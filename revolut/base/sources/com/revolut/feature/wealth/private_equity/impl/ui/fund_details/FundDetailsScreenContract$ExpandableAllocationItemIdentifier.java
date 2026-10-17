package com.revolut.feature.wealth.private_equity.impl.ui.fund_details;

import android.os.Parcel;
import android.os.Parcelable;
import jel.l0;
import jel.u0;
import jel.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier", "Landroid/os/Parcelable;", "Asset", "Strategy", "Sector", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier$Asset;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier$Sector;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier$Strategy;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FundDetailsScreenContract$ExpandableAllocationItemIdentifier extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier$Asset;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Asset implements FundDetailsScreenContract$ExpandableAllocationItemIdentifier {

        @NotNull
        public static final Parcelable.Creator<Asset> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f95759a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Asset(v.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Asset[i];
            }
        }

        public Asset(v identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f95759a = identifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Asset) && this.f95759a == ((Asset) obj2).f95759a;
        }

        public final int hashCode() {
            return this.f95759a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95759a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier$Sector;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Sector implements FundDetailsScreenContract$ExpandableAllocationItemIdentifier {

        @NotNull
        public static final Parcelable.Creator<Sector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f95760a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sector(parcel.readInt() == 0 ? null : u0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sector[i];
            }
        }

        public Sector(u0 u0Var) {
            this.f95760a = u0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Sector) && this.f95760a == ((Sector) obj2).f95760a;
        }

        public final int hashCode() {
            u0 u0Var = this.f95760a;
            if (u0Var == null) {
                return 0;
            }
            return u0Var.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            u0 u0Var = this.f95760a;
            if (u0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(u0Var.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier$Strategy;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ExpandableAllocationItemIdentifier;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Strategy implements FundDetailsScreenContract$ExpandableAllocationItemIdentifier {

        @NotNull
        public static final Parcelable.Creator<Strategy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f95761a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Strategy(l0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Strategy[i];
            }
        }

        public Strategy(l0 identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f95761a = identifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Strategy) && this.f95761a == ((Strategy) obj2).f95761a;
        }

        public final int hashCode() {
            return this.f95761a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95761a.name());
        }
    }
}
