package com.revolut.feature.trading_orders.api.ui.list;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$Disclaimers", "Landroid/os/Parcelable;", "Custom", "None", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$Disclaimers$Custom;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$Disclaimers$None;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestOrdersListFeatureContract$Disclaimers extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$Disclaimers$Custom;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$Disclaimers;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom implements InvestOrdersListFeatureContract$Disclaimers {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f91747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f91748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f91749c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(boolean z, boolean z3, boolean z4) {
            this.f91747a = z;
            this.f91748b = z3;
            this.f91749c = z4;
        }

        @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers
        /* JADX INFO: renamed from: E1, reason: from getter */
        public final boolean getF91749c() {
            return this.f91749c;
        }

        @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers
        /* JADX INFO: renamed from: d1, reason: from getter */
        public final boolean getF91747a() {
            return this.f91747a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj2;
            return this.f91747a == custom.f91747a && this.f91748b == custom.f91748b && this.f91749c == custom.f91749c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f91749c) + j6.a.c(Boolean.hashCode(this.f91747a) * 31, 31, this.f91748b);
        }

        @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers
        /* JADX INFO: renamed from: s4, reason: from getter */
        public final boolean getF91748b() {
            return this.f91748b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f91747a ? 1 : 0);
            dest.writeInt(this.f91748b ? 1 : 0);
            dest.writeInt(this.f91749c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$Disclaimers$None;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$Disclaimers;", "<init>", "()V", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None implements InvestOrdersListFeatureContract$Disclaimers {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f91750a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f91750a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: E1 */
    default boolean getF91749c() {
        return false;
    }

    /* JADX INFO: renamed from: d1 */
    default boolean getF91747a() {
        return false;
    }

    /* JADX INFO: renamed from: s4 */
    default boolean getF91748b() {
        return false;
    }
}
