package com.revolut.retail.feature.esim.impl.ui.flows.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dej.c4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "InitialDestination", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimHomeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimHomeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitialDestination f100645a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination;", "Landroid/os/Parcelable;", "Subscriptions", "Gifting", "PreferredView", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$Gifting;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$Subscriptions;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InitialDestination extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$Gifting;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Gifting implements InitialDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Gifting f100646a = new Gifting();

            @NotNull
            public static final Parcelable.Creator<Gifting> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Gifting.f100646a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Gifting[i];
                }
            }

            private Gifting() {
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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$PreferredView;", "Landroid/os/Parcelable;", "CurrentDevice", "GiftRecipient", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$PreferredView$CurrentDevice;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$PreferredView$GiftRecipient;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface PreferredView extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$PreferredView$CurrentDevice;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$PreferredView;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class CurrentDevice implements PreferredView {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final CurrentDevice f100647a = new CurrentDevice();

                @NotNull
                public static final Parcelable.Creator<CurrentDevice> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return CurrentDevice.f100647a;
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$PreferredView$GiftRecipient;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$PreferredView;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class GiftRecipient implements PreferredView {

                @NotNull
                public static final Parcelable.Creator<GiftRecipient> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f100648a;

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
                    this.f100648a = registeredIdentityId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof GiftRecipient) && Intrinsics.f(this.f100648a, ((GiftRecipient) obj2).f100648a);
                }

                public final int hashCode() {
                    return this.f100648a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f100648a);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination$Subscriptions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$InputData$InitialDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Subscriptions implements InitialDestination {

            @NotNull
            public static final Parcelable.Creator<Subscriptions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PreferredView f100649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c4 f100650b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f100651c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Subscriptions((PreferredView) parcel.readParcelable(Subscriptions.class.getClassLoader()), c4.valueOf(parcel.readString()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Subscriptions[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Subscriptions() {
                this((PreferredView) null, (c4) (0 == true ? 1 : 0), 7);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Subscriptions)) {
                    return false;
                }
                Subscriptions subscriptions = (Subscriptions) obj2;
                return Intrinsics.f(this.f100649a, subscriptions.f100649a) && this.f100650b == subscriptions.f100650b && this.f100651c == subscriptions.f100651c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f100651c) + ((this.f100650b.hashCode() + (this.f100649a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f100649a, i);
                dest.writeString(this.f100650b.name());
                dest.writeInt(this.f100651c ? 1 : 0);
            }

            public Subscriptions(PreferredView preferredView, c4 targetPage, boolean z) {
                Intrinsics.checkNotNullParameter(preferredView, "preferredView");
                Intrinsics.checkNotNullParameter(targetPage, "targetPage");
                this.f100649a = preferredView;
                this.f100650b = targetPage;
                this.f100651c = z;
            }

            public /* synthetic */ Subscriptions(PreferredView preferredView, c4 c4Var, int i) {
                this((i & 1) != 0 ? PreferredView.CurrentDevice.f100647a : preferredView, (i & 2) != 0 ? c4.ACTIVE : c4Var, (i & 4) == 0);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimHomeFlowContract$InputData((InitialDestination) parcel.readParcelable(EsimHomeFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimHomeFlowContract$InputData[i];
        }
    }

    public EsimHomeFlowContract$InputData(InitialDestination initialDestination) {
        Intrinsics.checkNotNullParameter(initialDestination, "initialDestination");
        this.f100645a = initialDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EsimHomeFlowContract$InputData) && Intrinsics.f(this.f100645a, ((EsimHomeFlowContract$InputData) obj2).f100645a);
    }

    public final int hashCode() {
        return this.f100645a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f100645a, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EsimHomeFlowContract$InputData() {
        this(new InitialDestination.Subscriptions((InitialDestination.PreferredView) null, (c4) (0 == true ? 1 : 0), 7));
    }
}
