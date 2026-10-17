package com.onfido.android.sdk.capture;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB9\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "Landroid/os/Parcelable;", "hideOnfidoLogo", "", "cobrandingText", "", "cobrandingLogoLightMode", "", "cobrandingLogoDarkMode", "disableMobileSdkAnalytics", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getCobrandingLogoDarkMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCobrandingLogoLightMode", "getCobrandingText", "()Ljava/lang/String;", "getDisableMobileSdkAnalytics", "()Z", "getHideOnfidoLogo", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EnterpriseFeatures implements Parcelable {
    private final Integer cobrandingLogoDarkMode;
    private final Integer cobrandingLogoLightMode;
    private final String cobrandingText;
    private final boolean disableMobileSdkAnalytics;
    private final boolean hideOnfidoLogo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<EnterpriseFeatures> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\t\u001a\u00020\u0000J\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/EnterpriseFeatures$Builder;", "", "()V", "cobrandingLogoDarkMode", "", "Ljava/lang/Integer;", "cobrandingLogoLightMode", "cobrandingText", "", "disableMobileSdkAnalytics", "", "hideOnfidoLogo", "build", "Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "withCobrandingLogo", "withCobrandingText", "withHideOnfidoLogo", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private Integer cobrandingLogoDarkMode;
        private Integer cobrandingLogoLightMode;
        private String cobrandingText;
        private boolean disableMobileSdkAnalytics;
        private boolean hideOnfidoLogo;

        @NotNull
        public final EnterpriseFeatures build() {
            return new EnterpriseFeatures(this.hideOnfidoLogo, this.cobrandingText, this.cobrandingLogoLightMode, this.cobrandingLogoDarkMode, this.disableMobileSdkAnalytics, null);
        }

        @NotNull
        public final Builder disableMobileSdkAnalytics() {
            this.disableMobileSdkAnalytics = true;
            return this;
        }

        @NotNull
        public final Builder withCobrandingLogo(int cobrandingLogoLightMode, int cobrandingLogoDarkMode) {
            this.cobrandingLogoLightMode = Integer.valueOf(cobrandingLogoLightMode);
            this.cobrandingLogoDarkMode = Integer.valueOf(cobrandingLogoDarkMode);
            return this;
        }

        @NotNull
        public final Builder withCobrandingText(@NotNull String cobrandingText) {
            Intrinsics.checkNotNullParameter(cobrandingText, "cobrandingText");
            this.cobrandingText = cobrandingText;
            return this;
        }

        @NotNull
        public final Builder withHideOnfidoLogo(boolean hideOnfidoLogo) {
            this.hideOnfidoLogo = hideOnfidoLogo;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/EnterpriseFeatures$Companion;", "", "()V", "builder", "Lcom/onfido/android/sdk/capture/EnterpriseFeatures$Builder;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EnterpriseFeatures> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final EnterpriseFeatures createFromParcel(@NotNull Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new EnterpriseFeatures(z4, string, numValueOf, numValueOf2, z, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final EnterpriseFeatures[] newArray(int i) {
            return new EnterpriseFeatures[i];
        }
    }

    public /* synthetic */ EnterpriseFeatures(boolean z, String str, Integer num, Integer num2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, num, num2, z3);
    }

    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer getCobrandingLogoDarkMode() {
        return this.cobrandingLogoDarkMode;
    }

    public final Integer getCobrandingLogoLightMode() {
        return this.cobrandingLogoLightMode;
    }

    public final String getCobrandingText() {
        return this.cobrandingText;
    }

    public final boolean getDisableMobileSdkAnalytics() {
        return this.disableMobileSdkAnalytics;
    }

    public final boolean getHideOnfidoLogo() {
        return this.hideOnfidoLogo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.hideOnfidoLogo ? 1 : 0);
        parcel.writeString(this.cobrandingText);
        Integer num = this.cobrandingLogoLightMode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, num);
        }
        Integer num2 = this.cobrandingLogoDarkMode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, num2);
        }
        parcel.writeInt(this.disableMobileSdkAnalytics ? 1 : 0);
    }

    private EnterpriseFeatures(boolean z, String str, Integer num, Integer num2, boolean z3) {
        this.hideOnfidoLogo = z;
        this.cobrandingText = str;
        this.cobrandingLogoLightMode = num;
        this.cobrandingLogoDarkMode = num2;
        this.disableMobileSdkAnalytics = z3;
    }
}
