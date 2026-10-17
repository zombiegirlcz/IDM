package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/StarRatingInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StarRatingInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<StarRatingInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63657c;
    public final String d;
    public final Long e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StarRatingInputItem(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StarRatingInputItem[i];
        }
    }

    public StarRatingInputItem(String id10, boolean z, String str, String str2, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f63655a = id10;
        this.f63656b = z;
        this.f63657c = str;
        this.d = str2;
        this.e = l2;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63655a() {
        return this.f63655a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63656b() {
        return this.f63656b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StarRatingInputItem)) {
            return false;
        }
        StarRatingInputItem starRatingInputItem = (StarRatingInputItem) obj2;
        return Intrinsics.f(this.f63655a, starRatingInputItem.f63655a) && this.f63656b == starRatingInputItem.f63656b && Intrinsics.f(this.f63657c, starRatingInputItem.f63657c) && Intrinsics.f(this.d, starRatingInputItem.d) && Intrinsics.f(this.e, starRatingInputItem.e);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63655a;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63655a.hashCode() * 31, 31, this.f63656b);
        String str = this.f63657c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.e;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63655a);
        dest.writeInt(this.f63656b ? 1 : 0);
        dest.writeString(this.f63657c);
        dest.writeString(this.d);
        Long l2 = this.e;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
    }
}
