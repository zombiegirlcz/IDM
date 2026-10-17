package ho2;

import cli.n;
import cli.y;
import com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input.PhoneNumberInputScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements g {
    public final phm.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z80.b f154215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f154216q;

    public j(n stateMapper, PhoneNumberInputScreenContract$InputData inputData, phm.a countryPickerControllerInteractorProvider, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryPickerControllerInteractorProvider, "countryPickerControllerInteractorProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.o = countryPickerControllerInteractorProvider;
        this.f154215p = phoneToolsProvider;
        wi0.b bVar = inputData.f63946a;
        this.f154216q = mra.d.b(this, new e(phoneToolsProvider.j(bVar), inputData.f63948c, bVar), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f154216q;
    }
}
