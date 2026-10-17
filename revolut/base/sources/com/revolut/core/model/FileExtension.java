package com.revolut.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revolut/core/model/FileExtension;", "Landroid/os/Parcelable;", "Pdf", "Xls", "Png", "Jpg", "Csv", "Html", "Gif", "Tiff", "Bmp", "Webp", "Unknown", "None", "Lcom/revolut/core/model/FileExtension$Bmp;", "Lcom/revolut/core/model/FileExtension$Csv;", "Lcom/revolut/core/model/FileExtension$Gif;", "Lcom/revolut/core/model/FileExtension$Html;", "Lcom/revolut/core/model/FileExtension$Jpg;", "Lcom/revolut/core/model/FileExtension$None;", "Lcom/revolut/core/model/FileExtension$Pdf;", "Lcom/revolut/core/model/FileExtension$Png;", "Lcom/revolut/core/model/FileExtension$Tiff;", "Lcom/revolut/core/model/FileExtension$Unknown;", "Lcom/revolut/core/model/FileExtension$Webp;", "Lcom/revolut/core/model/FileExtension$Xls;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FileExtension implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51399a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Bmp;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Bmp extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Bmp f51400b = new Bmp();

        @NotNull
        public static final Parcelable.Creator<Bmp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Bmp.f51400b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bmp[i];
            }
        }

        private Bmp() {
            super("bmp");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Csv;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Csv extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Csv f51401b = new Csv();

        @NotNull
        public static final Parcelable.Creator<Csv> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Csv.f51401b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Csv[i];
            }
        }

        private Csv() {
            super("csv");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Gif;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Gif extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Gif f51402b = new Gif();

        @NotNull
        public static final Parcelable.Creator<Gif> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Gif.f51402b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gif[i];
            }
        }

        private Gif() {
            super("gif");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Html;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Html extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Html f51403b = new Html();

        @NotNull
        public static final Parcelable.Creator<Html> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Html.f51403b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Html[i];
            }
        }

        private Html() {
            super("html");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Jpg;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Jpg extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Jpg f51404b = new Jpg();

        @NotNull
        public static final Parcelable.Creator<Jpg> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Jpg.f51404b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Jpg[i];
            }
        }

        private Jpg() {
            super("jpg");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$None;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final None f51405b = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f51405b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
            super("");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Pdf;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pdf extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Pdf f51406b = new Pdf();

        @NotNull
        public static final Parcelable.Creator<Pdf> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pdf.f51406b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pdf[i];
            }
        }

        private Pdf() {
            super("pdf");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Png;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Png extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Png f51407b = new Png();

        @NotNull
        public static final Parcelable.Creator<Png> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Png.f51407b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Png[i];
            }
        }

        private Png() {
            super("png");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Tiff;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Tiff extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Tiff f51408b = new Tiff();

        @NotNull
        public static final Parcelable.Creator<Tiff> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Tiff.f51408b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tiff[i];
            }
        }

        private Tiff() {
            super("tiff");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/FileExtension$Unknown;", "Lcom/revolut/core/model/FileExtension;", "", "toString", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unknown extends FileExtension {

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51409b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String extensionName) {
            super(extensionName);
            Intrinsics.checkNotNullParameter(extensionName, "extensionName");
            this.f51409b = extensionName;
        }

        @Override // com.revolut.core.model.FileExtension
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF51399a() {
            return this.f51409b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unknown) && Intrinsics.f(this.f51409b, ((Unknown) obj2).f51409b);
        }

        public final int hashCode() {
            return this.f51409b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51409b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Webp;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Webp extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Webp f51410b = new Webp();

        @NotNull
        public static final Parcelable.Creator<Webp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Webp.f51410b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Webp[i];
            }
        }

        private Webp() {
            super("webp");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/FileExtension$Xls;", "Lcom/revolut/core/model/FileExtension;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Xls extends FileExtension {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Xls f51411b = new Xls();

        @NotNull
        public static final Parcelable.Creator<Xls> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Xls.f51411b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Xls[i];
            }
        }

        private Xls() {
            super("xls");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public FileExtension(String str) {
        this.f51399a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF51399a() {
        return this.f51399a;
    }

    public final String toString() {
        return getF51399a();
    }
}
