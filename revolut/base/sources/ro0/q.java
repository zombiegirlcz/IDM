package ro0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import ix0.b1;
import ix0.i2;
import ix0.j2;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.s3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements pp0.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f255768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f255769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RenderNode f255770c;
    public final RenderNode d;
    public Canvas e;
    public j2 f;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static q a(View affectedView, e0 target) {
            Intrinsics.checkNotNullParameter(affectedView, "affectedView");
            Intrinsics.checkNotNullParameter(target, "target");
            Object parent = affectedView.getParent();
            View view = parent instanceof View ? (View) parent : 0;
            if (view != 0) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (g0.b(context, target)) {
                    pp0.a aVar = view instanceof pp0.a ? (pp0.a) view : null;
                    if (aVar != null) {
                        pp0.b f98450c = aVar.getF98450c();
                        if (f98450c instanceof q) {
                            return (q) f98450c;
                        }
                        if (f98450c != null) {
                            hx7.e.h(new IllegalStateException("Unexpected ViewGroupDrawingDelegate=" + f98450c));
                        }
                        q qVar = new q(0);
                        aVar.setDrawingDelegate(qVar);
                        return qVar;
                    }
                }
            }
            return null;
        }
    }

    public /* synthetic */ q(int i) {
        this();
    }

    public static p e(q qVar, View view, b1 insets, o blurVariant, Function0 function0, s3 s3Var, int i) {
        if ((i & 8) != 0) {
            function0 = new rm0.k(8);
        }
        Function0 blurFactorProvider = function0;
        Function0 kVar = s3Var;
        if ((i & 16) != 0) {
            kVar = new rm0.k(9);
        }
        Function0 startYOffsetProvider = kVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(blurVariant, "blurVariant");
        Intrinsics.checkNotNullParameter(blurFactorProvider, "blurFactorProvider");
        Intrinsics.checkNotNullParameter(startYOffsetProvider, "startYOffsetProvider");
        qVar.f(view);
        p pVar = new p(qVar, view, insets, blurVariant, blurFactorProvider, startYOffsetProvider);
        qVar.f255769b.add(pVar);
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0224  */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup, pp0.a] */
    /* JADX WARN: Type inference failed for: r15v7, types: [android.view.ViewGroup, pp0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro0.q.a(android.graphics.Canvas):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup, pp0.a] */
    public final boolean b(Canvas canvas, View child, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        ?? r06 = this.f255768a;
        if (r06 == 0) {
            r6.b.r("host is null");
            return false;
        }
        Canvas canvas2 = this.e;
        if (canvas2 != null) {
            ArrayList arrayList = this.f255769b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((p) arrayList.get(i)).f255759a == child) {
                    return r06.Z(canvas2, child, j2);
                }
            }
        }
        return r06.Z(canvas, child, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(pp0.a host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f255768a = (ViewGroup) host;
        j2 j2Var = this.f;
        if (j2Var != null) {
            j2Var.cancel();
        }
        i2 i2Var = j2.Companion;
        View self = host.getSelf();
        o6.a aVar = new o6.a(this, 20);
        i2Var.getClass();
        this.f = i2.a(self, aVar);
    }

    public final void d(pp0.a host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (host.equals(this.f255768a)) {
            j2 j2Var = this.f;
            if (j2Var != null) {
                j2Var.cancel();
            }
            this.f = null;
            ArrayList arrayList = this.f255769b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                p pVar = (p) arrayList.get(i);
                RenderNode renderNode = pVar.f;
                if (renderNode != null) {
                    renderNode.discardDisplayList();
                }
                pVar.f = null;
            }
            arrayList.clear();
            this.f255768a = null;
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f255769b;
        for (int iJ = zhm.v.j(arrayList); -1 < iJ; iJ--) {
            p pVar = (p) arrayList.get(iJ);
            boolean zF = Intrinsics.f(pVar.f255759a, view);
            if (zF) {
                RenderNode renderNode = pVar.f;
                if (renderNode != null) {
                    renderNode.discardDisplayList();
                }
                pVar.f = null;
            }
            if (zF) {
                arrayList.remove(iJ);
            }
        }
    }

    private q() {
        this.f255769b = new ArrayList();
        this.f255770c = q2.a.y();
        this.d = q2.a.z();
    }
}
