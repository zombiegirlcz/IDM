package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CardIconInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardIconInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardIconInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59864c;
    public final int d;
    public final int e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardIconInfo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardIconInfo[i];
        }
    }

    public CardIconInfo(int i, int i2, int i3, int i5, int i6) {
        this.f59862a = i;
        this.f59863b = i2;
        this.f59864c = i3;
        this.d = i5;
        this.e = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardIconInfo)) {
            return false;
        }
        CardIconInfo cardIconInfo = (CardIconInfo) obj2;
        return this.f59862a == cardIconInfo.f59862a && this.f59863b == cardIconInfo.f59863b && this.f59864c == cardIconInfo.f59864c && this.d == cardIconInfo.d && this.e == cardIconInfo.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f59864c, j6.a.b(this.f59863b, Integer.hashCode(this.f59862a) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59862a);
        dest.writeInt(this.f59863b);
        dest.writeInt(this.f59864c);
        dest.writeInt(this.d);
        dest.writeInt(this.e);
    }
}
