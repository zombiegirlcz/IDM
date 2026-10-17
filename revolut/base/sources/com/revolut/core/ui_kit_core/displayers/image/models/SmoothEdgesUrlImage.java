package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/SmoothEdgesUrlImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SmoothEdgesUrlImage implements Image {

    @NotNull
    public static final Parcelable.Creator<SmoothEdgesUrlImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f60004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f60005c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SmoothEdgesUrlImage(parcel.readString(), parcel.readFloat(), (Clause) parcel.readParcelable(SmoothEdgesUrlImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SmoothEdgesUrlImage[i];
        }
    }

    public SmoothEdgesUrlImage(String url2, float f, Clause clause) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f60003a = url2;
        this.f60004b = f;
        this.f60005c = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SmoothEdgesUrlImage)) {
            return false;
        }
        SmoothEdgesUrlImage smoothEdgesUrlImage = (SmoothEdgesUrlImage) obj2;
        return Intrinsics.f(this.f60003a, smoothEdgesUrlImage.f60003a) && Float.compare(this.f60004b, smoothEdgesUrlImage.f60004b) == 0 && Intrinsics.f(this.f60005c, smoothEdgesUrlImage.f60005c);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF60005c() {
        return this.f60005c;
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f60004b, this.f60003a.hashCode() * 31, 31);
        Clause clause = this.f60005c;
        return iB + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60003a);
        dest.writeFloat(this.f60004b);
        dest.writeParcelable(this.f60005c, i);
    }
}
