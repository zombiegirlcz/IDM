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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CheckboxTextInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowCheckboxItem;", "Lxl2/h0;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class CheckboxTextInputItem extends BackendFlowCheckboxItem implements h0 {

    @NotNull
    public static final Parcelable.Creator<CheckboxTextInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63354c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f63355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ValidationResult f63356h;
    public final CheckboxTextInputItem i;

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
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(CheckboxTextInputItem.class, parcel, arrayList, iE, i);
            }
            return new CheckboxTextInputItem(string, z, z3, string2, string3, string4, arrayList, (ValidationResult) parcel.readParcelable(CheckboxTextInputItem.class.getClassLoader()), parcel.readInt() == 0 ? null : CheckboxTextInputItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckboxTextInputItem[i];
        }
    }

    public CheckboxTextInputItem(String id10, boolean z, boolean z3, String str, String str2, String str3, List validations, ValidationResult validationResult, CheckboxTextInputItem checkboxTextInputItem) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(validations, "validations");
        this.f63352a = id10;
        this.f63353b = z;
        this.f63354c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f63355g = validations;
        this.f63356h = validationResult;
        this.i = checkboxTextInputItem;
    }

    public static CheckboxTextInputItem T(CheckboxTextInputItem checkboxTextInputItem, String str, boolean z, boolean z3, String str2, ValidationResult validationResult, CheckboxTextInputItem checkboxTextInputItem2, int i) {
        if ((i & 1) != 0) {
            str = checkboxTextInputItem.f63352a;
        }
        String id10 = str;
        if ((i & 2) != 0) {
            z = checkboxTextInputItem.f63353b;
        }
        boolean z4 = z;
        boolean z6 = (i & 4) != 0 ? checkboxTextInputItem.f63354c : z3;
        String str3 = checkboxTextInputItem.d;
        String str4 = checkboxTextInputItem.e;
        String str5 = (i & 32) != 0 ? checkboxTextInputItem.f : str2;
        List validations = checkboxTextInputItem.f63355g;
        ValidationResult validationResult2 = (i & 128) != 0 ? checkboxTextInputItem.f63356h : validationResult;
        checkboxTextInputItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(validations, "validations");
        return new CheckboxTextInputItem(id10, z4, z6, str3, str4, str5, validations, validationResult2, checkboxTextInputItem2);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendFlowCheckboxItem
    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getF63354c() {
        return this.f63354c;
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ValidationResult getF63356h() {
        return this.f63356h;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63352a() {
        return this.f63352a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63353b() {
        return this.f63353b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckboxTextInputItem)) {
            return false;
        }
        CheckboxTextInputItem checkboxTextInputItem = (CheckboxTextInputItem) obj2;
        return Intrinsics.f(this.f63352a, checkboxTextInputItem.f63352a) && this.f63353b == checkboxTextInputItem.f63353b && this.f63354c == checkboxTextInputItem.f63354c && Intrinsics.f(this.d, checkboxTextInputItem.d) && Intrinsics.f(this.e, checkboxTextInputItem.e) && Intrinsics.f(this.f, checkboxTextInputItem.f) && Intrinsics.f(this.f63355g, checkboxTextInputItem.f63355g) && Intrinsics.f(this.f63356h, checkboxTextInputItem.f63356h) && Intrinsics.f(this.i, checkboxTextInputItem.i);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63352a;
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f63352a.hashCode() * 31, 31, this.f63353b), 31, this.f63354c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iD = p.a.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f63355g);
        ValidationResult validationResult = this.f63356h;
        int iHashCode3 = (iD + (validationResult == null ? 0 : validationResult.hashCode())) * 31;
        CheckboxTextInputItem checkboxTextInputItem = this.i;
        return iHashCode3 + (checkboxTextInputItem != null ? checkboxTextInputItem.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63352a);
        dest.writeInt(this.f63353b ? 1 : 0);
        dest.writeInt(this.f63354c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Iterator itV = p.a.v(this.f63355g, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f63356h, i);
        CheckboxTextInputItem checkboxTextInputItem = this.i;
        if (checkboxTextInputItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            checkboxTextInputItem.writeToParcel(dest, i);
        }
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getF63355g() {
        return this.f63355g;
    }
}
