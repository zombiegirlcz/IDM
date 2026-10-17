package com.revolut.feature.rev_points.giftcards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tvb.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/model/VoucherProductGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VoucherProductGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VoucherProductGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f83643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83644c;
    public final String d;
    public final RevPoints e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f83645g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VoucherProductGroup(parcel.readString(), e.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (RevPoints) parcel.readParcelable(VoucherProductGroup.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VoucherProductGroup[i];
        }
    }

    public VoucherProductGroup(String id10, e source, String name, String logoImageUrl, RevPoints revPoints, String str, String category) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f83642a = id10;
        this.f83643b = source;
        this.f83644c = name;
        this.d = logoImageUrl;
        this.e = revPoints;
        this.f = str;
        this.f83645g = category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VoucherProductGroup)) {
            return false;
        }
        VoucherProductGroup voucherProductGroup = (VoucherProductGroup) obj2;
        return Intrinsics.f(this.f83642a, voucherProductGroup.f83642a) && this.f83643b == voucherProductGroup.f83643b && Intrinsics.f(this.f83644c, voucherProductGroup.f83644c) && Intrinsics.f(this.d, voucherProductGroup.d) && Intrinsics.f(this.e, voucherProductGroup.e) && Intrinsics.f(this.f, voucherProductGroup.f) && Intrinsics.f(this.f83645g, voucherProductGroup.f83645g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f83643b.hashCode() + (this.f83642a.hashCode() * 31)) * 31, 31, this.f83644c), 31, this.d);
        RevPoints revPoints = this.e;
        int iHashCode = (iC + (revPoints == null ? 0 : revPoints.f83960a.hashCode())) * 31;
        String str = this.f;
        return this.f83645g.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83642a);
        dest.writeString(this.f83643b.name());
        dest.writeString(this.f83644c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f83645g);
    }
}
