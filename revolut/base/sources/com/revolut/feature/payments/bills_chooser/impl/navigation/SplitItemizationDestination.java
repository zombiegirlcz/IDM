package com.revolut.feature.payments.bills_chooser.impl.navigation;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/navigation/SplitItemizationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "SplitBillItem", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitItemizationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SplitItemizationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f79228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79230c;
    public final ArrayList d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/navigation/SplitItemizationDestination$SplitBillItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SplitBillItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SplitBillItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f79233c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplitBillItem(parcel.readString(), parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitBillItem[i];
            }
        }

        public SplitBillItem(String id10, String name, long j2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f79231a = id10;
            this.f79232b = name;
            this.f79233c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SplitBillItem)) {
                return false;
            }
            SplitBillItem splitBillItem = (SplitBillItem) obj2;
            return Intrinsics.f(this.f79231a, splitBillItem.f79231a) && Intrinsics.f(this.f79232b, splitBillItem.f79232b) && this.f79233c == splitBillItem.f79233c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f79233c) + p.a.c(this.f79231a.hashCode() * 31, 31, this.f79232b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79231a);
            dest.writeString(this.f79232b);
            dest.writeLong(this.f79233c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            long j2 = parcel.readLong();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SplitBillItem.CREATOR, parcel, arrayList, iA, i);
            }
            return new SplitItemizationDestination(bVar, j2, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitItemizationDestination[i];
        }
    }

    public SplitItemizationDestination(b currency, long j2, boolean z, ArrayList items) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f79228a = currency;
        this.f79229b = j2;
        this.f79230c = z;
        this.d = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitItemizationDestination)) {
            return false;
        }
        SplitItemizationDestination splitItemizationDestination = (SplitItemizationDestination) obj2;
        return Intrinsics.f(this.f79228a, splitItemizationDestination.f79228a) && this.f79229b == splitItemizationDestination.f79229b && this.f79230c == splitItemizationDestination.f79230c && this.d.equals(splitItemizationDestination.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(d.c(this.f79228a.hashCode() * 31, 31, this.f79229b), 31, this.f79230c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79228a);
        dest.writeLong(this.f79229b);
        dest.writeInt(this.f79230c ? 1 : 0);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((SplitBillItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
