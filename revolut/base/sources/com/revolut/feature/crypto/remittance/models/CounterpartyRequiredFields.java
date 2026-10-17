package com.revolut.feature.crypto.remittance.models;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk5.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/remittance/models/CounterpartyRequiredFields;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CounterpartyRequiredFields implements Parcelable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f70975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f70976b;

    @NotNull
    public static final Parcelable.Creator<CounterpartyRequiredFields> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(c.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                arrayList2.add(c.valueOf(parcel.readString()));
            }
            return new CounterpartyRequiredFields(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CounterpartyRequiredFields[i];
        }
    }

    public CounterpartyRequiredFields(ArrayList individual, ArrayList company) {
        Intrinsics.checkNotNullParameter(individual, "individual");
        Intrinsics.checkNotNullParameter(company, "company");
        this.f70975a = individual;
        this.f70976b = company;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CounterpartyRequiredFields)) {
            return false;
        }
        CounterpartyRequiredFields counterpartyRequiredFields = (CounterpartyRequiredFields) obj2;
        return this.f70975a.equals(counterpartyRequiredFields.f70975a) && this.f70976b.equals(counterpartyRequiredFields.f70976b);
    }

    public final int hashCode() {
        return this.f70976b.hashCode() + (this.f70975a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = a.y(this.f70975a, dest);
        while (itY.hasNext()) {
            dest.writeString(((c) itY.next()).name());
        }
        Iterator itY2 = a.y(this.f70976b, dest);
        while (itY2.hasNext()) {
            dest.writeString(((c) itY2.next()).name());
        }
    }
}
