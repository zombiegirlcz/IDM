package a09;

import androidx.room.util.DBUtil;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import jz8.c1;
import jz8.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import u09.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnService f269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz8.l f270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f271c;
    public final w4l.f d;

    public j0(LearnService service, hz8.l dao, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f269a = service;
        this.f270b = dao;
        this.f271c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: a09.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f258b;

            {
                this.f258b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                j0 j0Var = this.f258b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<zz8.f> totalRewards = j0Var.f269a.getTotalRewards();
                        i0 i0Var = i0.f;
                        a0.b bVar = new a0.b(5);
                        totalRewards.getClass();
                        ufm.i iVar = new ufm.i(totalRewards, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        p0 info = (p0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(info, "info");
                        j0Var.f271c.f("LearnRewardsRepositoryImpl_CACHE_KEY", info);
                        break;
                    default:
                        p0 info2 = (p0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        hz8.l lVar = j0Var.f270b;
                        Intrinsics.checkNotNullParameter(info2, "<this>");
                        dj0.d dVar = info2.f276144a;
                        c1 c1Var = new c1("learn_rewards_total_earned_info", dVar != null ? new u0(dVar.f115082a, dVar.f115083b.f306286a) : null);
                        lVar.getClass();
                        DBUtil.performBlocking(lVar.f157081a, false, true, new hul.v(lVar, c1Var, 18));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: a09.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f261b;

            {
                this.f261b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (p0) this.f261b.f271c.get("LearnRewardsRepositoryImpl_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        c1 c1Var = (c1) DBUtil.performBlocking(this.f261b.f270b.f157081a, true, false, new hy2.k(17));
                        dj0.d dVar = null;
                        if (c1Var == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(c1Var, "<this>");
                        u0 u0Var = c1Var.f179608b;
                        if (u0Var != null) {
                            long j2 = u0Var.f179672a;
                            xi0.a aVar = xi0.b.Companion;
                            String str = u0Var.f179673b;
                            aVar.getClass();
                            dVar = new dj0.d(j2, xi0.a.a(str));
                        }
                        return new p0(dVar);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: a09.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f258b;

            {
                this.f258b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                j0 j0Var = this.f258b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<zz8.f> totalRewards = j0Var.f269a.getTotalRewards();
                        i0 i0Var = i0.f;
                        a0.b bVar = new a0.b(5);
                        totalRewards.getClass();
                        ufm.i iVar = new ufm.i(totalRewards, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        p0 info = (p0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(info, "info");
                        j0Var.f271c.f("LearnRewardsRepositoryImpl_CACHE_KEY", info);
                        break;
                    default:
                        p0 info2 = (p0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        hz8.l lVar = j0Var.f270b;
                        Intrinsics.checkNotNullParameter(info2, "<this>");
                        dj0.d dVar = info2.f276144a;
                        c1 c1Var = new c1("learn_rewards_total_earned_info", dVar != null ? new u0(dVar.f115082a, dVar.f115083b.f306286a) : null);
                        lVar.getClass();
                        DBUtil.performBlocking(lVar.f157081a, false, true, new hul.v(lVar, c1Var, 18));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: a09.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f261b;

            {
                this.f261b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (p0) this.f261b.f271c.get("LearnRewardsRepositoryImpl_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        c1 c1Var = (c1) DBUtil.performBlocking(this.f261b.f270b.f157081a, true, false, new hy2.k(17));
                        dj0.d dVar = null;
                        if (c1Var == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(c1Var, "<this>");
                        u0 u0Var = c1Var.f179608b;
                        if (u0Var != null) {
                            long j2 = u0Var.f179672a;
                            xi0.a aVar = xi0.b.Companion;
                            String str = u0Var.f179673b;
                            aVar.getClass();
                            dVar = new dj0.d(j2, xi0.a.a(str));
                        }
                        return new p0(dVar);
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: a09.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f258b;

            {
                this.f258b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                j0 j0Var = this.f258b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<zz8.f> totalRewards = j0Var.f269a.getTotalRewards();
                        i0 i0Var = i0.f;
                        a0.b bVar = new a0.b(5);
                        totalRewards.getClass();
                        ufm.i iVar = new ufm.i(totalRewards, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        p0 info = (p0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(info, "info");
                        j0Var.f271c.f("LearnRewardsRepositoryImpl_CACHE_KEY", info);
                        break;
                    default:
                        p0 info2 = (p0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        hz8.l lVar = j0Var.f270b;
                        Intrinsics.checkNotNullParameter(info2, "<this>");
                        dj0.d dVar = info2.f276144a;
                        c1 c1Var = new c1("learn_rewards_total_earned_info", dVar != null ? new u0(dVar.f115082a, dVar.f115083b.f306286a) : null);
                        lVar.getClass();
                        DBUtil.performBlocking(lVar.f157081a, false, true, new hul.v(lVar, c1Var, 18));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
