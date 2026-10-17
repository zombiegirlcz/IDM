package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.v6;
import tof.y6;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACClaimTransactions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "EligibleTransaction", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimTransactions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimTransactions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f74976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f74977b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACClaimTransactions$EligibleTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Direction", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EligibleTransaction implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EligibleTransaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y6 f74978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v6 f74979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Direction f74980c;
        public final Boolean d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACClaimTransactions$EligibleTransaction$Direction;", "Landroid/os/Parcelable;", "", "IN", "OUT", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Direction implements Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Direction[] $VALUES;

            @NotNull
            public static final Parcelable.Creator<Direction> CREATOR;
            public static final Direction IN;
            public static final Direction OUT;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return Direction.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Direction[i];
                }
            }

            static {
                Direction direction = new Direction("IN", 0);
                IN = direction;
                Direction direction2 = new Direction("OUT", 1);
                OUT = direction2;
                Direction[] directionArr = {direction, direction2};
                $VALUES = directionArr;
                $ENTRIES = s.n(directionArr);
                CREATOR = new a();
            }

            public static Direction valueOf(String str) {
                return (Direction) Enum.valueOf(Direction.class, str);
            }

            public static Direction[] values() {
                return (Direction[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                y6 y6VarValueOf = y6.valueOf(parcel.readString());
                v6 v6VarValueOf = v6.valueOf(parcel.readString());
                Direction directionCreateFromParcel = Direction.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new EligibleTransaction(y6VarValueOf, v6VarValueOf, directionCreateFromParcel, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EligibleTransaction[i];
            }
        }

        public EligibleTransaction(y6 type, v6 state, Direction direction, Boolean bool) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f74978a = type;
            this.f74979b = state;
            this.f74980c = direction;
            this.d = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EligibleTransaction)) {
                return false;
            }
            EligibleTransaction eligibleTransaction = (EligibleTransaction) obj2;
            return this.f74978a == eligibleTransaction.f74978a && this.f74979b == eligibleTransaction.f74979b && this.f74980c == eligibleTransaction.f74980c && Intrinsics.f(this.d, eligibleTransaction.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f74980c.hashCode() + ((this.f74979b.hashCode() + (this.f74978a.hashCode() * 31)) * 31)) * 31;
            Boolean bool = this.d;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74978a.name());
            dest.writeString(this.f74979b.name());
            this.f74980c.writeToParcel(dest, i);
            Boolean bool = this.d;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EligibleTransaction.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CFACClaimTransactions(j2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimTransactions[i];
        }
    }

    public CFACClaimTransactions(long j2, ArrayList eligibleTransactions) {
        Intrinsics.checkNotNullParameter(eligibleTransactions, "eligibleTransactions");
        this.f74976a = j2;
        this.f74977b = eligibleTransactions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimTransactions)) {
            return false;
        }
        CFACClaimTransactions cFACClaimTransactions = (CFACClaimTransactions) obj2;
        return this.f74976a == cFACClaimTransactions.f74976a && this.f74977b.equals(cFACClaimTransactions.f74977b);
    }

    public final int hashCode() {
        return this.f74977b.hashCode() + (Long.hashCode(this.f74976a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f74976a);
        Iterator itY = j6.a.y(this.f74977b, dest);
        while (itY.hasNext()) {
            ((EligibleTransaction) itY.next()).writeToParcel(dest, i);
        }
    }
}
