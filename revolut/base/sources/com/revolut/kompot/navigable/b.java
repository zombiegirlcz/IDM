package com.revolut.kompot.navigable;

import aki.e;
import aki.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import d9.t0;
import gki.j;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nhi.k;
import wji.d;
import wji.e;
import yji.g;
import yji.h;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f98418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f98419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aki.c f98420c;
    public final d d;
    public final Function2 e;
    public final Function2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f98421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f98422h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f98423j;
    public a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f98424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f98425m;

    public b(h type, Integer num, aki.c controllersCache, d controllerViewHolder, Function2 function2, Function2 function22, Function1 function1) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(controllersCache, "controllersCache");
        Intrinsics.checkNotNullParameter(controllerViewHolder, "controllerViewHolder");
        this.f98418a = type;
        this.f98419b = num;
        this.f98420c = controllersCache;
        this.d = controllerViewHolder;
        this.e = function2;
        this.f = function22;
        this.f98421g = function1;
        this.f98422h = c6d.b.q(type);
        this.i = c6d.b.p(type);
        this.f98423j = c6d.b.o(type);
        controllerViewHolder.e(new y99.c(this, 17));
        this.f98424l = true;
    }

    public static String i(a aVar) {
        if (aVar == null) {
            return "null";
        }
        String str = aVar.t2() + "|" + aVar.u2() + "|" + aVar.f.a();
        return str == null ? "null" : str;
    }

    public final void a() {
        a aVar;
        a aVar2 = this.k;
        if (aVar2 != null) {
            aVar2.K2();
        }
        if (!this.f98423j || (aVar = this.k) == null) {
            return;
        }
        TransitionAnimation modalTransitionAnimation = aVar.q2().f206461b;
        if (modalTransitionAnimation == null) {
            modalTransitionAnimation = new ModalTransitionAnimation(ModalTransitionAnimation.Style.POPUP.f98391a, false);
        }
        wji.c.Companion.getClass();
        wji.b.a(aVar, this).a(modalTransitionAnimation);
        this.k = null;
        this.f98424l = true;
    }

    public final boolean b() {
        a aVar = this.k;
        if (aVar == null) {
            return false;
        }
        boolean zF2 = aVar.F2();
        if (!this.f98423j || zF2) {
            return zF2;
        }
        a aVar2 = this.k;
        if (aVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        wji.c.Companion.getClass();
        wji.c cVarA = wji.b.a(aVar2, this);
        if (this.f98424l) {
            TransitionAnimation modalTransitionAnimation = aVar2.q2().f206461b;
            if (modalTransitionAnimation == null) {
                modalTransitionAnimation = new ModalTransitionAnimation(ModalTransitionAnimation.Style.POPUP.f98391a, false);
            }
            cVarA.a(modalTransitionAnimation);
        } else {
            cVarA.a(TransitionAnimation.NONE.f98393a);
            this.f98424l = true;
        }
        this.k = null;
        return true;
    }

    public final void c() {
        a aVar = this.k;
        if (aVar != null) {
            this.f98424l = true;
            if (aVar.o) {
                return;
            }
            aVar.H2();
        }
    }

    public void d() throws e {
        a aVar = this.k;
        if (aVar != null) {
            aVar.onDestroy();
        }
    }

    public final void e() {
        a aVar = this.k;
        if (aVar != null) {
            this.f98424l = false;
            if (aVar.o) {
                aVar.I2();
            }
        }
    }

    public final void f() {
        a aVar = this.k;
        if (aVar != null) {
            aVar.J();
        }
    }

    public final void g() {
        a aVar = this.k;
        if (aVar != null) {
            aVar.W();
        }
    }

    public final void h(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        a aVar = this.k;
        if (aVar != null) {
            aVar.o(i, permissions, grantResults);
            Unit unit = Unit.f186387a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(a to6, a aVar, TransitionAnimation animation, boolean z) {
        a aVar2;
        String str;
        d dVar = this.d;
        Intrinsics.checkNotNullParameter(to6, "controller");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Class<?> cls = to6.getClass();
        try {
            a aVar3 = this.k;
            this.k = to6;
            a aVar4 = to6.f98405m;
            if (z) {
                Intrinsics.checkNotNullParameter(this, "controllerManager");
                Intrinsics.checkNotNullParameter(this, "<set-?>");
                to6.f98403j = this;
                to6.f98405m = aVar;
            } else {
                Intrinsics.checkNotNullParameter(this, "controllerManager");
                Intrinsics.checkNotNullParameter(animation, "enterTransition");
                Intrinsics.checkNotNullParameter(this, "controllerManager");
                Intrinsics.checkNotNullParameter(this, "<set-?>");
                to6.f98403j = this;
                to6.f98405m = aVar;
                to6.q2().f206461b = animation;
            }
            Iterator it8 = k.f215505b.iterator();
            while (true) {
                aVar2 = null;
                aVar2 = null;
                if (!it8.hasNext()) {
                    break;
                }
                xji.a aVar5 = (xji.a) it8.next();
                xji.b bVar = aVar5 instanceof xji.b ? (xji.b) aVar5 : null;
                if (bVar != null) {
                    bVar.f2(to6.u2(), to6.f98408q);
                }
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(dVar.a().getContext());
            Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
            View viewW2 = to6.w2(layoutInflaterFrom);
            if (dVar.a().indexOfChild(viewW2) == -1 && viewW2.getParent() != null) {
                String strC = ((f) this.f98420c).c();
                ViewParent parent = viewW2.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    while (true) {
                        if (view == null) {
                            break;
                        }
                        a aVarN = com.bumptech.glide.c.n(view);
                        if (aVarN != null) {
                            aVar2 = aVarN;
                            break;
                        } else {
                            ViewParent parent2 = view.getParent();
                            view = parent2 instanceof View ? (View) parent2 : null;
                        }
                    }
                }
                String strI = i(to6);
                boolean z3 = to6.f98408q;
                boolean z4 = to6.o;
                boolean zIsAttachedToWindow = viewW2.isAttachedToWindow();
                String strI2 = i(aVar);
                String strI3 = i(aVar4);
                if (Intrinsics.f(aVar2, aVar4)) {
                    str = "";
                } else {
                    str = "oldParentFromView=" + i(aVar2);
                }
                throw new IllegalStateException("Can't show controller because it's already attached to another flow. " + ("[controller=" + strI + "created=" + z3 + " attached=" + z4 + " viewAttached=" + zIsAttachedToWindow + " newParent=" + strI2 + "oldParent=" + strI3 + " " + str + "]") + " \n" + strC);
            }
            if (z) {
                dVar.c(viewW2);
            } else {
                dVar.add(viewW2);
            }
            if (!to6.f98408q) {
                to6.onCreate();
            }
            if (Intrinsics.f(aVar3, this.k)) {
                aVar3 = null;
            }
            boolean z6 = true;
            if (!pd.b.g(to6) && (aVar3 == null || !pd.b.g(aVar3) || !z)) {
                z6 = false;
            }
            if (z6 && this.f98423j) {
                wji.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Intrinsics.checkNotNullParameter(this, "controllerManager");
                new wji.c(aVar3, to6, this, z, false, new wji.f(animation, dVar)).a(animation);
            } else {
                a aVar6 = aVar3;
                if (z6 && this.f98418a.equals(g.f314514a)) {
                    wji.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(to6, "to");
                    Intrinsics.checkNotNullParameter(this, "controllerManager");
                    new wji.c(aVar6, to6, this, z, false, e.a.f298139a).a(animation);
                } else {
                    wji.b bVar2 = wji.c.Companion;
                    boolean d = animation.getD();
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(to6, "to");
                    Intrinsics.checkNotNullParameter(this, "controllerManager");
                    new wji.c(aVar6, to6, this, z, d, e.b.f298140a).a(animation);
                }
            }
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            if (!(th10 instanceof CancellationException)) {
                t0.a(th10, cls, b.class, "show");
            }
            throw th10;
        }
    }
}
