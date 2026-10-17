package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.e0;
import xl2.f0;
import xl2.h0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/TextInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/h0;", "", "toString", "()Ljava/lang/String;", "xl2/f0", "xl2/e0", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextInputItem implements InputItem, h0 {

    @NotNull
    public static final Parcelable.Creator<TextInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63680c;
    public final String d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f63682h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f63683j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f63684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f63685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ValidationResult f63686n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f63687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e0 f63688q;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            e0 e0Var;
            boolean z3;
            boolean z4;
            f0 f0Var;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TextInputItem.class, parcel, arrayList, iE, 1);
            }
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                cls = TextInputItem.class;
                z = true;
            } else {
                cls = TextInputItem.class;
                z = false;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                e0Var = null;
                z3 = true;
            } else {
                e0Var = null;
                z3 = false;
            }
            Integer num = numValueOf;
            Integer num2 = numValueOf2;
            String string5 = parcel.readString();
            e0 e0Var2 = e0Var;
            String string6 = parcel.readString();
            f0 f0VarValueOf = f0.valueOf(parcel.readString());
            ValidationResult validationResult = (ValidationResult) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = true;
                f0Var = f0VarValueOf;
                z6 = true;
            } else {
                z4 = true;
                f0Var = f0VarValueOf;
                z6 = false;
            }
            if (parcel.readInt() == 0) {
                z4 = false;
            }
            return new TextInputItem(string, string2, string3, string4, arrayList, z11, z, num, num2, z3, string5, string6, f0Var, validationResult, z6, z4, parcel.readInt() == 0 ? e0Var2 : e0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextInputItem[i];
        }
    }

    public TextInputItem(String id10, String hint, String str, String str2, List validations, boolean z, boolean z3, Integer num, Integer num2, boolean z4, String str3, String str4, f0 textTransformation, ValidationResult validationResult, boolean z6, boolean z11, e0 e0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(textTransformation, "textTransformation");
        this.f63678a = id10;
        this.f63679b = hint;
        this.f63680c = str;
        this.d = str2;
        this.e = validations;
        this.f = z;
        this.f63681g = z3;
        this.f63682h = num;
        this.i = num2;
        this.f63683j = z4;
        this.k = str3;
        this.f63684l = str4;
        this.f63685m = textTransformation;
        this.f63686n = validationResult;
        this.o = z6;
        this.f63687p = z11;
        this.f63688q = e0Var;
    }

    public static TextInputItem d(TextInputItem textInputItem, String str, boolean z, ValidationResult validationResult, boolean z3, int i) {
        String id10 = textInputItem.f63678a;
        String hint = textInputItem.f63679b;
        String str2 = textInputItem.f63680c;
        String str3 = (i & 8) != 0 ? textInputItem.d : str;
        List validations = textInputItem.e;
        boolean z4 = textInputItem.f;
        boolean z6 = (i & 64) != 0 ? textInputItem.f63681g : z;
        Integer num = textInputItem.f63682h;
        boolean z11 = z6;
        Integer num2 = textInputItem.i;
        boolean z12 = textInputItem.f63683j;
        String str4 = textInputItem.k;
        String str5 = textInputItem.f63684l;
        f0 textTransformation = textInputItem.f63685m;
        ValidationResult validationResult2 = (i & 8192) != 0 ? textInputItem.f63686n : validationResult;
        boolean z29 = (i & 16384) != 0 ? textInputItem.o : z3;
        boolean z31 = textInputItem.f63687p;
        e0 e0Var = textInputItem.f63688q;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(textTransformation, "textTransformation");
        return new TextInputItem(id10, hint, str2, str3, validations, z4, z11, num, num2, z12, str4, str5, textTransformation, validationResult2, z29, z31, e0Var);
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ValidationResult getF63686n() {
        return this.f63686n;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63678a() {
        return this.f63678a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextInputItem)) {
            return false;
        }
        TextInputItem textInputItem = (TextInputItem) obj2;
        return Intrinsics.f(this.f63678a, textInputItem.f63678a) && Intrinsics.f(this.f63679b, textInputItem.f63679b) && Intrinsics.f(this.f63680c, textInputItem.f63680c) && Intrinsics.f(this.d, textInputItem.d) && Intrinsics.f(this.e, textInputItem.e) && this.f == textInputItem.f && this.f63681g == textInputItem.f63681g && Intrinsics.f(this.f63682h, textInputItem.f63682h) && Intrinsics.f(this.i, textInputItem.i) && this.f63683j == textInputItem.f63683j && Intrinsics.f(this.k, textInputItem.k) && Intrinsics.f(this.f63684l, textInputItem.f63684l) && this.f63685m == textInputItem.f63685m && Intrinsics.f(this.f63686n, textInputItem.f63686n) && this.o == textInputItem.o && this.f63687p == textInputItem.f63687p && this.f63688q == textInputItem.f63688q;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63678a;
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63678a.hashCode() * 31, 31, this.f63679b);
        String str = this.f63680c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iC2 = j6.a.c(j6.a.c(p.a.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f63681g);
        Integer num = this.f63682h;
        int iHashCode2 = (iC2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iC3 = j6.a.c((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f63683j);
        String str3 = this.k;
        int iHashCode3 = (iC3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f63684l;
        int iHashCode4 = (this.f63685m.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        ValidationResult validationResult = this.f63686n;
        int iC4 = j6.a.c(j6.a.c((iHashCode4 + (validationResult == null ? 0 : validationResult.hashCode())) * 31, 31, this.o), 31, this.f63687p);
        e0 e0Var = this.f63688q;
        return iC4 + (e0Var != null ? e0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63678a);
        dest.writeString(this.f63679b);
        dest.writeString(this.f63680c);
        dest.writeString(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f63681g ? 1 : 0);
        Integer num = this.f63682h;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.i;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeInt(this.f63683j ? 1 : 0);
        dest.writeString(this.k);
        dest.writeString(this.f63684l);
        dest.writeString(this.f63685m.name());
        dest.writeParcelable(this.f63686n, i);
        dest.writeInt(this.o ? 1 : 0);
        dest.writeInt(this.f63687p ? 1 : 0);
        e0 e0Var = this.f63688q;
        if (e0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(e0Var.name());
        }
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getE() {
        return this.e;
    }
}
