package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACCancellationReason;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACCancellationReason implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACCancellationReason> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74969c;
    public final List d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CFACCancellationReason.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new CFACCancellationReason(string, string2, string3, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACCancellationReason[i];
        }
    }

    public CFACCancellationReason(String type, String code, String name, String str, List list) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f74967a = type;
        this.f74968b = code;
        this.f74969c = name;
        this.d = list;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACCancellationReason)) {
            return false;
        }
        CFACCancellationReason cFACCancellationReason = (CFACCancellationReason) obj2;
        return Intrinsics.f(this.f74967a, cFACCancellationReason.f74967a) && Intrinsics.f(this.f74968b, cFACCancellationReason.f74968b) && Intrinsics.f(this.f74969c, cFACCancellationReason.f74969c) && Intrinsics.f(this.d, cFACCancellationReason.d) && Intrinsics.f(this.e, cFACCancellationReason.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f74967a.hashCode() * 31, 31, this.f74968b), 31, this.f74969c);
        List list = this.d;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74967a);
        dest.writeString(this.f74968b);
        dest.writeString(this.f74969c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((CFACCancellationReason) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.e);
    }
}
