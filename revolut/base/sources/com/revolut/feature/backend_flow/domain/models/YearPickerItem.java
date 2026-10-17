package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/YearPickerItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class YearPickerItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<YearPickerItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63725c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new YearPickerItem(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new YearPickerItem[i];
        }
    }

    public YearPickerItem(String id10, boolean z, int i, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f63723a = id10;
        this.f63724b = z;
        this.f63725c = i;
        this.d = num;
        this.e = num2;
        this.f = num3;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63723a() {
        return this.f63723a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63724b() {
        return this.f63724b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof YearPickerItem)) {
            return false;
        }
        YearPickerItem yearPickerItem = (YearPickerItem) obj2;
        return Intrinsics.f(this.f63723a, yearPickerItem.f63723a) && this.f63724b == yearPickerItem.f63724b && this.f63725c == yearPickerItem.f63725c && Intrinsics.f(this.d, yearPickerItem.d) && Intrinsics.f(this.e, yearPickerItem.e) && Intrinsics.f(this.f, yearPickerItem.f);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63723a;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f63725c, j6.a.c(this.f63723a.hashCode() * 31, 31, this.f63724b), 31);
        Integer num = this.d;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63723a);
        dest.writeInt(this.f63724b ? 1 : 0);
        dest.writeInt(this.f63725c);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Integer num3 = this.f;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
    }
}
