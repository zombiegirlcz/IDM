package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.ui.nfc.NfcDeviceNotSupportedFragment;
import kl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/onfido/workflow/internal/ui/NfcNotSupportedScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcNotSupportedScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NfcNotSupportedScreen f50195a = new NfcNotSupportedScreen();

    @NotNull
    public static final Parcelable.Creator<NfcNotSupportedScreen> CREATOR = new b(6);

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return NfcDeviceNotSupportedFragment.INSTANCE.createInstance("request_key_nfc_not_supported");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(1);
    }
}
