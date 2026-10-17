package x9b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.global_accounts.impl.registered_identities.RegisteredIdentitiesBottomSheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RegisteredIdentitiesBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RegisteredIdentitiesBottomSheetScreen registeredIdentitiesBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = registeredIdentitiesBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            com.revolut.feature.retail.global_accounts.impl.registered_identities.RegisteredIdentitiesBottomSheetScreen r6 = r5.v
            java.lang.Object r6 = r6.R
            java.lang.Object r6 = r6.getValue()
            x9b.d r6 = (x9b.d) r6
            kotlin.jvm.internal.Intrinsics.h(r0)
            x9b.j r6 = (x9b.j) r6
            r6.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.Object r0 = r0.u
            boolean r1 = r0 instanceof x9b.c
            if (r1 == 0) goto L85
            x9b.c r0 = (x9b.c) r0
            cli.y r1 = r6.f303658q
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            x9b.a r1 = (x9b.a) r1
            com.revolut.data.model.Data r1 = r1.f303649a
            java.lang.Object r1 = r1.getContent()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L69
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            r4 = r3
            zlg.c r4 = (zlg.c) r4
            boolean r4 = r4.f323252c
            if (r4 == 0) goto L45
            goto L58
        L57:
            r3 = r2
        L58:
            zlg.c r3 = (zlg.c) r3
            if (r3 == 0) goto L69
            do3.e r1 = r3.f323250a
            if (r1 == 0) goto L69
            com.revolut.feature.address.models.Address r1 = r1.e
            if (r1 == 0) goto L69
            java.lang.String r1 = r1.getCountry()
            goto L6a
        L69:
            r1 = r2
        L6a:
            java.lang.String r3 = r0.f303652b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 == 0) goto L73
            goto L97
        L73:
            wtj.f r1 = new wtj.f
            r3 = 27
            r1.<init>(r6, r0, r2, r3)
            yi5.b r0 = new yi5.b
            r2 = 26
            r0.<init>(r2)
            r6.l2(r1, r0)
            goto L97
        L85:
            x9b.b r1 = x9b.b.f303650a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 == 0) goto L97
            com.revolut.feature.retail.global_accounts.api.navigation.CountryProfileOnboardingFlowDestination r0 = com.revolut.feature.retail.global_accounts.api.navigation.CountryProfileOnboardingFlowDestination.f82639a
            r6.C1(r0)
            aii.q r0 = aii.q.f5292a
            r6.C2(r0)
        L97:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x9b.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
