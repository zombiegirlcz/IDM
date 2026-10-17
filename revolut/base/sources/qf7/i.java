package qf7;

import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryParams;
import com.revolut.feature.incentive_reward.impl.network.IncentiveRewardService;
import gf7.o;
import java.util.Map;
import kf7.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pfk.q;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncentiveRewardService f245269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f245270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f245271c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f245272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1 f245273h;

    public i(IncentiveRewardService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f245269a = service;
        this.f245270b = memoryCache;
        this.f245271c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new pti.d(this, continuation, 6), new Function1(this) { // from class: qf7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f245259b;

            {
                this.f245259b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        IncentiveRewardDetailsParams params = (IncentiveRewardDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (hf7.c) jVar.get(c.c(params));
                    case 1:
                        Map contextParams = (Map) obj2;
                        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                        return (o) this.f245259b.f245270b.get(i.a(contextParams));
                    case 2:
                        LotteryParams params2 = (LotteryParams) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        j jVar2 = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (r) jVar2.get(c.b(params2));
                    default:
                        LotteryParams params3 = (LotteryParams) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar3 = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (com.revolut.feature.incentive_reward.impl.model.lotteries.b) jVar3.get(c.a(params3));
                }
            }
        }, new Function2(this) { // from class: qf7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f245261b;

            {
                this.f245261b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        IncentiveRewardDetailsParams params = (IncentiveRewardDetailsParams) obj2;
                        hf7.c domain = (hf7.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar.f(c.c(params), domain);
                        break;
                    case 1:
                        Map contextParams = (Map) obj2;
                        o domain2 = (o) obj3;
                        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f245261b.f245270b.f(i.a(contextParams), domain2);
                        break;
                    case 2:
                        LotteryParams params2 = (LotteryParams) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        j jVar2 = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar2.f(c.b(params2), domain3);
                        break;
                    default:
                        LotteryParams params3 = (LotteryParams) obj2;
                        com.revolut.feature.incentive_reward.impl.model.lotteries.b domain4 = (com.revolut.feature.incentive_reward.impl.model.lotteries.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        j jVar3 = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar3.f(c.a(params3), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new d(this, continuation, i), new q(this, continuation, 14));
        final int i2 = 1;
        this.e = new x4l.c(new pti.d(this, continuation, 7), new Function1(this) { // from class: qf7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f245259b;

            {
                this.f245259b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        IncentiveRewardDetailsParams params = (IncentiveRewardDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (hf7.c) jVar.get(c.c(params));
                    case 1:
                        Map contextParams = (Map) obj2;
                        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                        return (o) this.f245259b.f245270b.get(i.a(contextParams));
                    case 2:
                        LotteryParams params2 = (LotteryParams) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        j jVar2 = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (r) jVar2.get(c.b(params2));
                    default:
                        LotteryParams params3 = (LotteryParams) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar3 = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (com.revolut.feature.incentive_reward.impl.model.lotteries.b) jVar3.get(c.a(params3));
                }
            }
        }, new Function2(this) { // from class: qf7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f245261b;

            {
                this.f245261b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        IncentiveRewardDetailsParams params = (IncentiveRewardDetailsParams) obj2;
                        hf7.c domain = (hf7.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar.f(c.c(params), domain);
                        break;
                    case 1:
                        Map contextParams = (Map) obj2;
                        o domain2 = (o) obj3;
                        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f245261b.f245270b.f(i.a(contextParams), domain2);
                        break;
                    case 2:
                        LotteryParams params2 = (LotteryParams) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        j jVar2 = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar2.f(c.b(params2), domain3);
                        break;
                    default:
                        LotteryParams params3 = (LotteryParams) obj2;
                        com.revolut.feature.incentive_reward.impl.model.lotteries.b domain4 = (com.revolut.feature.incentive_reward.impl.model.lotteries.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        j jVar3 = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar3.f(c.a(params3), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new d(this, continuation, i2), new q(this, continuation, 15));
        final int i3 = 2;
        this.f = new x4l.c(new e(this, continuation, 1), new Function1(this) { // from class: qf7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f245259b;

            {
                this.f245259b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        IncentiveRewardDetailsParams params = (IncentiveRewardDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (hf7.c) jVar.get(c.c(params));
                    case 1:
                        Map contextParams = (Map) obj2;
                        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                        return (o) this.f245259b.f245270b.get(i.a(contextParams));
                    case 2:
                        LotteryParams params2 = (LotteryParams) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        j jVar2 = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (r) jVar2.get(c.b(params2));
                    default:
                        LotteryParams params3 = (LotteryParams) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar3 = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (com.revolut.feature.incentive_reward.impl.model.lotteries.b) jVar3.get(c.a(params3));
                }
            }
        }, new Function2(this) { // from class: qf7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f245261b;

            {
                this.f245261b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        IncentiveRewardDetailsParams params = (IncentiveRewardDetailsParams) obj2;
                        hf7.c domain = (hf7.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar.f(c.c(params), domain);
                        break;
                    case 1:
                        Map contextParams = (Map) obj2;
                        o domain2 = (o) obj3;
                        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f245261b.f245270b.f(i.a(contextParams), domain2);
                        break;
                    case 2:
                        LotteryParams params2 = (LotteryParams) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        j jVar2 = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar2.f(c.b(params2), domain3);
                        break;
                    default:
                        LotteryParams params3 = (LotteryParams) obj2;
                        com.revolut.feature.incentive_reward.impl.model.lotteries.b domain4 = (com.revolut.feature.incentive_reward.impl.model.lotteries.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        j jVar3 = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar3.f(c.a(params3), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new d(this, continuation, 3), new q(this, continuation, 17));
        final int i5 = 3;
        this.f245272g = new x4l.c(new e(this, continuation, 0), new Function1(this) { // from class: qf7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f245259b;

            {
                this.f245259b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        IncentiveRewardDetailsParams params = (IncentiveRewardDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (hf7.c) jVar.get(c.c(params));
                    case 1:
                        Map contextParams = (Map) obj2;
                        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                        return (o) this.f245259b.f245270b.get(i.a(contextParams));
                    case 2:
                        LotteryParams params2 = (LotteryParams) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        j jVar2 = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (r) jVar2.get(c.b(params2));
                    default:
                        LotteryParams params3 = (LotteryParams) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar3 = this.f245259b.f245270b;
                        i.Companion.getClass();
                        return (com.revolut.feature.incentive_reward.impl.model.lotteries.b) jVar3.get(c.a(params3));
                }
            }
        }, new Function2(this) { // from class: qf7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f245261b;

            {
                this.f245261b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        IncentiveRewardDetailsParams params = (IncentiveRewardDetailsParams) obj2;
                        hf7.c domain = (hf7.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar.f(c.c(params), domain);
                        break;
                    case 1:
                        Map contextParams = (Map) obj2;
                        o domain2 = (o) obj3;
                        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f245261b.f245270b.f(i.a(contextParams), domain2);
                        break;
                    case 2:
                        LotteryParams params2 = (LotteryParams) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        j jVar2 = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar2.f(c.b(params2), domain3);
                        break;
                    default:
                        LotteryParams params3 = (LotteryParams) obj2;
                        com.revolut.feature.incentive_reward.impl.model.lotteries.b domain4 = (com.revolut.feature.incentive_reward.impl.model.lotteries.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        j jVar3 = this.f245261b.f245270b;
                        i.Companion.getClass();
                        jVar3.f(c.a(params3), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new d(this, continuation, 2), new q(this, continuation, 16));
        this.f245273h = vkm.q.b(0, 7, null);
    }

    public static String a(Map map) {
        return "INCENTIVE_SELECTION_KEY_" + map;
    }
}
