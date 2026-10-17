package om4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements al4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.e f226624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.q f226625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4 f226626c;

    public l(dp4.e creditCardAdditionalCardholdersRepository, al4.q creditCardProductInteractor, k4 familyCreditCardProductFeatureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersRepository, "creditCardAdditionalCardholdersRepository");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(familyCreditCardProductFeatureTogglesInteractor, "familyCreditCardProductFeatureTogglesInteractor");
        this.f226624a = creditCardAdditionalCardholdersRepository;
        this.f226625b = creditCardProductInteractor;
        this.f226626c = familyCreditCardProductFeatureTogglesInteractor;
    }

    public static final cxe.u a(l lVar, yw4.p pVar) {
        Flow flowI;
        int i = h.f226587a[pVar.f317331l.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            od0.h hVar = od0.i.Companion;
            el4.h hVar2 = new el4.h(0);
            hVar.getClass();
            flowI = zi0.c.i(od0.h.a(hVar2));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowI = rd0.e.e(new vkm.v1(new nyd.j(lVar, pVar, continuation, 23)), zhm.h0.f322473a, new im2.b(3, 28, continuation));
        }
        return n14.k.p(xam.a.h(new k(pVar, lVar, null), flowI), new okk.d(20));
    }

    public final vkm.d b(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        dp4.e eVar = this.f226624a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return eVar.d.b(new cp4.b(facilityId), loadingStrategy);
    }

    public final vkm.d c(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        dp4.e eVar = this.f226624a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return eVar.e.b(new cp4.d(facilityId), loadingStrategy);
    }

    public final Object d(String str, String str2, gim.i iVar) throws Throwable {
        dp4.e eVar = this.f226624a;
        eVar.getClass();
        dce.s0 s0Var = new dce.s0(eVar, str, str2, null, 10);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, s0Var, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object e(String str, String str2, el4.g gVar, gim.c cVar) throws Throwable {
        dp4.e eVar = this.f226624a;
        eVar.getClass();
        c5a.m0 m0Var = new c5a.m0(29, eVar, str, str2, gVar, null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, m0Var, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
