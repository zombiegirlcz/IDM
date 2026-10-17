package com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation;

import com.revolut.shared.cards.model.SharedRevolutCard;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedRevolutCard f60896w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, SharedRevolutCard sharedRevolutCard, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f60896w = sharedRevolutCard;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f60896w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (nim.a.a(r9, r8) == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (nim.a.a(r9, r8) == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b r0 = r8.v
            sg1.c r1 = r0.f60899r
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1e
            if (r3 == r5) goto L19
            if (r3 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            yhm.o.b(r9)
            goto La9
        L1e:
            yhm.o.b(r9)
            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData r9 = r0.o
            boolean r3 = r9 instanceof com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.Confirmation
            java.lang.String r6 = "error(...)"
            if (r3 == 0) goto L68
            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData$Confirmation r9 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.Confirmation) r9
            java.lang.String r3 = r9.f60892a
            boolean r9 = r9.f60893b
            r1.getClass()
            java.lang.String r4 = "cardInfoEncodedBase64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            sg1.a r9 = r1.a(r3, r9)
            if (r9 == 0) goto L51
            k7i.i r1 = r1.f262581b
            java.lang.String r3 = r9.f262578b
            java.lang.String r4 = r9.f262579c
            java.lang.String r9 = r9.f262577a
            fg1.a r6 = new fg1.a
            r7 = 24
            r6.<init>(r3, r9, r4, r7)
            pfm.r r9 = r1.e(r6)
            goto L5f
        L51:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r1 = "params parsing error"
            r9.<init>(r1)
            pfm.n r9 = efm.b.n(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
        L5f:
            r8.u = r5
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r2) goto La9
            goto La8
        L68:
            boolean r3 = r9 instanceof com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.RevivalConfirmation
            if (r3 == 0) goto Lb9
            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData$RevivalConfirmation r9 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.RevivalConfirmation) r9
            java.lang.String r9 = r9.f60894a
            r1.getClass()
            java.lang.String r3 = "card"
            com.revolut.shared.cards.model.SharedRevolutCard r5 = r8.f60896w
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.lang.String r3 = "tokenUniqueReference"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            k7i.i r1 = r1.f262581b
            fg1.a r3 = new fg1.a
            java.lang.String r5 = r5.e
            if (r5 != 0) goto L96
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r1 = "last four is required"
            r9.<init>(r1)
            pfm.n r9 = efm.b.n(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            goto La0
        L96:
            r6 = 0
            r7 = 8
            r3.<init>(r9, r5, r6, r7)
            pfm.r r9 = r1.e(r3)
        La0:
            r8.u = r4
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r2) goto La9
        La8:
            return r2
        La9:
            k7i.i r9 = r0.f60897p
            java.lang.Object r9 = r9.f182069b
            l93.f r9 = (l93.f) r9
            ha3.x r9 = (ha3.x) r9
            z6l.s r9 = r9.f
            r9.e()
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lb9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
