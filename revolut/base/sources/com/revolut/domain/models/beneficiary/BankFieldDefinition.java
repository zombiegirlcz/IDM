package com.revolut.domain.models.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import n61.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BankFieldDefinition;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankFieldDefinition implements Serializable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<BankFieldDefinition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankFieldFormat f60273c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f60274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f60275h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f60276j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f60277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f60278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f60279n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f60280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f60281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f60282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f60283s;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Boolean boolValueOf;
            Boolean bool;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            BankFieldFormat bankFieldFormatValueOf = BankFieldFormat.valueOf(parcel.readString());
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string3 = parcel.readString();
            boolean z11 = z3;
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z11 : z);
            }
            if (parcel.readInt() != 0) {
                Boolean bool2 = boolValueOf;
                z4 = z11;
                bool = bool2;
            } else {
                bool = boolValueOf;
                z4 = z;
            }
            return new BankFieldDefinition(string, string2, bankFieldFormatValueOf, z6, string3, string4, arrayListCreateStringArrayList, bool, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankFieldDefinition[i];
        }
    }

    public BankFieldDefinition(String type, String regex, BankFieldFormat format, boolean z, String str, String str2, ArrayList arrayList, Boolean bool, boolean z3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f60271a = type;
        this.f60272b = regex;
        this.f60273c = format;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.f60274g = arrayList;
        this.f60275h = bool;
        this.i = z3;
        this.f60276j = "BIC".equalsIgnoreCase(type);
        this.k = "IBAN".equalsIgnoreCase(type);
        this.f60277l = "EMAIL".equalsIgnoreCase(type);
        this.f60278m = "IFSC".equalsIgnoreCase(type);
        this.f60279n = "RFC_CURP".equalsIgnoreCase(type);
        this.o = "MSISDN".equalsIgnoreCase(type);
        this.f60280p = "COLOMBIA_ACH_ACCOUNT_TYPE".equalsIgnoreCase(type);
        this.f60281q = format == BankFieldFormat.DROPDOWN;
        this.f60282r = format == BankFieldFormat.SEARCH_LIST;
        this.f60283s = d.I(j.f212688a, type);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankFieldDefinition)) {
            return false;
        }
        BankFieldDefinition bankFieldDefinition = (BankFieldDefinition) obj2;
        return Intrinsics.f(this.f60271a, bankFieldDefinition.f60271a) && Intrinsics.f(this.f60272b, bankFieldDefinition.f60272b) && this.f60273c == bankFieldDefinition.f60273c && this.d == bankFieldDefinition.d && Intrinsics.f(this.e, bankFieldDefinition.e) && Intrinsics.f(this.f, bankFieldDefinition.f) && Intrinsics.f(this.f60274g, bankFieldDefinition.f60274g) && Intrinsics.f(this.f60275h, bankFieldDefinition.f60275h) && this.i == bankFieldDefinition.i;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f60273c.hashCode() + p.a.c(this.f60271a.hashCode() * 31, 31, this.f60272b)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f60274g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f60275h;
        return Boolean.hashCode(this.i) + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60271a);
        dest.writeString(this.f60272b);
        dest.writeString(this.f60273c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeStringList(this.f60274g);
        Boolean bool = this.f60275h;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeInt(this.i ? 1 : 0);
    }
}
