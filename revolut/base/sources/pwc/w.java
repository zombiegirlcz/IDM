package pwc;

import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public zja.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f240425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a f240426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ StreetModeInfo f240427y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar, StreetModeInfo streetModeInfo, Continuation continuation) {
        super(1, continuation);
        this.f240426x = aVar;
        this.f240427y = streetModeInfo;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.f240426x, this.f240427y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r9 == r0) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.f240425w
            r2 = 2
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a r3 = r8.f240426x
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r9)
            goto L75
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            int r1 = r8.u
            zja.a r5 = r8.v
            yhm.o.b(r9)
            goto L61
        L22:
            yhm.o.b(r9)
            gte.a r9 = r3.f85790y
            com.revolut.feature.security_hub.api.SecurityHubApi$Toggles$StreetModeWifi r1 = com.revolut.feature.security_hub.api.SecurityHubApi$Toggles.StreetModeWifi.f85371c
            jte.d r9 = (jte.d) r9
            boolean r9 = r9.c(r1)
            com.revolut.feature.security_hub.api.models.StreetModeInfo r1 = r8.f240427y
            if (r9 == 0) goto L42
            java.util.List r9 = r1.e
            java.util.Collection r9 = (java.util.Collection) r9
            if (r9 == 0) goto L42
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L40
            goto L42
        L40:
            r9 = 0
            goto L43
        L42:
            r9 = r4
        L43:
            java.util.ArrayList r5 = r1.d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L85
            if (r9 == 0) goto L85
            zja.a r5 = r3.f85788w
            r10.t r1 = r3.f85789x
            r8.v = r5
            r8.u = r9
            r8.f240425w = r4
            java.lang.Object r1 = r1.g(r8)
            if (r1 != r0) goto L5e
            goto L74
        L5e:
            r7 = r1
            r1 = r9
            r9 = r7
        L61:
            com.revolut.feature.product_article.api.models.ProductArticleParams r9 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r9
            r6 = 0
            r8.v = r6
            r8.u = r1
            r8.f240425w = r2
            kka.h r5 = (kka.h) r5
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r1 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r9 = r5.e(r9, r1, r8)
            if (r9 != r0) goto L75
        L74:
            return r0
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r9 = r9 ^ r4
            pwc.l r0 = new pwc.l
            r0.<init>(r9)
            r3.C2(r0)
            goto L90
        L85:
            cli.y r9 = r3.D
            pwc.s r0 = new pwc.s
            r2 = 1
            r0.<init>(r1, r3, r2)
            r3.H2(r9, r0)
        L90:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pwc.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
