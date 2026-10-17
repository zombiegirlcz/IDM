package com.onfido.android.sdk.capture.flow;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "Landroid/os/Parcelable;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions;", "capturedData", "Lcom/onfido/android/sdk/capture/flow/NfcArguments$CapturedNfcData;", "(Lcom/onfido/android/sdk/capture/model/NFCOptions;Lcom/onfido/android/sdk/capture/flow/NfcArguments$CapturedNfcData;)V", "getCapturedData", "()Lcom/onfido/android/sdk/capture/flow/NfcArguments$CapturedNfcData;", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CapturedNfcData", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NfcArguments implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NfcArguments> CREATOR = new Creator();
    private final CapturedNfcData capturedData;

    @NotNull
    private final NFCOptions nfcOptions;

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0014J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/onfido/android/sdk/capture/flow/NfcArguments$CapturedNfcData;", "Landroid/os/Parcelable;", "frontId", "", "nfcProperties", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "nfcSupported", "", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;Z)V", "getFrontId$onfido_capture_sdk_core_release", "()Ljava/lang/String;", "getNfcProperties$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "getNfcSupported$onfido_capture_sdk_core_release", "()Z", "component1", "component1$onfido_capture_sdk_core_release", "component2", "component2$onfido_capture_sdk_core_release", "component3", "component3$onfido_capture_sdk_core_release", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CapturedNfcData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CapturedNfcData> CREATOR = new Creator();

        @NotNull
        private final String frontId;
        private final NfcProperties nfcProperties;
        private final boolean nfcSupported;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CapturedNfcData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CapturedNfcData createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CapturedNfcData(parcel.readString(), parcel.readInt() == 0 ? null : NfcProperties.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CapturedNfcData[] newArray(int i) {
                return new CapturedNfcData[i];
            }
        }

        public CapturedNfcData(@NotNull String frontId, NfcProperties nfcProperties, boolean z) {
            Intrinsics.checkNotNullParameter(frontId, "frontId");
            this.frontId = frontId;
            this.nfcProperties = nfcProperties;
            this.nfcSupported = z;
        }

        public static /* synthetic */ CapturedNfcData copy$default(CapturedNfcData capturedNfcData, String str, NfcProperties nfcProperties, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = capturedNfcData.frontId;
            }
            if ((i & 2) != 0) {
                nfcProperties = capturedNfcData.nfcProperties;
            }
            if ((i & 4) != 0) {
                z = capturedNfcData.nfcSupported;
            }
            return capturedNfcData.copy(str, nfcProperties, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1$onfido_capture_sdk_core_release, reason: from getter */
        public final String getFrontId() {
            return this.frontId;
        }

        /* JADX INFO: renamed from: component2$onfido_capture_sdk_core_release, reason: from getter */
        public final NfcProperties getNfcProperties() {
            return this.nfcProperties;
        }

        /* JADX INFO: renamed from: component3$onfido_capture_sdk_core_release, reason: from getter */
        public final boolean getNfcSupported() {
            return this.nfcSupported;
        }

        @NotNull
        public final CapturedNfcData copy(@NotNull String frontId, NfcProperties nfcProperties, boolean nfcSupported) {
            Intrinsics.checkNotNullParameter(frontId, "frontId");
            return new CapturedNfcData(frontId, nfcProperties, nfcSupported);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CapturedNfcData)) {
                return false;
            }
            CapturedNfcData capturedNfcData = (CapturedNfcData) other;
            return Intrinsics.f(this.frontId, capturedNfcData.frontId) && Intrinsics.f(this.nfcProperties, capturedNfcData.nfcProperties) && this.nfcSupported == capturedNfcData.nfcSupported;
        }

        @NotNull
        public final String getFrontId$onfido_capture_sdk_core_release() {
            return this.frontId;
        }

        public final NfcProperties getNfcProperties$onfido_capture_sdk_core_release() {
            return this.nfcProperties;
        }

        public final boolean getNfcSupported$onfido_capture_sdk_core_release() {
            return this.nfcSupported;
        }

        public int hashCode() {
            int iHashCode = this.frontId.hashCode() * 31;
            NfcProperties nfcProperties = this.nfcProperties;
            return Boolean.hashCode(this.nfcSupported) + ((iHashCode + (nfcProperties == null ? 0 : nfcProperties.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("CapturedNfcData(frontId=");
            sb6.append(this.frontId);
            sb6.append(", nfcProperties=");
            sb6.append(this.nfcProperties);
            sb6.append(", nfcSupported=");
            return a.x(sb6, this.nfcSupported, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.frontId);
            NfcProperties nfcProperties = this.nfcProperties;
            if (nfcProperties == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                nfcProperties.writeToParcel(parcel, flags);
            }
            parcel.writeInt(this.nfcSupported ? 1 : 0);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NfcArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcArguments createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NfcArguments((NFCOptions) parcel.readParcelable(NfcArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : CapturedNfcData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcArguments[] newArray(int i) {
            return new NfcArguments[i];
        }
    }

    public NfcArguments(@NotNull NFCOptions nfcOptions, CapturedNfcData capturedNfcData) {
        Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
        this.nfcOptions = nfcOptions;
        this.capturedData = capturedNfcData;
    }

    public static /* synthetic */ NfcArguments copy$default(NfcArguments nfcArguments, NFCOptions nFCOptions, CapturedNfcData capturedNfcData, int i, Object obj2) {
        if ((i & 1) != 0) {
            nFCOptions = nfcArguments.nfcOptions;
        }
        if ((i & 2) != 0) {
            capturedNfcData = nfcArguments.capturedData;
        }
        return nfcArguments.copy(nFCOptions, capturedNfcData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NFCOptions getNfcOptions() {
        return this.nfcOptions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CapturedNfcData getCapturedData() {
        return this.capturedData;
    }

    @NotNull
    public final NfcArguments copy(@NotNull NFCOptions nfcOptions, CapturedNfcData capturedData) {
        Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
        return new NfcArguments(nfcOptions, capturedData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcArguments)) {
            return false;
        }
        NfcArguments nfcArguments = (NfcArguments) other;
        return Intrinsics.f(this.nfcOptions, nfcArguments.nfcOptions) && Intrinsics.f(this.capturedData, nfcArguments.capturedData);
    }

    public final CapturedNfcData getCapturedData() {
        return this.capturedData;
    }

    @NotNull
    public final NFCOptions getNfcOptions() {
        return this.nfcOptions;
    }

    public int hashCode() {
        int iHashCode = this.nfcOptions.hashCode() * 31;
        CapturedNfcData capturedNfcData = this.capturedData;
        return iHashCode + (capturedNfcData == null ? 0 : capturedNfcData.hashCode());
    }

    @NotNull
    public String toString() {
        return "NfcArguments(nfcOptions=" + this.nfcOptions + ", capturedData=" + this.capturedData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.nfcOptions, flags);
        CapturedNfcData capturedNfcData = this.capturedData;
        if (capturedNfcData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            capturedNfcData.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ NfcArguments(NFCOptions nFCOptions, CapturedNfcData capturedNfcData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nFCOptions, (i & 2) != 0 ? null : capturedNfcData);
    }
}
