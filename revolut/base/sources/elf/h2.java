package elf;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h2 extends yji.n implements s0 {

    @NotNull
    public static final e2 Companion = new e2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xig.b f127340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yig.a f127341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f127342n;
    public final lg0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sjg.a f127343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final klf.h0 f127344q;

    public h2(xig.b trustedMerchantDialogFactory, yig.a trustedMerchantsRepository, j60.a bottomDialogExtension, lg0.b deeplinkHandler, sjg.a twoFaErrorHandler, klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(trustedMerchantDialogFactory, "trustedMerchantDialogFactory");
        Intrinsics.checkNotNullParameter(trustedMerchantsRepository, "trustedMerchantsRepository");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f127340l = trustedMerchantDialogFactory;
        this.f127341m = trustedMerchantsRepository;
        this.f127342n = bottomDialogExtension;
        this.o = deeplinkHandler;
        this.f127343p = twoFaErrorHandler;
        this.f127344q = commonDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (b3(r3) == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.Object r22, gim.c r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof elf.f2
            if (r3 == 0) goto L19
            r3 = r2
            elf.f2 r3 = (elf.f2) r3
            int r4 = r3.f127324w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f127324w = r4
            goto L1e
        L19:
            elf.f2 r3 = new elf.f2
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f127324w
            r6 = 0
            r7 = 0
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L3e
            if (r5 == r9) goto L3a
            if (r5 != r8) goto L32
            yhm.o.b(r2)
            goto L8d
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            yhm.o.b(r2)
            goto L84
        L3e:
            yhm.o.b(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.api.model.TrustedMerchant"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            com.revolut.feature.trusted_merchants.api.model.TrustedMerchant r1 = (com.revolut.feature.trusted_merchants.api.model.TrustedMerchant) r1
            j60.a r2 = r0.f127342n
            j60.a.v(r2, r6, r7, r8)
            r3.f127324w = r9
            java.lang.String r1 = r1.getF94411b()
            yig.a r2 = r0.f127341m
            bjg.f r2 = (bjg.f) r2
            r2.getClass()
            java.lang.String r5 = "merchantId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            com.revolut.feature.trusted_merchants.impl.data.network.TrustedMerchantsService r2 = r2.f15668a
            efm.b r1 = r2.approveMerchant(r1, r7)
            pfm.r r1 = te0.w.g0(r1)
            sjg.a r2 = r0.f127343p
            eli.a r2 = sjg.a.b(r2)
            efm.b r1 = r1.h(r2)
            java.lang.String r2 = "compose(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r1 = nim.a.a(r1, r3)
            if (r1 != r4) goto L7f
            goto L81
        L7f:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L81:
            if (r1 != r4) goto L84
            goto L8c
        L84:
            r3.f127324w = r8
            java.lang.Object r1 = r0.b3(r3)
            if (r1 != r4) goto L8d
        L8c:
            return r4
        L8d:
            nii.y0 r1 = new nii.y0
            nii.j0 r8 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.cards_core.R$string.trusted_merchants_approve_success_title
            r3 = 14
            r9.<init>(r2, r7, r7, r3)
            r19 = 0
            r20 = 4094(0xffe, float:5.737E-42)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2 = 4
            java.lang.String r3 = "ID_TRUSTED_MERCHANT_ADDED"
            r1.<init>(r3, r8, r6, r2)
            r0.L2(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.h2.Z2(java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (nim.a.a(r9, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof elf.g2
            if (r0 == 0) goto L13
            r0 = r9
            elf.g2 r0 = (elf.g2) r0
            int r1 = r0.f127333w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127333w = r1
            goto L18
        L13:
            elf.g2 r0 = new elf.g2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127333w
            r3 = 0
            r4 = 3
            r5 = 1
            yig.a r6 = r8.f127341m
            r7 = 2
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r7) goto L38
            if (r2 != r4) goto L30
            yhm.o.b(r9)
            goto L88
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            yhm.o.b(r9)
            goto L6b
        L3c:
            yhm.o.b(r9)
            goto L57
        L40:
            yhm.o.b(r9)
            r9 = r6
            bjg.f r9 = (bjg.f) r9
            w4l.f r9 = r9.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            efm.b r9 = r9.g(r2, r3)
            r0.f127333w = r5
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto L57
            goto L87
        L57:
            r9 = r6
            bjg.f r9 = (bjg.f) r9
            w4l.f r9 = r9.e
            kotlin.Unit r2 = kotlin.Unit.f186387a
            efm.b r9 = r9.g(r2, r3)
            r0.f127333w = r7
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto L6b
            goto L87
        L6b:
            klf.h0 r9 = r8.f127344q
            java.lang.String r9 = r9.f185494j
            bjg.f r6 = (bjg.f) r6
            r6.getClass()
            java.lang.String r2 = "transactionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            w4l.f r2 = r6.f
            efm.b r9 = r2.g(r9, r3)
            r0.f127333w = r4
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.h2.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        int iHashCode = str.hashCode();
        boolean z = false;
        j60.a aVar = this.f127342n;
        switch (iHashCode) {
            case -1710881400:
                if (str.equals("TRUSTED_CONFIRMATION_DIALOG_SECONDARY_BUTTON_ID")) {
                    j60.a.v(aVar, false, null, 2);
                    z = true;
                }
                return Boolean.valueOf(z);
            case -1141326591:
                if (str.equals("ID_ADD_TO_TRUSTED_MERCHANTS")) {
                    Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.api.model.TrustedMerchant");
                    xig.a aVar2 = xig.b.Companion;
                    aVar.x(((fjg.a) this.f127340l).a((TrustedMerchant) obj2, null));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13802297:
                if (str.equals("ID_TRUSTED_MERCHANT_INFO")) {
                    return lg0.b.x1(this.o, "revolut://app/articles/trusted_merchants_intro_retail-c44", null, Boolean.FALSE, continuation, 2);
                }
                return Boolean.valueOf(z);
            case 103425527:
                if (str.equals("TRUSTED_CONFIRMATION_DIALOG_MAIN_BUTTON_ID")) {
                    return Z2(obj2, (gim.c) continuation);
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(z);
        }
    }
}
