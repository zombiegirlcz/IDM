package om4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class k3 {

    @NotNull
    public static final i3 Companion = new i3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f226619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dp4.c1 f226620b;

    public k3(mk0.a personalisationStorage, dp4.c1 creditCardRepository) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(creditCardRepository, "creditCardRepository");
        this.f226619a = personalisationStorage;
        this.f226620b = creditCardRepository;
    }

    public final cxe.u a(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Companion.getClass();
        Intrinsics.checkNotNullParameter("CREDIT_CARD_BALANCE_DISPLAY_SETTING", "id");
        ahe.i iVar = new ahe.i(oc.c.t(this.f226619a, new tk0.d("CREDIT_CARD_BALANCE_DISPLAY_SETTING"), "UNSELECTED"), 12);
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return n14.k.p(nim.a.v(zh9.u0.m(iVar, this.f226620b.v.b(new cp4.h0(facilityId), loadingStrategy)), new o0(25)), new o0(26));
    }

    public final Object b(String str, gim.i iVar) throws Throwable {
        oh4.i iVar2 = new oh4.i(20, this, str, (Continuation) null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, iVar2, iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
