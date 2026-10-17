package com.revolut.feature.cashback.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/api/models/CashbackBySources;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashbackBySources implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashbackBySources> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f65685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f65686b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CashbackSource.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CashbackBySources(dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashbackBySources[i];
        }
    }

    public CashbackBySources(d total, ArrayList sources) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.f65685a = total;
        this.f65686b = sources;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f65686b) {
            if (!((CashbackSource) obj2).f65688a.k()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final boolean b(uc3.d cashbackSourceType) {
        Object next;
        Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
        Iterator it8 = this.f65686b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((CashbackSource) next).f65689b == cashbackSourceType) {
                break;
            }
        }
        CashbackSource cashbackSource = (CashbackSource) next;
        return cashbackSource != null && cashbackSource.f65690c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashbackBySources)) {
            return false;
        }
        CashbackBySources cashbackBySources = (CashbackBySources) obj2;
        return Intrinsics.f(this.f65685a, cashbackBySources.f65685a) && this.f65686b.equals(cashbackBySources.f65686b);
    }

    public final int hashCode() {
        return this.f65686b.hashCode() + (this.f65685a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f65685a);
        Iterator itY = j6.a.y(this.f65686b, dest);
        while (itY.hasNext()) {
            ((CashbackSource) itY.next()).writeToParcel(dest, i);
        }
    }
}
