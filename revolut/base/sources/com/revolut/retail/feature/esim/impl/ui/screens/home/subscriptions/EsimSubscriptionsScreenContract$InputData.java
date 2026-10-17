package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "PreferredView", "Routing", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferredView f101029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Routing f101030b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData$PreferredView;", "Landroid/os/Parcelable;", "CurrentDevice", "GiftRecipient", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData$PreferredView$CurrentDevice;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData$PreferredView$GiftRecipient;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PreferredView extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData$PreferredView$CurrentDevice;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData$PreferredView;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CurrentDevice implements PreferredView {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CurrentDevice f101031a = new CurrentDevice();

            @NotNull
            public static final Parcelable.Creator<CurrentDevice> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CurrentDevice.f101031a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CurrentDevice[i];
                }
            }

            private CurrentDevice() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData$PreferredView$GiftRecipient;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData$PreferredView;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GiftRecipient implements PreferredView {

            @NotNull
            public static final Parcelable.Creator<GiftRecipient> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f101032a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GiftRecipient(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GiftRecipient[i];
                }
            }

            public GiftRecipient(String registeredIdentityId) {
                Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                this.f101032a = registeredIdentityId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof GiftRecipient) && Intrinsics.f(this.f101032a, ((GiftRecipient) obj2).f101032a);
            }

            public final int hashCode() {
                return this.f101032a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f101032a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionsScreenContract$InputData((PreferredView) parcel.readParcelable(EsimSubscriptionsScreenContract$InputData.class.getClassLoader()), Routing.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionsScreenContract$InputData[i];
        }
    }

    public EsimSubscriptionsScreenContract$InputData(PreferredView preferredView, Routing routing) {
        Intrinsics.checkNotNullParameter(preferredView, "preferredView");
        Intrinsics.checkNotNullParameter(routing, "routing");
        this.f101029a = preferredView;
        this.f101030b = routing;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionsScreenContract$InputData)) {
            return false;
        }
        EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData = (EsimSubscriptionsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101029a, esimSubscriptionsScreenContract$InputData.f101029a) && Intrinsics.f(this.f101030b, esimSubscriptionsScreenContract$InputData.f101030b);
    }

    public final int hashCode() {
        return this.f101030b.hashCode() + (this.f101029a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101029a, i);
        this.f101030b.writeToParcel(dest, i);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$InputData$Routing;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Routing implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f101034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101035b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Routing> CREATOR = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Routing f101033c = new Routing(false, false);

        /* JADX INFO: renamed from: com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$InputData$Routing$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Routing(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Routing[i];
            }
        }

        public Routing(boolean z, boolean z3) {
            this.f101034a = z;
            this.f101035b = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Routing)) {
                return false;
            }
            Routing routing = (Routing) obj2;
            return this.f101034a == routing.f101034a && this.f101035b == routing.f101035b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101035b) + (Boolean.hashCode(this.f101034a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f101034a ? 1 : 0);
            dest.writeInt(this.f101035b ? 1 : 0);
        }

        public Routing() {
            this(false, false);
        }
    }
}
