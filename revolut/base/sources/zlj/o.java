package zlj;

import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends oki.h implements m {
    public final EsimMobilePlanPhoneNumberActionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f323298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f323299q;

    public o(cli.n stateMapper, EsimMobilePlanPhoneNumberActionScreenContract$InputData inputData, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.o = inputData;
        this.f323298p = clipboard;
        this.f323299q = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f323299q;
    }
}
