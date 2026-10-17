package com.revolut.feature.apm.core.ui.api.navigation.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "g12/a", "Title", "Button", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QrData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g12.a f62320c;
    public final Integer d;
    public final Title e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f62321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f62322h;
    public final Button i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f62323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f62324b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button((Clause) parcel.readParcelable(Button.class.getClassLoader()), (Image) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(Clause text, Image icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f62323a = icon;
            this.f62324b = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f62323a, button.f62323a) && Intrinsics.f(this.f62324b, button.f62324b);
        }

        public final int hashCode() {
            return this.f62324b.hashCode() + (this.f62323a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62323a, i);
            dest.writeParcelable(this.f62324b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData$Title;", "Landroid/os/Parcelable;", "Header", "Small", "Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData$Title$Header;", "Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData$Title$Small;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Title extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData$Title$Header;", "Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData$Title;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Header implements Title {

            @NotNull
            public static final Parcelable.Creator<Header> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f62325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f62326b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Header((Clause) parcel.readParcelable(Header.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Header[i];
                }
            }

            public Header(Clause text, boolean z) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f62325a = text;
                this.f62326b = z;
            }

            @Override // com.revolut.feature.apm.core.ui.api.navigation.qr.QrData.Title
            /* JADX INFO: renamed from: X0, reason: from getter */
            public final boolean getF62328b() {
                return this.f62326b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj2;
                return Intrinsics.f(this.f62325a, header.f62325a) && this.f62326b == header.f62326b;
            }

            @Override // com.revolut.feature.apm.core.ui.api.navigation.qr.QrData.Title
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final Clause getF62327a() {
                return this.f62325a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f62326b) + (this.f62325a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f62325a, i);
                dest.writeInt(this.f62326b ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData$Title$Small;", "Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrData$Title;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Small implements Title {

            @NotNull
            public static final Parcelable.Creator<Small> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f62327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f62328b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Small((Clause) parcel.readParcelable(Small.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Small[i];
                }
            }

            public Small(Clause text, boolean z) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f62327a = text;
                this.f62328b = z;
            }

            @Override // com.revolut.feature.apm.core.ui.api.navigation.qr.QrData.Title
            /* JADX INFO: renamed from: X0, reason: from getter */
            public final boolean getF62328b() {
                return this.f62328b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Small)) {
                    return false;
                }
                Small small = (Small) obj2;
                return Intrinsics.f(this.f62327a, small.f62327a) && this.f62328b == small.f62328b;
            }

            @Override // com.revolut.feature.apm.core.ui.api.navigation.qr.QrData.Title
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final Clause getF62327a() {
                return this.f62327a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f62328b) + (this.f62327a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f62327a, i);
                dest.writeInt(this.f62328b ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: X0 */
        boolean getF62328b();

        /* JADX INFO: renamed from: getText */
        Clause getF62327a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QrData(parcel.readString(), parcel.readString(), g12.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Title) parcel.readParcelable(QrData.class.getClassLoader()), (Clause) parcel.readParcelable(QrData.class.getClassLoader()), (Clause) parcel.readParcelable(QrData.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrData[i];
        }
    }

    public QrData(String id10, String text, g12.a type, Integer num, Title title, Clause clause, Clause clause2, Button button, Button button2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f62318a = id10;
        this.f62319b = text;
        this.f62320c = type;
        this.d = num;
        this.e = title;
        this.f = clause;
        this.f62321g = clause2;
        this.f62322h = button;
        this.i = button2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QrData)) {
            return false;
        }
        QrData qrData = (QrData) obj2;
        return Intrinsics.f(this.f62318a, qrData.f62318a) && Intrinsics.f(this.f62319b, qrData.f62319b) && this.f62320c == qrData.f62320c && Intrinsics.f(this.d, qrData.d) && Intrinsics.f(this.e, qrData.e) && Intrinsics.f(this.f, qrData.f) && Intrinsics.f(this.f62321g, qrData.f62321g) && Intrinsics.f(this.f62322h, qrData.f62322h) && Intrinsics.f(this.i, qrData.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f62320c.hashCode() + p.a.c(this.f62318a.hashCode() * 31, 31, this.f62319b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Title title = this.e;
        int iHashCode3 = (iHashCode2 + (title == null ? 0 : title.hashCode())) * 31;
        Clause clause = this.f;
        int iHashCode4 = (iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f62321g;
        int iHashCode5 = (iHashCode4 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Button button = this.f62322h;
        int iHashCode6 = (iHashCode5 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.i;
        return iHashCode6 + (button2 != null ? button2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62318a);
        dest.writeString(this.f62319b);
        dest.writeString(this.f62320c.name());
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f62321g, i);
        Button button = this.f62322h;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
        Button button2 = this.i;
        if (button2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button2.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ QrData(String str, String str2, g12.a aVar, Integer num, Title.Header header, TextLocalisedClause textLocalisedClause, TextClause textClause, Button button, int i) {
        this(str, str2, aVar, num, header, textLocalisedClause, (i & 64) != 0 ? null : textClause, (i & 128) != 0 ? null : button, (Button) null);
    }
}
