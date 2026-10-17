package com.revolut.feature.payments.bills_chooser.impl.domain;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/domain/SplitBillItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SplitBillItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79227c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new SplitBillItem(string, string2, j2, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillItem[i];
        }
    }

    public SplitBillItem(String id10, String name, long j2, Set assignedMemberIds) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(assignedMemberIds, "assignedMemberIds");
        this.f79225a = id10;
        this.f79226b = name;
        this.f79227c = j2;
        this.d = assignedMemberIds;
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
        return Intrinsics.f(this.f79225a, splitBillItem.f79225a) && Intrinsics.f(this.f79226b, splitBillItem.f79226b) && this.f79227c == splitBillItem.f79227c && Intrinsics.f(this.d, splitBillItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.c(p.a.c(this.f79225a.hashCode() * 31, 31, this.f79226b), 31, this.f79227c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79225a);
        dest.writeString(this.f79226b);
        dest.writeLong(this.f79227c);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }

    public SplitBillItem(String str, String str2, long j2) {
        this(str, str2, j2, h0.f322473a);
    }
}
