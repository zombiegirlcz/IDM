package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.h0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SignatureInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/h0;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignatureInputItem implements InputItem, h0 {

    @NotNull
    public static final Parcelable.Creator<SignatureInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63629c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f63631h;
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ValidationResult f63632j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SignatureInputItem.class, parcel, arrayList, iE, 1);
            }
            boolean z3 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z4 = true;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            return new SignatureInputItem(string, string2, arrayList, z3, string3, string4, string5, z4, boolValueOf, (ValidationResult) parcel.readParcelable(SignatureInputItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignatureInputItem[i];
        }
    }

    public SignatureInputItem(String id10, String str, List validations, boolean z, String str2, String str3, String placeholder, boolean z3, Boolean bool, ValidationResult validationResult) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.f63627a = id10;
        this.f63628b = str;
        this.f63629c = validations;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.f63630g = placeholder;
        this.f63631h = z3;
        this.i = bool;
        this.f63632j = validationResult;
    }

    public static SignatureInputItem d(SignatureInputItem signatureInputItem, String str, boolean z, ValidationResult validationResult, int i) {
        String id10 = signatureInputItem.f63627a;
        if ((i & 2) != 0) {
            str = signatureInputItem.f63628b;
        }
        String str2 = str;
        List validations = signatureInputItem.f63629c;
        boolean z3 = signatureInputItem.d;
        String str3 = signatureInputItem.e;
        String str4 = signatureInputItem.f;
        String placeholder = signatureInputItem.f63630g;
        if ((i & 128) != 0) {
            z = signatureInputItem.f63631h;
        }
        boolean z4 = z;
        Boolean bool = signatureInputItem.i;
        if ((i & 512) != 0) {
            validationResult = signatureInputItem.f63632j;
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        return new SignatureInputItem(id10, str2, validations, z3, str3, str4, placeholder, z4, bool, validationResult);
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ValidationResult getF63632j() {
        return this.f63632j;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63627a() {
        return this.f63627a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getD() {
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
        if (!(obj2 instanceof SignatureInputItem)) {
            return false;
        }
        SignatureInputItem signatureInputItem = (SignatureInputItem) obj2;
        return Intrinsics.f(this.f63627a, signatureInputItem.f63627a) && Intrinsics.f(this.f63628b, signatureInputItem.f63628b) && Intrinsics.f(this.f63629c, signatureInputItem.f63629c) && this.d == signatureInputItem.d && Intrinsics.f(this.e, signatureInputItem.e) && Intrinsics.f(this.f, signatureInputItem.f) && Intrinsics.f(this.f63630g, signatureInputItem.f63630g) && this.f63631h == signatureInputItem.f63631h && Intrinsics.f(this.i, signatureInputItem.i) && Intrinsics.f(this.f63632j, signatureInputItem.f63632j);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63627a;
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final String getF63628b() {
        return this.f63628b;
    }

    public final int hashCode() {
        int iHashCode = this.f63627a.hashCode() * 31;
        String str = this.f63628b;
        int iC = j6.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f63629c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iC2 = j6.a.c(p.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f63630g), 31, this.f63631h);
        Boolean bool = this.i;
        int iHashCode3 = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ValidationResult validationResult = this.f63632j;
        return iHashCode3 + (validationResult != null ? validationResult.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63627a);
        dest.writeString(this.f63628b);
        Iterator itV = p.a.v(this.f63629c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f63630g);
        dest.writeInt(this.f63631h ? 1 : 0);
        Boolean bool = this.i;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeParcelable(this.f63632j, i);
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getF63629c() {
        return this.f63629c;
    }
}
