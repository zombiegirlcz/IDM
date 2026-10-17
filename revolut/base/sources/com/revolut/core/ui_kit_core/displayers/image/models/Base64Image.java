package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/Base64Image;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Base64Image implements Image, gz0.c {

    @NotNull
    public static final Parcelable.Creator<Base64Image> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageTransformations f59845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f59846c;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Base64Image(parcel.readString(), ImageTransformations.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(Base64Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Base64Image[i];
        }
    }

    public Base64Image(String encodedImage, ImageTransformations transformations, Clause clause) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        this.f59844a = encodedImage;
        this.f59845b = transformations;
        this.f59846c = clause;
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF59845b() {
        return this.f59845b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Base64Image)) {
            return false;
        }
        Base64Image base64Image = (Base64Image) obj2;
        return Intrinsics.f(this.f59844a, base64Image.f59844a) && Intrinsics.f(this.f59845b, base64Image.f59845b) && Intrinsics.f(this.f59846c, base64Image.f59846c);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59846c() {
        return this.f59846c;
    }

    public final int hashCode() {
        int iHashCode = (this.f59845b.hashCode() + (this.f59844a.hashCode() * 31)) * 31;
        Clause clause = this.f59846c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59844a);
        this.f59845b.writeToParcel(dest, i);
        dest.writeParcelable(this.f59846c, i);
    }

    public /* synthetic */ Base64Image(String str, ImageTransformations imageTransformations, int i) {
        this(str, (i & 2) != 0 ? new ImageTransformations(null, null, null, gz0.b.CenterInside, null, null, null, LDSFile.EF_SOD_TAG) : imageTransformations, (Clause) null);
    }
}
