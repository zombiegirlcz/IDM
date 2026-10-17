package hma;

import com.revolut.data.network.models.security.SecuritySettings;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f153615b;

    public /* synthetic */ p(s sVar, int i) {
        this.f153614a = i;
        this.f153615b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f153614a) {
            case 0:
                qla.a profileType = (qla.a) obj2;
                Intrinsics.checkNotNullParameter(profileType, "profileType");
                s sVar = this.f153615b;
                Flow flowV = nim.a.v(rd0.e.b(sVar.f153621c.b()), new coa.h(sVar, profileType));
                if (!((Boolean) sVar.f153622g.getValue()).booleanValue()) {
                    flowV = boh.f.e(flowV, new hie.b(1, sVar, s.class, "filterByCryptoAvailability", "filterByCryptoAvailability(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0, 4));
                }
                return boh.f.e(nim.a.v(flowV, new hie.b(1, sVar, s.class, "filterByRevolutPayTrackingAvailability", "filterByRevolutPayTrackingAvailability(Ljava/util/List;)Ljava/util/List;", 0, 5)), new hm3.b(sVar, profileType, 2));
            default:
                return this.f153615b.f153619a.c(SecuritySettings.PERSONALIZED_THIRD_PARTY_PROMOTION, ((Boolean) obj2).booleanValue());
        }
    }
}
