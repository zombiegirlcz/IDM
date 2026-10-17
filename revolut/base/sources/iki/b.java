package iki;

import aii.b0;
import aii.c0;
import aii.m;
import aii.n;
import aii.t;
import aii.u;
import aii.v;
import aii.w;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.root.RootFlow;
import dki.k;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b extends dki.g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f161973y = 0;
    public j u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f161976x;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final af0.a f161974t = new af0.a(20);
    public final TransitionAnimation.NONE v = TransitionAnimation.NONE.f98393a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f161975w = new ArrayList();

    @Override // yji.l
    public void I1() {
        j jVarP2 = P2();
        af0.a listener = this.f161974t;
        Intrinsics.checkNotNullParameter(listener, "listener");
        jVarP2.f161987b.add(listener);
    }

    @Override // dki.g, yji.l
    public final void K1() {
        super.K1();
        j jVarP2 = P2();
        af0.a listener = this.f161974t;
        Intrinsics.checkNotNullParameter(listener, "listener");
        jVarP2.f161987b.remove(listener);
    }

    public TransitionAnimation O2() {
        return this.v;
    }

    public final j P2() {
        j jVar = this.u;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("rootNavigator");
        throw null;
    }

    public final void Q2() {
        while (true) {
            ArrayList arrayList = this.f161975w;
            if (arrayList.isEmpty()) {
                return;
            }
            for (zki.i iVar : d0.P0(arrayList, new a())) {
                j jVarP2 = P2();
                ModalDestination tVar = iVar.c() ? new t(new com.revolut.kompot.common.b(iVar.b(), iVar.d(), 4)) : new com.revolut.kompot.common.b(iVar.b(), iVar.d(), 4);
                com.revolut.kompot.navigable.a aVar = iVar.f5291a;
                Intrinsics.h(aVar);
                jVarP2.c(tVar, aVar, true);
                arrayList.remove(iVar);
            }
        }
    }

    @Override // dki.g, yji.l
    public n o2(m event) {
        dki.j jVar;
        ao.h hVarA;
        Intrinsics.checkNotNullParameter(event, "event");
        n nVarO2 = super.o2(event);
        if (nVarO2 != null) {
            return nVarO2;
        }
        if (event instanceof v) {
            v vVar = (v) event;
            u uVarB = vVar.b();
            if (uVarB instanceof ModalDestination) {
                j jVarP2 = P2();
                ModalDestination modalDestination = (ModalDestination) vVar.b();
                com.revolut.kompot.navigable.a aVar = event.f5291a;
                Intrinsics.h(aVar);
                jVarP2.c(modalDestination, aVar, false);
            } else {
                if (!(uVarB instanceof ExternalDestination)) {
                    return super.o2(event);
                }
                ExternalDestination externalDestination = (ExternalDestination) vVar.b();
                com.revolut.kompot.navigable.a aVar2 = event.f5291a;
                Intrinsics.h(aVar2);
                if (externalDestination instanceof ExternalDestination.Browser) {
                    j jVarP22 = P2();
                    String url2 = ((ExternalDestination.Browser) externalDestination).getF98287a();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    jVarP22.b(new ExternalDestination.Browser(url2), jVarP22.f161986a);
                } else {
                    P2().b(externalDestination, aVar2);
                }
            }
            return w.f5295a;
        }
        com.revolut.kompot.navigable.b bVar = null;
        if (event instanceof b0) {
            dki.n nVar = P2().f161986a.L;
            com.revolut.kompot.navigable.b modal = nVar.e(0);
            if (modal != null) {
                Intrinsics.checkNotNullParameter(modal, "modal");
                dki.m mVarB = nVar.b(modal);
                k kVar = mVarB instanceof k ? (k) mVarB : null;
                if (kVar != null && (jVar = (dki.j) d0.o0(kVar.b())) != null && (hVarA = jVar.a()) != null) {
                    bVar = (com.revolut.kompot.navigable.b) hVarA.f7848c;
                }
                if (bVar != null) {
                    bVar.a();
                } else {
                    modal.a();
                }
            }
            return c0.f5280a;
        }
        if (event instanceof aii.c) {
            j jVarP23 = P2();
            com.revolut.kompot.navigable.a controller = ((aii.c) event).b();
            Intrinsics.checkNotNullParameter(controller, "controller");
            RootFlow rootFlow = jVarP23.f161986a;
            Intrinsics.checkNotNullParameter(controller, "controller");
            rootFlow.S.a(controller.u2().f98378a);
            return aii.d.f5281a;
        }
        boolean z = event instanceof zki.i;
        fli.b bVar2 = fli.b.f135995a;
        if (z) {
            this.f161975w.add(event);
            return bVar2;
        }
        if (!(event instanceof fli.e)) {
            return null;
        }
        if (this.f161976x) {
            Q2();
        }
        return bVar2;
    }

    @Override // dki.g
    public final TransitionAnimation v2() {
        return O2();
    }
}
