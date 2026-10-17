package com.revolut.feature.apm.core.models.alias.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/beneficiary/AliasMerchant;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AliasMerchant implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AliasMerchant> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61902c;
    public final String d;
    public final String e;
    public final Boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AliasMerchant(string, string2, boolValueOf, string3, string4, string5);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AliasMerchant[i];
        }
    }

    public AliasMerchant(String id10, String scheme, Boolean bool, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.f61900a = id10;
        this.f61901b = scheme;
        this.f61902c = str;
        this.d = str2;
        this.e = str3;
        this.f = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AliasMerchant)) {
            return false;
        }
        AliasMerchant aliasMerchant = (AliasMerchant) obj2;
        return Intrinsics.f(this.f61900a, aliasMerchant.f61900a) && Intrinsics.f(this.f61901b, aliasMerchant.f61901b) && Intrinsics.f(this.f61902c, aliasMerchant.f61902c) && Intrinsics.f(this.d, aliasMerchant.d) && Intrinsics.f(this.e, aliasMerchant.e) && Intrinsics.f(this.f, aliasMerchant.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f61900a.hashCode() * 31, 31, this.f61901b);
        String str = this.f61902c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61900a);
        dest.writeString(this.f61901b);
        dest.writeString(this.f61902c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        Boolean bool = this.f;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
