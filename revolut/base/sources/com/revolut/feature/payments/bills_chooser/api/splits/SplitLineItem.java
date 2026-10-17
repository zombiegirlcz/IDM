package com.revolut.feature.payments.bills_chooser.api.splits;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitLineItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitLineItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SplitLineItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79214c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            long j2 = parcel.readLong();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SplitLineItem.class, parcel, arrayList, iE, 1);
            }
            return new SplitLineItem(string, j2, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitLineItem[i];
        }
    }

    public SplitLineItem(String name, long j2, String currency, List payers) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(payers, "payers");
        this.f79212a = name;
        this.f79213b = j2;
        this.f79214c = currency;
        this.d = payers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitLineItem)) {
            return false;
        }
        SplitLineItem splitLineItem = (SplitLineItem) obj2;
        return Intrinsics.f(this.f79212a, splitLineItem.f79212a) && this.f79213b == splitLineItem.f79213b && Intrinsics.f(this.f79214c, splitLineItem.f79214c) && Intrinsics.f(this.d, splitLineItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(d.c(this.f79212a.hashCode() * 31, 31, this.f79213b), 31, this.f79214c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79212a);
        dest.writeLong(this.f79213b);
        dest.writeString(this.f79214c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
