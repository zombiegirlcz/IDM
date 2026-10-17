package kz0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import aw0.y9;
import com.revolut.core.ui_kit_core.R$layout;
import com.revolut.core.ui_kit_core.R$style;
import efm.r;
import eoi.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ox0.v;
import ox0.w;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Dialog implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f191035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f191036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f191037c;
    public nq0.a d;
    public nq0.b e;
    public rr0.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f191038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f191039h;
    public final ite.d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Activity activity, long j2) {
        super(activity, R$style.CustomDialog_Light);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f191035a = activity;
        this.f191037c = v0.a.d("create(...)");
        this.i = new ite.d(this, 8);
        setContentView(R$layout.dialog_fullscreen_loading);
        e eVar = new e(this, j2);
        setOnShowListener(eVar);
        setOnDismissListener(eVar);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    @Override // kz0.a
    public final r a() {
        return this.f191037c;
    }

    @Override // kz0.a
    public final void b(s callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f191039h = callback;
    }

    public final void c() {
        this.f191038g = h.FULLSCREEN;
        Activity activity = this.f191035a;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        super.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface, kz0.a
    public final void dismiss() {
        s sVar;
        h hVar = this.f191038g;
        this.f191038g = null;
        int i = hVar == null ? -1 : f.f191034a[hVar.ordinal()];
        Activity activity = this.f191035a;
        if (i != -1) {
            if (i == 1) {
                nq0.b bVar = this.e;
                if (bVar != null) {
                    bVar.d(this.i);
                }
                rr0.f fVar = this.f;
                if (fVar != null) {
                    fVar.b(false);
                }
                this.e = null;
                this.f = null;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    super.dismiss();
                }
            }
        }
        if (hVar != null && (sVar = this.f191039h) != null) {
            sVar.d();
        }
        w.Companion.getClass();
        nq0.a aVarA = v.a(activity);
        aVarA.f218342c--;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f191036b = true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f191037c.onNext(Unit.f186387a);
        super.onBackPressed();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f191036b = false;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(2);
        ((this.f191035a.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0 ? y9.DARK : y9.LIGHT).a(window);
    }

    @Override // android.app.Dialog, kz0.a
    public final void show() throws Throwable {
        s sVar;
        if (this.f191038g != null) {
            return;
        }
        nq0.a aVarA = this.d;
        if (aVarA == null) {
            v vVar = w.Companion;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            vVar.getClass();
            aVarA = v.a(context);
            this.d = aVarA;
        }
        nq0.b bVarA = aVarA.a();
        if (bVarA != null) {
            this.f191038g = h.EMBEDDED;
            this.e = bVarA;
            rr0.f fVarV = bVarA.V();
            fVarV.b(true);
            this.f = fVarV;
            bVarA.a(this.i);
        } else {
            c();
        }
        h hVar = this.f191038g;
        if (hVar != null && (sVar = this.f191039h) != null) {
            sVar.c(hVar);
        }
        w.Companion.getClass();
        v.a(this.f191035a).f218342c++;
    }
}
