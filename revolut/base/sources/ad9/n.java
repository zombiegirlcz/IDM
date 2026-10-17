package ad9;

import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowOutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.user_migration.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlaceOfBirthFlowOutputData.Success f3303w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.onboarding.impl.user_migration.e eVar, PlaceOfBirthFlowOutputData.Success success, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f3303w = success;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f3303w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r2.I2(null, r8) == r0) goto L15;
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
            int r1 = r8.u
            com.revolut.feature.onboarding.impl.user_migration.e r2 = r8.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r9)
            goto L67
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            yhm.o.b(r9)
            goto L5d
        L1e:
            yhm.o.b(r9)
            a99.g r9 = r2.f78590q
            com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowOutputData$Success r1 = r8.f3303w
            wi0.b r5 = r1.f105029a
            java.lang.String r1 = r1.f105030b
            ad9.s r9 = (ad9.s) r9
            r9.getClass()
            java.lang.String r6 = "country"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.String r7 = "city"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            bd9.c r9 = r9.f3309b
            r9.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            com.revolut.feature.onboarding.impl.user_migration.data.network.UserMigrationService r9 = r9.f14541a
            cd9.c r6 = new cd9.c
            java.lang.String r5 = r5.f297794a
            r6.<init>(r5, r1)
            efm.b r9 = r9.submitPlaceOfBirth(r6)
            pfm.r r9 = te0.w.g0(r9)
            r8.u = r4
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r0) goto L5d
            goto L66
        L5d:
            r8.u = r3
            r9 = 0
            java.lang.Object r9 = r2.I2(r9, r8)
            if (r9 != r0) goto L67
        L66:
            return r0
        L67:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ad9.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
