package com.revolut.feature.rev_points.api.extension.earning_rates;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.rev_points.models.RevPointsEarningBreakdown;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev_points/api/extension/earning_rates/RevPointsEarningRateAggregate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "PlanInfo", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsEarningRateAggregate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsEarningRateAggregate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsEarningBreakdown f83473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanInfo f83474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83475c;
    public final Map d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/extension/earning_rates/RevPointsEarningRateAggregate$PlanInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PlanInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f83476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83477b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanInfo((Clause) parcel.readParcelable(PlanInfo.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanInfo[i];
            }
        }

        public PlanInfo(Clause title, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f83476a = title;
            this.f83477b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanInfo)) {
                return false;
            }
            PlanInfo planInfo = (PlanInfo) obj2;
            return Intrinsics.f(this.f83476a, planInfo.f83476a) && this.f83477b == planInfo.f83477b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83477b) + (this.f83476a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83476a, i);
            dest.writeInt(this.f83477b ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            RevPointsEarningBreakdown revPointsEarningBreakdown = (RevPointsEarningBreakdown) j6.a.f(parcel, "parcel", RevPointsEarningRateAggregate.class);
            LinkedHashMap linkedHashMap = null;
            PlanInfo planInfoCreateFromParcel = parcel.readInt() == 0 ? null : PlanInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(f1.valueOf(parcel.readString()), parcel.readParcelable(RevPointsEarningRateAggregate.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new RevPointsEarningRateAggregate(revPointsEarningBreakdown, planInfoCreateFromParcel, string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsEarningRateAggregate[i];
        }
    }

    public RevPointsEarningRateAggregate(RevPointsEarningBreakdown revPointsEarningBreakdown, PlanInfo planInfo, String str, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(revPointsEarningBreakdown, "revPointsEarningBreakdown");
        this.f83473a = revPointsEarningBreakdown;
        this.f83474b = planInfo;
        this.f83475c = str;
        this.d = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsEarningRateAggregate)) {
            return false;
        }
        RevPointsEarningRateAggregate revPointsEarningRateAggregate = (RevPointsEarningRateAggregate) obj2;
        return Intrinsics.f(this.f83473a, revPointsEarningRateAggregate.f83473a) && Intrinsics.f(this.f83474b, revPointsEarningRateAggregate.f83474b) && Intrinsics.f(this.f83475c, revPointsEarningRateAggregate.f83475c) && Intrinsics.f(this.d, revPointsEarningRateAggregate.d);
    }

    public final int hashCode() {
        int iHashCode = this.f83473a.hashCode() * 31;
        PlanInfo planInfo = this.f83474b;
        int iHashCode2 = (iHashCode + (planInfo == null ? 0 : planInfo.hashCode())) * 31;
        String str = this.f83475c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.d;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83473a, i);
        PlanInfo planInfo = this.f83474b;
        if (planInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            planInfo.writeToParcel(dest, i);
        }
        dest.writeString(this.f83475c);
        Map map = this.d;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry = (Map.Entry) itV.next();
            dest.writeString(((f1) entry.getKey()).name());
            dest.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
