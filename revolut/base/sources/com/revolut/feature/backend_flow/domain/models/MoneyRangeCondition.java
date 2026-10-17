package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MoneyRangeCondition;", "Lcom/revolut/feature/backend_flow/domain/models/Condition;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRangeCondition extends Condition {

    @NotNull
    public static final Parcelable.Creator<MoneyRangeCondition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f63537c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new MoneyRangeCondition(j2, j3, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRangeCondition[i];
        }
    }

    public MoneyRangeCondition(long j2, long j3, String itemId, ArrayList currencies) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f63535a = itemId;
        this.f63536b = j2;
        this.f63537c = j3;
        this.d = currencies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRangeCondition)) {
            return false;
        }
        MoneyRangeCondition moneyRangeCondition = (MoneyRangeCondition) obj2;
        return Intrinsics.f(this.f63535a, moneyRangeCondition.f63535a) && this.f63536b == moneyRangeCondition.f63536b && this.f63537c == moneyRangeCondition.f63537c && this.d.equals(moneyRangeCondition.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.d.c(a0.d.c(this.f63535a.hashCode() * 31, 31, this.f63536b), 31, this.f63537c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63535a);
        dest.writeLong(this.f63536b);
        dest.writeLong(this.f63537c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
    }
}
