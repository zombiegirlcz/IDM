package o4a;

import android.content.Context;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import com.revolut.sso.impl.domain.models.Identifier;
import gim.i;
import hs3.m1;
import java.io.File;
import java.util.List;
import java.util.Set;
import jlc.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import nel.n;
import nel.z;
import obc.m;
import om4.s3;
import prl.r;
import q50.s;
import qca.q;
import qg7.u;
import qmd.j;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f222176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f222177x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f222176w = obj3;
        this.f222177x = obj4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b((c) this.f222176w, (Set) this.f222177x, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.b) this.f222176w, (dj0.d) this.f222177x, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f222176w, (String) this.f222177x, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            case 3:
                b bVar4 = new b((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f222176w, (q9c.f) this.f222177x, continuation, 3);
                bVar4.v = obj2;
                return bVar4;
            case 4:
                b bVar5 = new b((m) this.f222176w, (List) this.f222177x, continuation, 4);
                bVar5.v = obj2;
                return bVar5;
            case 5:
                b bVar6 = new b((og6.i) this.f222176w, (String) this.f222177x, continuation, 5);
                bVar6.v = obj2;
                return bVar6;
            case 6:
                b bVar7 = new b((oh2.b) this.f222176w, (Function0) this.f222177x, continuation, 6);
                bVar7.v = obj2;
                return bVar7;
            case 7:
                return new b((oi0.b) this.v, (Context) this.f222176w, (Set) this.f222177x, continuation, 7);
            case 8:
                b bVar8 = new b((s3) this.f222176w, (ll4.c) this.f222177x, continuation, 8);
                bVar8.v = obj2;
                return bVar8;
            case 9:
                b bVar9 = new b((k18.c) this.f222176w, (String) this.f222177x, continuation, 9);
                bVar9.v = obj2;
                return bVar9;
            case 10:
                b bVar10 = new b((pb0.f) this.f222176w, (EntitiesSummaryItem) this.f222177x, continuation, 10);
                bVar10.v = obj2;
                return bVar10;
            case 11:
                b bVar11 = new b((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) this.f222176w, (String) this.f222177x, continuation, 11);
                bVar11.v = obj2;
                return bVar11;
            case 12:
                b bVar12 = new b((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) this.f222176w, (File) this.f222177x, continuation, 12);
                bVar12.v = obj2;
                return bVar12;
            case 13:
                b bVar13 = new b((pf9.e) this.f222176w, (ap1.d) this.f222177x, continuation, 13);
                bVar13.v = obj2;
                return bVar13;
            case 14:
                b bVar14 = new b((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d) this.f222176w, (m1) this.f222177x, continuation, 14);
                bVar14.v = obj2;
                return bVar14;
            case 15:
                return new b((pml.e) this.v, (String) this.f222176w, (okl.d) this.f222177x, continuation, 15);
            case 16:
                return new b((r) this.v, (bfl.g) this.f222176w, (z) this.f222177x, continuation, 16);
            case 17:
                b bVar15 = new b((psk.i) this.f222176w, (n) this.f222177x, continuation, 17);
                bVar15.v = obj2;
                return bVar15;
            case 18:
                b bVar16 = new b((com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) this.f222176w, (String) this.f222177x, continuation, 18);
                bVar16.v = obj2;
                return bVar16;
            case 19:
                b bVar17 = new b((com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.f222176w, (zm3.a) this.f222177x, continuation, 19);
                bVar17.v = obj2;
                return bVar17;
            case 20:
                b bVar18 = new b((Address) this.f222176w, (com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) this.f222177x, continuation, 20);
                bVar18.v = obj2;
                return bVar18;
            case 21:
                b bVar19 = new b((y50.d) this.f222176w, (s) this.f222177x, continuation, 21);
                bVar19.v = obj2;
                return bVar19;
            case 22:
                b bVar20 = new b((g8a.f) this.f222176w, (q) this.f222177x, continuation, 22);
                bVar20.v = obj2;
                return bVar20;
            case 23:
                b bVar21 = new b((u) this.f222176w, (String) this.f222177x, continuation, 23);
                bVar21.v = obj2;
                return bVar21;
            case 24:
                b bVar22 = new b((com.revolut.sso.impl.ui.combined_authentication.unified.a) this.f222176w, (Identifier) this.f222177x, continuation, 24);
                bVar22.v = obj2;
                return bVar22;
            case 25:
                b bVar23 = new b((j) this.f222176w, (qmd.a) this.f222177x, continuation, 25);
                bVar23.v = obj2;
                return bVar23;
            case 26:
                return new b((j) this.v, (qmd.a) this.f222176w, (yld.c) this.f222177x, continuation, 26);
            case 27:
                b bVar24 = new b((qn9.q) this.f222176w, (l6c.b) this.f222177x, continuation, 27);
                bVar24.v = obj2;
                return bVar24;
            case 28:
                b bVar25 = new b((qoc.r) this.f222176w, (l) this.f222177x, continuation, 28);
                bVar25.v = obj2;
                return bVar25;
            default:
                b bVar26 = new b((qoc.r) this.f222176w, (jlc.m) this.f222177x, continuation, 29);
                bVar26.v = obj2;
                return bVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08c9  */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem[], java.lang.Object[]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 2564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4a.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f222176w = obj2;
        this.f222177x = obj3;
    }
}
