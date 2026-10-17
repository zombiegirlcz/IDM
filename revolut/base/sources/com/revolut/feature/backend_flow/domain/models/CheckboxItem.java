package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CheckboxItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowCheckboxItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class CheckboxItem extends BackendFlowCheckboxItem {

    @NotNull
    public static final Parcelable.Creator<CheckboxItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63350c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f63351g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new CheckboxItem(string, string2, string3, string4, z4, z6, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckboxItem[i];
        }
    }

    public CheckboxItem(String id10, String str, String text, String str2, boolean z, boolean z3, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f63348a = id10;
        this.f63349b = str;
        this.f63350c = text;
        this.d = str2;
        this.e = z;
        this.f = z3;
        this.f63351g = bool;
    }

    public static CheckboxItem T(CheckboxItem checkboxItem, String str, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = checkboxItem.f63348a;
        }
        String id10 = str;
        String str2 = checkboxItem.f63349b;
        String text = checkboxItem.f63350c;
        String str3 = checkboxItem.d;
        if ((i & 32) != 0) {
            z3 = checkboxItem.f;
        }
        Boolean bool = checkboxItem.f63351g;
        checkboxItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new CheckboxItem(id10, str2, text, str3, z, z3, bool);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendFlowCheckboxItem
    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63348a() {
        return this.f63348a;
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
        if (!(obj2 instanceof CheckboxItem)) {
            return false;
        }
        CheckboxItem checkboxItem = (CheckboxItem) obj2;
        return Intrinsics.f(this.f63348a, checkboxItem.f63348a) && Intrinsics.f(this.f63349b, checkboxItem.f63349b) && Intrinsics.f(this.f63350c, checkboxItem.f63350c) && Intrinsics.f(this.d, checkboxItem.d) && this.e == checkboxItem.e && this.f == checkboxItem.f && Intrinsics.f(this.f63351g, checkboxItem.f63351g);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63348a;
    }

    public final int hashCode() {
        int iHashCode = this.f63348a.hashCode() * 31;
        String str = this.f63349b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f63350c);
        String str2 = this.d;
        int iC2 = j6.a.c(j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
        Boolean bool = this.f63351g;
        return iC2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63348a);
        dest.writeString(this.f63349b);
        dest.writeString(this.f63350c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        Boolean bool = this.f63351g;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
