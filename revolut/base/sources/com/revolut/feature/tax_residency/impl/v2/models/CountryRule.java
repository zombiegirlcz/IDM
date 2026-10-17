package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/CountryRule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryRule implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CountryRule> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f90155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WhereToFindTinHint f90156c;
    public final TinInputFormat d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f90157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90158h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Checkmark.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new CountryRule(z, arrayList, parcel.readInt() == 0 ? null : WhereToFindTinHint.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TinInputFormat.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountryRule[i];
        }
    }

    public CountryRule(boolean z, ArrayList arrayList, WhereToFindTinHint whereToFindTinHint, TinInputFormat tinInputFormat, String tinName, String tinAcronym, String tinInputTitle, String tinInputSubtitle) {
        Intrinsics.checkNotNullParameter(tinName, "tinName");
        Intrinsics.checkNotNullParameter(tinAcronym, "tinAcronym");
        Intrinsics.checkNotNullParameter(tinInputTitle, "tinInputTitle");
        Intrinsics.checkNotNullParameter(tinInputSubtitle, "tinInputSubtitle");
        this.f90154a = z;
        this.f90155b = arrayList;
        this.f90156c = whereToFindTinHint;
        this.d = tinInputFormat;
        this.e = tinName;
        this.f = tinAcronym;
        this.f90157g = tinInputTitle;
        this.f90158h = tinInputSubtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountryRule)) {
            return false;
        }
        CountryRule countryRule = (CountryRule) obj2;
        return this.f90154a == countryRule.f90154a && Intrinsics.f(this.f90155b, countryRule.f90155b) && Intrinsics.f(this.f90156c, countryRule.f90156c) && Intrinsics.f(this.d, countryRule.d) && Intrinsics.f(this.e, countryRule.e) && Intrinsics.f(this.f, countryRule.f) && Intrinsics.f(this.f90157g, countryRule.f90157g) && Intrinsics.f(this.f90158h, countryRule.f90158h);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f90154a) * 31;
        List list = this.f90155b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        WhereToFindTinHint whereToFindTinHint = this.f90156c;
        int iHashCode3 = (iHashCode2 + (whereToFindTinHint == null ? 0 : whereToFindTinHint.hashCode())) * 31;
        TinInputFormat tinInputFormat = this.d;
        return this.f90158h.hashCode() + p.a.c(p.a.c(p.a.c((iHashCode3 + (tinInputFormat != null ? tinInputFormat.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.f90157g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f90154a ? 1 : 0);
        List list = this.f90155b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Checkmark) itQ.next()).writeToParcel(dest, i);
            }
        }
        WhereToFindTinHint whereToFindTinHint = this.f90156c;
        if (whereToFindTinHint == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            whereToFindTinHint.writeToParcel(dest, i);
        }
        TinInputFormat tinInputFormat = this.d;
        if (tinInputFormat == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tinInputFormat.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f90157g);
        dest.writeString(this.f90158h);
    }
}
