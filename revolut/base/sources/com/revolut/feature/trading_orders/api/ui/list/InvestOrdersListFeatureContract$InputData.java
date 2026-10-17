package com.revolut.feature.trading_orders.api.ui.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData", "Landroid/os/Parcelable;", "PendingOrders", "RecurringOrders", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestOrdersListFeatureContract$InputData extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData;", "", "toString", "()Ljava/lang/String;", "Context", "DisplayOptions", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingOrders implements InvestOrdersListFeatureContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PendingOrders> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestOrdersParams f91751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f91752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DisplayOptions f91753c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders$Context;", "Landroid/os/Parcelable;", "Security", "Commodity", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders$Context$Commodity;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders$Context$Security;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Context extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders$Context$Commodity;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders$Context;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Commodity implements Context {

                @NotNull
                public static final Parcelable.Creator<Commodity> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f91754a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Commodity((b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Commodity[i];
                    }
                }

                public Commodity(b currency) {
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    this.f91754a = currency;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Commodity) && Intrinsics.f(this.f91754a, ((Commodity) obj2).f91754a);
                }

                public final int hashCode() {
                    return this.f91754a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f91754a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders$Context$Security;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders$Context;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Security implements Context {

                @NotNull
                public static final Parcelable.Creator<Security> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final n f91755a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Security((n) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Security[i];
                    }
                }

                public Security(n instrument) {
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    this.f91755a = instrument;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Security) && Intrinsics.f(this.f91755a, ((Security) obj2).f91755a);
                }

                public final int hashCode() {
                    return this.f91755a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f91755a);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$PendingOrders$DisplayOptions;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$DisplayOptions;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayOptions implements InvestOrdersListFeatureContract$DisplayOptions {

            @NotNull
            public static final Parcelable.Creator<DisplayOptions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InvestOrdersListFeatureContract$Disclaimers f91756a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayOptions((InvestOrdersListFeatureContract$Disclaimers) parcel.readParcelable(DisplayOptions.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DisplayOptions[i];
                }
            }

            public DisplayOptions(InvestOrdersListFeatureContract$Disclaimers disclaimers) {
                Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
                this.f91756a = disclaimers;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DisplayOptions) && Intrinsics.f(this.f91756a, ((DisplayOptions) obj2).f91756a);
            }

            public final int hashCode() {
                return this.f91756a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f91756a, i);
            }

            @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$DisplayOptions
            /* JADX INFO: renamed from: z3, reason: from getter */
            public final InvestOrdersListFeatureContract$Disclaimers getF91760b() {
                return this.f91756a;
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingOrders((InvestOrdersParams) parcel.readParcelable(PendingOrders.class.getClassLoader()), (Context) parcel.readParcelable(PendingOrders.class.getClassLoader()), DisplayOptions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingOrders[i];
            }
        }

        public PendingOrders(InvestOrdersParams params, Context context, DisplayOptions displayOptions) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
            this.f91751a = params;
            this.f91752b = context;
            this.f91753c = displayOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PendingOrders)) {
                return false;
            }
            PendingOrders pendingOrders = (PendingOrders) obj2;
            return Intrinsics.f(this.f91751a, pendingOrders.f91751a) && Intrinsics.f(this.f91752b, pendingOrders.f91752b) && Intrinsics.f(this.f91753c, pendingOrders.f91753c);
        }

        @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData
        public final InvestOrdersListFeatureContract$DisplayOptions getDisplayOptions() {
            return this.f91753c;
        }

        @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData
        /* JADX INFO: renamed from: getParams, reason: from getter */
        public final InvestOrdersParams getF91757a() {
            return this.f91751a;
        }

        public final int hashCode() {
            int iHashCode = this.f91751a.hashCode() * 31;
            Context context = this.f91752b;
            return this.f91753c.f91756a.hashCode() + ((iHashCode + (context == null ? 0 : context.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91751a, i);
            dest.writeParcelable(this.f91752b, i);
            this.f91753c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData;", "", "toString", "()Ljava/lang/String;", "DisplayOptions", "PlusActionNavBarButton", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringOrders implements InvestOrdersListFeatureContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RecurringOrders> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestOrdersParams f91757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DisplayOptions f91758b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$DisplayOptions;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$DisplayOptions;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayOptions implements InvestOrdersListFeatureContract$DisplayOptions {

            @NotNull
            public static final Parcelable.Creator<DisplayOptions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlusActionNavBarButton f91759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InvestOrdersListFeatureContract$Disclaimers f91760b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayOptions((PlusActionNavBarButton) parcel.readParcelable(DisplayOptions.class.getClassLoader()), (InvestOrdersListFeatureContract$Disclaimers) parcel.readParcelable(DisplayOptions.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DisplayOptions[i];
                }
            }

            public DisplayOptions(PlusActionNavBarButton button, InvestOrdersListFeatureContract$Disclaimers disclaimers) {
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
                this.f91759a = button;
                this.f91760b = disclaimers;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DisplayOptions)) {
                    return false;
                }
                DisplayOptions displayOptions = (DisplayOptions) obj2;
                return Intrinsics.f(this.f91759a, displayOptions.f91759a) && Intrinsics.f(this.f91760b, displayOptions.f91760b);
            }

            public final int hashCode() {
                return this.f91760b.hashCode() + (this.f91759a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f91759a, i);
                dest.writeParcelable(this.f91760b, i);
            }

            @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$DisplayOptions
            /* JADX INFO: renamed from: z3, reason: from getter */
            public final InvestOrdersListFeatureContract$Disclaimers getF91760b() {
                return this.f91760b;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton;", "Landroid/os/Parcelable;", "OpenRecurringBuys", "StartSecurityOrder", "StartCommodityOrder", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton$OpenRecurringBuys;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton$StartCommodityOrder;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton$StartSecurityOrder;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface PlusActionNavBarButton extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton$OpenRecurringBuys;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton;", "<init>", "()V", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class OpenRecurringBuys implements PlusActionNavBarButton {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final OpenRecurringBuys f91761a = new OpenRecurringBuys();

                @NotNull
                public static final Parcelable.Creator<OpenRecurringBuys> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return OpenRecurringBuys.f91761a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new OpenRecurringBuys[i];
                    }
                }

                private OpenRecurringBuys() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton$StartCommodityOrder;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class StartCommodityOrder implements PlusActionNavBarButton {

                @NotNull
                public static final Parcelable.Creator<StartCommodityOrder> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f91762a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new StartCommodityOrder((b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new StartCommodityOrder[i];
                    }
                }

                public StartCommodityOrder(b currency) {
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    this.f91762a = currency;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof StartCommodityOrder) && Intrinsics.f(this.f91762a, ((StartCommodityOrder) obj2).f91762a);
                }

                public final int hashCode() {
                    return this.f91762a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f91762a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton$StartSecurityOrder;", "Lcom/revolut/feature/trading_orders/api/ui/list/InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class StartSecurityOrder implements PlusActionNavBarButton {

                @NotNull
                public static final Parcelable.Creator<StartSecurityOrder> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final n f91763a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new StartSecurityOrder((n) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new StartSecurityOrder[i];
                    }
                }

                public StartSecurityOrder(n instrument) {
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    this.f91763a = instrument;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof StartSecurityOrder) && Intrinsics.f(this.f91763a, ((StartSecurityOrder) obj2).f91763a);
                }

                public final int hashCode() {
                    return this.f91763a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f91763a);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringOrders((InvestOrdersParams) parcel.readParcelable(RecurringOrders.class.getClassLoader()), DisplayOptions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringOrders[i];
            }
        }

        public RecurringOrders(InvestOrdersParams params, DisplayOptions displayOptions) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
            this.f91757a = params;
            this.f91758b = displayOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecurringOrders)) {
                return false;
            }
            RecurringOrders recurringOrders = (RecurringOrders) obj2;
            return Intrinsics.f(this.f91757a, recurringOrders.f91757a) && Intrinsics.f(this.f91758b, recurringOrders.f91758b);
        }

        @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData
        public final InvestOrdersListFeatureContract$DisplayOptions getDisplayOptions() {
            return this.f91758b;
        }

        @Override // com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData
        /* JADX INFO: renamed from: getParams, reason: from getter */
        public final InvestOrdersParams getF91757a() {
            return this.f91757a;
        }

        public final int hashCode() {
            return this.f91758b.hashCode() + (this.f91757a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91757a, i);
            this.f91758b.writeToParcel(dest, i);
        }
    }

    InvestOrdersListFeatureContract$DisplayOptions getDisplayOptions();

    /* JADX INFO: renamed from: getParams */
    InvestOrdersParams getF91757a();
}
