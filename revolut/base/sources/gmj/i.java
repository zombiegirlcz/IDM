package gmj;

import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData;
import dfj.i1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends oki.h implements dli.b {
    public final EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i1 f144871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nkj.d f144872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f144873r;

    public i(n stateMapper, EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData inputData, i1 esimPhoneNumberInteractor, nkj.d shotDialogBuilder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimPhoneNumberInteractor, "esimPhoneNumberInteractor");
        Intrinsics.checkNotNullParameter(shotDialogBuilder, "shotDialogBuilder");
        this.o = inputData;
        this.f144871p = esimPhoneNumberInteractor;
        this.f144872q = shotDialogBuilder;
        this.f144873r = mra.d.b(this, new e(inputData.f101391b.f), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f144873r;
    }
}
