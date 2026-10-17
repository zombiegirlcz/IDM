package es0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f128835b;

    public /* synthetic */ k() {
        this.f128834a = 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0038, code lost:
    
        r0 = null;
     */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.f128834a
            switch(r0) {
                case 0: goto L5;
                case 1: goto L67;
                case 2: goto L5;
                case 3: goto L67;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L26;
                case 7: goto Lb;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto L5;
                case 11: goto L5;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "v"
        L7:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            return
        Lb:
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.ViewParent r4 = r4.getParent()
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L1b
            android.view.View r4 = (android.view.View) r4
            goto L1c
        L1b:
            r4 = 0
        L1c:
            if (r4 == 0) goto L25
            java.lang.Object r0 = r3.f128835b
            ox0.j r0 = (ox0.j) r0
            r4.addOnLayoutChangeListener(r0)
        L25:
            return
        L26:
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L37
            android.view.View r0 = (android.view.View) r0
            goto L38
        L37:
            r0 = r2
        L38:
            if (r0 == 0) goto L4a
            boolean r1 = r0 instanceof com.revolut.core.ui_kit.views.o
            if (r1 == 0) goto L3f
            goto L4b
        L3f:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L37
            android.view.View r0 = (android.view.View) r0
            goto L38
        L4a:
            r0 = r2
        L4b:
            boolean r1 = r0 instanceof com.revolut.core.ui_kit.views.o
            if (r1 == 0) goto L52
            r2 = r0
            com.revolut.core.ui_kit.views.o r2 = (com.revolut.core.ui_kit.views.o) r2
        L52:
            r3.f128835b = r2
            if (r2 == 0) goto L66
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.ArrayList r0 = r2.f59566a
            boolean r1 = r0.contains(r4)
            if (r1 != 0) goto L66
            r0.add(r4)
        L66:
            return
        L67:
            java.lang.String r0 = "view"
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: es0.k.onViewAttachedToWindow(android.view.View):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        switch (this.f128834a) {
            case 0:
                Intrinsics.checkNotNullParameter(v, "v");
                q qVar = (q) this.f128835b;
                qVar.e.cancel();
                qVar.c();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v, "view");
                foi.o oVar = (foi.o) this.f128835b;
                if (oVar.f137004b == v) {
                    oVar.a();
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(v, "v");
                fp0.p pVar = (fp0.p) this.f128835b;
                View view = pVar.f137029a;
                fp0.l lVar = pVar.f137032g;
                if (lVar != null) {
                    view.removeCallbacks(lVar);
                    view.setPressed(false);
                }
                pVar.f137032g = null;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(v, "view");
                iv0.o oVar2 = (iv0.o) this.f128835b;
                oVar2.f();
                k kVar = oVar2.f168686b;
                if (kVar != null) {
                    oVar2.c().removeOnAttachStateChangeListener(kVar);
                }
                oVar2.f168686b = null;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(v, "v");
                ((jq0.c) this.f128835b).i();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(v, "v");
                ((jr0.g) this.f128835b).a();
                break;
            case 6:
                Intrinsics.checkNotNullParameter(v, "v");
                com.revolut.core.ui_kit.views.o oVar3 = (com.revolut.core.ui_kit.views.o) this.f128835b;
                if (oVar3 != null) {
                    Intrinsics.checkNotNullParameter(v, "view");
                    oVar3.f59566a.remove(v);
                }
                this.f128835b = null;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(v, "v");
                Object parent = v.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    view2.removeOnLayoutChangeListener((ox0.j) this.f128835b);
                }
                break;
            case 8:
                Intrinsics.checkNotNullParameter(v, "v");
                sv0.c cVar = (sv0.c) this.f128835b;
                cVar.f265812b.getDecorView().removeOnAttachStateChangeListener(this);
                Iterator it8 = cVar.f265813c.iterator();
                while (it8.hasNext()) {
                    ((vv0.a) it8.next()).detach();
                }
                sl5.a modifier = cVar.f265822r;
                Object obj2 = or0.u.f228038a;
                Intrinsics.checkNotNullParameter(v, "<this>");
                Intrinsics.checkNotNullParameter(modifier, "modifier");
                or0.c cVarI = or0.u.i(v);
                Intrinsics.checkNotNullParameter(modifier, "modifier");
                cVarI.f228007b.remove(modifier);
                tv0.n nVar = cVar.f265816j;
                View view3 = nVar.f274678a;
                view3.removeCallbacks(nVar.k);
                if (Build.VERSION.SDK_INT >= 30) {
                    ViewCompat.setWindowInsetsAnimationCallback(view3, null);
                    break;
                }
                break;
            case 9:
                Intrinsics.checkNotNullParameter(v, "v");
                v.removeCallbacks(((us0.f) this.f128835b).e);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(v, "v");
                vs0.e eVar = (vs0.e) this.f128835b;
                ValueAnimator valueAnimator = eVar.f291710b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                eVar.f291710b = null;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(v, "v");
                ((xp0.f) this.f128835b).b();
                break;
            default:
                Intrinsics.checkNotNullParameter(v, "v");
                ((yp0.k) this.f128835b).b();
                break;
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f128834a = i;
        this.f128835b = obj2;
    }
}
