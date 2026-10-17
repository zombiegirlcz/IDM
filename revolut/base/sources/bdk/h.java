package bdk;

import adk.b1;
import adk.l1;
import adk.o1;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.retail.feature.plan_rewards.impl.data.service.PlanRewardsService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import xck.o;
import xck.p;
import xck.q;
import xck.r;
import xck.s;
import xck.t;
import xck.u;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f14616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f14617x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o oVar, j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14616w = oVar;
        this.f14617x = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f14616w, this.f14617x, continuation, 0);
            default:
                return new h(this.f14616w, this.f14617x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        s qVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    int i2 = g.f14615a[this.f14616w.ordinal()];
                    if (i2 == 1) {
                        str = "milestone-rewards/product-article";
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "monthly-draws/product-article";
                    }
                    PlanRewardsService planRewardsService = this.f14617x.f14619a;
                    this.v = 1;
                    obj2 = planRewardsService.getProductArticle(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                b1 b1Var = (b1) obj2;
                Intrinsics.checkNotNullParameter(b1Var, "<this>");
                return new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(b1Var.f3365a), b1Var.f3366b);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    int i5 = i.f14618a[this.f14616w.ordinal()];
                    if (i5 == 1) {
                        str2 = "milestone-rewards/reveal";
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "monthly-draws/reveal";
                    }
                    PlanRewardsService planRewardsService2 = this.f14617x.f14619a;
                    this.v = 1;
                    obj2 = planRewardsService2.revealReward(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                l1 l1Var = (l1) obj2;
                Intrinsics.checkNotNullParameter(l1Var, "<this>");
                String str3 = l1Var.f3406a;
                String str4 = l1Var.f3407b;
                o1 o1Var = l1Var.f3408c;
                u uVar = new u(o1Var.f3418a, o1Var.f3419b, o1Var.f3420c);
                String str5 = l1Var.d;
                String str6 = l1Var.e;
                String str7 = l1Var.f;
                String str8 = l1Var.f3410h;
                if (str7 != null) {
                    qVar = new r(str7);
                } else {
                    String str9 = l1Var.f3409g;
                    if (str9 != null && str8 != null) {
                        qVar = new p(str9, str8);
                    } else {
                        if (str8 == null) {
                            throw new IllegalStateException("RewardRevealDto must have either productArticleId or buttonText");
                        }
                        qVar = new q(str8);
                    }
                }
                return new t(str3, str4, uVar, str5, str6, qVar, l1Var.i);
        }
    }
}
