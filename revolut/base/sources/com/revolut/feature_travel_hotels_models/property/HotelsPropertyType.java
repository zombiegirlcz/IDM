package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufi.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyType;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyType implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyType> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f98053c;
    public final Integer d;
    public final String e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            g gVarValueOf = g.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(egi.a.valueOf(parcel.readString()));
            }
            return new HotelsPropertyType(string, string2, gVarValueOf, numValueOf, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyType[i];
        }
    }

    public HotelsPropertyType(String id10, String str, g type, Integer num, String str2, List categories) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f98051a = id10;
        this.f98052b = str;
        this.f98053c = type;
        this.d = num;
        this.e = str2;
        this.f = categories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyType)) {
            return false;
        }
        HotelsPropertyType hotelsPropertyType = (HotelsPropertyType) obj2;
        return Intrinsics.f(this.f98051a, hotelsPropertyType.f98051a) && Intrinsics.f(this.f98052b, hotelsPropertyType.f98052b) && this.f98053c == hotelsPropertyType.f98053c && Intrinsics.f(this.d, hotelsPropertyType.d) && Intrinsics.f(this.e, hotelsPropertyType.e) && Intrinsics.f(this.f, hotelsPropertyType.f);
    }

    public final int hashCode() {
        int iHashCode = this.f98051a.hashCode() * 31;
        String str = this.f98052b;
        int iHashCode2 = (this.f98053c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98051a);
        dest.writeString(this.f98052b);
        dest.writeString(this.f98053c.name());
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.e);
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            dest.writeString(((egi.a) itV.next()).name());
        }
    }
}
