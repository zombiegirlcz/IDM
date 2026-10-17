package com.revolut.retail.feature.esim.impl.repositories.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/repositories/model/EsimPhoneNumberPortingOwnerAccountTypeRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingOwnerAccountTypeRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingOwnerAccountTypeRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f100586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f100587b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            t0 t0VarValueOf = t0.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingAttributeRequest.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new EsimPhoneNumberPortingOwnerAccountTypeRequest(t0VarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingOwnerAccountTypeRequest[i];
        }
    }

    public EsimPhoneNumberPortingOwnerAccountTypeRequest(t0 type, List list) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f100586a = type;
        this.f100587b = list;
    }

    public static EsimPhoneNumberPortingOwnerAccountTypeRequest a(EsimPhoneNumberPortingOwnerAccountTypeRequest esimPhoneNumberPortingOwnerAccountTypeRequest, ArrayList arrayList) {
        t0 type = esimPhoneNumberPortingOwnerAccountTypeRequest.f100586a;
        esimPhoneNumberPortingOwnerAccountTypeRequest.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return new EsimPhoneNumberPortingOwnerAccountTypeRequest(type, arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingOwnerAccountTypeRequest)) {
            return false;
        }
        EsimPhoneNumberPortingOwnerAccountTypeRequest esimPhoneNumberPortingOwnerAccountTypeRequest = (EsimPhoneNumberPortingOwnerAccountTypeRequest) obj2;
        return this.f100586a == esimPhoneNumberPortingOwnerAccountTypeRequest.f100586a && Intrinsics.f(this.f100587b, esimPhoneNumberPortingOwnerAccountTypeRequest.f100587b);
    }

    public final int hashCode() {
        int iHashCode = this.f100586a.hashCode() * 31;
        List list = this.f100587b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100586a.name());
        List list = this.f100587b;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((EsimPhoneNumberPortingAttributeRequest) itQ.next()).writeToParcel(dest, i);
        }
    }
}
