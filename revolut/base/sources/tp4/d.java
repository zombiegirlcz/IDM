package tp4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273263a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f273264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f273265c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(yt0.j jVar, boolean z, boolean z3) {
        this.d = jVar;
        this.f273264b = z;
        this.f273265c = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f273263a) {
            case 0:
                com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar = (com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a) this.d;
                vp4.a aVar2 = aVar.f69066t;
                if (!this.f273264b || this.f273265c) {
                    aVar2.getClass();
                    yji.l.b1(aVar, aVar.X1(new mii.f("auto-pay-amount-updated-shot-dialog", new TextLocalisedClause(R$string.credit_card_auto_pay_amount_saved, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG)), null, null, 7);
                } else {
                    aVar2.getClass();
                    yji.l.b1(aVar, aVar.X1(new mii.f("id_autopay_management_dialog_source_updated", new TextLocalisedClause(R$string.credit_card_auto_pay_management_update_source, null, null, 14), null, null, null, null, 124)), null, null, 7);
                }
                aVar.I2();
                break;
            default:
                ((yt0.j) this.d).a(this.f273264b, this.f273265c);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ d(boolean z, boolean z3, com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar) {
        this.f273264b = z;
        this.f273265c = z3;
        this.d = aVar;
    }
}
