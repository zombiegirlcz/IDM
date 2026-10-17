package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CardImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardImage implements Image {

    @NotNull
    public static final Parcelable.Creator<CardImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevolutIcon f59867c;
    public final boolean d;
    public final Integer e;
    public final CardIcon f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f59868g;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardImage(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), RevolutIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? CardIcon.CREATOR.createFromParcel(parcel) : null, (Clause) parcel.readParcelable(CardImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardImage[i];
        }
    }

    public CardImage(int i, Integer num, RevolutIcon revolutIcon, boolean z, Integer num2, CardIcon cardIcon, Clause clause) {
        Intrinsics.checkNotNullParameter(revolutIcon, "revolutIcon");
        this.f59865a = i;
        this.f59866b = num;
        this.f59867c = revolutIcon;
        this.d = z;
        this.e = num2;
        this.f = cardIcon;
        this.f59868g = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardImage)) {
            return false;
        }
        CardImage cardImage = (CardImage) obj2;
        return this.f59865a == cardImage.f59865a && Intrinsics.f(this.f59866b, cardImage.f59866b) && Intrinsics.f(this.f59867c, cardImage.f59867c) && this.d == cardImage.d && Intrinsics.f(this.e, cardImage.e) && Intrinsics.f(this.f, cardImage.f) && Intrinsics.f(this.f59868g, cardImage.f59868g);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59810c() {
        return this.f59868g;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f59865a) * 31;
        Integer num = this.f59866b;
        int iC = j6.a.c((this.f59867c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.d);
        Integer num2 = this.e;
        int iHashCode2 = (iC + (num2 == null ? 0 : num2.hashCode())) * 31;
        CardIcon cardIcon = this.f;
        int iHashCode3 = (iHashCode2 + (cardIcon == null ? 0 : cardIcon.hashCode())) * 31;
        Clause clause = this.f59868g;
        return iHashCode3 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59865a);
        Integer num = this.f59866b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        this.f59867c.writeToParcel(dest, i);
        dest.writeInt(this.d ? 1 : 0);
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        CardIcon cardIcon = this.f;
        if (cardIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardIcon.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f59868g, i);
    }
}
