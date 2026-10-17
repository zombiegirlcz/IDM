package avk;

import b4g.m0;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.breb.impl.ui.keys.BrebKeysScreen;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info.InsightSettingsInfoBottomSheetScreen;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import io.fotoapparat.exception.camera.CameraException;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import nii.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f10094w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f10094w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i((CfdDetailsController) this.f10094w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i((BrebKeysScreen) this.f10094w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i((aw1.q) this.f10094w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i((PlanComparisonScreen) this.f10094w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i((aw7.l) this.f10094w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            case 5:
                i iVar6 = new i((awk.i) this.f10094w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
            case 6:
                i iVar7 = new i((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.b) this.f10094w, continuation, 6);
                iVar7.v = obj2;
                return iVar7;
            case 7:
                i iVar8 = new i((ProfileScannerScreen) this.f10094w, continuation, 7);
                iVar8.v = obj2;
                return iVar8;
            case 8:
                i iVar9 = new i((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) this.f10094w, continuation, 8);
                iVar9.v = obj2;
                return iVar9;
            case 9:
                return new i((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) this.v, (y0) this.f10094w, continuation, 9);
            case 10:
                i iVar10 = new i((aye.m) this.f10094w, continuation, 10);
                iVar10.v = obj2;
                return iVar10;
            case 11:
                i iVar11 = new i((SchemeLoungesHowToAccessScreen) this.f10094w, continuation, 11);
                iVar11.v = obj2;
                return iVar11;
            case 12:
                i iVar12 = new i((b0i.e) this.f10094w, continuation, 12);
                iVar12.v = obj2;
                return iVar12;
            case 13:
                i iVar13 = new i((com.revolut.feature.rev_points.impl.ui.trophy_room.home.b) this.f10094w, continuation, 13);
                iVar13.v = obj2;
                return iVar13;
            case 14:
                i iVar14 = new i((ApmAliasClaimUploadScreen) this.f10094w, continuation, 14);
                iVar14.v = obj2;
                return iVar14;
            case 15:
                i iVar15 = new i((b22.m) this.f10094w, continuation, 15);
                iVar15.v = obj2;
                return iVar15;
            case 16:
                i iVar16 = new i((com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a) this.f10094w, continuation, 16);
                iVar16.v = obj2;
                return iVar16;
            case 17:
                i iVar17 = new i((b28.b) this.f10094w, continuation, 17);
                iVar17.v = obj2;
                return iVar17;
            case 18:
                i iVar18 = new i((InsightSettingsInfoBottomSheetScreen) this.f10094w, continuation, 18);
                iVar18.v = obj2;
                return iVar18;
            case 19:
                return new i((b30.e) this.v, (b30.b) this.f10094w, continuation, 19);
            case 20:
                i iVar19 = new i((b47.h) this.f10094w, continuation, 20);
                iVar19.v = obj2;
                return iVar19;
            case 21:
                i iVar20 = new i((b4g.f) this.f10094w, continuation, 21);
                iVar20.v = obj2;
                return iVar20;
            case 22:
                i iVar21 = new i((b4g.u) this.f10094w, continuation, 22);
                iVar21.v = obj2;
                return iVar21;
            case 23:
                return new i((m0) this.v, (String) this.f10094w, continuation, 23);
            case 24:
                i iVar22 = new i((b4h.c) this.f10094w, continuation, 24);
                iVar22.v = obj2;
                return iVar22;
            case 25:
                i iVar23 = new i((com.revolut.feature.credit.application.plugins.impl.ui.akahu.b) this.f10094w, continuation, 25);
                iVar23.v = obj2;
                return iVar23;
            case 26:
                i iVar24 = new i((aah.g) this.f10094w, continuation, 26);
                iVar24.v = obj2;
                return iVar24;
            case 27:
                i iVar25 = new i((b5b.a) this.f10094w, continuation, 27);
                iVar25.v = obj2;
                return iVar25;
            case 28:
                i iVar26 = new i((b6a.e) this.f10094w, continuation, 28);
                iVar26.v = obj2;
                return iVar26;
            default:
                i iVar27 = new i((b73.i) this.f10094w, continuation, 29);
                iVar27.v = obj2;
                return iVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((awk.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i) create((CameraException) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i) create((File) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((i) create((e60.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((i) create((b4g.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((i) create((nel.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                ((i) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 26:
                return ((i) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((i) create((y5a.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0473  */
    /* JADX WARN: Type inference failed for: r0v104, types: [ue0.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [tji.l] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.revolut.feature.payments.profile.impl.ui_kompot.scanner.b, java.lang.Object, yji.n] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: avk.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f10094w = obj2;
    }
}
