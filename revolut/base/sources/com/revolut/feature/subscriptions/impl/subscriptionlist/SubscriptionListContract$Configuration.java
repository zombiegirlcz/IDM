package com.revolut.feature.subscriptions.impl.subscriptionlist;

import android.os.Parcel;
import android.os.Parcelable;
import b9e.b;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subscriptions/impl/subscriptionlist/SubscriptionListContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionListContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubscriptionListContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f89313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecurringPaymentFilter f89315c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            int iE = 0;
            boolean z = parcel.readInt() != 0;
            RecurringPaymentFilter recurringPaymentFilter = (RecurringPaymentFilter) parcel.readParcelable(SubscriptionListContract$Configuration.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            while (iE != i) {
                iE = d.e(SubscriptionListContract$Configuration.class, parcel, linkedHashSet, iE, 1);
            }
            return new SubscriptionListContract$Configuration(bVarValueOf, z, recurringPaymentFilter, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionListContract$Configuration[i];
        }
    }

    public SubscriptionListContract$Configuration(b bVar, boolean z, RecurringPaymentFilter recurringPaymentFilter, Set accountIds) {
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        this.f89313a = bVar;
        this.f89314b = z;
        this.f89315c = recurringPaymentFilter;
        this.d = accountIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionListContract$Configuration)) {
            return false;
        }
        SubscriptionListContract$Configuration subscriptionListContract$Configuration = (SubscriptionListContract$Configuration) obj2;
        return this.f89313a == subscriptionListContract$Configuration.f89313a && this.f89314b == subscriptionListContract$Configuration.f89314b && Intrinsics.f(this.f89315c, subscriptionListContract$Configuration.f89315c) && Intrinsics.f(this.d, subscriptionListContract$Configuration.d);
    }

    public final int hashCode() {
        b bVar = this.f89313a;
        int iC = j6.a.c((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f89314b);
        RecurringPaymentFilter recurringPaymentFilter = this.f89315c;
        return this.d.hashCode() + ((iC + (recurringPaymentFilter != null ? recurringPaymentFilter.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        b bVar = this.f89313a;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeInt(this.f89314b ? 1 : 0);
        dest.writeParcelable(this.f89315c, i);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
