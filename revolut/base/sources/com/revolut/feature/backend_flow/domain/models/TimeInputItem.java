package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/TimeInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimeInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<TimeInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63696c;
    public final LocalTime d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimeInputItem(parcel.readString(), parcel.readInt() != 0, parcel.readString(), (LocalTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TimeInputItem[i];
        }
    }

    public TimeInputItem(String id10, boolean z, String str, LocalTime localTime, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f63694a = id10;
        this.f63695b = z;
        this.f63696c = str;
        this.d = localTime;
        this.e = str2;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63723a() {
        return this.f63694a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63724b() {
        return this.f63695b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TimeInputItem)) {
            return false;
        }
        TimeInputItem timeInputItem = (TimeInputItem) obj2;
        return Intrinsics.f(this.f63694a, timeInputItem.f63694a) && this.f63695b == timeInputItem.f63695b && Intrinsics.f(this.f63696c, timeInputItem.f63696c) && Intrinsics.f(this.d, timeInputItem.d) && Intrinsics.f(this.e, timeInputItem.e);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63694a;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63694a.hashCode() * 31, 31, this.f63695b);
        String str = this.f63696c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        LocalTime localTime = this.d;
        int iHashCode2 = (iHashCode + (localTime == null ? 0 : localTime.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63694a);
        dest.writeInt(this.f63695b ? 1 : 0);
        dest.writeString(this.f63696c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
    }
}
