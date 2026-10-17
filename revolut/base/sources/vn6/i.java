package vn6;

import cli.n;
import cli.y;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements g {
    public final IbanScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f290765p;

    public i(IbanScreenContract$InputData inputData, n stateMapper) {
        String str;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        String str2 = inputData.e;
        BankFieldDefinition bankFieldDefinition = inputData.d;
        if (str2 == null) {
            str = bankFieldDefinition.e;
            if (str == null) {
                str = "";
            }
        } else {
            str = str2;
        }
        if (str2 == null && (str2 = bankFieldDefinition.e) == null) {
            str2 = "";
        }
        this.f290765p = mra.d.b(this, new d(str, str2), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f290765p;
    }
}
