package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CoreResourceImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class CoreResourceImage implements Image {

    @NotNull
    public static final Parcelable.Creator<CoreResourceImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f59897c;
    public final Integer d;
    public final Clause e;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoreResourceImage(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (Clause) parcel.readParcelable(CoreResourceImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoreResourceImage[i];
        }
    }

    public CoreResourceImage(int i, Integer num, Integer num2, Integer num3, Clause clause) {
        this.f59895a = i;
        this.f59896b = num;
        this.f59897c = num2;
        this.d = num3;
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
        if (!(obj2 instanceof CoreResourceImage)) {
            return false;
        }
        CoreResourceImage coreResourceImage = (CoreResourceImage) obj2;
        return this.f59895a == coreResourceImage.f59895a && Intrinsics.f(this.f59896b, coreResourceImage.f59896b) && Intrinsics.f(this.f59897c, coreResourceImage.f59897c) && Intrinsics.f(this.d, coreResourceImage.d) && Intrinsics.f(this.e, coreResourceImage.e);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f59895a) * 31;
        Integer num = this.f59896b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f59897c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Clause clause = this.e;
        return iHashCode4 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59895a);
        Integer num = this.f59896b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f59897c;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Integer num3 = this.d;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        dest.writeParcelable(this.e, i);
    }
}
