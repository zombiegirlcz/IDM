package i8e;

import cli.y;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends oki.h implements b {
    public final SubAccountEditNameContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ppg.b f159523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f159524q;

    public k(e mapper, SubAccountEditNameContract$InputData inputData, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.o = inputData;
        this.f159523p = vaultsInteractor;
        this.f159524q = mra.d.b(this, new c(inputData.f89084b, true), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f159524q;
    }
}
