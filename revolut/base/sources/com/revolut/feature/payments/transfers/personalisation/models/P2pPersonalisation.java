package com.revolut.feature.payments.transfers.personalisation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Content", "Font", "feature_payments_transfers_personalisation_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class P2pPersonalisation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<P2pPersonalisation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Content f79970b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation$Content;", "Landroid/os/Parcelable;", "Video", "Image", "Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation$Content$Image;", "Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation$Content$Video;", "feature_payments_transfers_personalisation_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Content extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation$Content$Image;", "Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation$Content;", "", "toString", "()Ljava/lang/String;", "feature_payments_transfers_personalisation_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Image implements Content {

            @NotNull
            public static final Parcelable.Creator<Image> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79971a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f79972b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f79973c;
            public final Font d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Image(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Font.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Image[i];
                }
            }

            public Image(String id10, String thumbnailUrl, String str, Font font) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
                this.f79971a = id10;
                this.f79972b = thumbnailUrl;
                this.f79973c = str;
                this.d = font;
            }

            @Override // com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation.Content
            /* JADX INFO: renamed from: J5, reason: from getter */
            public final Font getE() {
                return this.d;
            }

            @Override // com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation.Content
            /* JADX INFO: renamed from: X2, reason: from getter */
            public final String getD() {
                return this.f79973c;
            }

            @Override // com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation.Content
            /* JADX INFO: renamed from: Z, reason: from getter */
            public final String getF79976c() {
                return this.f79972b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj2;
                return Intrinsics.f(this.f79971a, image.f79971a) && Intrinsics.f(this.f79972b, image.f79972b) && Intrinsics.f(this.f79973c, image.f79973c) && Intrinsics.f(this.d, image.d);
            }

            @Override // com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation.Content
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF79974a() {
                return this.f79971a;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f79971a.hashCode() * 31, 31, this.f79972b);
                String str = this.f79973c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                Font font = this.d;
                return iHashCode + (font != null ? font.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79971a);
                dest.writeString(this.f79972b);
                dest.writeString(this.f79973c);
                Font font = this.d;
                if (font == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    font.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation$Content$Video;", "Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation$Content;", "", "toString", "()Ljava/lang/String;", "feature_payments_transfers_personalisation_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Video implements Content {

            @NotNull
            public static final Parcelable.Creator<Video> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f79975b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f79976c;
            public final String d;
            public final Font e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Video(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Font.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Video[i];
                }
            }

            public Video(String id10, String videoUrl, String thumbnailUrl, String str, Font font) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
                Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
                this.f79974a = id10;
                this.f79975b = videoUrl;
                this.f79976c = thumbnailUrl;
                this.d = str;
                this.e = font;
            }

            @Override // com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation.Content
            /* JADX INFO: renamed from: J5, reason: from getter */
            public final Font getE() {
                return this.e;
            }

            @Override // com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation.Content
            /* JADX INFO: renamed from: X2, reason: from getter */
            public final String getD() {
                return this.d;
            }

            @Override // com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation.Content
            /* JADX INFO: renamed from: Z, reason: from getter */
            public final String getF79976c() {
                return this.f79976c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Video)) {
                    return false;
                }
                Video video = (Video) obj2;
                return Intrinsics.f(this.f79974a, video.f79974a) && Intrinsics.f(this.f79975b, video.f79975b) && Intrinsics.f(this.f79976c, video.f79976c) && Intrinsics.f(this.d, video.d) && Intrinsics.f(this.e, video.e);
            }

            @Override // com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation.Content
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF79974a() {
                return this.f79974a;
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(this.f79974a.hashCode() * 31, 31, this.f79975b), 31, this.f79976c);
                String str = this.d;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                Font font = this.e;
                return iHashCode + (font != null ? font.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79974a);
                dest.writeString(this.f79975b);
                dest.writeString(this.f79976c);
                dest.writeString(this.d);
                Font font = this.e;
                if (font == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    font.writeToParcel(dest, i);
                }
            }
        }

        /* JADX INFO: renamed from: J5 */
        Font getE();

        /* JADX INFO: renamed from: X2 */
        String getD();

        /* JADX INFO: renamed from: Z */
        String getF79976c();

        /* JADX INFO: renamed from: getId */
        String getF79974a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/models/P2pPersonalisation$Font;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_transfers_personalisation_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Font implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Font> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79979c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Font(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Font[i];
            }
        }

        public Font(String id10, String str, String url2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f79977a = id10;
            this.f79978b = str;
            this.f79979c = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Font)) {
                return false;
            }
            Font font = (Font) obj2;
            return Intrinsics.f(this.f79977a, font.f79977a) && Intrinsics.f(this.f79978b, font.f79978b) && Intrinsics.f(this.f79979c, font.f79979c);
        }

        public final int hashCode() {
            int iHashCode = this.f79977a.hashCode() * 31;
            String str = this.f79978b;
            return this.f79979c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79977a);
            dest.writeString(this.f79978b);
            dest.writeString(this.f79979c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new P2pPersonalisation(parcel.readString(), (Content) parcel.readParcelable(P2pPersonalisation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new P2pPersonalisation[i];
        }
    }

    public P2pPersonalisation(String id10, Content content) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f79969a = id10;
        this.f79970b = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof P2pPersonalisation)) {
            return false;
        }
        P2pPersonalisation p2pPersonalisation = (P2pPersonalisation) obj2;
        return Intrinsics.f(this.f79969a, p2pPersonalisation.f79969a) && Intrinsics.f(this.f79970b, p2pPersonalisation.f79970b);
    }

    public final int hashCode() {
        return this.f79970b.hashCode() + (this.f79969a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79969a);
        dest.writeParcelable(this.f79970b, i);
    }
}
