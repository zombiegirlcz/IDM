package ald;

import android.app.Application;
import com.appsflyer.AppsFlyerLib;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherFragment;
import com.revolut.kompot.navigable.screen.BaseScreen;
import cp4.i0;
import dp4.o0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import no.z;
import skm.e0;
import skm.p0;
import te0.w;
import vkm.q0;
import zh9.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f6240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Serializable serializable, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f6240w = serializable;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p((r) this.f6240w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p((o0) this.f6240w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            case 2:
                p pVar3 = new p((ff8.d) this.f6240w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
            case 3:
                p pVar4 = new p((hi3.i) this.f6240w, continuation, 3);
                pVar4.v = obj2;
                return pVar4;
            case 4:
                return new p((i1b.f) this.v, (String) this.f6240w, continuation, 4);
            case 5:
                p pVar5 = new p((iwj.a) this.f6240w, continuation, 5);
                pVar5.v = obj2;
                return pVar5;
            case 6:
                p pVar6 = new p((BaseScreen) this.f6240w, continuation, 6);
                pVar6.v = obj2;
                return pVar6;
            case 7:
                p pVar7 = new p((jki.g) this.f6240w, continuation, 7);
                pVar7.v = obj2;
                return pVar7;
            case 8:
                return new p((l1b.g) this.v, (do3.n) this.f6240w, continuation, 8);
            case 9:
                p pVar8 = new p((mii.d) this.f6240w, continuation, 9);
                pVar8.v = obj2;
                return pVar8;
            case 10:
                p pVar9 = new p((z) this.f6240w, continuation, 10);
                pVar9.v = obj2;
                return pVar9;
            case 11:
                p pVar10 = new p((qj8.j) this.f6240w, continuation, 11);
                pVar10.v = obj2;
                return pVar10;
            case 12:
                p pVar11 = new p((KompotLauncherFragment) this.f6240w, continuation, 12);
                pVar11.v = obj2;
                return pVar11;
            case 13:
                p pVar12 = new p((vpk.p) this.f6240w, continuation, 13);
                pVar12.v = obj2;
                return pVar12;
            case 14:
                p pVar13 = new p((xr3.k) this.f6240w, continuation, 14);
                pVar13.v = obj2;
                return pVar13;
            case 15:
                p pVar14 = new p((z10.e) this.f6240w, continuation, 15);
                pVar14.v = obj2;
                return pVar14;
            default:
                p pVar15 = new p((zuh.o) this.f6240w, continuation, 16);
                pVar15.v = obj2;
                return pVar15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((SlotContext) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((i0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((p) create((hi3.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((p) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((p) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((p) create((IndexedValue) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((p) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((p) create((al0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((p) create((com.revolut.kompot.navigable.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((p) create((vpk.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((p) create((xr3.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((p) create((r20.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((pil.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Address address;
        int i = 8;
        Object arrayList = 0;
        country = null;
        String country = null;
        switch (this.u) {
            case 0:
                SlotContext slotContext = (SlotContext) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) this.f6240w;
                return (tkd.l) j6.a.k(tkd.l.class, rVar.d, rVar.b(slotContext));
            case 1:
                i0 i0Var = (i0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ko4.a aVar3 = (ko4.a) ((o0) this.f6240w).f116673c.a(i0Var);
                if (aVar3 != null) {
                    return ko4.b.a(aVar3);
                }
                return null;
            case 2:
                String str = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) ((ff8.d) this.f6240w).f134770c.T2(ff8.c.a(ff8.d.Companion, str), ff8.d.f134767g);
                if (list != null) {
                    return ue8.b.b(list);
                }
                return null;
            case 3:
                hi3.e eVar = (hi3.e) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((hi3.i) this.f6240w).f152490c;
                String strC = eVar.c("pre_orders");
                hi3.i.Companion.getClass();
                List list2 = (List) cVar.T2(strC, hi3.i.f152486g);
                if (list2 != null) {
                    arrayList = new ArrayList();
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        pi3.l lVarV = gc0.c.v((mi3.c) it8.next());
                        if (lVarV != null) {
                            arrayList.add(lVarV);
                        }
                    }
                }
                return arrayList;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i1b.f fVar = (i1b.f) this.v;
                AppsFlyerLib appsFlyerLib = fVar.f157601b;
                String str2 = (String) this.f6240w;
                appsFlyerLib.setCustomerUserId(str2);
                l1b.g gVar = (l1b.g) fVar.f157602c;
                CoroutineScope coroutineScope = gVar.e;
                p0 p0Var = p0.f264001a;
                e0.C(coroutineScope, elm.f.f127540b, null, new afe.a(gVar, str2, (Continuation) arrayList, i), 2);
                return Unit.f186387a;
            case 5:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                do3.n nVar = (do3.n) iVar.f224257a;
                if (nVar != null) {
                    iwj.a aVar8 = (iwj.a) this.f6240w;
                    aVar8.f169176l = nVar.f116408a;
                    if (nVar.k != null) {
                        aVar8.f169174h = w.V(nVar);
                        if (aVar8.f169174h) {
                            Application application = aVar8.f;
                            if (application != null) {
                                application.registerActivityLifecycleCallbacks(aVar8);
                            }
                            nhi.k.a(aVar8);
                            vkm.q.G(new q0(rd0.e.b(((z39.b) aVar8.f169171b).f319221b.j()), new iug.j(aVar8, (Continuation) arrayList, i), 1), aVar8.f169173g);
                            e0.C(aVar8.f169173g, null, null, new ikf.g(aVar8, (Continuation) arrayList, 24), 3);
                        } else {
                            aVar8.clear();
                        }
                    }
                }
                return Unit.f186387a;
            case 6:
                BaseScreen baseScreen = (BaseScreen) this.f6240w;
                Pair pair = (Pair) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jki.m mVar = (jki.m) pair.f186385a;
                jki.m mVar2 = (jki.m) pair.f186386b;
                jki.o oVarB = mVar != null ? mVar2.b(mVar) : null;
                long jNanoTime = System.nanoTime();
                baseScreen.Z2(mVar2, oVarB);
                baseScreen.E.a(System.nanoTime() - jNanoTime);
                return Unit.f186387a;
            case 7:
                IndexedValue indexedValue = (IndexedValue) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new akg.n(new go.g(indexedValue.f186392b, 2), ((jki.g) this.f6240w).f175188l, 3);
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l1b.g gVar2 = (l1b.g) this.v;
                do3.n nVar2 = (do3.n) this.f6240w;
                if (nVar2 != null && (address = nVar2.k) != null) {
                    country = address.getCountry();
                }
                if (country == null) {
                    country = "";
                }
                l1b.g.j3(gVar2, country);
                return Unit.f186387a;
            case 9:
                mii.q qVar = (mii.q) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((mii.d) this.f6240w).g(qVar);
                return Unit.f186387a;
            case 10:
                al0.a aVar13 = (al0.a) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) this.f6240w).f217890n.set(aVar13);
                return Unit.f186387a;
            case 11:
                String str3 = (String) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return p.a.j(com.revolut.feature.junior_profile.api.models.a.class, KTypeProjection.INSTANCE, List.class, ((qj8.j) this.f6240w).f246790c, qj8.e.a(qj8.j.Companion, str3));
            case 12:
                com.revolut.kompot.navigable.a aVar16 = (com.revolut.kompot.navigable.a) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (aVar16 instanceof BaseScreen) {
                    ((KompotLauncherFragment) this.f6240w).c0 = aVar16;
                }
                return Unit.f186387a;
            case 13:
                vpk.g gVar3 = (vpk.g) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return d8l.d.E(((vpk.p) this.f6240w).d.d(cp5.d.d(gVar3.a()), io3.h.S(gVar3.c()).a()));
            case 14:
                xr3.i iVar2 = (xr3.i) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tr3.c cVar2 = (tr3.c) ((xr3.k) this.f6240w).d.T2(xr3.k.a(iVar2), tr3.c.class);
                if (cVar2 != null) {
                    return u0.P(cVar2);
                }
                return null;
            case 15:
                r20.h hVar = (r20.h) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z10.e) this.f6240w).f318714h.setValue(hVar);
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "OkHttpChatWsApiV2", "state:" + hVar, null, null, 16);
                return Unit.f186387a;
            default:
                pil.d dVar = (pil.d) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return p.a.j(String.class, KTypeProjection.INSTANCE, List.class, ((zuh.o) this.f6240w).f325480a, zuh.o.b(dVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6240w = obj2;
    }
}
