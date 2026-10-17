package rs2;

import com.google.gson.reflect.TypeToken;
import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p24.q;
import rnd.d0;
import ru.y;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements vu.d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Type f256953m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5j.g f256954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f256955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f256956c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f256957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f256958h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f256959j;
    public final x4l.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f256960l;

    static {
        Type type = new TypeToken<List<? extends tu.h>>() { // from class: com.revolut.feature.business.referrals.data.repository.ReferralWithIncentiveCampaignRepositoryImpl$Companion$targetAccountDtoListType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f256953m = type;
    }

    public n(m5j.g service, ue0.c storage, ne0.j cache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f256954a = service;
        this.f256955b = storage;
        this.f256956c = cache;
        Continuation continuation = null;
        f fVar = new f(this, continuation, 3);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: rs2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256941b;

            {
                this.f256941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y) this.f256941b.f256956c.get("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (ru.k) this.f256941b.f256956c.get("ACTIVE_CAMPAIGN_STATE_KEY");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (ru.k) this.f256941b.f256956c.get("INACTIVE_CAMPAIGN_STATE_KEY");
                    case 3:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (ru.a) this.f256941b.f256956c.get(n.c(params));
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f256941b.f256956c.get("PERSONAL_ACCOUNT_KEY");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f256941b.f256956c.get("BUSINESS_ACCOUNT_KEY");
                    case 6:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        return (List) this.f256941b.f256956c.get("RECENT_ACCOUNTS_KEY");
                    default:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) v7.r("ACCOUNT_IMAGE_KEY", params2.f50671a, this.f256941b.f256956c);
                }
            }
        };
        final int i2 = 7;
        this.d = new x4l.c(fVar, function1, new Function2(this) { // from class: rs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256943b;

            {
                this.f256943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ru.k data = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f256943b.f256956c.f("ACTIVE_CAMPAIGN_STATE_KEY", data);
                        break;
                    case 1:
                        ru.k data2 = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f256943b.f256956c.f("INACTIVE_CAMPAIGN_STATE_KEY", data2);
                        break;
                    case 2:
                        String params = (String) obj2;
                        ru.a data3 = (ru.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f256943b.f256956c.f(n.c(params), data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        this.f256943b.f256956c.f("PERSONAL_ACCOUNT_KEY", data4);
                        break;
                    case 4:
                        List data5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f256943b.f256956c.f("BUSINESS_ACCOUNT_KEY", data5);
                        break;
                    case 5:
                        List data6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data6, "data");
                        this.f256943b.f256956c.f("RECENT_ACCOUNTS_KEY", data6);
                        break;
                    case 6:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        String data7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data7, "data");
                        if (m70.a.l(data7) != null) {
                            this.f256943b.f256956c.f("ACCOUNT_IMAGE_KEY" + params2.f50671a, data7);
                        }
                        break;
                    default:
                        y data8 = (y) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data8, "data");
                        this.f256943b.f256956c.f("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", data8);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, 2), new q(this, continuation, 25));
        final int i3 = 1;
        f fVar2 = new f(this, continuation, i3);
        Function1 function12 = new Function1(this) { // from class: rs2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256941b;

            {
                this.f256941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y) this.f256941b.f256956c.get("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (ru.k) this.f256941b.f256956c.get("ACTIVE_CAMPAIGN_STATE_KEY");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (ru.k) this.f256941b.f256956c.get("INACTIVE_CAMPAIGN_STATE_KEY");
                    case 3:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (ru.a) this.f256941b.f256956c.get(n.c(params));
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f256941b.f256956c.get("PERSONAL_ACCOUNT_KEY");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f256941b.f256956c.get("BUSINESS_ACCOUNT_KEY");
                    case 6:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        return (List) this.f256941b.f256956c.get("RECENT_ACCOUNTS_KEY");
                    default:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) v7.r("ACCOUNT_IMAGE_KEY", params2.f50671a, this.f256941b.f256956c);
                }
            }
        };
        final int i5 = 0;
        this.e = new x4l.c(fVar2, function12, new Function2(this) { // from class: rs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256943b;

            {
                this.f256943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        ru.k data = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f256943b.f256956c.f("ACTIVE_CAMPAIGN_STATE_KEY", data);
                        break;
                    case 1:
                        ru.k data2 = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f256943b.f256956c.f("INACTIVE_CAMPAIGN_STATE_KEY", data2);
                        break;
                    case 2:
                        String params = (String) obj2;
                        ru.a data3 = (ru.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f256943b.f256956c.f(n.c(params), data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        this.f256943b.f256956c.f("PERSONAL_ACCOUNT_KEY", data4);
                        break;
                    case 4:
                        List data5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f256943b.f256956c.f("BUSINESS_ACCOUNT_KEY", data5);
                        break;
                    case 5:
                        List data6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data6, "data");
                        this.f256943b.f256956c.f("RECENT_ACCOUNTS_KEY", data6);
                        break;
                    case 6:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        String data7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data7, "data");
                        if (m70.a.l(data7) != null) {
                            this.f256943b.f256956c.f("ACCOUNT_IMAGE_KEY" + params2.f50671a, data7);
                        }
                        break;
                    default:
                        y data8 = (y) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data8, "data");
                        this.f256943b.f256956c.f("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", data8);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, i5), new h(this, continuation, i5));
        f fVar3 = new f(this, continuation, 4);
        final int i6 = 2;
        Function1 function13 = new Function1(this) { // from class: rs2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256941b;

            {
                this.f256941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y) this.f256941b.f256956c.get("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (ru.k) this.f256941b.f256956c.get("ACTIVE_CAMPAIGN_STATE_KEY");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (ru.k) this.f256941b.f256956c.get("INACTIVE_CAMPAIGN_STATE_KEY");
                    case 3:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (ru.a) this.f256941b.f256956c.get(n.c(params));
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f256941b.f256956c.get("PERSONAL_ACCOUNT_KEY");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f256941b.f256956c.get("BUSINESS_ACCOUNT_KEY");
                    case 6:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        return (List) this.f256941b.f256956c.get("RECENT_ACCOUNTS_KEY");
                    default:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) v7.r("ACCOUNT_IMAGE_KEY", params2.f50671a, this.f256941b.f256956c);
                }
            }
        };
        final int i21 = 1;
        this.f = new x4l.c(fVar3, function13, new Function2(this) { // from class: rs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256943b;

            {
                this.f256943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        ru.k data = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f256943b.f256956c.f("ACTIVE_CAMPAIGN_STATE_KEY", data);
                        break;
                    case 1:
                        ru.k data2 = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f256943b.f256956c.f("INACTIVE_CAMPAIGN_STATE_KEY", data2);
                        break;
                    case 2:
                        String params = (String) obj2;
                        ru.a data3 = (ru.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f256943b.f256956c.f(n.c(params), data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        this.f256943b.f256956c.f("PERSONAL_ACCOUNT_KEY", data4);
                        break;
                    case 4:
                        List data5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f256943b.f256956c.f("BUSINESS_ACCOUNT_KEY", data5);
                        break;
                    case 5:
                        List data6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data6, "data");
                        this.f256943b.f256956c.f("RECENT_ACCOUNTS_KEY", data6);
                        break;
                    case 6:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        String data7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data7, "data");
                        if (m70.a.l(data7) != null) {
                            this.f256943b.f256956c.f("ACCOUNT_IMAGE_KEY" + params2.f50671a, data7);
                        }
                        break;
                    default:
                        y data8 = (y) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data8, "data");
                        this.f256943b.f256956c.f("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", data8);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, 3), new h(this, continuation, 1));
        pti.d dVar = new pti.d(this, continuation, 15);
        final int i22 = 3;
        Function1 function14 = new Function1(this) { // from class: rs2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256941b;

            {
                this.f256941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y) this.f256941b.f256956c.get("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (ru.k) this.f256941b.f256956c.get("ACTIVE_CAMPAIGN_STATE_KEY");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (ru.k) this.f256941b.f256956c.get("INACTIVE_CAMPAIGN_STATE_KEY");
                    case 3:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (ru.a) this.f256941b.f256956c.get(n.c(params));
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f256941b.f256956c.get("PERSONAL_ACCOUNT_KEY");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f256941b.f256956c.get("BUSINESS_ACCOUNT_KEY");
                    case 6:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        return (List) this.f256941b.f256956c.get("RECENT_ACCOUNTS_KEY");
                    default:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) v7.r("ACCOUNT_IMAGE_KEY", params2.f50671a, this.f256941b.f256956c);
                }
            }
        };
        final int i32 = 2;
        this.f256957g = new x4l.c(dVar, function14, new Function2(this) { // from class: rs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256943b;

            {
                this.f256943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        ru.k data = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f256943b.f256956c.f("ACTIVE_CAMPAIGN_STATE_KEY", data);
                        break;
                    case 1:
                        ru.k data2 = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f256943b.f256956c.f("INACTIVE_CAMPAIGN_STATE_KEY", data2);
                        break;
                    case 2:
                        String params = (String) obj2;
                        ru.a data3 = (ru.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f256943b.f256956c.f(n.c(params), data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        this.f256943b.f256956c.f("PERSONAL_ACCOUNT_KEY", data4);
                        break;
                    case 4:
                        List data5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f256943b.f256956c.f("BUSINESS_ACCOUNT_KEY", data5);
                        break;
                    case 5:
                        List data6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data6, "data");
                        this.f256943b.f256956c.f("RECENT_ACCOUNTS_KEY", data6);
                        break;
                    case 6:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        String data7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data7, "data");
                        if (m70.a.l(data7) != null) {
                            this.f256943b.f256956c.f("ACCOUNT_IMAGE_KEY" + params2.f50671a, data7);
                        }
                        break;
                    default:
                        y data8 = (y) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data8, "data");
                        this.f256943b.f256956c.f("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", data8);
                        break;
                }
                return Unit.f186387a;
            }
        }, new rk9.d(this, continuation, 26), new pfk.q(this, continuation, 23));
        f fVar4 = new f(this, continuation, 5);
        final int i33 = 4;
        Function1 function15 = new Function1(this) { // from class: rs2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256941b;

            {
                this.f256941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y) this.f256941b.f256956c.get("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (ru.k) this.f256941b.f256956c.get("ACTIVE_CAMPAIGN_STATE_KEY");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (ru.k) this.f256941b.f256956c.get("INACTIVE_CAMPAIGN_STATE_KEY");
                    case 3:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (ru.a) this.f256941b.f256956c.get(n.c(params));
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f256941b.f256956c.get("PERSONAL_ACCOUNT_KEY");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f256941b.f256956c.get("BUSINESS_ACCOUNT_KEY");
                    case 6:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        return (List) this.f256941b.f256956c.get("RECENT_ACCOUNTS_KEY");
                    default:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) v7.r("ACCOUNT_IMAGE_KEY", params2.f50671a, this.f256941b.f256956c);
                }
            }
        };
        final int i43 = 3;
        this.f256958h = new x4l.c(fVar4, function15, new Function2(this) { // from class: rs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256943b;

            {
                this.f256943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        ru.k data = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f256943b.f256956c.f("ACTIVE_CAMPAIGN_STATE_KEY", data);
                        break;
                    case 1:
                        ru.k data2 = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f256943b.f256956c.f("INACTIVE_CAMPAIGN_STATE_KEY", data2);
                        break;
                    case 2:
                        String params = (String) obj2;
                        ru.a data3 = (ru.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f256943b.f256956c.f(n.c(params), data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        this.f256943b.f256956c.f("PERSONAL_ACCOUNT_KEY", data4);
                        break;
                    case 4:
                        List data5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f256943b.f256956c.f("BUSINESS_ACCOUNT_KEY", data5);
                        break;
                    case 5:
                        List data6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data6, "data");
                        this.f256943b.f256956c.f("RECENT_ACCOUNTS_KEY", data6);
                        break;
                    case 6:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        String data7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data7, "data");
                        if (m70.a.l(data7) != null) {
                            this.f256943b.f256956c.f("ACCOUNT_IMAGE_KEY" + params2.f50671a, data7);
                        }
                        break;
                    default:
                        y data8 = (y) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data8, "data");
                        this.f256943b.f256956c.f("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", data8);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, 4), new i(this, continuation, 1));
        f fVar5 = new f(this, continuation, 2);
        final int i59 = 5;
        Function1 function16 = new Function1(this) { // from class: rs2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256941b;

            {
                this.f256941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i59) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y) this.f256941b.f256956c.get("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (ru.k) this.f256941b.f256956c.get("ACTIVE_CAMPAIGN_STATE_KEY");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (ru.k) this.f256941b.f256956c.get("INACTIVE_CAMPAIGN_STATE_KEY");
                    case 3:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (ru.a) this.f256941b.f256956c.get(n.c(params));
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f256941b.f256956c.get("PERSONAL_ACCOUNT_KEY");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f256941b.f256956c.get("BUSINESS_ACCOUNT_KEY");
                    case 6:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        return (List) this.f256941b.f256956c.get("RECENT_ACCOUNTS_KEY");
                    default:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) v7.r("ACCOUNT_IMAGE_KEY", params2.f50671a, this.f256941b.f256956c);
                }
            }
        };
        final int i66 = 4;
        this.i = new x4l.c(fVar5, function16, new Function2(this) { // from class: rs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256943b;

            {
                this.f256943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        ru.k data = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f256943b.f256956c.f("ACTIVE_CAMPAIGN_STATE_KEY", data);
                        break;
                    case 1:
                        ru.k data2 = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f256943b.f256956c.f("INACTIVE_CAMPAIGN_STATE_KEY", data2);
                        break;
                    case 2:
                        String params = (String) obj2;
                        ru.a data3 = (ru.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f256943b.f256956c.f(n.c(params), data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        this.f256943b.f256956c.f("PERSONAL_ACCOUNT_KEY", data4);
                        break;
                    case 4:
                        List data5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f256943b.f256956c.f("BUSINESS_ACCOUNT_KEY", data5);
                        break;
                    case 5:
                        List data6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data6, "data");
                        this.f256943b.f256956c.f("RECENT_ACCOUNTS_KEY", data6);
                        break;
                    case 6:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        String data7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data7, "data");
                        if (m70.a.l(data7) != null) {
                            this.f256943b.f256956c.f("ACCOUNT_IMAGE_KEY" + params2.f50671a, data7);
                        }
                        break;
                    default:
                        y data8 = (y) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data8, "data");
                        this.f256943b.f256956c.f("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", data8);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, 1), new i(this, continuation, 0));
        final int i74 = 6;
        f fVar6 = new f(this, continuation, i74);
        Function1 function17 = new Function1(this) { // from class: rs2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256941b;

            {
                this.f256941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i74) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y) this.f256941b.f256956c.get("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (ru.k) this.f256941b.f256956c.get("ACTIVE_CAMPAIGN_STATE_KEY");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (ru.k) this.f256941b.f256956c.get("INACTIVE_CAMPAIGN_STATE_KEY");
                    case 3:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (ru.a) this.f256941b.f256956c.get(n.c(params));
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f256941b.f256956c.get("PERSONAL_ACCOUNT_KEY");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f256941b.f256956c.get("BUSINESS_ACCOUNT_KEY");
                    case 6:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        return (List) this.f256941b.f256956c.get("RECENT_ACCOUNTS_KEY");
                    default:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) v7.r("ACCOUNT_IMAGE_KEY", params2.f50671a, this.f256941b.f256956c);
                }
            }
        };
        final int i92 = 5;
        this.f256959j = new x4l.c(fVar6, function17, new Function2(this) { // from class: rs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256943b;

            {
                this.f256943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        ru.k data = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f256943b.f256956c.f("ACTIVE_CAMPAIGN_STATE_KEY", data);
                        break;
                    case 1:
                        ru.k data2 = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f256943b.f256956c.f("INACTIVE_CAMPAIGN_STATE_KEY", data2);
                        break;
                    case 2:
                        String params = (String) obj2;
                        ru.a data3 = (ru.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f256943b.f256956c.f(n.c(params), data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        this.f256943b.f256956c.f("PERSONAL_ACCOUNT_KEY", data4);
                        break;
                    case 4:
                        List data5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f256943b.f256956c.f("BUSINESS_ACCOUNT_KEY", data5);
                        break;
                    case 5:
                        List data6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data6, "data");
                        this.f256943b.f256956c.f("RECENT_ACCOUNTS_KEY", data6);
                        break;
                    case 6:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        String data7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data7, "data");
                        if (m70.a.l(data7) != null) {
                            this.f256943b.f256956c.f("ACCOUNT_IMAGE_KEY" + params2.f50671a, data7);
                        }
                        break;
                    default:
                        y data8 = (y) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data8, "data");
                        this.f256943b.f256956c.f("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", data8);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, i92), new i(this, continuation, 2));
        int i96 = 2;
        int i99 = 3;
        this.k = new x4l.c(new f(this, continuation, 7), new rpi.e(23), new d0(20), new rp1.c(i96, 2, continuation), new nfj.i(i99, 17, continuation));
        f fVar7 = new f(this, continuation, 0);
        final int i100 = 7;
        Function1 function18 = new Function1(this) { // from class: rs2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256941b;

            {
                this.f256941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i100) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y) this.f256941b.f256956c.get("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (ru.k) this.f256941b.f256956c.get("ACTIVE_CAMPAIGN_STATE_KEY");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (ru.k) this.f256941b.f256956c.get("INACTIVE_CAMPAIGN_STATE_KEY");
                    case 3:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (ru.a) this.f256941b.f256956c.get(n.c(params));
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f256941b.f256956c.get("PERSONAL_ACCOUNT_KEY");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f256941b.f256956c.get("BUSINESS_ACCOUNT_KEY");
                    case 6:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        return (List) this.f256941b.f256956c.get("RECENT_ACCOUNTS_KEY");
                    default:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) v7.r("ACCOUNT_IMAGE_KEY", params2.f50671a, this.f256941b.f256956c);
                }
            }
        };
        final int i101 = 6;
        this.f256960l = new x4l.c(fVar7, function18, new Function2(this) { // from class: rs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f256943b;

            {
                this.f256943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i101) {
                    case 0:
                        ru.k data = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f256943b.f256956c.f("ACTIVE_CAMPAIGN_STATE_KEY", data);
                        break;
                    case 1:
                        ru.k data2 = (ru.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f256943b.f256956c.f("INACTIVE_CAMPAIGN_STATE_KEY", data2);
                        break;
                    case 2:
                        String params = (String) obj2;
                        ru.a data3 = (ru.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f256943b.f256956c.f(n.c(params), data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        this.f256943b.f256956c.f("PERSONAL_ACCOUNT_KEY", data4);
                        break;
                    case 4:
                        List data5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f256943b.f256956c.f("BUSINESS_ACCOUNT_KEY", data5);
                        break;
                    case 5:
                        List data6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data6, "data");
                        this.f256943b.f256956c.f("RECENT_ACCOUNTS_KEY", data6);
                        break;
                    case 6:
                        RewardTargetAccount params2 = (RewardTargetAccount) obj2;
                        String data7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data7, "data");
                        if (m70.a.l(data7) != null) {
                            this.f256943b.f256956c.f("ACCOUNT_IMAGE_KEY" + params2.f50671a, data7);
                        }
                        break;
                    default:
                        y data8 = (y) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data8, "data");
                        this.f256943b.f256956c.f("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", data8);
                        break;
                }
                return Unit.f186387a;
            }
        }, new rp1.c(i96, 1, continuation), new nfj.i(i99, 16, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:31:0x00bc, B:35:0x00c9, B:23:0x0080, B:25:0x0086, B:27:0x008f, B:36:0x00d4, B:40:0x00de), top: B:44:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:31:0x00bc, B:35:0x00c9, B:23:0x0080, B:25:0x0086, B:27:0x008f, B:36:0x00d4, B:40:0x00de), top: B:44:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b7 -> B:44:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c7 -> B:35:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rs2.n r17, com.revolut.data.model.Data r18, boolean r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rs2.n.a(rs2.n, com.revolut.data.model.Data, boolean, gim.c):java.lang.Object");
    }

    public static String c(String str) {
        return j6.a.q("CAMPAIGN_INVITEE_KEY", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.business.feature.referrals.model.RewardTargetAccount r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rs2.j
            if (r0 == 0) goto L13
            r0 = r6
            rs2.j r0 = (rs2.j) r0
            int r1 = r0.f256947w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256947w = r1
            goto L18
        L13:
            rs2.j r0 = new rs2.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256947w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            x4l.c r6 = r4.f256960l
            w4l.h r2 = w4l.h.f294642c
            vkm.d r5 = r6.b(r5, r2)
            r6 = 3
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r2, r6)
            r0.f256947w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = m70.a.l(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rs2.n.b(com.revolut.business.feature.referrals.model.RewardTargetAccount, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof rs2.l
            if (r0 == 0) goto L13
            r0 = r6
            rs2.l r0 = (rs2.l) r0
            int r1 = r0.f256949w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256949w = r1
            goto L18
        L13:
            rs2.l r0 = new rs2.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256949w
            r3 = 1
            if (r2 == 0) goto L45
            r4 = 2
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r6)
            goto L42
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            r0.f256949w = r4
            x4l.c r2 = r5.d
            java.lang.Object r6 = r2.d(r6, r3, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L45:
            yhm.o.b(r6)
            r0.f256949w = r3
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "C2B referrals don't support target accounts"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rs2.n.d(gim.c):java.lang.Object");
    }
}
