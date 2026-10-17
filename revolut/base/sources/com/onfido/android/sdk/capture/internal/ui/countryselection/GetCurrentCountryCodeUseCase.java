package com.onfido.android.sdk.capture.internal.ui.countryselection;

import android.telephony.TelephonyManager;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/GetCurrentCountryCodeUseCase;", "", "telephonyManager", "Landroid/telephony/TelephonyManager;", "(Landroid/telephony/TelephonyManager;)V", "build", "Lio/reactivex/rxjava3/core/Single;", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class GetCurrentCountryCodeUseCase {

    @NotNull
    private final TelephonyManager telephonyManager;

    public GetCurrentCountryCodeUseCase(@NotNull TelephonyManager telephonyManager) {
        Intrinsics.checkNotNullParameter(telephonyManager, "telephonyManager");
        this.telephonyManager = telephonyManager;
    }

    @NotNull
    public Single<String> build() {
        b bVarF = Single.f(this.telephonyManager.getSimCountryIso());
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }
}
