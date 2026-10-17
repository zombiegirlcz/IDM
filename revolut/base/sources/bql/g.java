package bql;

import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.api.models.WebAuthnEvidence;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends i implements Function1 {
    public String u;
    public WebAuthnEvidence v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signin_sessions_flow.a f17852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RevolutAccountSession f17853y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.sso.impl.ui.signin_sessions_flow.a aVar, RevolutAccountSession revolutAccountSession, Continuation continuation) {
        super(1, continuation);
        this.f17852x = aVar;
        this.f17853y = revolutAccountSession;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f17852x, this.f17853y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.security.NoSuchAlgorithmException {
        /*
            r13 = this;
            com.revolut.sso.impl.ui.signin_sessions_flow.a r1 = r13.f17852x
            akl.i0 r6 = r1.f106746s
            gu2.e r7 = r1.f106743p
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r0 = r13.f17851w
            com.revolut.sso.api.models.RevolutAccountSession r3 = r13.f17853y
            r9 = 3
            r10 = 2
            r11 = 1
            r4 = 0
            if (r0 == 0) goto L36
            if (r0 == r11) goto L30
            if (r0 == r10) goto L29
            if (r0 != r9) goto L21
            com.revolut.sso.api.models.WebAuthnEvidence r0 = r13.v
            java.lang.String r1 = r13.u
            yhm.o.b(r14)
            goto L99
        L21:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L29:
            java.lang.String r0 = r13.u
            yhm.o.b(r14)
        L2e:
            r2 = r0
            goto L7c
        L30:
            java.lang.String r0 = r13.u
            yhm.o.b(r14)
            goto L5c
        L36:
            yhm.o.b(r14)
            xjl.i r14 = r1.f106744q
            java.lang.String r0 = r14.b()
            java.lang.String r2 = r14.a(r0)
            akl.d r14 = r1.o
            akl.h r14 = (akl.h) r14
            r14.g(r4)
            r13.u = r2
            r13.f17851w = r11
            bql.e r0 = new bql.e
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r14 = fkl.c.b(r7, r0, r13)
            if (r14 != r8) goto L5b
            goto L96
        L5b:
            r0 = r2
        L5c:
            com.revolut.sso.impl.domain.models.AuthResult r14 = (com.revolut.sso.impl.domain.models.AuthResult) r14
            boolean r2 = r14 instanceof com.revolut.sso.impl.domain.models.AuthResult.EvidenceRequired
            if (r2 == 0) goto Lad
            r2 = r14
            com.revolut.sso.impl.domain.models.AuthResult$EvidenceRequired r2 = (com.revolut.sso.impl.domain.models.AuthResult.EvidenceRequired) r2
            com.revolut.sso.impl.domain.models.Challenge r2 = r2.f106077a
            jkl.i r5 = r2.f106098a
            jkl.i r12 = jkl.i.WEB_AUTHN
            if (r5 != r12) goto Lad
            col.c r14 = r1.f106745r
            r13.u = r0
            r13.f17851w = r10
            col.i r14 = (col.i) r14
            java.lang.Object r14 = r14.d3(r2, r11, r13)
            if (r14 != r8) goto L2e
            goto L96
        L7c:
            col.a r14 = (col.a) r14
            if (r14 == 0) goto L82
            com.revolut.sso.api.models.WebAuthnEvidence r4 = r14.f25571a
        L82:
            if (r4 == 0) goto Lab
            r13.u = r2
            r13.v = r4
            r13.f17851w = r9
            bql.e r0 = new bql.e
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r14 = fkl.c.b(r7, r0, r13)
            if (r14 != r8) goto L97
        L96:
            return r8
        L97:
            r1 = r2
            r0 = r4
        L99:
            com.revolut.sso.impl.domain.models.AuthResult r14 = (com.revolut.sso.impl.domain.models.AuthResult) r14
            java.util.List r0 = zhm.u.c(r0)
            ebm.a.f(r1)
            gkl.s0 r2 = new gkl.s0
            r2.<init>(r1, r0, r14)
            r6.g(r1, r2)
            goto Lba
        Lab:
            r11 = 0
            goto Lba
        Lad:
            zhm.f0 r1 = zhm.f0.f322471a
            ebm.a.f(r0)
            gkl.s0 r2 = new gkl.s0
            r2.<init>(r0, r1, r14)
            r6.g(r0, r2)
        Lba:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: bql.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
