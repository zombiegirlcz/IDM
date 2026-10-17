package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import aw0.n9;
import aw0.o9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/NameClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "Law0/n9;", "", "toString", "()Ljava/lang/String;", "Format", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NameClause implements Clause, fa, n9 {

    @NotNull
    public static final Parcelable.Creator<NameClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f57837c;
    public final o9 d;
    public final Format e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/NameClause$Format;", "Landroid/os/Parcelable;", "Short", "Full", "Lcom/revolut/core/ui_kit/models/NameClause$Format$Full;", "Lcom/revolut/core/ui_kit/models/NameClause$Format$Short;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Format extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/NameClause$Format$Full;", "Lcom/revolut/core/ui_kit/models/NameClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Full implements Format {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Full f57838a = new Full();

            @NotNull
            public static final Parcelable.Creator<Full> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Full.f57838a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Full[i];
                }
            }

            private Full() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/NameClause$Format$Short;", "Lcom/revolut/core/ui_kit/models/NameClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Short implements Format {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Short f57839a = new Short();

            @NotNull
            public static final Parcelable.Creator<Short> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Short.f57839a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Short[i];
                }
            }

            private Short() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NameClause(parcel.readString(), parcel.readString(), (Style) parcel.readParcelable(NameClause.class.getClassLoader()), o9.valueOf(parcel.readString()), (Format) parcel.readParcelable(NameClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NameClause[i];
        }
    }

    public NameClause(String firstName, String str, Style style, o9 sensitivity, Format format) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f57835a = firstName;
        this.f57836b = str;
        this.f57837c = style;
        this.d = sensitivity;
        this.e = format;
    }

    @Override // aw0.n9
    /* JADX INFO: renamed from: a, reason: from getter */
    public final o9 getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NameClause)) {
            return false;
        }
        NameClause nameClause = (NameClause) obj2;
        return Intrinsics.f(this.f57835a, nameClause.f57835a) && Intrinsics.f(this.f57836b, nameClause.f57836b) && Intrinsics.f(this.f57837c, nameClause.f57837c) && this.d == nameClause.d && Intrinsics.f(this.e, nameClause.e);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57837c() {
        return this.f57837c;
    }

    public final int hashCode() {
        int iHashCode = this.f57835a.hashCode() * 31;
        String str = this.f57836b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Style style = this.f57837c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (style != null ? style.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f57835a);
        dest.writeString(this.f57836b);
        dest.writeParcelable(this.f57837c, i);
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ NameClause(String str, String str2, int i) {
        this(str, str2, null, o9.NON_SENSITIVE, Format.Full.f57838a);
    }
}
