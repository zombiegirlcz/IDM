package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/DateInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DateInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<DateInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63382c;
    public final LocalDate d;
    public final Filter e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            LocalDate localDate;
            Filter filter;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string2 = parcel.readString();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            Filter filter2 = (Filter) parcel.readParcelable(DateInputItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = z3;
                localDate = localDate2;
                filter = filter2;
            } else {
                localDate = localDate2;
                filter = filter2;
                z4 = z;
            }
            return new DateInputItem(string, z6, string2, localDate, filter, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DateInputItem[i];
        }
    }

    public DateInputItem(String id10, boolean z, String str, LocalDate localDate, Filter filter, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f63380a = id10;
        this.f63381b = z;
        this.f63382c = str;
        this.d = localDate;
        this.e = filter;
        this.f = z3;
    }

    public static DateInputItem d(DateInputItem dateInputItem, LocalDate localDate, boolean z, int i) {
        String id10 = dateInputItem.f63380a;
        boolean z3 = dateInputItem.f63381b;
        String str = dateInputItem.f63382c;
        if ((i & 8) != 0) {
            localDate = dateInputItem.d;
        }
        LocalDate localDate2 = localDate;
        Filter filter = dateInputItem.e;
        if ((i & 32) != 0) {
            z = dateInputItem.f;
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        return new DateInputItem(id10, z3, str, localDate2, filter, z);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63380a() {
        return this.f63380a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63381b() {
        return this.f63381b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DateInputItem)) {
            return false;
        }
        DateInputItem dateInputItem = (DateInputItem) obj2;
        return Intrinsics.f(this.f63380a, dateInputItem.f63380a) && this.f63381b == dateInputItem.f63381b && Intrinsics.f(this.f63382c, dateInputItem.f63382c) && Intrinsics.f(this.d, dateInputItem.d) && Intrinsics.f(this.e, dateInputItem.e) && this.f == dateInputItem.f;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63380a;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63380a.hashCode() * 31, 31, this.f63381b);
        String str = this.f63382c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Filter filter = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (filter != null ? filter.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63380a);
        dest.writeInt(this.f63381b ? 1 : 0);
        dest.writeString(this.f63382c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }
}
