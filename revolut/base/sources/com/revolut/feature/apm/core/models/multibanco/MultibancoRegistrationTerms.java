package com.revolut.feature.apm.core.models.multibanco;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "q0", "termsId", "b", "termsUrl", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoRegistrationTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MultibancoRegistrationTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("termsId")
    @NotNull
    private final String termsId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("termsUrl")
    @NotNull
    private final String termsUrl;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoRegistrationTerms(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoRegistrationTerms[i];
        }
    }

    public MultibancoRegistrationTerms(String termsId, String termsUrl) {
        Intrinsics.checkNotNullParameter(termsId, "termsId");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.termsId = termsId;
        this.termsUrl = termsUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultibancoRegistrationTerms)) {
            return false;
        }
        MultibancoRegistrationTerms multibancoRegistrationTerms = (MultibancoRegistrationTerms) obj2;
        return Intrinsics.f(this.termsId, multibancoRegistrationTerms.termsId) && Intrinsics.f(this.termsUrl, multibancoRegistrationTerms.termsUrl);
    }

    public final int hashCode() {
        return this.termsUrl.hashCode() + (this.termsId.hashCode() * 31);
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final String getTermsId() {
        return this.termsId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.termsId);
        dest.writeString(this.termsUrl);
    }
}
