package zq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSendWalletsListControllerContract$InputData f324390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final po5.a f324391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pn5.a f324392c;
    public final bk5.a d;
    public final j0 e;

    public l(CryptoSendWalletsListControllerContract$InputData inputData, po5.a cryptoWithdrawEnabledStateChecker, pn5.a cryptoAddressValidationInteractor, bk5.a blockchainInteractor, j0 sendRecipientsSorter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(cryptoAddressValidationInteractor, "cryptoAddressValidationInteractor");
        Intrinsics.checkNotNullParameter(blockchainInteractor, "blockchainInteractor");
        Intrinsics.checkNotNullParameter(sendRecipientsSorter, "sendRecipientsSorter");
        this.f324390a = inputData;
        this.f324391b = cryptoWithdrawEnabledStateChecker;
        this.f324392c = cryptoAddressValidationInteractor;
        this.d = blockchainInteractor;
        this.e = sendRecipientsSorter;
    }

    public final List a(String str, List list) {
        if (!this.f324390a.f71335b.contains(ko5.p.WALLET)) {
            return zhm.f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof f0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            CryptoAddress cryptoAddress = ((f0) obj3).f324378a;
            String str2 = CryptoAddress.e(cryptoAddress, 0, 3).f186223a;
            if (!(str2 != null ? kotlin.text.d0.J(str2, str, true) : false)) {
                String str3 = cryptoAddress.f71061c;
                if (!(str3 != null ? kotlin.text.d0.J(str3, str, true) : false)) {
                    String strName = wk5.m.a(cryptoAddress.f71063h).name();
                    if (strName != null ? kotlin.text.d0.J(strName, str, true) : false) {
                    }
                }
            }
            arrayList2.add(obj3);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
    
        if (r11 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, xi0.b r9, java.util.List r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq5.l.b(java.lang.String, xi0.b, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(wk5.a r6, xi0.b r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zq5.k
            if (r0 == 0) goto L13
            r0 = r8
            zq5.k r0 = (zq5.k) r0
            int r1 = r0.f324389x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324389x = r1
            goto L18
        L13:
            zq5.k r0 = new zq5.k
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324389x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wk5.a r6 = r0.u
            yhm.o.b(r8)
            goto L62
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            bk5.a r8 = r5.d
            efm.r r7 = bk5.a.c(r8, r7)
            znd.u0 r8 = new znd.u0
            r2 = 18
            r8.<init>(r2)
            zmg.c r2 = new zmg.c
            r4 = 14
            r2.<init>(r8, r4)
            efm.r r7 = r7.filter(r2)
            java.lang.String r8 = "filter(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r8 = 3
            r2 = 0
            efm.r r7 = m70.a.g(r7, r2, r2, r8)
            r0.u = r6
            r0.f324389x = r3
            java.lang.Object r8 = nim.a.c(r7, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            java.util.List r8 = (java.util.List) r8
            boolean r6 = r8.contains(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zq5.l.c(wk5.a, xi0.b, gim.c):java.lang.Object");
    }
}
