package o3j;

import cli.g;
import cli.y;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends h implements dli.b {
    public final y o;

    public d(e stateMapper, DefinitionSelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new a(inputData.f99695a, inputData.f99696b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
