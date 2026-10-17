package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.utils.CountryCode;
import j6.a;
import kl.g;
import kl.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/NfcFlowScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/g", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NfcFlowScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f50192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountryCode f50193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NfcProperties f50194c;
    public final NFCOptions.Enabled d;
    public final boolean e;
    public final boolean f;

    @NotNull
    public static final g Companion = new g();

    @NotNull
    public static final Parcelable.Creator<NfcFlowScreen> CREATOR = new h();

    public NfcFlowScreen(DocumentType documentType, CountryCode countryCode, NfcProperties nfcProperties, NFCOptions.Enabled nfcOptions, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
        Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
        this.f50192a = documentType;
        this.f50193b = countryCode;
        this.f50194c = nfcProperties;
        this.d = nfcOptions;
        this.e = z;
        this.f = z3;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return NfcHostFragment.INSTANCE.newInstance("request_key_nfc_flow", this.f50192a, this.f50193b, this.f50194c, this.d, this.e, this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NfcFlowScreen)) {
            return false;
        }
        NfcFlowScreen nfcFlowScreen = (NfcFlowScreen) obj2;
        return this.f50192a == nfcFlowScreen.f50192a && this.f50193b == nfcFlowScreen.f50193b && Intrinsics.f(this.f50194c, nfcFlowScreen.f50194c) && Intrinsics.f(this.d, nfcFlowScreen.d) && this.e == nfcFlowScreen.e && this.f == nfcFlowScreen.f;
    }

    public final int hashCode() {
        int iHashCode = this.f50192a.hashCode() * 31;
        CountryCode countryCode = this.f50193b;
        return Boolean.hashCode(this.f) + a.c((this.d.hashCode() + ((this.f50194c.hashCode() + ((iHashCode + (countryCode == null ? 0 : countryCode.hashCode())) * 31)) * 31)) * 31, 31, this.e);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    public final String toString() {
        return "NfcFlowScreen(documentType=" + this.f50192a + ", countryCode=" + this.f50193b + ", nfcProperties=" + this.f50194c + ", nfcOptions=" + this.d + ", isOnlyOneDocAvailable=" + this.e + ", isInWorkflow=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f50192a.name());
        CountryCode countryCode = this.f50193b;
        if (countryCode == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(countryCode.name());
        }
        out.writeParcelable(this.f50194c, i);
        out.writeParcelable(this.d, i);
        out.writeInt(this.e ? 1 : 0);
        out.writeInt(this.f ? 1 : 0);
    }
}
