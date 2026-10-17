package com.revolut.domain.models.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BeneficiarySearchListSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiarySearchListSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BeneficiarySearchListSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60298c;
    public final Map d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new BeneficiarySearchListSource(string, string2, string3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BeneficiarySearchListSource[i];
        }
    }

    public BeneficiarySearchListSource(String name, String str, String str2, Map values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f60296a = name;
        this.f60297b = str;
        this.f60298c = str2;
        this.d = values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BeneficiarySearchListSource)) {
            return false;
        }
        BeneficiarySearchListSource beneficiarySearchListSource = (BeneficiarySearchListSource) obj2;
        return Intrinsics.f(this.f60296a, beneficiarySearchListSource.f60296a) && Intrinsics.f(this.f60297b, beneficiarySearchListSource.f60297b) && Intrinsics.f(this.f60298c, beneficiarySearchListSource.f60298c) && Intrinsics.f(this.d, beneficiarySearchListSource.d);
    }

    public final int hashCode() {
        int iHashCode = this.f60296a.hashCode() * 31;
        String str = this.f60297b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60298c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60296a);
        dest.writeString(this.f60297b);
        dest.writeString(this.f60298c);
        Iterator itZ = j6.a.z(this.d, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
