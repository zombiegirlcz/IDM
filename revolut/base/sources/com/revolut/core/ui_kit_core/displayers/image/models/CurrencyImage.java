package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CurrencyImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyImage implements Image, gz0.c {

    @NotNull
    public static final Parcelable.Creator<CurrencyImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f59912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageTransformations f59913c;
    public final Clause d;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyImage(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ImageTransformations.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(CurrencyImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencyImage[i];
        }
    }

    public CurrencyImage(String currencyCode, boolean z, ImageTransformations imageTransformations, Clause clause) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f59911a = currencyCode;
        this.f59912b = z;
        this.f59913c = imageTransformations;
        this.d = clause;
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF59845b() {
        return this.f59913c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CurrencyImage)) {
            return false;
        }
        CurrencyImage currencyImage = (CurrencyImage) obj2;
        return Intrinsics.f(this.f59911a, currencyImage.f59911a) && this.f59912b == currencyImage.f59912b && Intrinsics.f(this.f59913c, currencyImage.f59913c) && Intrinsics.f(this.d, currencyImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getE() {
        return this.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f59911a.hashCode() * 31, 31, this.f59912b);
        ImageTransformations imageTransformations = this.f59913c;
        int iHashCode = (iC + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        Clause clause = this.d;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59911a);
        dest.writeInt(this.f59912b ? 1 : 0);
        ImageTransformations imageTransformations = this.f59913c;
        if (imageTransformations == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageTransformations.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ CurrencyImage(String str, ImageTransformations imageTransformations, TextLocalisedClause textLocalisedClause, int i) {
        this(str, (i & 2) == 0, (i & 4) != 0 ? null : imageTransformations, (i & 8) != 0 ? null : textLocalisedClause);
    }
}
