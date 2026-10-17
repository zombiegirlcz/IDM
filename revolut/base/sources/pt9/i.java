package pt9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends bji.b implements jki.h {

    @NotNull
    public static final h Companion = new h();
    public final os2.g u;
    public final a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(os2.g interactor, GroupSettingsNameContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.u = interactor;
        PaymentGroup paymentGroup = inputData.f79488a;
        this.v = new a(paymentGroup, paymentGroup.f79286b);
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.v;
    }
}
