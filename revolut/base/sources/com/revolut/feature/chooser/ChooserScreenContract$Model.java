package com.revolut.feature.chooser;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qi3.p;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/chooser/ChooserScreenContract$Model", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooserScreenContract$Model implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<ChooserScreenContract$Model> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f65905c;
    public final p d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f65907h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f65908j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Serializable f65909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f65910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f65911n;
    public final boolean o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            Serializable serializable;
            boolean z6;
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Clause clause = (Clause) parcel.readParcelable(ChooserScreenContract$Model.class.getClassLoader());
            p pVarValueOf = p.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Image image = (Image) parcel.readParcelable(ChooserScreenContract$Model.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z12 = false;
            boolean z29 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z12 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z29 = z;
            }
            Serializable serializable2 = parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z4 = z3;
                serializable = serializable2;
                z6 = z4;
            } else {
                z4 = z3;
                serializable = serializable2;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z11 = z4;
            } else {
                z11 = z4;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z11 = z;
            }
            return new ChooserScreenContract$Model(string, string2, clause, pVarValueOf, string3, string4, string5, image, numValueOf, z12, z29, serializable, z6, z4, z11);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooserScreenContract$Model[i];
        }
    }

    public ChooserScreenContract$Model(String id10, String title, Clause clause, p type, String str, String str2, String str3, Image image, Integer num, boolean z, boolean z3, Serializable serializable, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f65903a = id10;
        this.f65904b = title;
        this.f65905c = clause;
        this.d = type;
        this.e = str;
        this.f = str2;
        this.f65906g = str3;
        this.f65907h = image;
        this.i = num;
        this.f65908j = z;
        this.k = z3;
        this.f65909l = serializable;
        this.f65910m = z4;
        this.f65911n = z6;
        this.o = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChooserScreenContract$Model)) {
            return false;
        }
        ChooserScreenContract$Model chooserScreenContract$Model = (ChooserScreenContract$Model) obj2;
        return Intrinsics.f(this.f65903a, chooserScreenContract$Model.f65903a) && Intrinsics.f(this.f65904b, chooserScreenContract$Model.f65904b) && Intrinsics.f(this.f65905c, chooserScreenContract$Model.f65905c) && this.d == chooserScreenContract$Model.d && Intrinsics.f(this.e, chooserScreenContract$Model.e) && Intrinsics.f(this.f, chooserScreenContract$Model.f) && Intrinsics.f(this.f65906g, chooserScreenContract$Model.f65906g) && Intrinsics.f(this.f65907h, chooserScreenContract$Model.f65907h) && Intrinsics.f(this.i, chooserScreenContract$Model.i) && this.f65908j == chooserScreenContract$Model.f65908j && this.k == chooserScreenContract$Model.k && Intrinsics.f(this.f65909l, chooserScreenContract$Model.f65909l) && this.f65910m == chooserScreenContract$Model.f65910m && this.f65911n == chooserScreenContract$Model.f65911n && this.o == chooserScreenContract$Model.o;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f65903a.hashCode() * 31, 31, this.f65904b);
        Clause clause = this.f65905c;
        int iHashCode = (this.d.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65906g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.f65907h;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.i;
        int iC2 = j6.a.c(j6.a.c((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f65908j), 31, this.k);
        Serializable serializable = this.f65909l;
        return Boolean.hashCode(this.o) + j6.a.c(j6.a.c((iC2 + (serializable != null ? serializable.hashCode() : 0)) * 31, 31, this.f65910m), 31, this.f65911n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65903a);
        dest.writeString(this.f65904b);
        dest.writeParcelable(this.f65905c, i);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f65906g);
        dest.writeParcelable(this.f65907h, i);
        Integer num = this.i;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f65908j ? 1 : 0);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeSerializable(this.f65909l);
        dest.writeInt(this.f65910m ? 1 : 0);
        dest.writeInt(this.f65911n ? 1 : 0);
        dest.writeInt(this.o ? 1 : 0);
    }

    public /* synthetic */ ChooserScreenContract$Model(String str, String str2, p pVar, String str3, String str4, Image image, boolean z, Serializable serializable, int i) {
        this(str, str2, null, (i & 8) != 0 ? p.IMAGE_ITEM : pVar, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, null, (i & 128) != 0 ? null : image, null, (i & 512) != 0 ? false : z, (i & 1024) == 0, (i & 2048) != 0 ? null : serializable, true, (i & 8192) == 0, true);
    }
}
