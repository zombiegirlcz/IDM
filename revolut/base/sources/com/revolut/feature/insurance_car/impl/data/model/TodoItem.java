package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kl7.j2;
import kl7.k2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/TodoItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kl7/k2", "kl7/j2", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TodoItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TodoItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f75332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75334c;
    public final int d;
    public final j2 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f75335g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TodoItem(k2.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt(), j2.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TodoItem[i];
        }
    }

    public TodoItem(k2 type, String title, String subtitle, int i, j2 level, String str, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f75332a = type;
        this.f75333b = title;
        this.f75334c = subtitle;
        this.d = i;
        this.e = level;
        this.f = str;
        this.f75335g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TodoItem)) {
            return false;
        }
        TodoItem todoItem = (TodoItem) obj2;
        return this.f75332a == todoItem.f75332a && Intrinsics.f(this.f75333b, todoItem.f75333b) && Intrinsics.f(this.f75334c, todoItem.f75334c) && this.d == todoItem.d && this.e == todoItem.e && Intrinsics.f(this.f, todoItem.f) && this.f75335g == todoItem.f75335g;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + j6.a.b(this.d, p.a.c(p.a.c(this.f75332a.hashCode() * 31, 31, this.f75333b), 31, this.f75334c), 31)) * 31;
        String str = this.f;
        return Boolean.hashCode(this.f75335g) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75332a.name());
        dest.writeString(this.f75333b);
        dest.writeString(this.f75334c);
        dest.writeInt(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        dest.writeInt(this.f75335g ? 1 : 0);
    }
}
