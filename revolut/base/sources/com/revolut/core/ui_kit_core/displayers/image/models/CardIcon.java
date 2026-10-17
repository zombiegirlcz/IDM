package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CardIcon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardIcon implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardIcon> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardIconInfo f59861b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardIcon(parcel.readInt(), CardIconInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardIcon[i];
        }
    }

    public CardIcon(int i, CardIconInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f59860a = i;
        this.f59861b = info;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardIconInfo getF59861b() {
        return this.f59861b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF59860a() {
        return this.f59860a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardIcon)) {
            return false;
        }
        CardIcon cardIcon = (CardIcon) obj2;
        return this.f59860a == cardIcon.f59860a && Intrinsics.f(this.f59861b, cardIcon.f59861b);
    }

    public final int hashCode() {
        return this.f59861b.hashCode() + (Integer.hashCode(this.f59860a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59860a);
        this.f59861b.writeToParcel(dest, i);
    }
}
