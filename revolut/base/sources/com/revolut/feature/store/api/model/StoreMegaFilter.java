package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaFilter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "StoreMegaFilterValue", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreMegaFilter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreMegaFilter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f88539c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaFilter$StoreMegaFilterValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoreMegaFilterValue implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StoreMegaFilterValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x f88542c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoreMegaFilterValue(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : x.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoreMegaFilterValue[i];
            }
        }

        public StoreMegaFilterValue(String id10, String name, x xVar) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f88540a = id10;
            this.f88541b = name;
            this.f88542c = xVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StoreMegaFilterValue)) {
                return false;
            }
            StoreMegaFilterValue storeMegaFilterValue = (StoreMegaFilterValue) obj2;
            return Intrinsics.f(this.f88540a, storeMegaFilterValue.f88540a) && Intrinsics.f(this.f88541b, storeMegaFilterValue.f88541b) && this.f88542c == storeMegaFilterValue.f88542c;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f88540a.hashCode() * 31, 31, this.f88541b);
            x xVar = this.f88542c;
            return iC + (xVar == null ? 0 : xVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88540a);
            dest.writeString(this.f88541b);
            x xVar = this.f88542c;
            if (xVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(xVar.name());
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreMegaFilterValue.CREATOR, parcel, arrayList, iA, 1);
            }
            return new StoreMegaFilter(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreMegaFilter[i];
        }
    }

    public StoreMegaFilter(String id10, String name, ArrayList values) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f88537a = id10;
        this.f88538b = name;
        this.f88539c = values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreMegaFilter)) {
            return false;
        }
        StoreMegaFilter storeMegaFilter = (StoreMegaFilter) obj2;
        return Intrinsics.f(this.f88537a, storeMegaFilter.f88537a) && Intrinsics.f(this.f88538b, storeMegaFilter.f88538b) && this.f88539c.equals(storeMegaFilter.f88539c);
    }

    public final int hashCode() {
        return this.f88539c.hashCode() + p.a.c(this.f88537a.hashCode() * 31, 31, this.f88538b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88537a);
        dest.writeString(this.f88538b);
        Iterator itY = j6.a.y(this.f88539c, dest);
        while (itY.hasNext()) {
            ((StoreMegaFilterValue) itY.next()).writeToParcel(dest, i);
        }
    }
}
