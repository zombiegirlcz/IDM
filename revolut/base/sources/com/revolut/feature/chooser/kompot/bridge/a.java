package com.revolut.feature.chooser.kompot.bridge;

import afa.q;
import aj3.b;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.chooser.kompot.bridge.ChooserScreenKompotBridgeContract$Step;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ChooserScreenKompotBridgeContract$Step.Picker f65928t;
    public final ChooserScreenKompotBridgeContract$State u;

    public a(ChooserScreenKompotBridgeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f65928t = new ChooserScreenKompotBridgeContract$Step.Picker(inputData);
        this.u = ChooserScreenKompotBridgeContract$State.f65926a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        Object next;
        ChooserScreenKompotBridgeContract$Step step = (ChooserScreenKompotBridgeContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof ChooserScreenKompotBridgeContract$Step.Picker)) {
            throw new NoWhenBranchMatchedException();
        }
        ChooserConfiguration chooserConfiguration = ((ChooserScreenKompotBridgeContract$Step.Picker) step).f65927a.f65925a;
        String str = chooserConfiguration.e;
        if (str == null) {
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = chooserConfiguration.f65893g;
        TextClause textClause2 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Iterator it8 = chooserConfiguration.f65890a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ChooserScreenContract$Model) next).f65908j) {
                break;
            }
        }
        ChooserScreenContract$Model chooserScreenContract$Model = (ChooserScreenContract$Model) next;
        PickerScreen pickerScreen = new PickerScreen(new PickerScreenContract$InputData(null, textClause, null, null, false, textClause2, null, null, chooserScreenContract$Model != null ? chooserScreenContract$Model.f65903a : null, null, null, chooserConfiguration.i, null, chooserConfiguration.f65897m, null, 123666169));
        q qVar = new q(this, 10);
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        pickerScreen.H = qVar;
        return pickerScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f65928t;
    }
}
