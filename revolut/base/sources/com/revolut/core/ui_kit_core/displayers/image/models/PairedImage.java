package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/PairedImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PairedImage implements Image {

    @NotNull
    public static final Parcelable.Creator<PairedImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f59967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f59968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59969c;
    public final Clause d;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PairedImage((Image) parcel.readParcelable(PairedImage.class.getClassLoader()), (Image) parcel.readParcelable(PairedImage.class.getClassLoader()), parcel.readInt(), (Clause) parcel.readParcelable(PairedImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PairedImage[i];
        }
    }

    public PairedImage(Image bottom, Image top, int i, Clause clause) {
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(top, "top");
        this.f59967a = bottom;
        this.f59968b = top;
        this.f59969c = i;
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
        if (!(obj2 instanceof PairedImage)) {
            return false;
        }
        PairedImage pairedImage = (PairedImage) obj2;
        return Intrinsics.f(this.f59967a, pairedImage.f59967a) && Intrinsics.f(this.f59968b, pairedImage.f59968b) && this.f59969c == pairedImage.f59969c && Intrinsics.f(this.d, pairedImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59810c() {
        return this.d;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f59969c, a10.b.c(this.f59968b, this.f59967a.hashCode() * 31, 31), 31);
        Clause clause = this.d;
        return iB + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f59967a, i);
        dest.writeParcelable(this.f59968b, i);
        dest.writeInt(this.f59969c);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ PairedImage(Image image, Image image2) {
        this(image, image2, R$attr.uikit_colorWidgetBackground, null);
    }
}
