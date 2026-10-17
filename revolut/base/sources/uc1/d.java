package uc1;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nii.b0;
import nii.y0;
import nii.z;
import uc1.a;
import zii.i;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f278967b;

    public /* synthetic */ d(e eVar, int i) {
        this.f278966a = i;
        this.f278967b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f278966a) {
            case 0:
                e eVar = this.f278967b;
                eVar.f278969x.Q(new d(eVar, 1));
                break;
            case 1:
                this.f278967b.v2(a.d.f278963a);
                break;
            case 2:
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_flow_updating_regular_title, null, null, 14);
                e eVar2 = this.f278967b;
                i.t(eVar2, eVar2.z2(new y0(null, new b0(textLocalisedClause, null, null, null, o70.a.f(eVar2.v.i), 0, true, false, null, 1838), false, 5)), null, null, 15);
                break;
            default:
                y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.merchant_card_reader_flow_updating_failure_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_connect_to_different_reader, null, new Click(30, (Integer) null, (Object) null, "rescan_click_id", false), 10), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
                e eVar3 = this.f278967b;
                i.t(eVar3, eVar3.z2(y0Var), new c(eVar3, 4), null, 14);
                break;
        }
        return Unit.f186387a;
    }
}
