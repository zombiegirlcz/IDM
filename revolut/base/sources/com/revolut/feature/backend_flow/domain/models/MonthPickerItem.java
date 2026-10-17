package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MonthPickerItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MonthPickerItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<MonthPickerItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63540c;
    public final LocalDate d;
    public final LocalDate e;
    public final LocalDate f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MonthPickerItem(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MonthPickerItem[i];
        }
    }

    public MonthPickerItem(String id10, boolean z, int i, LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f63538a = id10;
        this.f63539b = z;
        this.f63540c = i;
        this.d = localDate;
        this.e = localDate2;
        this.f = localDate3;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63538a() {
        return this.f63538a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63539b() {
        return this.f63539b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MonthPickerItem)) {
            return false;
        }
        MonthPickerItem monthPickerItem = (MonthPickerItem) obj2;
        return Intrinsics.f(this.f63538a, monthPickerItem.f63538a) && this.f63539b == monthPickerItem.f63539b && this.f63540c == monthPickerItem.f63540c && Intrinsics.f(this.d, monthPickerItem.d) && Intrinsics.f(this.e, monthPickerItem.e) && Intrinsics.f(this.f, monthPickerItem.f);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63538a;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f63540c, j6.a.c(this.f63538a.hashCode() * 31, 31, this.f63539b), 31);
        LocalDate localDate = this.d;
        int iHashCode = (iB + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.e;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f;
        return iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63538a);
        dest.writeInt(this.f63539b ? 1 : 0);
        dest.writeInt(this.f63540c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
    }
}
