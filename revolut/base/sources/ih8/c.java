package ih8;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.junior_graduation.impl.ui.screen.personalised.JuniorPersonalisedGraduationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ JuniorPersonalisedGraduationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JuniorPersonalisedGraduationScreen juniorPersonalisedGraduationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = juniorPersonalisedGraduationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r3)
            com.revolut.feature.junior_graduation.impl.ui.screen.personalised.JuniorPersonalisedGraduationScreen r3 = r2.u
            java.lang.Object r3 = r3.N
            java.lang.Object r3 = r3.getValue()
            ih8.e r3 = (ih8.e) r3
            ih8.i r3 = (ih8.i) r3
            lg8.a r0 = r3.f161303p
            com.revolut.feature.junior_graduation.api.model.PersonalisedGraduationData r0 = r0.f195083a
            java.lang.String r0 = r0.f76910b
            if (r0 == 0) goto L30
            z80.b r1 = r3.f161304q
            boolean r1 = z80.b.l(r1, r0)
            if (r1 == 0) goto L2c
            java.lang.String r1 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier$Predefined$Phone r1 = new com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier$Predefined$Phone
            r1.<init>(r0)
            goto L2e
        L2c:
            com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier$Preferred r1 = com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier.Preferred.Phone
        L2e:
            if (r1 != 0) goto L32
        L30:
            com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier$Preferred r1 = com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier.Preferred.Phone
        L32:
            lg8.c r0 = new lg8.c
            r0.<init>(r1)
            r3.C2(r0)
            kotlin.Unit r3 = kotlin.Unit.f186387a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ih8.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
