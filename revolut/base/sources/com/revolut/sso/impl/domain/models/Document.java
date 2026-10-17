package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import gkl.j0;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Document;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "gkl/j0", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Document implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f106145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106146c;
    public final LocalDate d;
    public final String e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f106147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f106148h;
    public final String i;

    @NotNull
    public static final Parcelable.Creator<Document> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Document(parcel.readString(), j0.valueOf(parcel.readString()), parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Document[i];
        }
    }

    public Document(String number, j0 type, String str, LocalDate localDate, String str2, LocalDate localDate2, LocalDate localDate3, String issuerCountry, String str3) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(issuerCountry, "issuerCountry");
        this.f106144a = number;
        this.f106145b = type;
        this.f106146c = str;
        this.d = localDate;
        this.e = str2;
        this.f = localDate2;
        this.f106147g = localDate3;
        this.f106148h = issuerCountry;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Document)) {
            return false;
        }
        Document document = (Document) obj2;
        return Intrinsics.f(this.f106144a, document.f106144a) && this.f106145b == document.f106145b && Intrinsics.f(this.f106146c, document.f106146c) && Intrinsics.f(this.d, document.d) && Intrinsics.f(this.e, document.e) && Intrinsics.f(this.f, document.f) && Intrinsics.f(this.f106147g, document.f106147g) && Intrinsics.f(this.f106148h, document.f106148h) && Intrinsics.f(this.i, document.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f106145b.hashCode() + (this.f106144a.hashCode() * 31)) * 31;
        String str = this.f106146c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        int iHashCode5 = (iHashCode4 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f106147g;
        int iC = p.a.c((iHashCode5 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31, 31, this.f106148h);
        String str3 = this.i;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106144a);
        dest.writeString(this.f106145b.name());
        dest.writeString(this.f106146c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f106147g);
        dest.writeString(this.f106148h);
        dest.writeString(this.i);
    }
}
