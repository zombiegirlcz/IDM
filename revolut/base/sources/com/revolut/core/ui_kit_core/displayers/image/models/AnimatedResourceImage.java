package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/AnimatedResourceImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnimatedResourceImage implements Image {

    @NotNull
    public static final Parcelable.Creator<AnimatedResourceImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59840c;
    public final Clause d;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnimatedResourceImage(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, (Clause) parcel.readParcelable(AnimatedResourceImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnimatedResourceImage[i];
        }
    }

    public AnimatedResourceImage(int i, Integer num, boolean z, Clause clause) {
        this.f59838a = i;
        this.f59839b = num;
        this.f59840c = z;
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
        if (!(obj2 instanceof AnimatedResourceImage)) {
            return false;
        }
        AnimatedResourceImage animatedResourceImage = (AnimatedResourceImage) obj2;
        return this.f59838a == animatedResourceImage.f59838a && Intrinsics.f(this.f59839b, animatedResourceImage.f59839b) && this.f59840c == animatedResourceImage.f59840c && Intrinsics.f(this.d, animatedResourceImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f59838a) * 31;
        Integer num = this.f59839b;
        int iC = j6.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f59840c);
        Clause clause = this.d;
        return iC + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59838a);
        Integer num = this.f59839b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f59840c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ AnimatedResourceImage(int i, int i2, Clause clause, Integer num) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) == 0, (i2 & 8) != 0 ? null : clause);
    }
}
