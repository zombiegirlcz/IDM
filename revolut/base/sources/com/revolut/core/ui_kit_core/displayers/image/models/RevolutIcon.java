package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/RevolutIcon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutIcon implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevolutIcon> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60001b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutIcon(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutIcon[i];
        }
    }

    public RevolutIcon(int i, int i2) {
        this.f60000a = i;
        this.f60001b = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF60001b() {
        return this.f60001b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF60000a() {
        return this.f60000a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutIcon)) {
            return false;
        }
        RevolutIcon revolutIcon = (RevolutIcon) obj2;
        return this.f60000a == revolutIcon.f60000a && this.f60001b == revolutIcon.f60001b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60001b) + (Integer.hashCode(this.f60000a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f60000a);
        dest.writeInt(this.f60001b);
    }
}
