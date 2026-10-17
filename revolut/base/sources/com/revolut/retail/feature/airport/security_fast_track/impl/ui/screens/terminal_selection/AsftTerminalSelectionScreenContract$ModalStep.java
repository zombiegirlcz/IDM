package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RevPointsInfo", "AboutPriceDialog", "FreeAccessInfo", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep$AboutPriceDialog;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep$FreeAccessInfo;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep$RevPointsInfo;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AsftTerminalSelectionScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep$AboutPriceDialog;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AboutPriceDialog extends AsftTerminalSelectionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AboutPriceDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AsftConfig f98869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AsftTerminal f98870b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AboutPriceDialog((AsftConfig) parcel.readParcelable(AboutPriceDialog.class.getClassLoader()), (AsftTerminal) parcel.readParcelable(AboutPriceDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AboutPriceDialog[i];
            }
        }

        public AboutPriceDialog(AsftConfig config, AsftTerminal terminal) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(terminal, "terminal");
            this.f98869a = config;
            this.f98870b = terminal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AboutPriceDialog)) {
                return false;
            }
            AboutPriceDialog aboutPriceDialog = (AboutPriceDialog) obj2;
            return Intrinsics.f(this.f98869a, aboutPriceDialog.f98869a) && Intrinsics.f(this.f98870b, aboutPriceDialog.f98870b);
        }

        public final int hashCode() {
            return this.f98870b.hashCode() + (this.f98869a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98869a, i);
            dest.writeParcelable(this.f98870b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep$FreeAccessInfo;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreeAccessInfo extends AsftTerminalSelectionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FreeAccessInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98872b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreeAccessInfo(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreeAccessInfo[i];
            }
        }

        public FreeAccessInfo(String planName, boolean z) {
            Intrinsics.checkNotNullParameter(planName, "planName");
            this.f98871a = planName;
            this.f98872b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FreeAccessInfo)) {
                return false;
            }
            FreeAccessInfo freeAccessInfo = (FreeAccessInfo) obj2;
            return Intrinsics.f(this.f98871a, freeAccessInfo.f98871a) && this.f98872b == freeAccessInfo.f98872b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98872b) + (this.f98871a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98871a);
            dest.writeInt(this.f98872b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep$RevPointsInfo;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsInfo extends AsftTerminalSelectionScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsInfo f98873a = new RevPointsInfo();

        @NotNull
        public static final Parcelable.Creator<RevPointsInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsInfo.f98873a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsInfo[i];
            }
        }

        private RevPointsInfo() {
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

    private AsftTerminalSelectionScreenContract$ModalStep() {
    }
}
