package qug;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountClosureFeedbackScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountClosureFeedbackScreen accountClosureFeedbackScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountClosureFeedbackScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            com.revolut.core.ui_kit.delegates.InputChecklistDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.InputChecklistDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreen r5 = r4.v
            java.lang.Object r5 = r5.Q
            java.lang.Object r5 = r5.getValue()
            qug.h r5 = (qug.h) r5
            kotlin.jvm.internal.Intrinsics.h(r0)
            qug.j r5 = (qug.j) r5
            r5.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = r0.f52519a
            int r1 = r0.hashCode()
            switch(r1) {
                case -1977560851: goto L76;
                case -1717866458: goto L6a;
                case -1578807882: goto L5a;
                case -820581599: goto L4e;
                case -500236721: goto L42;
                case 27649993: goto L36;
                case 2127376230: goto L2a;
                default: goto L29;
            }
        L29:
            goto L7e
        L2a:
            java.lang.String r1 = "FEEDBACK_TOO_EXPENSIVE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33
            goto L7e
        L33:
            com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice$TooExpensive r0 = com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice.TooExpensive.f94866b
            goto L82
        L36:
            java.lang.String r1 = "FEEDBACK_ANOTHER_PLATFORM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L7e
        L3f:
            com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice$AnotherPlatform r0 = com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice.AnotherPlatform.f94860b
            goto L82
        L42:
            java.lang.String r1 = "FEEDBACK_NOT_INTERESTED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L7e
        L4b:
            com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice$NotInterested r0 = com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice.NotInterested.f94863b
            goto L82
        L4e:
            java.lang.String r1 = "ACCOUNT_CLOSURE_FEEDBACK_FEATURES_DONT_WORK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L57
            goto L7e
        L57:
            com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice$FeaturesDontWork r0 = com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice.FeaturesDontWork.f94862b
            goto L82
        L5a:
            java.lang.String r1 = "FEEDBACK_OTHER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L7e
        L63:
            com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice$Other r0 = new com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice$Other
            r1 = 0
            r0.<init>(r1)
            goto L82
        L6a:
            java.lang.String r1 = "FEEDBACK_UNHAPPY_CUSTOMER_SERVICE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L73
            goto L7e
        L73:
            com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice$UnhappyCustomerSupport r0 = com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice.UnhappyCustomerSupport.f94867b
            goto L82
        L76:
            java.lang.String r1 = "FEEDBACK_POOR_PERFORMANCE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80
        L7e:
            r0 = 0
            goto L82
        L80:
            com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice$PoorPerformance r0 = com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice.PoorPerformance.f94865b
        L82:
            if (r0 == 0) goto L8f
            cli.y r1 = r5.f249451p
            qtb.c r2 = new qtb.c
            r3 = 6
            r2.<init>(r0, r3)
            r5.H2(r1, r2)
        L8f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qug.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
