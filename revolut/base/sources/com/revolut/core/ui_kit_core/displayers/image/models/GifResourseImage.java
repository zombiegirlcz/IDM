package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GifResourseImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GifResourseImage implements Image, Parcelable {

    @NotNull
    public static final Parcelable.Creator<GifResourseImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f59924c;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GifResourseImage(parcel.readInt(), (Clause) parcel.readParcelable(GifResourseImage.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GifResourseImage[i];
        }
    }

    public GifResourseImage(int i, Clause clause, Integer num) {
        this.f59922a = i;
        this.f59923b = num;
        this.f59924c = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GifResourseImage)) {
            return false;
        }
        GifResourseImage gifResourseImage = (GifResourseImage) obj2;
        return this.f59922a == gifResourseImage.f59922a && Intrinsics.f(this.f59923b, gifResourseImage.f59923b) && Intrinsics.f(this.f59924c, gifResourseImage.f59924c);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59910c() {
        return this.f59924c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f59922a) * 31;
        Integer num = this.f59923b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Clause clause = this.f59924c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59922a);
        Integer num = this.f59923b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f59924c, i);
    }
}
