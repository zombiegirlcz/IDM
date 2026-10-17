package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/ImageClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImageClause implements Clause, oy0.b {

    @NotNull
    public static final Parcelable.Creator<ImageClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageClauseTint f57786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f57787c;
    public final Float d;
    public final Clause e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageClause(parcel.readInt(), (ImageClauseTint) parcel.readParcelable(ImageClause.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, (Clause) parcel.readParcelable(ImageClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageClause[i];
        }
    }

    public ImageClause(int i, ImageClauseTint imageClauseTint, Float f, Float f4, Clause clause) {
        this.f57785a = i;
        this.f57786b = imageClauseTint;
        this.f57787c = f;
        this.d = f4;
        this.e = clause;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF57785a() {
        return this.f57785a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getF57787c() {
        return this.f57787c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ImageClauseTint getF57786b() {
        return this.f57786b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ImageClause)) {
            return false;
        }
        ImageClause imageClause = (ImageClause) obj2;
        return this.f57785a == imageClause.f57785a && Intrinsics.f(this.f57786b, imageClause.f57786b) && Intrinsics.f(this.f57787c, imageClause.f57787c) && Intrinsics.f(this.d, imageClause.d) && Intrinsics.f(this.e, imageClause.e);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f57785a) * 31;
        ImageClauseTint imageClauseTint = this.f57786b;
        int iHashCode2 = (iHashCode + (imageClauseTint == null ? 0 : imageClauseTint.hashCode())) * 31;
        Float f = this.f57787c;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.d;
        int iHashCode4 = (iHashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Clause clause = this.e;
        return iHashCode4 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f57785a);
        dest.writeParcelable(this.f57786b, i);
        Float f = this.f57787c;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
        Float f4 = this.d;
        if (f4 == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f4);
        }
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ ImageClause(int i, ImageClauseTint imageClauseTint, Float f, Float f4, int i2) {
        this(i, imageClauseTint, (i2 & 4) != 0 ? null : f, (i2 & 8) != 0 ? null : f4, (Clause) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageClause(int i, Integer num, Float f, Float f4, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        this(i, num != null ? new ImageClauseTint.Color(new Color.Solid(num.intValue())) : null, (i2 & 4) != 0 ? null : f, (i2 & 8) != 0 ? null : f4, (Clause) null);
    }
}
