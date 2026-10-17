package crf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import opf.l;
import org.jetbrains.annotations.NotNull;
import wli.x;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends n implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f108373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zxd.c f108374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n0e.b f108375n;
    public final vyd.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f108376p;

    public k(l ticketsInteractor, zxd.c statementsInteractor, n0e.b statementsNaviCommandFactory, vyd.a statementsDialogFactory, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementsNaviCommandFactory, "statementsNaviCommandFactory");
        Intrinsics.checkNotNullParameter(statementsDialogFactory, "statementsDialogFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f108373l = ticketsInteractor;
        this.f108374m = statementsInteractor;
        this.f108375n = statementsNaviCommandFactory;
        this.o = statementsDialogFactory;
        this.f108376p = deeplinkHandler;
    }

    public static y0 Z2() {
        return new y0("TICKET_ERROR_STATUS_ID", new z(new TextLocalisedClause(R$string.bank_transfer_troubleshooting_locate_error_reticket_title, null, null, 14), null, new TextLocalisedClause(R$string.bank_transfer_troubleshooting_locate_error_reticket_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof crf.g
            if (r0 == 0) goto L13
            r0 = r8
            crf.g r0 = (crf.g) r0
            int r1 = r0.f108364x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108364x = r1
            goto L18
        L13:
            crf.g r0 = new crf.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108364x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "revolut://app/form/locate-outbound-transfer-flow-codeless-ticketor?transactionId="
            r8.<init>(r2)
            r8.append(r6)
            java.lang.String r2 = "&source="
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = "&userType=retail&requestType=Locate%20Transfer"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            wli.x r8 = r5.f108376p
            r2 = 6
            efm.d0 r7 = lg0.b.s1(r8, r7, r3, r3, r2)
            r0.u = r6
            r0.f108364x = r4
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L7e
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Troubleshooter Locate Transfer failed for "
            java.lang.String r6 = j6.a.q(r8, r6)
            r7.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            rd0.d.a(r8, r3, r3, r7, r6)
        L7e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: crf.k.b3(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final Unit c3(y0 y0Var, kse.a aVar) {
        n.j2(this, L2(y0Var), null, new c34.d(this, aVar, (Continuation) null, 26), 3);
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (c3(r9, r12) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        if (b3(r9, r11, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        if (c3(r9, r12) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(crf.b r9, com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType r10, java.lang.String r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: crf.k.d3(crf.b, com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        if (c3(r1, r12) == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(crf.b r29, com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType r30, java.lang.String r31, gim.c r32) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: crf.k.e3(crf.b, com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType, java.lang.String, gim.c):java.lang.Object");
    }
}
