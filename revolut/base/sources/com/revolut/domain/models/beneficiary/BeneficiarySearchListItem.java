package com.revolut.domain.models.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BeneficiarySearchListItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiarySearchListItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BeneficiarySearchListItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60295c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BeneficiarySearchListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BeneficiarySearchListItem[i];
        }
    }

    public BeneficiarySearchListItem(String id10, String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f60293a = id10;
        this.f60294b = title;
        this.f60295c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BeneficiarySearchListItem)) {
            return false;
        }
        BeneficiarySearchListItem beneficiarySearchListItem = (BeneficiarySearchListItem) obj2;
        return Intrinsics.f(this.f60293a, beneficiarySearchListItem.f60293a) && Intrinsics.f(this.f60294b, beneficiarySearchListItem.f60294b) && Intrinsics.f(this.f60295c, beneficiarySearchListItem.f60295c) && Intrinsics.f(this.d, beneficiarySearchListItem.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f60293a.hashCode() * 31, 31, this.f60294b);
        String str = this.f60295c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60293a);
        dest.writeString(this.f60294b);
        dest.writeString(this.f60295c);
        dest.writeString(this.d);
    }
}
