package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/BulletImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "Content", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BulletImage implements Image {

    @NotNull
    public static final Parcelable.Creator<BulletImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Content f59850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f59852c;
    public final Integer d;
    public final float e;
    public final Clause f;

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/BulletImage$Content;", "Landroid/os/Parcelable;", "<init>", "()V", "Letter", "Number", "Lcom/revolut/core/ui_kit_core/displayers/image/models/BulletImage$Content$Letter;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/BulletImage$Content$Number;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Content implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/BulletImage$Content$Letter;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/BulletImage$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Letter extends Content {

            @NotNull
            public static final Parcelable.Creator<Letter> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f59853a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Letter((Clause) parcel.readParcelable(Letter.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Letter[i];
                }
            }

            public Letter(Clause letter) {
                Intrinsics.checkNotNullParameter(letter, "letter");
                this.f59853a = letter;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Clause getF59853a() {
                return this.f59853a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Letter) && Intrinsics.f(this.f59853a, ((Letter) obj2).f59853a);
            }

            public final int hashCode() {
                return this.f59853a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f59853a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/BulletImage$Content$Number;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/BulletImage$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Number extends Content {

            @NotNull
            public static final Parcelable.Creator<Number> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59854a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Number(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Number[i];
                }
            }

            public Number(int i) {
                this.f59854a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF59854a() {
                return this.f59854a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Number) && this.f59854a == ((Number) obj2).f59854a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f59854a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59854a);
            }
        }

        private Content() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BulletImage((Content) parcel.readParcelable(BulletImage.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readFloat(), (Clause) parcel.readParcelable(BulletImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BulletImage[i];
        }
    }

    public BulletImage(Content content, Integer num, Integer num2, Integer num3, float f, Clause clause) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f59850a = content;
        this.f59851b = num;
        this.f59852c = num2;
        this.d = num3;
        this.e = f;
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
        if (!(obj2 instanceof BulletImage)) {
            return false;
        }
        BulletImage bulletImage = (BulletImage) obj2;
        return Intrinsics.f(this.f59850a, bulletImage.f59850a) && Intrinsics.f(this.f59851b, bulletImage.f59851b) && Intrinsics.f(this.f59852c, bulletImage.f59852c) && Intrinsics.f(this.d, bulletImage.d) && Float.compare(this.e, bulletImage.e) == 0 && Intrinsics.f(this.f, bulletImage.f);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.f59850a.hashCode() * 31;
        Integer num = this.f59851b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f59852c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iB = m72.b.b(this.e, (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        Clause clause = this.f;
        return iB + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f59850a, i);
        Integer num = this.f59851b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f59852c;
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
        dest.writeFloat(this.e);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ BulletImage(Content content, Integer num, Integer num2, Integer num3, float f, int i) {
        this(content, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? 2.0f : f, (Clause) null);
    }
}
