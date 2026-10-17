package a5k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends yji.n implements u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BankTransferFlowInputData f1498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y1k.a f1499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bqf.d f1500n;
    public final wsg.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eli.j f1501p;

    public y(BankTransferFlowInputData inputData, y1k.a bankTransferInteractor, bqf.d trustInteractor, wsg.n walletInteractor, eli.j twoFaErrorHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        this.f1498l = inputData;
        this.f1499m = bankTransferInteractor;
        this.f1500n = trustInteractor;
        this.o = walletInteractor;
        this.f1501p = twoFaErrorHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public static prf.f d3(TransferNote transferNote) {
        ?? arrayList;
        if (transferNote instanceof TransferNote.StructuredNote) {
            TransferNote.StructuredNote structuredNote = (TransferNote.StructuredNote) transferNote;
            Map mapB = structuredNote.b();
            if (mapB != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapB.entrySet()) {
                    if (!kotlin.text.d0.W(((TransferNote.StructuredNote.ReferenceValue) entry.getValue()).f101986a)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    arrayList.add(new prf.e((String) entry2.getKey(), ((TransferNote.StructuredNote.ReferenceValue) entry2.getValue()).f101986a));
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = zhm.f0.f322471a;
            }
            if (!arrayList.isEmpty()) {
                return new prf.f(structuredNote.f101984a, arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.transfer.models.transfer.TransferTrustData r11, gim.c r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a5k.v
            if (r0 == 0) goto L13
            r0 = r12
            a5k.v r0 = (a5k.v) r0
            int r1 = r0.f1491y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1491y = r1
            goto L18
        L13:
            a5k.v r0 = new a5k.v
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f1489w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1491y
            r7 = 0
            r9 = 1
            if (r2 == 0) goto L3a
            if (r2 != r9) goto L32
            iy9.d r11 = r0.v
            com.revolut.feature.transfer.models.transfer.TransferTrustData r1 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L2d
            r4 = r10
            goto L79
        L2d:
            r0 = move-exception
            r12 = r0
            r4 = r10
            r6 = r1
            goto L67
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            yhm.o.b(r12)
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r12 = r11.f92305b
            boolean r12 = com.revolut.feature.transfer.models.transfer.a.a(r12)
            if (r12 != 0) goto L48
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L48:
            iy9.d r5 = iy9.d.BENEFICIARY
            a41.s r3 = new a41.s     // Catch: java.lang.Exception -> L63
            r8 = 1
            r4 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L5f
            r0.u = r6     // Catch: java.lang.Exception -> L5f
            r0.v = r5     // Catch: java.lang.Exception -> L5f
            r0.f1491y = r9     // Catch: java.lang.Exception -> L5f
            java.lang.Object r11 = do3.q.u(r10, r3, r0)     // Catch: java.lang.Exception -> L5f
            if (r11 != r1) goto L79
            return r1
        L5f:
            r0 = move-exception
        L60:
            r12 = r0
            r11 = r5
            goto L67
        L63:
            r0 = move-exception
            r4 = r10
            r6 = r11
            goto L60
        L67:
            com.revolut.feature.transfer.core.api.trust.RecipientTrustError r0 = new com.revolut.feature.transfer.core.api.trust.RecipientTrustError
            r0.<init>(r12, r11, r6)
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r7, r7, r0, r11)
            boolean r11 = r12 instanceof com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException
            if (r11 != 0) goto L7c
        L79:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L7c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.y.Z2(com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r28, com.revolut.feature.transfer.models.transfer.TransferTrustData r29, java.lang.String r30, java.lang.String r31, gim.c r32) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.y.b3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, com.revolut.feature.transfer.models.transfer.TransferTrustData, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        if (r1 == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r31, com.revolut.feature.transfer.models.transfer.TransferTrustData r32, dj0.d r33, gim.c r34) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.y.c3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, com.revolut.feature.transfer.models.transfer.TransferTrustData, dj0.d, gim.c):java.lang.Object");
    }
}
