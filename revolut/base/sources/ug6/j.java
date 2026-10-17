package ug6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function1 {
    public re6.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f279954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ExternalAccountTopupPayload.BrazilPixMandatePayload f279955x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, ExternalAccountTopupPayload.BrazilPixMandatePayload brazilPixMandatePayload, Continuation continuation) {
        super(1, continuation);
        this.f279954w = vVar;
        this.f279955x = brazilPixMandatePayload;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f279954w, this.f279955x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[PHI: r1
      0x0099: PHI (r1v12 re6.a) = (r1v11 re6.a), (r1v14 re6.a) binds: [B:31:0x0096, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[RETURN] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.v
            r6 = 0
            r8 = 4
            r9 = 3
            r2 = 2
            r10 = 1
            ug6.v r11 = r12.f279954w
            if (r1 == 0) goto L34
            if (r1 == r10) goto L30
            if (r1 == r2) goto L2a
            if (r1 == r9) goto L23
            if (r1 != r8) goto L1b
            re6.a r0 = r12.u
            yhm.o.b(r13)
            return r0
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            re6.a r1 = r12.u
            yhm.o.b(r13)
            goto L99
        L2a:
            re6.a r1 = r12.u
            yhm.o.b(r13)
            goto L84
        L30:
            yhm.o.b(r13)
            goto L52
        L34:
            yhm.o.b(r13)
            qg6.f r13 = r11.f279975t
            r12.v = r10
            of6.e r13 = r13.f245665a
            r13.getClass()
            nyd.j r1 = new nyd.j
            r3 = 12
            r1.<init>(r13, r6, r3)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r1, r12)
            if (r13 != r0) goto L52
            goto Lb9
        L52:
            re6.a r13 = (re6.a) r13
            if (r13 == 0) goto Lbb
            qg6.f r1 = r11.f279975t
            java.lang.String r4 = r13.f253527a
            com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload$BrazilPixMandatePayload r3 = r12.f279955x
            java.lang.String r5 = r3.f73098a
            r12.u = r13
            r12.v = r2
            of6.e r3 = r1.f245665a
            r3.getClass()
            nyd.j r2 = new nyd.j
            r7 = 13
            r2.<init>(r3, r4, r5, r6, r7)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r2, r12)
            if (r1 != r0) goto L79
            goto L7b
        L79:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L7b:
            if (r1 != r0) goto L7e
            goto L80
        L7e:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L80:
            if (r1 != r0) goto L83
            goto Lb9
        L83:
            r1 = r13
        L84:
            xg6.x r13 = r11.u
            java.lang.String r2 = r1.f253527a
            dj0.d r3 = r1.f253528b
            pfm.r r13 = r13.f(r3, r2, r10)
            r12.u = r1
            r12.v = r9
            java.lang.Object r13 = nim.a.a(r13, r12)
            if (r13 != r0) goto L99
            goto Lb9
        L99:
            u51.a r13 = r11.f279976w
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$StoredMethodId r3 = new com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$StoredMethodId
            java.lang.String r2 = r1.f253527a
            r3.<init>(r2)
            dj0.d r2 = r1.f253528b
            xi0.b r2 = r2.f115083b
            java.lang.String r4 = r2.f306286a
            yte.n r5 = r1.f253529c
            r12.u = r1
            r12.v = r8
            r2 = r13
            e0f.r1 r2 = (e0f.r1) r2
            r6 = 1
            r7 = r12
            java.lang.Object r13 = r2.k(r3, r4, r5, r6, r7)
            if (r13 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            return r1
        Lbb:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Brazil PIX mandate creation data not found in cache"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ug6.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
