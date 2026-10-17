package com.revolut.feature.vaults.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultTermsViewerDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "BottomButton", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VaultTermsViewerDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<VaultTermsViewerDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94700c;
    public final BottomButton d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultTermsViewerDestination$BottomButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BottomButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f94701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f94702b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomButton((Clause) parcel.readParcelable(BottomButton.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomButton[i];
            }
        }

        public BottomButton(Clause text, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f94701a = text;
            this.f94702b = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF94702b() {
            return this.f94702b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BottomButton)) {
                return false;
            }
            BottomButton bottomButton = (BottomButton) obj2;
            return Intrinsics.f(this.f94701a, bottomButton.f94701a) && this.f94702b == bottomButton.f94702b;
        }

        /* JADX INFO: renamed from: getText, reason: from getter */
        public final Clause getF94701a() {
            return this.f94701a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f94702b) + (this.f94701a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94701a, i);
            dest.writeInt(this.f94702b ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VaultTermsViewerDestination(parcel.readString(), (Clause) parcel.readParcelable(VaultTermsViewerDestination.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BottomButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VaultTermsViewerDestination[i];
        }
    }

    public VaultTermsViewerDestination(String termsUrl, Clause title, boolean z, BottomButton bottomButton) {
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f94698a = termsUrl;
        this.f94699b = title;
        this.f94700c = z;
        this.d = bottomButton;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Clause getF94699b() {
        return this.f94699b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF94700c() {
        return this.f94700c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BottomButton getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF94698a() {
        return this.f94698a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VaultTermsViewerDestination)) {
            return false;
        }
        VaultTermsViewerDestination vaultTermsViewerDestination = (VaultTermsViewerDestination) obj2;
        return Intrinsics.f(this.f94698a, vaultTermsViewerDestination.f94698a) && Intrinsics.f(this.f94699b, vaultTermsViewerDestination.f94699b) && this.f94700c == vaultTermsViewerDestination.f94700c && Intrinsics.f(this.d, vaultTermsViewerDestination.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.a(this.f94698a.hashCode() * 31, 31, this.f94699b), 31, this.f94700c);
        BottomButton bottomButton = this.d;
        return iC + (bottomButton == null ? 0 : bottomButton.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94698a);
        dest.writeParcelable(this.f94699b, i);
        dest.writeInt(this.f94700c ? 1 : 0);
        BottomButton bottomButton = this.d;
        if (bottomButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bottomButton.writeToParcel(dest, i);
        }
    }
}
