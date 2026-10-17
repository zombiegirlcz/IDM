package zk8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_referrals.impl.services.JuniorReferralsService;
import efm.d0;
import java.lang.reflect.Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import sk8.b;
import ufm.i;
import w4l.f;
import wim.z;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements a {

    @NotNull
    public static final d Companion = new d();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorReferralsService f322919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f322920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f322921c;
    public final f d;

    static {
        Type type = new TypeToken<yk8.b>() { // from class: com.revolut.feature.junior_referrals.impl.repositories.JuniorReferralsRepositoryImpl$Companion$JUNIOR_REFERRAL_CAMPAIGN_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public e(JuniorReferralsService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f322919a = service;
        this.f322920b = memoryCache;
        this.f322921c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: zk8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f322916b;

            {
                this.f322916b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                yk8.b bVar;
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<xk8.b> juniorCampaign = this.f322916b.f322919a.getJuniorCampaign(juniorId);
                        zii.e eVar = new zii.e(new zii.c(25), 2);
                        juniorCampaign.getClass();
                        i iVar = new i(juniorCampaign, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String juniorId2 = (String) obj2;
                        sk8.b value = (sk8.b) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f322916b.f322920b.f(e.a(juniorId2), value);
                        return Unit.f186387a;
                    default:
                        String juniorId3 = (String) obj2;
                        sk8.b referralCampaign = (sk8.b) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(referralCampaign, "referralCampaign");
                        ue0.c cVar = this.f322916b.f322921c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(referralCampaign, "<this>");
                        if (referralCampaign instanceof sk8.a) {
                            sk8.a aVar = (sk8.a) referralCampaign;
                            bVar = new yk8.b(new yk8.a(aVar.f263779b, hx7.a.A(aVar.f263778a)));
                        } else {
                            if (!(referralCampaign instanceof b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new yk8.b(null);
                        }
                        cVar.G(bVar, strA, z.d(o0.b(yk8.b.class)));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: zk8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f322918b;

            {
                this.f322918b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String juniorId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (sk8.b) this.f322918b.f322920b.get(e.a(juniorId));
                    default:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        yk8.b bVar = (yk8.b) this.f322918b.f322921c.T2(e.a(juniorId), e.e);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        return bVar.getCampaign() == null ? b.a.f263780a : new sk8.a(hx7.a.v(bVar.getCampaign().getReferrerReward()), bVar.getCampaign().getTermsUrl());
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: zk8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f322916b;

            {
                this.f322916b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                yk8.b bVar;
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<xk8.b> juniorCampaign = this.f322916b.f322919a.getJuniorCampaign(juniorId);
                        zii.e eVar = new zii.e(new zii.c(25), 2);
                        juniorCampaign.getClass();
                        i iVar = new i(juniorCampaign, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String juniorId2 = (String) obj2;
                        sk8.b value = (sk8.b) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f322916b.f322920b.f(e.a(juniorId2), value);
                        return Unit.f186387a;
                    default:
                        String juniorId3 = (String) obj2;
                        sk8.b referralCampaign = (sk8.b) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(referralCampaign, "referralCampaign");
                        ue0.c cVar = this.f322916b.f322921c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(referralCampaign, "<this>");
                        if (referralCampaign instanceof sk8.a) {
                            sk8.a aVar = (sk8.a) referralCampaign;
                            bVar = new yk8.b(new yk8.a(aVar.f263779b, hx7.a.A(aVar.f263778a)));
                        } else {
                            if (!(referralCampaign instanceof b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new yk8.b(null);
                        }
                        cVar.G(bVar, strA, z.d(o0.b(yk8.b.class)));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: zk8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f322918b;

            {
                this.f322918b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String juniorId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (sk8.b) this.f322918b.f322920b.get(e.a(juniorId));
                    default:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        yk8.b bVar = (yk8.b) this.f322918b.f322921c.T2(e.a(juniorId), e.e);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        return bVar.getCampaign() == null ? b.a.f263780a : new sk8.a(hx7.a.v(bVar.getCampaign().getReferrerReward()), bVar.getCampaign().getTermsUrl());
                }
            }
        };
        final int i3 = 2;
        this.d = new f(function2, function1, function22, function12, new Function2(this) { // from class: zk8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f322916b;

            {
                this.f322916b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                yk8.b bVar;
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<xk8.b> juniorCampaign = this.f322916b.f322919a.getJuniorCampaign(juniorId);
                        zii.e eVar = new zii.e(new zii.c(25), 2);
                        juniorCampaign.getClass();
                        i iVar = new i(juniorCampaign, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String juniorId2 = (String) obj2;
                        sk8.b value = (sk8.b) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f322916b.f322920b.f(e.a(juniorId2), value);
                        return Unit.f186387a;
                    default:
                        String juniorId3 = (String) obj2;
                        sk8.b referralCampaign = (sk8.b) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(referralCampaign, "referralCampaign");
                        ue0.c cVar = this.f322916b.f322921c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(referralCampaign, "<this>");
                        if (referralCampaign instanceof sk8.a) {
                            sk8.a aVar = (sk8.a) referralCampaign;
                            bVar = new yk8.b(new yk8.a(aVar.f263779b, hx7.a.A(aVar.f263778a)));
                        } else {
                            if (!(referralCampaign instanceof b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new yk8.b(null);
                        }
                        cVar.G(bVar, strA, z.d(o0.b(yk8.b.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(String str) {
        return j6.a.q("CACHE_KEY_REFERRAL_CAMPAIGN", str);
    }
}
