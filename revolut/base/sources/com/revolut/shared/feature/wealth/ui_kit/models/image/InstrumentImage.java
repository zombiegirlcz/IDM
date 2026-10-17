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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/ui_kit/models/image/InstrumentImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentImage implements Image {

    @NotNull
    public static final Parcelable.Creator<InstrumentImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f105355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f105356c;
    public final ImageTransformations d;
    public final Clause e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstrumentImage(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (ImageTransformations) parcel.readParcelable(InstrumentImage.class.getClassLoader()), (Clause) parcel.readParcelable(InstrumentImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentImage[i];
        }
    }

    public InstrumentImage(String ref2, Integer num, Integer num2, ImageTransformations imageTransformations, Clause clause) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f105354a = ref2;
        this.f105355b = num;
        this.f105356c = num2;
        this.d = imageTransformations;
        this.e = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentImage)) {
            return false;
        }
        InstrumentImage instrumentImage = (InstrumentImage) obj2;
        return Intrinsics.f(this.f105354a, instrumentImage.f105354a) && Intrinsics.f(this.f105355b, instrumentImage.f105355b) && Intrinsics.f(this.f105356c, instrumentImage.f105356c) && Intrinsics.f(this.d, instrumentImage.d) && Intrinsics.f(this.e, instrumentImage.e);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.f105354a.hashCode() * 31;
        Integer num = this.f105355b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f105356c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ImageTransformations imageTransformations = this.d;
        int iHashCode4 = (iHashCode3 + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        Clause clause = this.e;
        return iHashCode4 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105354a);
        Integer num = this.f105355b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f105356c;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ InstrumentImage(String str, int i, Integer num, Integer num2) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, null, null);
    }
}
