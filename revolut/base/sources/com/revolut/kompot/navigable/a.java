package com.revolut.kompot.navigable;

import aii.a0;
import aii.s;
import aki.a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.root.RootFlow;
import dok.k;
import gki.f;
import gki.n;
import hli.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kji.h;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.e0;
import wf0.r0;
import yhm.j;
import yji.o;
import yji.r;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zkm.d;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements LifecycleOwner, o, r {

    @NotNull
    public static final b Companion = new b(0);
    public aki.a A;
    public final h0 B;
    public final k C;
    public final gli.b D;
    public final gli.b E;
    public final LifecycleRegistry F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mki.a f98398a = new mki.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f98399b = new xl3.a(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f98400c;
    public final Object d;
    public final Lazy e;
    public final C0597a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f98401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f98402h;
    public final zji.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.revolut.kompot.navigable.b f98403j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f98404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f98405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f98406n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f98407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f98408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f98409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f98410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public yji.b f98411t;
    public final ArrayList u;
    public final ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f98412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f98413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f98414y;
    public boolean z;

    /* JADX INFO: renamed from: com.revolut.kompot.navigable.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes10.dex */
    public static final class C0597a {

        @NotNull
        public static final C0598a Companion = new C0598a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f98415a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f98416b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f98417c;

        /* JADX INFO: renamed from: com.revolut.kompot.navigable.a$a$a, reason: collision with other inner class name */
        public static final class C0598a {
            private C0598a() {
            }
        }

        public final String a() {
            long j2 = this.f98415a;
            long j3 = this.f98416b;
            String str = this.f98417c;
            if (str == null) {
                str = "null";
            }
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "(addedAt: ", ", removedAt: ");
            sbV.append(j3);
            sbV.append(", reason: ");
            sbV.append(str);
            sbV.append(")");
            return sbV.toString();
        }

        public final void b(long j2) {
            this.f98415a = j2;
        }

        public final void c(String str) {
            this.f98417c = str;
        }

        public final void d(long j2) {
            this.f98416b = j2;
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class b {
        private b() {
        }

        public b(int i) {
        }
    }

    public a() {
        yhm.k kVar = yhm.k.NONE;
        final int i = 0;
        this.f98400c = j.c(kVar, new Function0(this) { // from class: yji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.navigable.a f314508b;

            {
                this.f314508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Context context = this.f314508b.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                            context = ((ContextWrapper) context).getBaseContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                        }
                        Activity activity = context instanceof Activity ? (Activity) context : null;
                        if (activity != null) {
                            return activity;
                        }
                        throw new IllegalStateException("Activity is not present");
                    case 1:
                        return (ControllerKey) this.f314508b.f98399b.invoke();
                    case 2:
                        return new mki.b(this.f314508b);
                    case 3:
                        return new aii.b(this.f314508b);
                    case 4:
                        return new a0(this.f314508b);
                    default:
                        return LifecycleRegistry.INSTANCE.createUnsafe(this.f314508b);
                }
            }
        });
        final int i2 = 1;
        this.d = j.c(kVar, new Function0(this) { // from class: yji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.navigable.a f314508b;

            {
                this.f314508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Context context = this.f314508b.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                            context = ((ContextWrapper) context).getBaseContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                        }
                        Activity activity = context instanceof Activity ? (Activity) context : null;
                        if (activity != null) {
                            return activity;
                        }
                        throw new IllegalStateException("Activity is not present");
                    case 1:
                        return (ControllerKey) this.f314508b.f98399b.invoke();
                    case 2:
                        return new mki.b(this.f314508b);
                    case 3:
                        return new aii.b(this.f314508b);
                    case 4:
                        return new a0(this.f314508b);
                    default:
                        return LifecycleRegistry.INSTANCE.createUnsafe(this.f314508b);
                }
            }
        });
        final int i3 = 2;
        this.e = j.b(new Function0(this) { // from class: yji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.navigable.a f314508b;

            {
                this.f314508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        Context context = this.f314508b.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                            context = ((ContextWrapper) context).getBaseContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                        }
                        Activity activity = context instanceof Activity ? (Activity) context : null;
                        if (activity != null) {
                            return activity;
                        }
                        throw new IllegalStateException("Activity is not present");
                    case 1:
                        return (ControllerKey) this.f314508b.f98399b.invoke();
                    case 2:
                        return new mki.b(this.f314508b);
                    case 3:
                        return new aii.b(this.f314508b);
                    case 4:
                        return new a0(this.f314508b);
                    default:
                        return LifecycleRegistry.INSTANCE.createUnsafe(this.f314508b);
                }
            }
        });
        this.f = new C0597a();
        g gVar = g.f186406a;
        this.f98401g = jh.d.a(gVar);
        this.f98402h = jh.d.a(gVar);
        this.i = new zji.c();
        final int i5 = 3;
        this.k = j.c(kVar, new Function0(this) { // from class: yji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.navigable.a f314508b;

            {
                this.f314508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        Context context = this.f314508b.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                            context = ((ContextWrapper) context).getBaseContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                        }
                        Activity activity = context instanceof Activity ? (Activity) context : null;
                        if (activity != null) {
                            return activity;
                        }
                        throw new IllegalStateException("Activity is not present");
                    case 1:
                        return (ControllerKey) this.f314508b.f98399b.invoke();
                    case 2:
                        return new mki.b(this.f314508b);
                    case 3:
                        return new aii.b(this.f314508b);
                    case 4:
                        return new a0(this.f314508b);
                    default:
                        return LifecycleRegistry.INSTANCE.createUnsafe(this.f314508b);
                }
            }
        });
        final int i6 = 4;
        this.f98404l = j.c(kVar, new Function0(this) { // from class: yji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.navigable.a f314508b;

            {
                this.f314508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        Context context = this.f314508b.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                            context = ((ContextWrapper) context).getBaseContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                        }
                        Activity activity = context instanceof Activity ? (Activity) context : null;
                        if (activity != null) {
                            return activity;
                        }
                        throw new IllegalStateException("Activity is not present");
                    case 1:
                        return (ControllerKey) this.f314508b.f98399b.invoke();
                    case 2:
                        return new mki.b(this.f314508b);
                    case 3:
                        return new aii.b(this.f314508b);
                    case 4:
                        return new a0(this.f314508b);
                    default:
                        return LifecycleRegistry.INSTANCE.createUnsafe(this.f314508b);
                }
            }
        });
        this.f98411t = yji.b.NONE;
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.f98412w = new ArrayList();
        this.f98413x = new ArrayList();
        final int i21 = 5;
        this.f98414y = j.c(kVar, new Function0(this) { // from class: yji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.navigable.a f314508b;

            {
                this.f314508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        Context context = this.f314508b.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                            context = ((ContextWrapper) context).getBaseContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                        }
                        Activity activity = context instanceof Activity ? (Activity) context : null;
                        if (activity != null) {
                            return activity;
                        }
                        throw new IllegalStateException("Activity is not present");
                    case 1:
                        return (ControllerKey) this.f314508b.f98399b.invoke();
                    case 2:
                        return new mki.b(this.f314508b);
                    case 3:
                        return new aii.b(this.f314508b);
                    case 4:
                        return new a0(this.f314508b);
                    default:
                        return LifecycleRegistry.INSTANCE.createUnsafe(this.f314508b);
                }
            }
        });
        this.z = true;
        this.A = a.C0016a.f5957a;
        this.B = h0.f322473a;
        this.C = new k(this);
        this.D = new gli.b();
        this.E = new gli.b();
        this.F = v2();
    }

    public static /* synthetic */ a2 g2(a aVar, Flow flow, Function2 function2, Function2 function22, int i) {
        if ((i & 1) != 0) {
            function2 = new xsd.a();
        }
        a27.d dVar = new a27.d(15);
        if ((i & 4) != 0) {
            function22 = new r0(15);
        }
        return aVar.f2(flow, function2, dVar, function22);
    }

    /* JADX INFO: renamed from: A2 */
    public Integer getW() {
        return null;
    }

    public Set B2() {
        return null;
    }

    public final RootFlow C2() {
        a aVar = this instanceof BaseFlow ? (BaseFlow) this : null;
        if (aVar == null) {
            aVar = this.f98405m;
        }
        while (true) {
            if ((aVar != null ? aVar.f98405m : null) == null) {
                Intrinsics.i(aVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.root.RootFlow<*, *>");
                return (RootFlow) aVar;
            }
            aVar = aVar.f98405m;
        }
    }

    public final View D2() {
        View view = this.f98406n;
        if (view != null) {
            return view;
        }
        Intrinsics.r("view");
        throw null;
    }

    public final LayoutInflater E2(LayoutInflater baseInflater) {
        f fVar;
        Intrinsics.checkNotNullParameter(baseInflater, "baseInflater");
        Integer numA2 = getW();
        gki.j jVar = y2().f98425m;
        if (jVar != null) {
            fVar = (f) ((uji.b) jVar).a(f.f144402b);
        } else {
            fVar = null;
        }
        if (fVar == null && numA2 == null) {
            return baseInflater;
        }
        Context context = baseInflater.getContext();
        if (fVar != null) {
            h hVar = fVar.f144403a;
            mki.b bVarQ2 = q2();
            Intrinsics.h(context);
            context = (Context) hVar.invoke(bVarQ2, context, numA2, B2());
        } else if (numA2 != null) {
            context = new ContextThemeWrapper(context, numA2.intValue());
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    public boolean F2() {
        Set setO2 = o2();
        if (!(setO2 instanceof Collection) || !setO2.isEmpty()) {
            Iterator it8 = setO2.iterator();
            while (it8.hasNext()) {
                if (((yji.d) it8.next()).I()) {
                    return true;
                }
            }
        }
        return J2() || !this.z;
    }

    public void G2(boolean z) {
        a aVar = this.f98405m;
        if (aVar != null) {
            aVar.G2(z);
        }
    }

    public void H2() {
        this.o = true;
        this.f98407p = false;
        Iterator it8 = o2().iterator();
        while (it8.hasNext()) {
            ((yji.d) it8.next()).P(s.SHOWN);
        }
        ArrayList arrayList = this.f98412w;
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            ((Function0) it9.next()).invoke();
        }
        arrayList.clear();
        v2().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        nhi.k.f215504a.k(this);
        Iterator it10 = o2().iterator();
        while (it10.hasNext()) {
            ((yji.d) it10.next()).O();
        }
    }

    public void I2() {
        e0.n(this.f98402h.f323100a);
        this.o = false;
        this.f98407p = true;
        Iterator it8 = o2().iterator();
        while (it8.hasNext()) {
            ((yji.d) it8.next()).P(s.HIDDEN);
        }
        v2().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        Iterator it9 = o2().iterator();
        while (it9.hasNext()) {
            ((yji.d) it9.next()).O();
        }
        Iterator it10 = nhi.k.f215505b.iterator();
        while (it10.hasNext()) {
            ((xji.a) it10.next()).q(this);
        }
    }

    public void J() {
    }

    public void J0(boolean z) {
        Iterator it8 = nhi.k.f215505b.iterator();
        while (it8.hasNext()) {
            ((xji.a) it8.next()).O0(this, z);
        }
    }

    public boolean J2() {
        return false;
    }

    public void K2() {
        Set setO2 = o2();
        if ((setO2 instanceof Collection) && setO2.isEmpty()) {
            return;
        }
        Iterator it8 = setO2.iterator();
        while (it8.hasNext() && !((yji.d) it8.next()).I()) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void L2(int i, List permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ((a0) this.f98404l.getValue()).a(i, permissions);
    }

    public void M2(aki.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.A = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void N2(Intent intent, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ((aii.b) this.k.getValue()).b(intent, i, null);
    }

    public void W() {
    }

    @Override // yji.r
    public void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f98398a.e(state);
    }

    public final void e2(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Boolean boolS2 = s2();
        Boolean boolR2 = r2();
        if (boolS2 != null) {
            eVar.setFitStatusBar(boolS2.booleanValue());
        }
        if (boolR2 != null) {
            eVar.setFitNavigationBar(boolR2.booleanValue());
        }
    }

    public final a2 f2(Flow flow, Function2 onError, Function1 onSuccessCompletion, Function2 onEach) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        return ue0.e.d(flow, this.f98402h, onError, onSuccessCompletion, onEach);
    }

    @Override // yji.r
    public void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f98398a.g(outState);
    }

    public void g1(boolean z) {
        this.f98411t = yji.b.NONE;
        Iterator it8 = nhi.k.f215505b.iterator();
        while (it8.hasNext()) {
            ((xji.a) it8.next()).U0(this, z);
        }
        if (z) {
            return;
        }
        ArrayList arrayList = this.f98413x;
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            ((Function0) it9.next()).invoke();
        }
        arrayList.clear();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.F;
    }

    public View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getW(), (ViewGroup) null, false);
        Intrinsics.h(viewInflate);
        Intrinsics.checkNotNullParameter(viewInflate, "<set-?>");
        this.f98406n = viewInflate;
        Intrinsics.checkNotNullExpressionValue(viewInflate, "also(...)");
        return viewInflate;
    }

    public void i1(boolean z) {
        Iterator it8 = nhi.k.f215505b.iterator();
        while (it8.hasNext()) {
            ((xji.a) it8.next()).q0(this, z);
        }
    }

    public final void i2(Function0 onAttach) {
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        if (this.o) {
            onAttach.invoke();
        } else {
            this.f98412w.add(onAttach);
        }
    }

    public final void j2(Function0 onCreate) {
        Intrinsics.checkNotNullParameter(onCreate, "onCreate");
        if (this.f98408q) {
            onCreate.invoke();
        } else {
            this.u.add(onCreate);
        }
    }

    public final void k2(Function0 onDestroy) {
        Intrinsics.checkNotNullParameter(onDestroy, "onDestroy");
        if (this.f98410s) {
            onDestroy.invoke();
        } else {
            this.v.add(onDestroy);
        }
    }

    public final void l2(Function0 onNextExit) {
        Intrinsics.checkNotNullParameter(onNextExit, "onNextExit");
        this.f98413x.add(onNextExit);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Activity m2() {
        return (Activity) this.f98400c.getValue();
    }

    public void n() {
        boolean z = this.f98411t == yji.b.ENTER;
        this.f98411t = yji.b.NONE;
        Iterator it8 = nhi.k.f215505b.iterator();
        while (it8.hasNext()) {
            ((xji.a) it8.next()).d2(this, z);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public aki.a getQ() {
        return this.A;
    }

    public void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Iterator it8 = o2().iterator();
        while (it8.hasNext()) {
            ((yji.d) it8.next()).o(i, permissions, grantResults);
        }
    }

    public Set o2() {
        return this.B;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        i2(new bli.a(i, this, intent, i2, 5));
    }

    public void onCreate() {
        Object next;
        this.f98408q = true;
        Iterator it8 = o2().iterator();
        while (it8.hasNext()) {
            ((yji.d) it8.next()).P(s.CREATED);
        }
        Iterator it9 = o2().iterator();
        while (it9.hasNext()) {
            ((yji.d) it9.next()).L(this.f98402h);
        }
        ArrayList arrayList = this.u;
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            ((Function0) it10.next()).invoke();
        }
        arrayList.clear();
        aki.f fVar = (aki.f) y2().f98420c;
        LinkedHashMap linkedHashMap = fVar.f5962a;
        LinkedHashSet linkedHashSet = fVar.e;
        LinkedHashMap linkedHashMap2 = fVar.f5964c;
        LinkedHashMap linkedHashMap3 = fVar.f5963b;
        Intrinsics.checkNotNullParameter(this, "controller");
        aki.a aVarN2 = getQ();
        if (!(aVarN2 instanceof a.b)) {
            boolean z = aVarN2 instanceof a.C0016a;
            C0597a c0597a = this.f;
            if (z) {
                long j2 = fVar.f5965g + 1;
                fVar.f5965g = j2;
                c0597a.b(j2);
                if (this instanceof qji.c) {
                    linkedHashMap2.put(u2(), this);
                } else {
                    linkedHashMap3.put(u2(), this);
                    if (linkedHashMap2.size() + linkedHashMap3.size() > 30 && !linkedHashMap3.isEmpty()) {
                        Set setEntrySet = linkedHashMap3.entrySet();
                        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                        Iterator it11 = setEntrySet.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it11.next();
                            Map.Entry entry = (Map.Entry) next;
                            Intrinsics.h(entry);
                            Object key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
                            a aVar = (a) value;
                            if (!Intrinsics.f((ControllerKey) key, u2()) && aVar.y2().k != aVar) {
                                break;
                            }
                        }
                        Map.Entry entry2 = (Map.Entry) next;
                        if (entry2 != null) {
                            fVar.f = fVar.c();
                            Object key2 = entry2.getKey();
                            Intrinsics.checkNotNullExpressionValue(key2, "<get-key>(...)");
                            ControllerKey controllerKey = (ControllerKey) key2;
                            if (!linkedHashSet.contains(controllerKey)) {
                                fVar.e(controllerKey, true, true, "trim_cache");
                                fVar.f = null;
                                Unit unit = Unit.f186387a;
                            }
                        }
                    }
                }
            } else if (aVarN2 instanceof aki.b) {
                long j3 = fVar.f5965g + 1;
                fVar.f5965g = j3;
                c0597a.b(j3);
                linkedHashMap.put(u2(), this);
                ControllerKey controllerKey2 = ((aki.b) aVarN2).f5959a;
                LinkedHashMap linkedHashMap4 = fVar.d;
                Collection collection = (List) linkedHashMap4.get(controllerKey2);
                if (collection == null) {
                    collection = f0.f322471a;
                }
                linkedHashMap4.put(controllerKey2, d0.F0(u2(), collection));
                linkedHashSet.add(u2());
            } else {
                if (!(aVarN2 instanceof a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                long j5 = fVar.f5965g + 1;
                fVar.f5965g = j5;
                c0597a.b(j5);
                linkedHashMap.put(u2(), this);
            }
        }
        v2().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        v2().handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.f98409r = true;
        Iterator it12 = o2().iterator();
        while (it12.hasNext()) {
            ((yji.d) it12.next()).O();
        }
        Iterator it13 = nhi.k.f215505b.iterator();
        while (it13.hasNext()) {
            ((xji.a) it13.next()).q1(this);
        }
        this.C.e(D2());
    }

    public void onDestroy() throws aki.e {
        if (this.f98410s) {
            return;
        }
        this.f98410s = true;
        Iterator it8 = o2().iterator();
        while (it8.hasNext()) {
            ((yji.d) it8.next()).P(s.FINISHED);
        }
        ArrayList arrayList = this.v;
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            ((Function0) it9.next()).invoke();
        }
        arrayList.clear();
        e0.n(this.f98401g.f323100a);
        aki.f fVar = (aki.f) y2().f98420c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(this, "controller");
        fVar.e(u2(), false, false, "destroy");
        if (this.f98409r) {
            v2().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.f98409r = false;
        }
        try {
            v2().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            Iterator it10 = o2().iterator();
            while (it10.hasNext()) {
                ((yji.d) it10.next()).O();
            }
            Iterator it11 = nhi.k.f215505b.iterator();
            while (it11.hasNext()) {
                ((xji.a) it11.next()).w1(this);
            }
            this.C.a(D2());
        } catch (IllegalStateException causeException) {
            if (v2().getState() != Lifecycle.State.INITIALIZED) {
                throw causeException;
            }
            aki.f fVar2 = (aki.f) y2().f98420c;
            fVar2.getClass();
            Intrinsics.checkNotNullParameter(causeException, "causeException");
            Intrinsics.checkNotNullParameter(this, "controller");
            String strT2 = t2();
            String str = u2().f98378a;
            String str2 = fVar2.f;
            StringBuilder sbM = v0.a.m("Finished before creation. ", strT2, " key: ", str, ". Cache = ");
            sbM.append(str2);
            throw new aki.e(sbM.toString(), causeException);
        }
    }

    public String p2() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final mki.b q2() {
        return (mki.b) this.e.getValue();
    }

    public Boolean r2() {
        return null;
    }

    public Boolean s2() {
        return null;
    }

    public final String t2() {
        String strConcat;
        String strT2;
        a aVar = this.f98405m;
        if (aVar == null || (strT2 = aVar.t2()) == null || (strConcat = strT2.concat(".")) == null) {
            strConcat = "";
        }
        return a0.d.r(strConcat, p2());
    }

    public void u(boolean z) {
        this.f98411t = z ? yji.b.ENTER : yji.b.EXIT;
        Iterator it8 = nhi.k.f215505b.iterator();
        while (it8.hasNext()) {
            ((xji.a) it8.next()).m0(this, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ControllerKey u2() {
        return (ControllerKey) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LifecycleRegistry v2() {
        return (LifecycleRegistry) this.f98414y.getValue();
    }

    public final View w2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.f98408q) {
            return D2();
        }
        long jNanoTime = System.nanoTime();
        View viewH2 = h2(inflater);
        this.D.a(System.nanoTime() - jNanoTime);
        Intrinsics.checkNotNullParameter(viewH2, "<this>");
        Intrinsics.checkNotNullParameter(this, "controller");
        viewH2.setTag(R$id.controller_tag, this);
        gki.j jVar = y2().f98425m;
        if (jVar != null) {
            n nVar = (n) ((uji.b) jVar).a(n.f144408b);
            if (nVar != null) {
                nVar.f144409a.invoke(this, viewH2);
            }
        }
        return viewH2;
    }

    public final boolean x2() {
        if (y2().i) {
            return false;
        }
        ModalDestination.Style styleB = q2().b();
        if ((styleB instanceof ModalDestination.Style.ExpandableBottomDialog) || Intrinsics.f(styleB, ModalDestination.Style.BOTTOM_DIALOG.f98301a) || (styleB instanceof ModalDestination.Style.ContextualAlert)) {
            return true;
        }
        if (Intrinsics.f(styleB, ModalDestination.Style.POPUP.f98311a) || Intrinsics.f(styleB, ModalDestination.Style.FULLSCREEN_FADE.f98307a) || Intrinsics.f(styleB, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a) || Intrinsics.f(styleB, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a) || (styleB instanceof ModalDestination.Style.Custom) || Intrinsics.f(styleB, ModalDestination.Style.FullscreenPaged.f98310a) || styleB == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final com.revolut.kompot.navigable.b y2() {
        com.revolut.kompot.navigable.b bVar = this.f98403j;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("parentControllerManager");
        throw null;
    }

    public final qji.c z2() {
        o oVar = this.f98405m;
        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.di.flow.ParentFlow");
        return (qji.c) oVar;
    }
}
