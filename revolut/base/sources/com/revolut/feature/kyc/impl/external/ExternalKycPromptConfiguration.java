package com.revolut.feature.kyc.impl.external;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/external/ExternalKycPromptConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalKycPromptConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExternalKycPromptConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f77646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f77647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77648c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExternalKycPromptConfiguration((Clause) parcel.readParcelable(ExternalKycPromptConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(ExternalKycPromptConfiguration.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalKycPromptConfiguration[i];
        }
    }

    public ExternalKycPromptConfiguration(Clause title, Clause subtitle, String imageId, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        this.f77646a = title;
        this.f77647b = subtitle;
        this.f77648c = imageId;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalKycPromptConfiguration)) {
            return false;
        }
        ExternalKycPromptConfiguration externalKycPromptConfiguration = (ExternalKycPromptConfiguration) obj2;
        return Intrinsics.f(this.f77646a, externalKycPromptConfiguration.f77646a) && Intrinsics.f(this.f77647b, externalKycPromptConfiguration.f77647b) && Intrinsics.f(this.f77648c, externalKycPromptConfiguration.f77648c) && this.d == externalKycPromptConfiguration.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.a(this.f77646a.hashCode() * 31, 31, this.f77647b), 31, this.f77648c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77646a, i);
        dest.writeParcelable(this.f77647b, i);
        dest.writeString(this.f77648c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
