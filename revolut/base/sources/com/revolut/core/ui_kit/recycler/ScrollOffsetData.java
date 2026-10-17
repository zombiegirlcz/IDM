package com.revolut.core.ui_kit.recycler;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/recycler/ScrollOffsetData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScrollOffsetData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScrollOffsetData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58171c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScrollOffsetData(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScrollOffsetData[i];
        }
    }

    public ScrollOffsetData(String listId, int i, int i2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f58169a = listId;
        this.f58170b = i;
        this.f58171c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScrollOffsetData)) {
            return false;
        }
        ScrollOffsetData scrollOffsetData = (ScrollOffsetData) obj2;
        return Intrinsics.f(this.f58169a, scrollOffsetData.f58169a) && this.f58170b == scrollOffsetData.f58170b && this.f58171c == scrollOffsetData.f58171c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58171c) + j6.a.b(this.f58170b, this.f58169a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f58169a);
        dest.writeInt(this.f58170b);
        dest.writeInt(this.f58171c);
    }
}
