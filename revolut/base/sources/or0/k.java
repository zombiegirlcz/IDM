package or0;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements View.OnLayoutChangeListener {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f228013m = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f228014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f228015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f228016c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f228017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f228018h;
    public Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f228019j;
    public i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f228020l;

    public k(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f228014a = view;
        int i = f228013m + 1;
        f228013m = i;
        this.f228015b = a0.d.n("helper#", i);
        this.f228019j = new Rect();
        this.k = i.NONE;
    }

    public final void a() {
        if (this.f228018h) {
            return;
        }
        this.f228018h = true;
        View view = this.f228014a;
        if (view.isLaidOut()) {
            e();
        }
        view.addOnLayoutChangeListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f228018h) {
            this.f228018h = false;
            View view = this.f228014a;
            view.removeOnLayoutChangeListener(this);
            View view2 = this.f228020l;
            xv0.c cVar = null;
            if (view2 == null) {
                ViewParent parent = view.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            if (view2 != null) {
                TouchDelegate touchDelegate = view2.getTouchDelegate();
                if (touchDelegate != null) {
                    cVar = (xv0.c) (touchDelegate instanceof xv0.c ? touchDelegate : null);
                }
                if (cVar != null) {
                    cVar.b(this.f228015b);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(View view) {
        i iVar = this.k;
        i iVar2 = i.ENSURE_MINIMAL;
        if (iVar == iVar2 && Intrinsics.f(this.f228020l, view)) {
            return;
        }
        this.k = iVar2;
        boolean zF = Intrinsics.f(this.f228020l, view);
        View view2 = this.f228014a;
        if (!zF) {
            View view3 = this.f228020l;
            xv0.c cVar = null;
            if (view3 == null) {
                ViewParent parent = view2.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
            if (view3 != null) {
                TouchDelegate touchDelegate = view3.getTouchDelegate();
                if (touchDelegate != null) {
                    cVar = (xv0.c) (touchDelegate instanceof xv0.c ? touchDelegate : null);
                }
                if (cVar != null) {
                    cVar.b(this.f228015b);
                }
            }
            this.f228020l = view;
        }
        if (this.f228017g == 0) {
            this.f228017g = com.google.android.gms.internal.mlkit_vision_face.a.a(view2, "getContext(...)", 44.0f);
        }
        if (this.f228018h) {
            e();
        }
    }

    public final void d(int i, int i2, int i3, int i5) {
        i iVar = this.k;
        i iVar2 = i.INCREASE;
        boolean z = (iVar == iVar2 && i == this.f228016c && i3 == this.e && i2 == this.d && i5 == this.f) ? false : true;
        this.k = iVar2;
        if (z) {
            this.f228016c = i;
            this.e = i3;
            this.f = i5;
            this.d = i2;
            if (this.f228018h) {
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0028, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or0.k.e():void");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.f228018h) {
            e();
        }
    }
}
