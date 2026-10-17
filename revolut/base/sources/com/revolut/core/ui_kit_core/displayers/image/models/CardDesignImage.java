package com.revolut.core.ui_kit_core.displayers.image.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CardDesignImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDesignImage implements Image {

    @NotNull
    public static final Parcelable.Creator<CardDesignImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59859c;
    public final Clause d;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDesignImage(parcel.readInt(), parcel.readLong(), (Clause) parcel.readParcelable(CardDesignImage.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDesignImage[i];
        }
    }

    public CardDesignImage(int i, long j2, Clause clause, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f59857a = url2;
        this.f59858b = i;
        this.f59859c = j2;
        this.d = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDesignImage)) {
            return false;
        }
        CardDesignImage cardDesignImage = (CardDesignImage) obj2;
        return Intrinsics.f(this.f59857a, cardDesignImage.f59857a) && this.f59858b == cardDesignImage.f59858b && this.f59859c == cardDesignImage.f59859c && Intrinsics.f(this.d, cardDesignImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.d;
    }

    public final int hashCode() {
        int iC = d.c(j6.a.b(this.f59858b, this.f59857a.hashCode() * 31, 31), 31, this.f59859c);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59857a);
        dest.writeInt(this.f59858b);
        dest.writeLong(this.f59859c);
        dest.writeParcelable(this.d, i);
    }
}
