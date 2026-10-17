package com.revolut.feature.profile.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/InsuranceDocumentItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceDocumentItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InsuranceDocumentItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f81309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81311c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceDocumentItem((Clause) parcel.readParcelable(InsuranceDocumentItem.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceDocumentItem[i];
        }
    }

    public InsuranceDocumentItem(Clause title, String str, String product) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f81309a = title;
        this.f81310b = str;
        this.f81311c = product;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceDocumentItem)) {
            return false;
        }
        InsuranceDocumentItem insuranceDocumentItem = (InsuranceDocumentItem) obj2;
        return Intrinsics.f(this.f81309a, insuranceDocumentItem.f81309a) && Intrinsics.f(this.f81310b, insuranceDocumentItem.f81310b) && Intrinsics.f(this.f81311c, insuranceDocumentItem.f81311c);
    }

    public final int hashCode() {
        int iHashCode = this.f81309a.hashCode() * 31;
        String str = this.f81310b;
        return this.f81311c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81309a, i);
        dest.writeString(this.f81310b);
        dest.writeString(this.f81311c);
    }
}
