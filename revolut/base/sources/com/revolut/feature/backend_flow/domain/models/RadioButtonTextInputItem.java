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
import xl2.l;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/RadioButtonTextInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/l;", "Lxl2/h0;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class RadioButtonTextInputItem implements InputItem, l, h0 {

    @NotNull
    public static final Parcelable.Creator<RadioButtonTextInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f63595c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f63597h;
    public final ValidationResult i;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iE = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(RadioButtonTextInputItem.class, parcel, arrayList, iE, i);
            }
            return new RadioButtonTextInputItem(string, z, numValueOf, z3, string2, string3, string4, arrayList, (ValidationResult) parcel.readParcelable(RadioButtonTextInputItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RadioButtonTextInputItem[i];
        }
    }

    public RadioButtonTextInputItem(String id10, boolean z, Integer num, boolean z3, String str, String str2, String str3, List validations, ValidationResult validationResult) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(validations, "validations");
        this.f63593a = id10;
        this.f63594b = z;
        this.f63595c = num;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.f63596g = str3;
        this.f63597h = validations;
        this.i = validationResult;
    }

    public static RadioButtonTextInputItem J(RadioButtonTextInputItem radioButtonTextInputItem, boolean z, String str, ValidationResult validationResult, int i) {
        String id10 = radioButtonTextInputItem.f63593a;
        boolean z3 = radioButtonTextInputItem.f63594b;
        Integer num = radioButtonTextInputItem.f63595c;
        if ((i & 8) != 0) {
            z = radioButtonTextInputItem.d;
        }
        boolean z4 = z;
        String str2 = radioButtonTextInputItem.e;
        String str3 = radioButtonTextInputItem.f;
        if ((i & 64) != 0) {
            str = radioButtonTextInputItem.f63596g;
        }
        String str4 = str;
        List validations = radioButtonTextInputItem.f63597h;
        if ((i & 256) != 0) {
            validationResult = radioButtonTextInputItem.i;
        }
        radioButtonTextInputItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(validations, "validations");
        return new RadioButtonTextInputItem(id10, z3, num, z4, str2, str3, str4, validations, validationResult);
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ValidationResult getI() {
        return this.i;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63593a() {
        return this.f63593a;
    }

    @Override // xl2.l
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getF63595c() {
        return this.f63595c;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63594b() {
        return this.f63594b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RadioButtonTextInputItem)) {
            return false;
        }
        RadioButtonTextInputItem radioButtonTextInputItem = (RadioButtonTextInputItem) obj2;
        return Intrinsics.f(this.f63593a, radioButtonTextInputItem.f63593a) && this.f63594b == radioButtonTextInputItem.f63594b && Intrinsics.f(this.f63595c, radioButtonTextInputItem.f63595c) && this.d == radioButtonTextInputItem.d && Intrinsics.f(this.e, radioButtonTextInputItem.e) && Intrinsics.f(this.f, radioButtonTextInputItem.f) && Intrinsics.f(this.f63596g, radioButtonTextInputItem.f63596g) && Intrinsics.f(this.f63597h, radioButtonTextInputItem.f63597h) && Intrinsics.f(this.i, radioButtonTextInputItem.i);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63593a;
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final String getF63596g() {
        return this.f63596g;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63593a.hashCode() * 31, 31, this.f63594b);
        Integer num = this.f63595c;
        int iC2 = j6.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63596g;
        int iD = p.a.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f63597h);
        ValidationResult validationResult = this.i;
        return iD + (validationResult != null ? validationResult.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63593a);
        dest.writeInt(this.f63594b ? 1 : 0);
        Integer num = this.f63595c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f63596g);
        Iterator itV = p.a.v(this.f63597h, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.i, i);
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getF63597h() {
        return this.f63597h;
    }
}
