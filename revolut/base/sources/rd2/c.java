package rd2;

import kotlin.jvm.internal.Intrinsics;
import uy1.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f253319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o71.a f253320b;

    public c(o aliasResolveInteractor, o71.a beneficiaryRepository) {
        Intrinsics.checkNotNullParameter(aliasResolveInteractor, "aliasResolveInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        this.f253319a = aliasResolveInteractor;
        this.f253320b = beneficiaryRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.recipients.SpinContact r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rd2.a
            if (r0 == 0) goto L13
            r0 = r8
            rd2.a r0 = (rd2.a) r0
            int r1 = r0.f253317w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253317w = r1
            goto L18
        L13:
            rd2.a r0 = new rd2.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253317w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto L7e
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r8)
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r8 = r7.f62154b
            boolean r2 = r8 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Email
            if (r2 == 0) goto L3c
            a02.a r2 = a02.a.EMAIL
            goto L49
        L3c:
            boolean r2 = r8 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone
            if (r2 == 0) goto L43
            a02.a r2 = a02.a.PHONE
            goto L49
        L43:
            boolean r2 = r8 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.TaxNumber
            if (r2 == 0) goto Laa
            a02.a r2 = a02.a.TAX_NUMBER
        L49:
            java.lang.String r8 = r8.getF62112a()
            if (r8 == 0) goto La2
            java.lang.String r7 = r7.f62155c
            if (r7 == 0) goto L6d
            java.lang.CharSequence r7 = kotlin.text.d0.F0(r7)
            java.lang.String r7 = r7.toString()
            if (r7 == 0) goto L6d
            int r5 = r7.length()
            if (r5 <= 0) goto L64
            goto L65
        L64:
            r7 = r4
        L65:
            if (r7 == 0) goto L6d
            com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias$ExpectedOverrides r5 = new com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias$ExpectedOverrides
            r5.<init>(r7)
            goto L6e
        L6d:
            r5 = r4
        L6e:
            com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias r7 = new com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias
            r7.<init>(r2, r8, r5)
            r0.f253317w = r3
            uy1.o r8 = r6.f253319a
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L7e
            return r1
        L7e:
            a02.i r8 = (a02.i) r8
            boolean r7 = r8 instanceof a02.c
            if (r7 != 0) goto Laa
            boolean r7 = r8 instanceof a02.d
            if (r7 != 0) goto Laa
            boolean r7 = r8 instanceof a02.e
            if (r7 != 0) goto Laa
            boolean r7 = r8 instanceof a02.f
            if (r7 == 0) goto L91
            goto Laa
        L91:
            boolean r7 = r8 instanceof a02.h
            if (r7 == 0) goto L9c
            a02.h r8 = (a02.h) r8
            a02.b r7 = r8.f113a
            java.lang.String r7 = r7.f106a
            return r7
        L9c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        La2:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rd2.c.a(com.revolut.feature.apm.core.models.recipients.SpinContact, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(com.revolut.feature.apm.core.models.recipients.SpinContact r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rd2.b
            if (r0 == 0) goto L13
            r0 = r8
            rd2.b r0 = (rd2.b) r0
            int r1 = r0.f253318w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253318w = r1
            goto L18
        L13:
            rd2.b r0 = new rd2.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253318w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L69
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L58
        L37:
            yhm.o.b(r8)
            f5j.a r8 = r7.f62156g
            if (r8 == 0) goto L3f
            return r8
        L3f:
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r8 = r7.f62153a
            boolean r2 = r8 instanceof com.revolut.feature.apm.core.models.recipients.ApmIdentifier.Uuid
            if (r2 == 0) goto L48
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier$Uuid r8 = (com.revolut.feature.apm.core.models.recipients.ApmIdentifier.Uuid) r8
            goto L49
        L48:
            r8 = r5
        L49:
            if (r8 == 0) goto L4f
            java.lang.String r8 = r8.f62112a
            if (r8 != 0) goto L5a
        L4f:
            r0.f253318w = r4
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L58
            goto L68
        L58:
            java.lang.String r8 = (java.lang.String) r8
        L5a:
            if (r8 == 0) goto L6c
            r0.f253318w = r3
            o71.a r7 = r6.f253320b
            r21.h r7 = (r21.h) r7
            java.lang.Object r8 = r7.f(r8, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            f5j.a r8 = (f5j.a) r8
            return r8
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rd2.c.b(com.revolut.feature.apm.core.models.recipients.SpinContact, gim.c):java.io.Serializable");
    }
}
