package u29;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import ukm.i0;
import vch.x0;
import vge.r0;
import vge.t0;
import vha.q0;
import w38.w0;
import wda.z;
import wnc.g0;
import yhm.r;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f276564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f276565x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f276565x = str;
        this.f276564w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((d) this.f276564w, (String) this.f276565x, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c((d) this.f276564w, (w4l.k) this.f276565x, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c((ued.d) this.f276564w, (LocalDate) this.f276565x, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c((toh.d) this.f276564w, (w4l.k) this.f276565x, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c((und.e) this.f276564w, (AnalyticsAccountsSelection) this.f276565x, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c((NavBarWithToolbar) this.f276564w, (RecyclerView) this.f276565x, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c((dj0.d) this.f276564w, (su9.c) this.f276565x, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c((use.d) this.f276564w, (w4l.k) this.f276565x, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c((uvl.c) this.f276564w, (w4l.k) this.f276565x, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c((NavBarWithToolbar) this.f276564w, (RecipientSelectionScreen) this.f276565x, continuation, 9);
                cVar10.v = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c((com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b) this.f276564w, (Set) this.f276565x, continuation, 10);
                cVar11.v = obj2;
                return cVar11;
            case 11:
                c cVar12 = new c((v73.j) this.f276564w, (dj0.d) this.f276565x, continuation, 11);
                cVar12.v = obj2;
                return cVar12;
            case 12:
                c cVar13 = new c((x0) this.f276564w, (j1j.d) this.f276565x, continuation, 12);
                cVar13.v = obj2;
                return cVar13;
            case 13:
                c cVar14 = new c((vf9.b) this.f276564w, (ve7.i) this.f276565x, continuation, 13);
                cVar14.v = obj2;
                return cVar14;
            case 14:
                c cVar15 = new c((t0) this.f276564w, (List) this.f276565x, continuation, 14);
                cVar15.v = obj2;
                return cVar15;
            case 15:
                c cVar16 = new c((ohe.b) this.f276564w, (t0) this.f276565x, continuation, 15);
                cVar16.v = obj2;
                return cVar16;
            case 16:
                c cVar17 = new c((t0) this.f276564w, (sfe.a) this.f276565x, continuation, 16);
                cVar17.v = obj2;
                return cVar17;
            case 17:
                c cVar18 = new c((q0) this.f276564w, (sfe.m) this.f276565x, continuation, 17);
                cVar18.v = obj2;
                return cVar18;
            case 18:
                return new c(18, (vkl.e) this.v, (okl.d) this.f276564w, (String) this.f276565x, continuation);
            case 19:
                c cVar19 = new c((Ref$ObjectRef) this.f276564w, (i0) this.f276565x, continuation, 19);
                cVar19.v = obj2;
                return cVar19;
            case 20:
                return new c((com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.v, (bgf.h) this.f276564w, (String) this.f276565x, continuation);
            case 21:
                c cVar20 = new c((vrl.e) this.f276564w, (w4l.k) this.f276565x, continuation, 21);
                cVar20.v = obj2;
                return cVar20;
            case 22:
                c cVar21 = new c((xi0.b) this.f276564w, (vrl.o) this.f276565x, continuation, 22);
                cVar21.v = obj2;
                return cVar21;
            case 23:
                c cVar22 = new c((List) this.f276564w, (w20.e) this.f276565x, continuation, 23);
                cVar22.v = obj2;
                return cVar22;
            case 24:
                c cVar23 = new c((w0) this.f276564w, (sfe.a) this.f276565x, continuation, 24);
                cVar23.v = obj2;
                return cVar23;
            case 25:
                c cVar24 = new c((wbf.a) this.f276564w, (lbf.f) this.f276565x, continuation, 25);
                cVar24.v = obj2;
                return cVar24;
            case 26:
                return new c(26, (z) this.v, (Set) this.f276564w, (String) this.f276565x, continuation);
            case 27:
                c cVar25 = new c((wdb.n) this.f276564w, (String) this.f276565x, continuation, 27);
                cVar25.v = obj2;
                return cVar25;
            case 28:
                c cVar26 = new c((wm3.l) this.f276564w, (zm3.a) this.f276565x, continuation, 28);
                cVar26.v = obj2;
                return cVar26;
            default:
                c cVar27 = new c((List) this.f276564w, (g0) this.f276565x, continuation, 29);
                cVar27.v = obj2;
                return cVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((r0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((r0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((ohe.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((xfe.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create(new ukm.z(((ukm.z) obj2).f280843a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((k4l.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((v38.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((TradingLegalEntityInformation) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((Reservation) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((doc.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.revolut.retail.core.navigation.NaviCommand] */
    /* JADX WARN: Type inference failed for: r13v14, types: [com.revolut.retail.core.navigation.FeatureCommand] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u29.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar, bgf.h hVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 20;
        this.v = aVar;
        this.f276564w = hVar;
        this.f276565x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f276564w = obj2;
        this.f276565x = obj3;
    }
}
