package ali;

import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import eki.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;
import vkm.j2;
import vkm.q;
import vkm.q0;
import yji.o;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements c, pki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f6274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6276c;
    public final m d;
    public final bli.b e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPager2 f6278h;

    /* JADX WARN: Multi-variable type inference failed */
    public f(g controller, int i, h model, int i2) {
        Intrinsics.i(controller, "null cannot be cast to non-null type com.revolut.kompot.navigable.Controller");
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) controller;
        m controllersAdapter = new m(i, aVar, aVar.y2().f98420c, new acb.f(model, controller, 29));
        bli.b parentControllerModelBindingDelegate = new bli.b(controllersAdapter, controller);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(controllersAdapter, "controllersAdapter");
        Intrinsics.checkNotNullParameter(parentControllerModelBindingDelegate, "parentControllerModelBindingDelegate");
        this.f6274a = controller;
        this.f6275b = model;
        this.f6276c = i2;
        this.d = controllersAdapter;
        this.e = parentControllerModelBindingDelegate;
    }

    @Override // pki.a
    public final void J() {
        this.e.J();
    }

    @Override // pki.a
    public final void J0(boolean z) {
        this.e.J0(z);
    }

    @Override // pki.a
    public final void J1(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.e.J1(token);
    }

    @Override // pki.a
    public final void L1(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.e.L1(stateStorage);
    }

    @Override // pki.a
    public final void R0() {
        this.e.R0();
        q0 q0Var = new q0((j2) this.f6275b.getState().f22677a, new e(this, null, 1), 1);
        o oVar = this.f6274a;
        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
        q.G(q0Var, ((ViewController) oVar).f98402h);
    }

    @Override // pki.a
    public final void W() {
        this.e.W();
    }

    public final void a(String str) {
        if (this.f || str == null || str.equals(this.f6277g)) {
            return;
        }
        m mVar = this.d;
        List currentList = mVar.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator it8 = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.f(((PagerItem) it8.next()).getF70838b(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i > mVar.getItemCount()) {
            return;
        }
        ViewPager2 viewPager2 = this.f6278h;
        if (viewPager2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (viewPager2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        viewPager2.setCurrentItem(i, viewPager2.isLaidOut());
        this.f6277g = str;
    }

    @Override // pki.a
    public final void b0(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.e.b0(stateStorage);
    }

    @Override // pki.a
    public final void c2() {
        this.e.c2();
    }

    @Override // yji.r
    public final void e(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "state");
        b bVarI0 = this.f6275b.I0();
        bVarI0.getClass();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(b.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("PAGER_CHILD_STATES_KEY");
        if (bundle2 != null) {
            bundle2.setClassLoader(b.class.getClassLoader());
            Set<String> setKeySet = bundle2.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                Bundle bundle3 = bundle2.getBundle(str);
                if (bundle3 != null) {
                    bVarI0.f6271c.put(str, bundle3);
                }
            }
        }
    }

    @Override // pki.a
    public final void e0(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.e.e0(token);
    }

    @Override // yji.r
    public final void g(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outState");
        h hVar = this.f6275b;
        hVar.I0().f6271c.clear();
        String f85710a = ((oki.a) ((j2) hVar.getState().f22677a).getValue()).getF85710a();
        m mVar = this.d;
        List currentList = mVar.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator it8 = currentList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it8.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.f(((PagerItem) it8.next()).getF70838b(), f85710a)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        }
        List currentList2 = mVar.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
        for (Object obj2 : currentList2) {
            int i3 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            PagerItem item = (PagerItem) obj2;
            if (Math.abs(i - i2) <= 5) {
                Intrinsics.h(item);
                Intrinsics.checkNotNullParameter(item, "item");
                ControllerKey controllerKey = (ControllerKey) mVar.f127176j.get(item.getF70838b());
                com.revolut.kompot.navigable.a aVarD = controllerKey != null ? ((aki.f) mVar.f127175h).d(controllerKey) : null;
                com.revolut.kompot.navigable.a aVar = aVarD != null ? aVarD : null;
                if (aVar != null) {
                    Bundle state = new Bundle();
                    aVar.g(state);
                    b bVarI0 = hVar.I0();
                    String pagerItemId = item.getF70838b();
                    bVarI0.getClass();
                    Intrinsics.checkNotNullParameter(pagerItemId, "pagerItemId");
                    Intrinsics.checkNotNullParameter(state, "state");
                    bVarI0.f6271c.put(pagerItemId, state);
                }
            }
            i = i3;
        }
        b bVarI02 = hVar.I0();
        bVarI02.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        LinkedHashMap linkedHashMap = bVarI02.f6271c;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            bundle.putBundle((String) entry.getKey(), (Bundle) entry.getValue());
        }
        outBundle.putBundle("PAGER_CHILD_STATES_KEY", bundle);
    }

    @Override // pki.a
    public final void g1(boolean z) {
        this.e.g1(z);
        if (z) {
            m mVar = this.d;
            mVar.getClass();
            mVar.c(BitmapDescriptorFactory.HUE_RED, null);
        }
    }

    @Override // pki.a
    public final void i1(boolean z) {
        this.e.i1(z);
    }

    @Override // pki.a
    public final boolean l0(boolean z) {
        this.e.getClass();
        return false;
    }

    @Override // pki.a
    public final void n() {
        this.e.n();
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.e.o(i, permissions, grantResults);
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.e.onActivityResult(i, i2, intent);
    }

    @Override // pki.a
    public final void onCreate() {
        this.e.getClass();
        o oVar = this.f6274a;
        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
        ViewPager2 viewPager2 = (ViewPager2) ((ViewController) oVar).D2().findViewById(this.f6276c);
        if (viewPager2 == null) {
            throw new IllegalStateException(f.class.getSimpleName().concat(": viewPagerId is not valid. Forgot to override?"));
        }
        this.f6278h = viewPager2;
        viewPager2.setAdapter(this.d);
        viewPager2.registerOnPageChangeCallback(new d(this));
        viewPager2.setOffscreenPageLimit(1);
        if (((com.revolut.kompot.navigable.a) oVar).q2().d()) {
            ViewPager2 viewPager22 = this.f6278h;
            if (viewPager22 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            viewPager22.setTag(zv0.c.f325571b, zv0.c.f325570a);
        }
        q0 q0Var = new q0(this.f6275b.I0().f6270b, new e(this, null, 0), 1);
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        Flow flowC = q.C(q0Var, oji.e.f225788b);
        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
        q.G(flowC, ((ViewController) oVar).f98401g);
    }

    @Override // pki.a
    public final void onDestroy() throws aki.e {
        this.e.onDestroy();
        m mVar = this.d;
        List currentList = mVar.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        mVar.e(currentList, f0.f322471a);
    }

    @Override // pki.a
    public final void u(boolean z) {
        this.e.u(z);
    }

    @Override // pki.a
    public final boolean u1(oki.d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        return this.e.u1(defaultHandler);
    }

    @Override // pki.a
    public final void z() {
        this.e.z();
    }
}
