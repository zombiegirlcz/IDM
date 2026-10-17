package com.revolut.feature.vaults.impl.ui.details.terms_viewer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/vaults/impl/ui/details/terms_viewer/VaultTermsViewerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "BottomButton", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VaultTermsViewerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<VaultTermsViewerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94754c;
    public final BottomButton d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/details/terms_viewer/VaultTermsViewerScreenContract$InputData$BottomButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BottomButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f94755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f94756b;

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
            this.f94755a = text;
            this.f94756b = z;
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
            return Intrinsics.f(this.f94755a, bottomButton.f94755a) && this.f94756b == bottomButton.f94756b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f94756b) + (this.f94755a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94755a, i);
            dest.writeInt(this.f94756b ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VaultTermsViewerScreenContract$InputData(parcel.readString(), (Clause) parcel.readParcelable(VaultTermsViewerScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BottomButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VaultTermsViewerScreenContract$InputData[i];
        }
    }

    public VaultTermsViewerScreenContract$InputData(String termsUrl, Clause title, boolean z, BottomButton bottomButton) {
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f94752a = termsUrl;
        this.f94753b = title;
        this.f94754c = z;
        this.d = bottomButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VaultTermsViewerScreenContract$InputData)) {
            return false;
        }
        VaultTermsViewerScreenContract$InputData vaultTermsViewerScreenContract$InputData = (VaultTermsViewerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94752a, vaultTermsViewerScreenContract$InputData.f94752a) && Intrinsics.f(this.f94753b, vaultTermsViewerScreenContract$InputData.f94753b) && this.f94754c == vaultTermsViewerScreenContract$InputData.f94754c && Intrinsics.f(this.d, vaultTermsViewerScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.a(this.f94752a.hashCode() * 31, 31, this.f94753b), 31, this.f94754c);
        BottomButton bottomButton = this.d;
        return iC + (bottomButton == null ? 0 : bottomButton.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94752a);
        dest.writeParcelable(this.f94753b, i);
        dest.writeInt(this.f94754c ? 1 : 0);
        BottomButton bottomButton = this.d;
        if (bottomButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bottomButton.writeToParcel(dest, i);
        }
    }
}
