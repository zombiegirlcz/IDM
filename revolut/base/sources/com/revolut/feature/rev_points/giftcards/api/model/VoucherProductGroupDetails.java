package com.revolut.feature.rev_points.giftcards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tvb.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/model/VoucherProductGroupDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VoucherProductGroupDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VoucherProductGroupDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f83647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83648c;
    public final String d;
    public final String e;
    public final VoucherProductTermsAndConditions f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f83649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f83650h;
    public final ArrayList i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            e eVarValueOf = e.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            VoucherProductTermsAndConditions voucherProductTermsAndConditionsCreateFromParcel = VoucherProductTermsAndConditions.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(VoucherProduct.CREATOR, parcel, arrayList, iA, 1);
            }
            return new VoucherProductGroupDetails(string, eVarValueOf, string2, string3, string4, voucherProductTermsAndConditionsCreateFromParcel, string5, string6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VoucherProductGroupDetails[i];
        }
    }

    public VoucherProductGroupDetails(String id10, e source, String name, String cardImageUrl, String str, VoucherProductTermsAndConditions termsAndConditions, String description, String instructions, ArrayList voucherProducts) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cardImageUrl, "cardImageUrl");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(voucherProducts, "voucherProducts");
        this.f83646a = id10;
        this.f83647b = source;
        this.f83648c = name;
        this.d = cardImageUrl;
        this.e = str;
        this.f = termsAndConditions;
        this.f83649g = description;
        this.f83650h = instructions;
        this.i = voucherProducts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VoucherProductGroupDetails)) {
            return false;
        }
        VoucherProductGroupDetails voucherProductGroupDetails = (VoucherProductGroupDetails) obj2;
        return Intrinsics.f(this.f83646a, voucherProductGroupDetails.f83646a) && this.f83647b == voucherProductGroupDetails.f83647b && Intrinsics.f(this.f83648c, voucherProductGroupDetails.f83648c) && Intrinsics.f(this.d, voucherProductGroupDetails.d) && Intrinsics.f(this.e, voucherProductGroupDetails.e) && Intrinsics.f(this.f, voucherProductGroupDetails.f) && Intrinsics.f(this.f83649g, voucherProductGroupDetails.f83649g) && Intrinsics.f(this.f83650h, voucherProductGroupDetails.f83650h) && this.i.equals(voucherProductGroupDetails.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f83647b.hashCode() + (this.f83646a.hashCode() * 31)) * 31, 31, this.f83648c), 31, this.d);
        String str = this.e;
        return this.i.hashCode() + p.a.c(p.a.c((this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f83649g), 31, this.f83650h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83646a);
        dest.writeString(this.f83647b.name());
        dest.writeString(this.f83648c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f83649g);
        dest.writeString(this.f83650h);
        Iterator itY = j6.a.y(this.i, dest);
        while (itY.hasNext()) {
            ((VoucherProduct) itY.next()).writeToParcel(dest, i);
        }
    }
}
