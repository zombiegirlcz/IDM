package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/ContactImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lyy0/p;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactImage implements Image, p, gz0.c {

    @NotNull
    public static final Parcelable.Creator<ContactImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59890c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f59891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f59892h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StylableContactImage$ContactStyle f59893j;
    public final ImageTransformations k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f59894l;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactImage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, (StylableContactImage$ContactStyle) parcel.readParcelable(ContactImage.class.getClassLoader()), parcel.readInt() != 0 ? ImageTransformations.CREATOR.createFromParcel(parcel) : null, (Clause) parcel.readParcelable(ContactImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContactImage[i];
        }
    }

    public ContactImage() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4095);
    }

    public static ContactImage c(ContactImage contactImage, StylableContactImage$ContactStyle stylableContactImage$ContactStyle, ImageTransformations imageTransformations, int i) {
        String str = contactImage.f59888a;
        String str2 = contactImage.f59889b;
        String str3 = contactImage.f59890c;
        String str4 = contactImage.d;
        String str5 = contactImage.e;
        String str6 = contactImage.f;
        String str7 = contactImage.f59891g;
        Integer num = contactImage.f59892h;
        boolean z = contactImage.i;
        if ((i & 512) != 0) {
            stylableContactImage$ContactStyle = contactImage.f59893j;
        }
        return new ContactImage(str, str2, str3, str4, str5, str6, str7, num, z, stylableContactImage$ContactStyle, (i & 1024) != 0 ? contactImage.k : imageTransformations, contactImage.f59894l);
    }

    @Override // yy0.p
    public final Image a(StylableContactImage$ContactStyle stylableContactImage$ContactStyle) {
        return c(this, stylableContactImage$ContactStyle, null, 3583);
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF60025n() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ContactImage)) {
            return false;
        }
        ContactImage contactImage = (ContactImage) obj2;
        return Intrinsics.f(this.f59888a, contactImage.f59888a) && Intrinsics.f(this.f59889b, contactImage.f59889b) && Intrinsics.f(this.f59890c, contactImage.f59890c) && Intrinsics.f(this.d, contactImage.d) && Intrinsics.f(this.e, contactImage.e) && Intrinsics.f(this.f, contactImage.f) && Intrinsics.f(this.f59891g, contactImage.f59891g) && Intrinsics.f(this.f59892h, contactImage.f59892h) && this.i == contactImage.i && Intrinsics.f(this.f59893j, contactImage.f59893j) && Intrinsics.f(this.k, contactImage.k) && Intrinsics.f(this.f59894l, contactImage.f59894l);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getE() {
        return this.f59894l;
    }

    @Override // yy0.p
    /* JADX INFO: renamed from: h, reason: from getter */
    public final StylableContactImage$ContactStyle getF60045b() {
        return this.f59893j;
    }

    public final int hashCode() {
        String str = this.f59888a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59889b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59890c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59891g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.f59892h;
        int iC = j6.a.c((iHashCode7 + (num == null ? 0 : num.hashCode())) * 31, 31, this.i);
        StylableContactImage$ContactStyle stylableContactImage$ContactStyle = this.f59893j;
        int iHashCode8 = (iC + (stylableContactImage$ContactStyle == null ? 0 : stylableContactImage$ContactStyle.hashCode())) * 31;
        ImageTransformations imageTransformations = this.k;
        int iHashCode9 = (iHashCode8 + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        Clause clause = this.f59894l;
        return iHashCode9 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59888a);
        dest.writeString(this.f59889b);
        dest.writeString(this.f59890c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f59891g);
        Integer num = this.f59892h;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f59893j, i);
        ImageTransformations imageTransformations = this.k;
        if (imageTransformations == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageTransformations.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f59894l, i);
    }

    public ContactImage(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, boolean z, StylableContactImage$ContactStyle stylableContactImage$ContactStyle, ImageTransformations imageTransformations, Clause clause) {
        this.f59888a = str;
        this.f59889b = str2;
        this.f59890c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f59891g = str7;
        this.f59892h = num;
        this.i = z;
        this.f59893j = stylableContactImage$ContactStyle;
        this.k = imageTransformations;
        this.f59894l = clause;
    }

    public /* synthetic */ ContactImage(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, StylableContactImage$ContactStyle stylableContactImage$ContactStyle, ImageTransformations imageTransformations, TextLocalisedClause textLocalisedClause, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (Integer) null, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : stylableContactImage$ContactStyle, (i & 1024) != 0 ? null : imageTransformations, (i & 2048) != 0 ? null : textLocalisedClause);
    }
}
