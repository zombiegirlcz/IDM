package lsf;

import com.revolut.feature.transfer_reasons.impl.data.network.service.TransferReasonsService;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonRecipientIdentification;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import k3c.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import li2.f;
import lk4.g;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f199678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonsService f199679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f199680c;

    public d(j memoryCache, TransferReasonsService transferReasonsService) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(transferReasonsService, "transferReasonsService");
        this.f199678a = memoryCache;
        this.f199679b = transferReasonsService;
        Continuation continuation = null;
        this.f199680c = new x4l.c(new f(this, null), new g(this, 27), new lp2.c(this, 4), new iz1.g(2, 25, continuation), new l(3, 17, continuation));
    }

    public static String a(TransferReasonsRequest transferReasonsRequest) {
        String str;
        if (transferReasonsRequest instanceof TransferReasonsRequest.ForTransaction) {
            TransferReasonsRequest.ForTransaction forTransaction = (TransferReasonsRequest.ForTransaction) transferReasonsRequest;
            return a0.d.s("transaction:", forTransaction.f92424a, ":", forTransaction.f92425b);
        }
        if (transferReasonsRequest instanceof TransferReasonsRequest.ForTransferWithCountry) {
            TransferReasonsRequest.ForTransferWithCountry forTransferWithCountry = (TransferReasonsRequest.ForTransferWithCountry) transferReasonsRequest;
            long j2 = forTransferWithCountry.f92426a;
            String str2 = forTransferWithCountry.f92427b.f306286a;
            String str3 = forTransferWithCountry.e;
            String str4 = forTransferWithCountry.d;
            String strName = forTransferWithCountry.f92428c.name();
            String str5 = forTransferWithCountry.f;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(j2);
            sb6.append(":");
            sb6.append(str2);
            sb6.append(":");
            j6.a.D(sb6, str3, ":country_", str4, ":");
            return a0.d.u(sb6, strName, ":", str5);
        }
        if (!(transferReasonsRequest instanceof TransferReasonsRequest.ForTransferWithIdentification)) {
            throw new NoWhenBranchMatchedException();
        }
        TransferReasonsRequest.ForTransferWithIdentification forTransferWithIdentification = (TransferReasonsRequest.ForTransferWithIdentification) transferReasonsRequest;
        long j3 = forTransferWithIdentification.f92429a;
        String str6 = forTransferWithIdentification.f92430b.f306286a;
        String str7 = forTransferWithIdentification.e;
        TransferReasonRecipientIdentification transferReasonRecipientIdentification = forTransferWithIdentification.d;
        if (transferReasonRecipientIdentification instanceof TransferReasonRecipientIdentification.BeneficiaryId) {
            str = "beneficiary_id";
        } else {
            if (!(transferReasonRecipientIdentification instanceof TransferReasonRecipientIdentification.Code)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "code";
        }
        String strS = a0.d.s("recipient_", str, "_", transferReasonRecipientIdentification.getF92423a());
        String strName2 = forTransferWithIdentification.f92431c.name();
        String str8 = forTransferWithIdentification.f;
        StringBuilder sb9 = new StringBuilder();
        sb9.append(j3);
        sb9.append(":");
        sb9.append(str6);
        sb9.append(":");
        j6.a.D(sb9, str7, ":", strS, ":");
        return a0.d.u(sb9, strName2, ":", str8);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lsf.c
            if (r0 == 0) goto L13
            r0 = r8
            lsf.c r0 = (lsf.c) r0
            int r1 = r0.f199677w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199677w = r1
            goto L18
        L13:
            lsf.c r0 = new lsf.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199677w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L57
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            x4l.c r8 = r6.f199680c
            w4l.i r2 = w4l.i.f294643c
            vkm.d r7 = r8.b(r7, r2)
            loc.a r8 = new loc.a
            r2 = 22
            r8.<init>(r2)
            vkm.q0 r7 = c8g.c.c(r7, r8)
            ie6.q r8 = new ie6.q
            r2 = 2
            r4 = 26
            r5 = 0
            r8.<init>(r2, r4, r5)
            r0.f199677w = r3
            java.lang.Object r8 = vkm.q.y(r7, r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r7 = r8.getContent()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lsf.d.b(com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest, gim.c):java.lang.Object");
    }
}
