package om4;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5h.g f226650a;

    public n4(a5h.g securedCreditCardRepository) {
        Intrinsics.checkNotNullParameter(securedCreditCardRepository, "securedCreditCardRepository");
        this.f226650a = securedCreditCardRepository;
    }

    public final vkm.d a(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((x4l.c) this.f226650a.f).b(new cp4.k0(facilityId), loadingStrategy);
    }

    public final Object b(String str, gim.c cVar) {
        Object objD = ((x4l.c) this.f226650a.f).d(new cp4.k0(str), false, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }
}
