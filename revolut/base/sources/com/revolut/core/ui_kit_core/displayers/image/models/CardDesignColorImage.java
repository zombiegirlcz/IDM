package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CardDesignColorImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDesignColorImage implements Image {

    @NotNull
    public static final Parcelable.Creator<CardDesignColorImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorResource f59855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f59856b;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDesignColorImage((ColorResource) parcel.readParcelable(CardDesignColorImage.class.getClassLoader()), (Clause) parcel.readParcelable(CardDesignColorImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDesignColorImage[i];
        }
    }

    public CardDesignColorImage(ColorResource colorResource, Clause clause) {
        Intrinsics.checkNotNullParameter(colorResource, "colorResource");
        this.f59855a = colorResource;
        this.f59856b = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDesignColorImage)) {
            return false;
        }
        CardDesignColorImage cardDesignColorImage = (CardDesignColorImage) obj2;
        return Intrinsics.f(this.f59855a, cardDesignColorImage.f59855a) && Intrinsics.f(this.f59856b, cardDesignColorImage.f59856b);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59856b() {
        return this.f59856b;
    }

    public final int hashCode() {
        int iHashCode = this.f59855a.hashCode() * 31;
        Clause clause = this.f59856b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f59855a, i);
        dest.writeParcelable(this.f59856b, i);
    }
}
