package lii;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kt0.d;
import rr0.f;
import tji.i;
import tji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f195526c;
    public f d;
    public int e;

    public a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f195526c = activity;
    }

    public static void j(RuntimeException runtimeException) {
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e()) {
            new Handler(Looper.getMainLooper()).post(new d(runtimeException, 5));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
    }

    @Override // tji.i
    public final boolean a(l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return dialogModel instanceof c;
    }

    @Override // tji.i
    public final void b() {
        int iMax = Math.max(this.e - 1, 0);
        this.e = iMax;
        if (iMax == 0) {
            f fVar = this.d;
            if (fVar != null) {
                fVar.b(false);
            }
            this.d = null;
        }
    }

    @Override // tji.i
    public final void e() {
        this.e = 0;
        f fVar = this.d;
        if (fVar != null) {
            fVar.b(false);
        }
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // tji.i
    public final void i(l lVar) {
        c dialogModel = (c) lVar;
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        Window window = this.f195526c.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        View viewFindViewWithTag = viewGroup.findViewWithTag(dialogModel.a());
        if (viewFindViewWithTag == 0) {
            j(new IllegalStateException(p.a.p("Button with tag ", dialogModel.a(), " not found")));
            return;
        }
        if (!(viewFindViewWithTag instanceof sy0.a)) {
            j(new IllegalArgumentException(p.a.p("Button with tag ", dialogModel.a(), " must implement LoadingButton interface")));
            return;
        }
        this.e++;
        f fVar = this.d;
        if (fVar == null || !fVar.a(viewFindViewWithTag)) {
            f fVar2 = this.d;
            if (fVar2 != null) {
                fVar2.b(false);
            }
            this.d = null;
            f fVarV = ((sy0.a) viewFindViewWithTag).V();
            fVarV.b(true);
            this.d = fVarV;
        }
    }
}
