package bb2;

import cb2.e;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.payid.api.R$string;
import com.revolut.feature.apm.payid.impl.screen.settings.SettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.youTransactor.uCube.rpc.Constants;
import eb2.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsScreenContract$ModalStep f14157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.settings.a f14158c;

    public /* synthetic */ x(SettingsScreenContract$ModalStep settingsScreenContract$ModalStep, com.revolut.feature.apm.payid.impl.screen.settings.a aVar) {
        this.f14156a = 1;
        this.f14157b = settingsScreenContract$ModalStep;
        this.f14158c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14156a) {
            case 0:
                cb2.e outputData = (cb2.e) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof e.b;
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar = this.f14158c;
                SettingsScreenContract$ModalStep settingsScreenContract$ModalStep = this.f14157b;
                if (z) {
                    aVar.f62736r.a(null, ((SettingsScreenContract$ModalStep.OpenActions) settingsScreenContract$ModalStep).f62733a.f61879b, false);
                    if (!c70.a.g()) {
                        g1 g1Var = aVar.f62737s;
                        k1 k1Var = (k1) g1Var;
                        k1Var.d(ShotDialogDisplayer$Configuration.Companion.b(ShotDialogDisplayer$Configuration.INSTANCE, "id_payid_copied", new TextLocalisedClause(R$string.pay_id_details_did_copy_to_paste_board, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                    }
                } else if (outputData instanceof e.c) {
                    oki.h.v2(aVar.f62739w, new SettingsScreenContract$ModalStep.DeleteAlias(((SettingsScreenContract$ModalStep.OpenActions) settingsScreenContract$ModalStep).f62733a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (!(outputData instanceof e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 1:
                eb2.e outputData2 = (eb2.e) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (!(outputData2 instanceof e.a)) {
                    if (!(outputData2 instanceof e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Alias alias = ((SettingsScreenContract$ModalStep.AddAlias) this.f14157b).f62730a;
                    AliasType aliasType = alias.f61878a;
                    boolean zF = Intrinsics.f(aliasType, AliasType.EMAIL.f61894b);
                    com.revolut.feature.apm.payid.impl.screen.settings.a aVar2 = this.f14158c;
                    Continuation continuation = null;
                    if (zF || Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
                        aVar2.l2(new z(alias, aVar2, null), new yi5.b(26));
                    } else if (Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
                        aVar2.l2(new z(aVar2, alias, continuation, 1), new yi5.b(26));
                    } else if (!Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) && !Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b) && !Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            default:
                eb2.e outputData3 = (eb2.e) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (!(outputData3 instanceof e.a)) {
                    if (!(outputData3 instanceof e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.feature.apm.payid.impl.screen.settings.a aVar3 = this.f14158c;
                    aVar3.l2(new z(aVar3, ((SettingsScreenContract$ModalStep.DeleteAlias) this.f14157b).f62731a, null, 0), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ x(com.revolut.feature.apm.payid.impl.screen.settings.a aVar, SettingsScreenContract$ModalStep settingsScreenContract$ModalStep, int i) {
        this.f14156a = i;
        this.f14158c = aVar;
        this.f14157b = settingsScreenContract$ModalStep;
    }
}
