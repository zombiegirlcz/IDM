package com.revolut.feature.payments.groups.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/models/GroupAnalytics;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupAnalytics implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupAnalytics> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f79497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f79498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f79499c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(GroupCurrencySpend.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(GroupCurrencySpend.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new GroupAnalytics(dVar, dVar2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupAnalytics[i];
        }
    }

    public GroupAnalytics(d totalSpentByGroup, d totalSpentByCurrentMember, List totalSpentByGroupByCurrency, List totalSpentByCurrentMemberByCurrency) {
        Intrinsics.checkNotNullParameter(totalSpentByGroup, "totalSpentByGroup");
        Intrinsics.checkNotNullParameter(totalSpentByCurrentMember, "totalSpentByCurrentMember");
        Intrinsics.checkNotNullParameter(totalSpentByGroupByCurrency, "totalSpentByGroupByCurrency");
        Intrinsics.checkNotNullParameter(totalSpentByCurrentMemberByCurrency, "totalSpentByCurrentMemberByCurrency");
        this.f79497a = totalSpentByGroup;
        this.f79498b = totalSpentByCurrentMember;
        this.f79499c = totalSpentByGroupByCurrency;
        this.d = totalSpentByCurrentMemberByCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupAnalytics)) {
            return false;
        }
        GroupAnalytics groupAnalytics = (GroupAnalytics) obj2;
        return Intrinsics.f(this.f79497a, groupAnalytics.f79497a) && Intrinsics.f(this.f79498b, groupAnalytics.f79498b) && Intrinsics.f(this.f79499c, groupAnalytics.f79499c) && Intrinsics.f(this.d, groupAnalytics.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(v7.c(this.f79497a.hashCode() * 31, 31, this.f79498b), 31, this.f79499c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79497a);
        dest.writeSerializable(this.f79498b);
        Iterator itV = p.a.v(this.f79499c, dest);
        while (itV.hasNext()) {
            ((GroupCurrencySpend) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            ((GroupCurrencySpend) itV2.next()).writeToParcel(dest, i);
        }
    }
}
