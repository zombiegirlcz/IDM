package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GlyphImage implements Image {

    @NotNull
    public static final Parcelable.Creator<GlyphImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlyphImageTint f59926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f59927c;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GlyphImage(parcel.readInt(), (GlyphImageTint) parcel.readParcelable(GlyphImage.class.getClassLoader()), (Clause) parcel.readParcelable(GlyphImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GlyphImage[i];
        }
    }

    public GlyphImage(int i, GlyphImageTint tint, Clause clause) {
        Intrinsics.checkNotNullParameter(tint, "tint");
        this.f59925a = i;
        this.f59926b = tint;
        this.f59927c = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GlyphImage)) {
            return false;
        }
        GlyphImage glyphImage = (GlyphImage) obj2;
        return this.f59925a == glyphImage.f59925a && Intrinsics.f(this.f59926b, glyphImage.f59926b) && Intrinsics.f(this.f59927c, glyphImage.f59927c);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59927c() {
        return this.f59927c;
    }

    public final int hashCode() {
        int iHashCode = (this.f59926b.hashCode() + (Integer.hashCode(this.f59925a) * 31)) * 31;
        Clause clause = this.f59927c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59925a);
        dest.writeParcelable(this.f59926b, i);
        dest.writeParcelable(this.f59927c, i);
    }

    public /* synthetic */ GlyphImage(int i, GlyphImageTint glyphImageTint, TextLocalisedClause textLocalisedClause, int i2) {
        this(i, (i2 & 2) != 0 ? GlyphImageTint.STANDARD.f59931a : glyphImageTint, (i2 & 4) != 0 ? null : textLocalisedClause);
    }
}
