package com.revolut.feature.terms.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/terms/api/model/Terms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_terms_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Terms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Terms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90357c;
    public final String d;
    public final LocalDate e;
    public final TermsScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f90358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90359h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Terms(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), TermsScope.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Terms[i];
        }
    }

    public Terms(String id10, String str, String str2, String str3, LocalDate date, TermsScope scope, String str4, String title, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f90355a = id10;
        this.f90356b = str;
        this.f90357c = str2;
        this.d = str3;
        this.e = date;
        this.f = scope;
        this.f90358g = str4;
        this.f90359h = title;
        this.i = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Terms)) {
            return false;
        }
        Terms terms = (Terms) obj2;
        return Intrinsics.f(this.f90355a, terms.f90355a) && Intrinsics.f(this.f90356b, terms.f90356b) && Intrinsics.f(this.f90357c, terms.f90357c) && Intrinsics.f(this.d, terms.d) && Intrinsics.f(this.e, terms.e) && Intrinsics.f(this.f, terms.f) && Intrinsics.f(this.f90358g, terms.f90358g) && Intrinsics.f(this.f90359h, terms.f90359h) && Intrinsics.f(this.i, terms.i);
    }

    public final int hashCode() {
        int iHashCode = this.f90355a.hashCode() * 31;
        String str = this.f90356b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90357c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iC = p.a.c(d.g(this.e, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f.f90390a);
        String str4 = this.f90358g;
        int iC2 = p.a.c((iC + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f90359h);
        String str5 = this.i;
        return iC2 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90355a);
        dest.writeString(this.f90356b);
        dest.writeString(this.f90357c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f90358g);
        dest.writeString(this.f90359h);
        dest.writeString(this.i);
    }
}
