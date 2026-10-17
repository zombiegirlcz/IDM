package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/DayPickerItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DayPickerItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<DayPickerItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f63389c;
    public final LocalDate d;
    public final LocalDate e;
    public final LocalDate f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DayPickerItem(parcel.readString(), parcel.readInt() != 0, (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DayPickerItem[i];
        }
    }

    public DayPickerItem(String id10, boolean z, LocalDate presentedMonth, LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        this.f63387a = id10;
        this.f63388b = z;
        this.f63389c = presentedMonth;
        this.d = localDate;
        this.e = localDate2;
        this.f = localDate3;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63726a() {
        return this.f63387a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63727b() {
        return this.f63388b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DayPickerItem)) {
            return false;
        }
        DayPickerItem dayPickerItem = (DayPickerItem) obj2;
        return Intrinsics.f(this.f63387a, dayPickerItem.f63387a) && this.f63388b == dayPickerItem.f63388b && Intrinsics.f(this.f63389c, dayPickerItem.f63389c) && Intrinsics.f(this.d, dayPickerItem.d) && Intrinsics.f(this.e, dayPickerItem.e) && Intrinsics.f(this.f, dayPickerItem.f);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63387a;
    }

    public final int hashCode() {
        int iA = y.a(j6.a.c(this.f63387a.hashCode() * 31, 31, this.f63388b), 31, this.f63389c);
        LocalDate localDate = this.d;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.e;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f;
        return iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63387a);
        dest.writeInt(this.f63388b ? 1 : 0);
        dest.writeSerializable(this.f63389c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
    }
}
