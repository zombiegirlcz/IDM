package jc1;

import android.content.Intent;
import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.card_reader.data.api.domain.exception.MerchantNotOnboardedException;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.R$string;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;
import d67.s;
import d67.u;
import efm.d0;
import fa1.q;
import fa1.r;
import ha1.v;
import java.util.List;
import jc1.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m98.k;
import nii.c0;
import nii.j1;
import nii.l1;
import nii.n1;
import nii.y0;
import nii.z;
import sa1.j;
import sa1.t;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f172692b;

    public /* synthetic */ d(h hVar, int i) {
        this.f172691a = i;
        this.f172692b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f172691a;
        final int i2 = 0;
        a.C0982a c0982a = a.C0982a.f172687a;
        a.b bVar = a.b.f172688a;
        final h hVar = this.f172692b;
        switch (i) {
            case 0:
                u output = (u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, s.f111464a)) {
                    hVar.C2();
                } else {
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 1:
                n1 dialogResult = (n1) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                if (dialogResult instanceof l1) {
                    hVar.C2();
                } else if (dialogResult instanceof j1) {
                    hVar.v2(bVar);
                } else {
                    hVar.v2(c0982a);
                }
                return Unit.f186387a;
            case 2:
                xc1.d dVar = hVar.f172699x;
                q connectionResult = (q) obj2;
                Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
                final int i5 = 1;
                if (Intrinsics.f(connectionResult, q.d.f133211a)) {
                    dVar.Q(new Function0() { // from class: jc1.e
                        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
                                    h hVar2 = hVar;
                                    zii.i.t(hVar2, hVar2.z2(y0Var), new d(hVar2, 1), null, 14);
                                    break;
                                case 1:
                                    h hVar3 = hVar;
                                    hVar3.B2(hVar3.u.f60650a.getName());
                                    break;
                                case 2:
                                    h hVar4 = hVar;
                                    zii.i.t(hVar4, hVar4.z2(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connecting_to_device_failure_title, zhm.u.c(new TextClause(hVar4.u.f60650a.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5)), new d(hVar4, 5), null, 14);
                                    break;
                                default:
                                    h hVar5 = hVar;
                                    hVar5.B2(hVar5.u.f60650a.getName());
                                    ma1.u uVar = hVar5.f172698w;
                                    v vVar = uVar.f203908b;
                                    efm.b bVarB = vVar.b();
                                    sa1.q qVar = (sa1.q) vVar.f150392a;
                                    qVar.getClass();
                                    sfm.b bVarG = bVarB.g(pw5.a.g(t.a(new GetInfosCommand(195, Constants.TAG_FIRMWARE_VERSION, Constants.TAG_BLE_FIRMWARE_VERSION, Constants.TAG_POWER_OFF_TIMEOUT, 196), new j(qVar, 0), new s8h.h(9))));
                                    Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                                    d0 d0VarFirstOrError = bVarG.firstOrError();
                                    m78.e eVar = new m78.e(new k(uVar, 5), 26);
                                    d0VarFirstOrError.getClass();
                                    ufm.i iVar = new ufm.i(d0VarFirstOrError, eVar, 0);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                    d onSuccess = new d(hVar5, 3);
                                    d handleError = new d(hVar5, 4);
                                    hVar5.getClass();
                                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                                    Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                                    Intrinsics.checkNotNullParameter(handleError, "handleError");
                                    ((zii.h) hVar5.f15679t.getValue()).g(iVar, onSuccess, handleError);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                } else if (connectionResult instanceof fa1.u) {
                    final fa1.u uVar = (fa1.u) connectionResult;
                    if (!(uVar instanceof fa1.t)) {
                        if (uVar instanceof fa1.s) {
                            dVar.Q(new Function0() { // from class: jc1.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i2) {
                                        case 0:
                                            fa1.s sVar = (fa1.s) uVar;
                                            y0 y0Var = new y0(null, new c0(new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connecting_pairing_key, zhm.v.k(new TextClause(String.valueOf(sVar.f133215b), (Style) null, Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, 122), new TextClause(sVar.f133214a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, true, null, false, false, null, 1902), false, 5);
                                            h hVar2 = hVar;
                                            zii.i.t(hVar2, hVar2.z2(y0Var), null, null, 15);
                                            break;
                                        default:
                                            hVar.B2(((r) uVar).f133213a);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            });
                        } else {
                            if (!(uVar instanceof r)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar.Q(new Function0() { // from class: jc1.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            fa1.s sVar = (fa1.s) uVar;
                                            y0 y0Var = new y0(null, new c0(new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connecting_pairing_key, zhm.v.k(new TextClause(String.valueOf(sVar.f133215b), (Style) null, Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, 122), new TextClause(sVar.f133214a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, true, null, false, false, null, 1902), false, 5);
                                            h hVar2 = hVar;
                                            zii.i.t(hVar2, hVar2.z2(y0Var), null, null, 15);
                                            break;
                                        default:
                                            hVar.B2(((r) uVar).f133213a);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            });
                        }
                    }
                } else if (Intrinsics.f(connectionResult, q.c.f133210a)) {
                    final int i6 = 2;
                    dVar.Q(new Function0() { // from class: jc1.e
                        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
                                    h hVar2 = hVar;
                                    zii.i.t(hVar2, hVar2.z2(y0Var), new d(hVar2, 1), null, 14);
                                    break;
                                case 1:
                                    h hVar3 = hVar;
                                    hVar3.B2(hVar3.u.f60650a.getName());
                                    break;
                                case 2:
                                    h hVar4 = hVar;
                                    zii.i.t(hVar4, hVar4.z2(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connecting_to_device_failure_title, zhm.u.c(new TextClause(hVar4.u.f60650a.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5)), new d(hVar4, 5), null, 14);
                                    break;
                                default:
                                    h hVar5 = hVar;
                                    hVar5.B2(hVar5.u.f60650a.getName());
                                    ma1.u uVar2 = hVar5.f172698w;
                                    v vVar = uVar2.f203908b;
                                    efm.b bVarB = vVar.b();
                                    sa1.q qVar = (sa1.q) vVar.f150392a;
                                    qVar.getClass();
                                    sfm.b bVarG = bVarB.g(pw5.a.g(t.a(new GetInfosCommand(195, Constants.TAG_FIRMWARE_VERSION, Constants.TAG_BLE_FIRMWARE_VERSION, Constants.TAG_POWER_OFF_TIMEOUT, 196), new j(qVar, 0), new s8h.h(9))));
                                    Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                                    d0 d0VarFirstOrError = bVarG.firstOrError();
                                    m78.e eVar = new m78.e(new k(uVar2, 5), 26);
                                    d0VarFirstOrError.getClass();
                                    ufm.i iVar = new ufm.i(d0VarFirstOrError, eVar, 0);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                    d onSuccess = new d(hVar5, 3);
                                    d handleError = new d(hVar5, 4);
                                    hVar5.getClass();
                                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                                    Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                                    Intrinsics.checkNotNullParameter(handleError, "handleError");
                                    ((zii.h) hVar5.f15679t.getValue()).g(iVar, onSuccess, handleError);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                } else if (Intrinsics.f(connectionResult, q.e.f133212a)) {
                    final int i21 = 3;
                    dVar.Q(new Function0() { // from class: jc1.e
                        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i21) {
                                case 0:
                                    y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
                                    h hVar2 = hVar;
                                    zii.i.t(hVar2, hVar2.z2(y0Var), new d(hVar2, 1), null, 14);
                                    break;
                                case 1:
                                    h hVar3 = hVar;
                                    hVar3.B2(hVar3.u.f60650a.getName());
                                    break;
                                case 2:
                                    h hVar4 = hVar;
                                    zii.i.t(hVar4, hVar4.z2(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connecting_to_device_failure_title, zhm.u.c(new TextClause(hVar4.u.f60650a.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5)), new d(hVar4, 5), null, 14);
                                    break;
                                default:
                                    h hVar5 = hVar;
                                    hVar5.B2(hVar5.u.f60650a.getName());
                                    ma1.u uVar2 = hVar5.f172698w;
                                    v vVar = uVar2.f203908b;
                                    efm.b bVarB = vVar.b();
                                    sa1.q qVar = (sa1.q) vVar.f150392a;
                                    qVar.getClass();
                                    sfm.b bVarG = bVarB.g(pw5.a.g(t.a(new GetInfosCommand(195, Constants.TAG_FIRMWARE_VERSION, Constants.TAG_BLE_FIRMWARE_VERSION, Constants.TAG_POWER_OFF_TIMEOUT, 196), new j(qVar, 0), new s8h.h(9))));
                                    Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                                    d0 d0VarFirstOrError = bVarG.firstOrError();
                                    m78.e eVar = new m78.e(new k(uVar2, 5), 26);
                                    d0VarFirstOrError.getClass();
                                    ufm.i iVar = new ufm.i(d0VarFirstOrError, eVar, 0);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                    d onSuccess = new d(hVar5, 3);
                                    d handleError = new d(hVar5, 4);
                                    hVar5.getClass();
                                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                                    Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                                    Intrinsics.checkNotNullParameter(handleError, "handleError");
                                    ((zii.h) hVar5.f15679t.getValue()).g(iVar, onSuccess, handleError);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                } else if (Intrinsics.f(connectionResult, q.a.f133208a)) {
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    knm.b.j(hVar.l1(), new ExternalDestination.ByIntent(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 56));
                } else if (!Intrinsics.f(connectionResult, q.b.f133209a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 3:
                PairingInfo it8 = (PairingInfo) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                hVar.f172699x.Q(new j68.a(hVar, it8, 12));
                return Unit.f186387a;
            case 4:
                xc1.d dVar2 = hVar.f172699x;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof MerchantNotOnboardedException) {
                    dVar2.d.onNext(xc1.d.f);
                    hVar.X().a();
                    hVar.v2(a.c.f172689a);
                } else {
                    dVar2.Q(new Function0() { // from class: jc1.e
                        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
                                    h hVar2 = hVar;
                                    zii.i.t(hVar2, hVar2.z2(y0Var), new d(hVar2, 1), null, 14);
                                    break;
                                case 1:
                                    h hVar3 = hVar;
                                    hVar3.B2(hVar3.u.f60650a.getName());
                                    break;
                                case 2:
                                    h hVar4 = hVar;
                                    zii.i.t(hVar4, hVar4.z2(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connecting_to_device_failure_title, zhm.u.c(new TextClause(hVar4.u.f60650a.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.card_reader.ui.api.R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5)), new d(hVar4, 5), null, 14);
                                    break;
                                default:
                                    h hVar5 = hVar;
                                    hVar5.B2(hVar5.u.f60650a.getName());
                                    ma1.u uVar2 = hVar5.f172698w;
                                    v vVar = uVar2.f203908b;
                                    efm.b bVarB = vVar.b();
                                    sa1.q qVar = (sa1.q) vVar.f150392a;
                                    qVar.getClass();
                                    sfm.b bVarG = bVarB.g(pw5.a.g(t.a(new GetInfosCommand(195, Constants.TAG_FIRMWARE_VERSION, Constants.TAG_BLE_FIRMWARE_VERSION, Constants.TAG_POWER_OFF_TIMEOUT, 196), new j(qVar, 0), new s8h.h(9))));
                                    Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                                    d0 d0VarFirstOrError = bVarG.firstOrError();
                                    m78.e eVar = new m78.e(new k(uVar2, 5), 26);
                                    d0VarFirstOrError.getClass();
                                    ufm.i iVar = new ufm.i(d0VarFirstOrError, eVar, 0);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                    d onSuccess = new d(hVar5, 3);
                                    d handleError = new d(hVar5, 4);
                                    hVar5.getClass();
                                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                                    Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                                    Intrinsics.checkNotNullParameter(handleError, "handleError");
                                    ((zii.h) hVar5.f15679t.getValue()).g(iVar, onSuccess, handleError);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                }
                return Boolean.TRUE;
            default:
                n1 dialogResult2 = (n1) obj2;
                Intrinsics.checkNotNullParameter(dialogResult2, "dialogResult");
                if (dialogResult2 instanceof l1) {
                    hVar.C2();
                } else if (dialogResult2 instanceof j1) {
                    hVar.v2(bVar);
                } else {
                    hVar.v2(c0982a);
                }
                return Unit.f186387a;
        }
    }
}
