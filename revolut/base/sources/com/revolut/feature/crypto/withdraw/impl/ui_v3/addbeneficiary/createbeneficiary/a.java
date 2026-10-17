package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary;

import ahe.y0;
import amh.w;
import ap5.b;
import bq5.a0;
import bq5.a1;
import bq5.b0;
import bq5.b1;
import bq5.c;
import bq5.f1;
import bq5.i0;
import bq5.j0;
import bq5.k0;
import bq5.k1;
import bq5.l0;
import bq5.o0;
import bq5.p0;
import bq5.r0;
import bq5.u0;
import bq5.w0;
import cli.y;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$Modal;
import com.revolut.kompot.common.ModalDestination;
import go.g;
import i4b.f;
import jid.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import vkm.j2;
import vkm.q;
import vkm.t0;
import wk5.i;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements k0 {

    @NotNull
    public static final p0 Companion = new p0();
    public final se5.a A;
    public final k1 B;
    public final y C;
    public final com.revolut.kompot.navigable.vc.modal.a D;
    public final CryptoCreateBeneficiaryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final po5.a f71234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bk5.a f71235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pn5.a f71236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f71237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z f71238t;
    public final bq5.a u;
    public final qn5.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l7l.b f71239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f71240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ang.f f71241y;
    public final c z;

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(ac4.g r48, com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData r49, po5.a r50, bk5.a r51, pn5.a r52, ap5.b r53, jid.z r54, bq5.a r55, qn5.b r56, l7l.b r57, i4b.f r58, ang.f r59, bq5.c r60, se5.a r61, bq5.k1 r62) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.<init>(ac4.g, com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData, po5.a, bk5.a, pn5.a, ap5.b, jid.z, bq5.a, qn5.b, l7l.b, i4b.f, ang.f, bq5.c, se5.a, bq5.k1):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01dc, code lost:
    
        if (r0 != r7) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5 A[PHI: r0 r11 r12 r13
      0x01b5: PHI (r0v31 int) = (r0v20 int), (r0v42 int) binds: [B:47:0x00bd, B:61:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r11v1 'currency' xi0.b) = (r11v0 'currency' xi0.b), (r11v2 'currency' xi0.b) binds: [B:47:0x00bd, B:61:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r12v1 'blockchain' wk5.a) = (r12v0 'blockchain' wk5.a), (r12v2 'blockchain' wk5.a) binds: [B:47:0x00bd, B:61:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r13v9 int) = (r13v5 int), (r13v10 int) binds: [B:47:0x00bd, B:61:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.I2(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof bq5.g1
            if (r0 == 0) goto L13
            r0 = r5
            bq5.g1 r0 = (bq5.g1) r0
            int r1 = r0.f17715w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17715w = r1
            goto L18
        L13:
            bq5.g1 r0 = new bq5.g1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17715w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L5e
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData r5 = r4.o
            java.lang.String r5 = r5.f
            if (r5 == 0) goto L63
            cli.y r2 = r4.C
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            bq5.a0 r2 = (bq5.a0) r2
            java.lang.String r2 = r2.f17682p
            java.lang.String r2 = ehe.n.u(r2)
            r0.f17715w = r3
            ap5.b r3 = r4.f71237s
            pfm.r r5 = r3.j(r5, r2)
            java.lang.Object r5 = nim.a.a(r5, r0)
            if (r5 != r1) goto L59
            goto L5b
        L59:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L5b:
            if (r5 != r1) goto L5e
            return r1
        L5e:
            bq5.f0 r5 = bq5.f0.f17709a
            r4.C2(r5)
        L63:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.J2(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a r4, java.lang.String r5, wk5.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof bq5.i1
            if (r0 == 0) goto L13
            r0 = r7
            bq5.i1 r0 = (bq5.i1) r0
            int r1 = r0.f17724y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17724y = r1
            goto L18
        L13:
            bq5.i1 r0 = new bq5.i1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f17722w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17724y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            wk5.a r6 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L71
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r7)
            int r7 = r5.length()
            if (r7 != 0) goto L44
            kn5.e r4 = new kn5.e
            kn5.h r5 = kn5.h.f186003a
            r4.<init>(r5)
            return r4
        L44:
            if (r6 == 0) goto L86
            com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData r7 = r4.o
            wk5.a r7 = r7.e
            if (r7 == 0) goto L5e
            wk5.k r7 = wk5.m.a(r7)
            wk5.k r2 = wk5.m.a(r6)
            if (r7 == r2) goto L5e
            kn5.b r4 = new kn5.b
            kn5.i r5 = kn5.i.f186004a
            r4.<init>(r5)
            return r4
        L5e:
            po5.a r7 = r4.f71234p
            ufm.i r7 = r7.a()
            r0.u = r5
            r0.v = r6
            r0.f17724y = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            pn5.a r4 = r4.f71236r
            kn5.a r0 = new kn5.a
            kotlin.jvm.internal.Intrinsics.h(r7)
            boolean r7 = r7.booleanValue()
            r0.<init>(r5, r6, r7)
            kn5.f r4 = r4.b(r0)
            return r4
        L86:
            kn5.e r4 = new kn5.e
            r5 = 0
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.K2(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a, java.lang.String, wk5.a, gim.c):java.lang.Object");
    }

    public static i0 M2(CryptoAddressRecipientDetails cryptoAddressRecipientDetails) {
        if (cryptoAddressRecipientDetails == null) {
            return null;
        }
        String str = cryptoAddressRecipientDetails.f70984a;
        i iVar = cryptoAddressRecipientDetails.f70985b;
        String str2 = iVar == i.INDIVIDUAL ? str : null;
        String str3 = str2 == null ? "" : str2;
        String str4 = cryptoAddressRecipientDetails.f70986c;
        String str5 = str4 == null ? "" : str4;
        String str6 = iVar == i.COMPANY ? str : null;
        String str7 = str6 == null ? "" : str6;
        String str8 = cryptoAddressRecipientDetails.e;
        return new i0(str3, str5, str7, str8 == null ? "" : str8, r0.f17751c[iVar.ordinal()] == 2 ? j0.BUSINESS : j0.INDIVIDUAL);
    }

    public static l0 O2(CryptoAddressRecipientDetails cryptoAddressRecipientDetails, l0 l0Var) {
        i iVar = cryptoAddressRecipientDetails != null ? cryptoAddressRecipientDetails.f70985b : null;
        int i = iVar == null ? -1 : r0.f17751c[iVar.ordinal()];
        return (i == 1 || i == 2) ? l0.SOMEONE_ELSE : i != 3 ? l0Var : l0.MY_WALLET;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    public final CryptoAddressHostingInfo L2() {
        CryptoAddressHostingCheckResult.Found foundA;
        y yVar = this.C;
        CryptoAddressRecipientDetails recipientDetails = ((a0) ((j2) yVar.f22677a).getValue()).B;
        if (recipientDetails == null || (foundA = com.revolut.feature.crypto.withdraw.api.models.a.a((CryptoAddressHostingCheckResult) ((a0) ((j2) yVar.f22677a).getValue()).f17677h.getContent())) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(foundA, "<this>");
        Intrinsics.checkNotNullParameter(recipientDetails, "recipientDetails");
        return new CryptoAddressHostingInfo(foundA.f71073b, foundA.f71072a, recipientDetails);
    }

    public final void N2() {
        h.v2(this.D, new CryptoCreateBeneficiaryScreenContract$Modal.Hosting(((a0) ((j2) this.C.f22677a).getValue()).i == l0.SOMEONE_ELSE), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow gVar;
        CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData = this.o;
        String str = cryptoCreateBeneficiaryScreenContract$InputData.f;
        b0 b0Var = cryptoCreateBeneficiaryScreenContract$InputData.f71222a;
        boolean z = false;
        y yVar = this.C;
        Continuation continuation = null;
        if (str != null && ((a0) ((j2) yVar.f22677a).getValue()).D == null) {
            l.b1(this, mo3.a.g(e.b(this.f71237s.c(cryptoCreateBeneficiaryScreenContract$InputData.f, false, ho5.a.NONE)), null, null, 3), null, new w0(this, null), 3);
        }
        l.b1(this, new a1(yVar.B(new bng.a(22)), this, 0), null, new u0(2, this, continuation), 3);
        l.b1(this, new w(q.Q(new t0(yVar.B(new bng.a(27)), 1), new b1(0, this, continuation)), 1), null, new u0(3, this, continuation), 3);
        xi0.b currency = ((a0) ((j2) yVar.f22677a).getValue()).f17673a;
        xi0.b.Companion.getClass();
        if (Intrinsics.f(currency, xi0.b.K)) {
            bk5.a aVar = this.f71235q;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(currency, "currency");
            gVar = new bk6.c(e.b(nim.a.w(nim.a.w(aVar.f16260a.a(false), new a6j.a(currency, z, 8)), new bjg.c(7))), 16);
        } else {
            gVar = new g(null, 2);
        }
        l.b1(this, yh5.b.d(gVar, yVar.B(new o0(0))), null, new u0(1, this, continuation), 3);
        b0Var.getClass();
        b0 b0Var2 = b0.CREATION;
        if (b0Var == b0Var2) {
            l.b1(this, q.Q(yVar.B(new bng.a(28)), new y0(continuation, this, 4)), null, new u0(0, this, continuation), 3);
        } else {
            H2(yVar, new bng.a(29));
        }
        b0Var.getClass();
        if (b0Var == b0Var2 || b0Var == b0.SUBMIT_RECIPIENT_DETAILS || b0Var == b0.SUBMIT_DEPOSITED_COUNTERPARTY_DETAILS) {
            l.b1(this, q.Q(yVar.B(new bng.a(20)), new b1(1, this, continuation)), null, new u0(5, this, continuation), 3);
        }
        l.b1(this, new a1(yVar.B(new bng.a(23)), this, 1), null, new u0(4, this, continuation), 3);
        l.b1(this, yVar.B(new bng.a(24)), null, new u0(6, this, continuation), 3);
        b0Var.getClass();
        if (b0Var == b0.SUBMIT_DEPOSITED_COUNTERPARTY_DETAILS) {
            l.b1(this, yVar.B(new bng.a(21)), null, new f1(this, null), 3);
            l.b1(this, this.f71241y.j(w4l.h.f294642c), null, new u0(9, this, continuation), 3);
        }
        l.b1(this, yVar.B(new bng.a(26)), null, new u0(8, this, continuation), 3);
        l.b1(this, yVar.B(new bng.a(25)), null, new u0(7, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
