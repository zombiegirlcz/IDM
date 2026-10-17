package com.revolut.shared.feature.wealth.ui_kit.models.image;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/ui_kit/models/image/InstrumentIssuerImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentIssuerImage implements Image {

    @NotNull
    public static final Parcelable.Creator<InstrumentIssuerImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f105359c;
    public final Integer d;
    public final ImageTransformations e;
    public final Clause f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstrumentIssuerImage(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (ImageTransformations) parcel.readParcelable(InstrumentIssuerImage.class.getClassLoader()), (Clause) parcel.readParcelable(InstrumentIssuerImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentIssuerImage[i];
        }
    }

    public InstrumentIssuerImage(String origin, String id10, Integer num, Integer num2, ImageTransformations imageTransformations, Clause clause) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f105357a = origin;
        this.f105358b = id10;
        this.f105359c = num;
        this.d = num2;
        this.e = imageTransformations;
        this.f = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentIssuerImage)) {
            return false;
        }
        InstrumentIssuerImage instrumentIssuerImage = (InstrumentIssuerImage) obj2;
        return Intrinsics.f(this.f105357a, instrumentIssuerImage.f105357a) && Intrinsics.f(this.f105358b, instrumentIssuerImage.f105358b) && Intrinsics.f(this.f105359c, instrumentIssuerImage.f105359c) && Intrinsics.f(this.d, instrumentIssuerImage.d) && Intrinsics.f(this.e, instrumentIssuerImage.e) && Intrinsics.f(this.f, instrumentIssuerImage.f);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF() {
        return this.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f105357a.hashCode() * 31, 31, this.f105358b);
        Integer num = this.f105359c;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        ImageTransformations imageTransformations = this.e;
        int iHashCode3 = (iHashCode2 + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        Clause clause = this.f;
        return iHashCode3 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105357a);
        dest.writeString(this.f105358b);
        Integer num = this.f105359c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.d;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
