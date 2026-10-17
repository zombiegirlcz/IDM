package com.revolut.feature.tab.invest.impl.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ThemeCustomisation", "RegisteredIdentities", "PortfolioValueInfo", "KompotDescriptor", "Checklist", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$Checklist;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$KompotDescriptor;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$PortfolioValueInfo;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$RegisteredIdentities;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$ThemeCustomisation;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TabInvestControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$Checklist;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checklist implements TabInvestControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Checklist> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlotChecklistPayload f89848a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checklist((SlotChecklistPayload) parcel.readParcelable(Checklist.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checklist[i];
            }
        }

        public Checklist(SlotChecklistPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f89848a = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checklist) && Intrinsics.f(this.f89848a, ((Checklist) obj2).f89848a);
        }

        public final int hashCode() {
            return this.f89848a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89848a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$KompotDescriptor;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KompotDescriptor implements TabInvestControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<KompotDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableControllerDescriptor f89849a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new KompotDescriptor((ParcelableControllerDescriptor) parcel.readParcelable(KompotDescriptor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KompotDescriptor[i];
            }
        }

        public KompotDescriptor(ParcelableControllerDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f89849a = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof KompotDescriptor) && Intrinsics.f(this.f89849a, ((KompotDescriptor) obj2).f89849a);
        }

        public final int hashCode() {
            return this.f89849a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89849a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$PortfolioValueInfo;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortfolioValueInfo implements TabInvestControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PortfolioValueInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hel.b f89850a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortfolioValueInfo(hel.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfolioValueInfo[i];
            }
        }

        public PortfolioValueInfo(hel.b tradingContext) {
            Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
            this.f89850a = tradingContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PortfolioValueInfo) && this.f89850a == ((PortfolioValueInfo) obj2).f89850a;
        }

        public final int hashCode() {
            return this.f89850a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89850a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$RegisteredIdentities;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep;", "<init>", "()V", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RegisteredIdentities implements TabInvestControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RegisteredIdentities f89851a = new RegisteredIdentities();

        @NotNull
        public static final Parcelable.Creator<RegisteredIdentities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RegisteredIdentities.f89851a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegisteredIdentities[i];
            }
        }

        private RegisteredIdentities() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep$ThemeCustomisation;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$ModalStep;", "<init>", "()V", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ThemeCustomisation implements TabInvestControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThemeCustomisation f89852a = new ThemeCustomisation();

        @NotNull
        public static final Parcelable.Creator<ThemeCustomisation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ThemeCustomisation.f89852a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThemeCustomisation[i];
            }
        }

        private ThemeCustomisation() {
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
}
