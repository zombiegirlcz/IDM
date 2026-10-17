package z32;

import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.e7;
import tof.i7;
import tof.j7;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f319129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.a f319130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw1.a f319131c;
    public final iz1.l d;
    public final lx1.d e;
    public final lx1.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qz0.b f319132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o71.a f319133h;

    public h(whf.b transactionsContentProvider, r10.a recipientAnalyticsInteractor, yw1.a paymentsSettingsInteractor, iz1.l apmRecipientSettingsRepository, lx1.d apmContactsInteractor, lx1.i apmRecipientMapper, qz0.b contactImagesRepository, o71.a beneficiaryRepository) {
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(recipientAnalyticsInteractor, "recipientAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(paymentsSettingsInteractor, "paymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(apmRecipientSettingsRepository, "apmRecipientSettingsRepository");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(contactImagesRepository, "contactImagesRepository");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        this.f319129a = transactionsContentProvider;
        this.f319130b = recipientAnalyticsInteractor;
        this.f319131c = paymentsSettingsInteractor;
        this.d = apmRecipientSettingsRepository;
        this.e = apmContactsInteractor;
        this.f = apmRecipientMapper;
        this.f319132g = contactImagesRepository;
        this.f319133h = beneficiaryRepository;
    }

    public static i7 b(ApmRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (recipient instanceof ApmBeneficiary) {
            return new j7(recipient.getF62147a().getF62112a());
        }
        if (recipient instanceof ApmContact) {
            return new e7(recipient.getF62147a().getF62112a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.recipients.ApmRecipient r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof z32.d
            if (r0 == 0) goto L13
            r0 = r9
            z32.d r0 = (z32.d) r0
            int r1 = r0.f319124x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319124x = r1
            goto L18
        L13:
            z32.d r0 = new z32.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319124x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.revolut.core.ui_kit_core.displayers.image.models.ContactImage r8 = r0.u
            yhm.o.b(r9)
            goto La7
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)
            lx1.i r9 = r7.f
            fy1.q r9 = (fy1.q) r9
            com.revolut.core.ui_kit_core.displayers.image.models.ContactImage r8 = r9.c(r8)
            qz0.b r9 = r7.f319132g
            xz0.c r9 = (xz0.c) r9
            java.lang.String r2 = "contactImage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            az0.r r2 = r9.f309759b
            i51.a r2 = (i51.a) r2
            java.lang.String r2 = r2.b(r8)
            java.lang.String r4 = "just(...)"
            if (r2 != 0) goto L5e
            java.util.Optional r9 = java.util.Optional.empty()
            ufm.b r9 = efm.d0.m(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            goto L9c
        L5e:
            java.util.concurrent.ConcurrentHashMap r5 = xz0.c.f309757c
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L72
            java.util.Optional r9 = java.util.Optional.empty()
            ufm.b r9 = efm.d0.m(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            goto L9c
        L72:
            xz0.j r4 = new xz0.j
            xz0.h r5 = new xz0.h
            java.lang.String r6 = r8.d
            if (r6 != 0) goto L7c
            java.lang.String r6 = ""
        L7c:
            r5.<init>(r6)
            r4.<init>(r2, r5)
            e1 r2 = new e1
            r5 = 11
            r2.<init>(r9, r4, r5)
            ufm.b r9 = new ufm.b
            r4 = 0
            r9.<init>(r2, r4)
            java.util.Optional r2 = java.util.Optional.empty()
            pfm.z r9 = r9.o(r2)
            java.lang.String r2 = "onErrorReturnItem(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
        L9c:
            r0.u = r8
            r0.f319124x = r3
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto La7
            return r1
        La7:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            java.util.Optional r9 = (java.util.Optional) r9
            java.lang.Object r9 = le.u1.l(r9)
            java.io.File r9 = (java.io.File) r9
            if (r9 == 0) goto Lbe
            com.revolut.core.ui_kit_core.displayers.image.models.FileImage r8 = new com.revolut.core.ui_kit_core.displayers.image.models.FileImage
            r0 = 14
            r1 = 0
            r8.<init>(r9, r1, r1, r0)
        Lbe:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z32.h.a(com.revolut.feature.apm.core.models.recipients.ApmRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.apm.core.models.recipients.ApmRecipient r7, com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue.BlockIncomingMoneyRequests r8, gim.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof z32.g
            if (r0 == 0) goto L13
            r0 = r9
            z32.g r0 = (z32.g) r0
            int r1 = r0.f319128y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319128y = r1
            goto L18
        L13:
            z32.g r0 = new z32.g
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f319126w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319128y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r9)
            goto L93
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue$BlockIncomingMoneyRequests r8 = r0.v
            com.revolut.feature.apm.core.models.recipients.ApmRecipient r7 = r0.u
            yhm.o.b(r9)
            goto L5c
        L3c:
            yhm.o.b(r9)
            r0.u = r7
            r0.v = r8
            r0.f319128y = r4
            iz1.k r9 = new iz1.k
            iz1.l r2 = r6.d
            r9.<init>(r8, r2, r7, r5)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r2, r9, r0)
            if (r9 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L59:
            if (r9 != r1) goto L5c
            goto L92
        L5c:
            boolean r9 = r7 instanceof com.revolut.feature.apm.core.models.recipients.ApmContact
            if (r9 == 0) goto L96
            com.revolut.feature.apm.core.models.recipients.ApmContact r7 = (com.revolut.feature.apm.core.models.recipients.ApmContact) r7
            r0.u = r5
            r0.v = r5
            r0.f319128y = r3
            lx1.d r9 = r6.e
            fy1.o r9 = (fy1.o) r9
            if (r8 == 0) goto L6f
            goto L70
        L6f:
            r8 = r5
        L70:
            com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings r2 = new com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings
            r2.<init>(r8)
            cz5.b r8 = r9.f138869b
            java.lang.Class r9 = r7.getClass()
            ky1.a r8 = r8.a(r9)
            if (r8 == 0) goto L8f
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r7 = r7.getF62147a()
            java.lang.String r7 = r7.getF62112a()
            java.lang.Object r7 = r8.d(r7, r2, r0)
            r9 = r7
            goto L90
        L8f:
            r9 = r5
        L90:
            if (r9 != r1) goto L93
        L92:
            return r1
        L93:
            com.revolut.feature.apm.core.models.recipients.ApmRecipient r9 = (com.revolut.feature.apm.core.models.recipients.ApmRecipient) r9
            return r9
        L96:
            boolean r8 = r7 instanceof com.revolut.feature.apm.core.models.recipients.ApmBeneficiary
            if (r8 == 0) goto L9b
            return r7
        L9b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z32.h.c(com.revolut.feature.apm.core.models.recipients.ApmRecipient, com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue$BlockIncomingMoneyRequests, gim.c):java.lang.Object");
    }
}
