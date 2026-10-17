package kl;

import android.os.Parcel;
import android.os.Parcelable;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.workflow.internal.ui.NfcFlowScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        DocumentType documentTypeValueOf = DocumentType.valueOf(parcel.readString());
        CountryCode countryCodeValueOf = parcel.readInt() == 0 ? null : CountryCode.valueOf(parcel.readString());
        NfcProperties nfcProperties = (NfcProperties) parcel.readParcelable(NfcFlowScreen.class.getClassLoader());
        NFCOptions.Enabled enabled = (NFCOptions.Enabled) parcel.readParcelable(NfcFlowScreen.class.getClassLoader());
        boolean z3 = false;
        if (parcel.readInt() != 0) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        return new NfcFlowScreen(documentTypeValueOf, countryCodeValueOf, nfcProperties, enabled, z3, parcel.readInt() == 0 ? z : true);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NfcFlowScreen[i];
    }
}
