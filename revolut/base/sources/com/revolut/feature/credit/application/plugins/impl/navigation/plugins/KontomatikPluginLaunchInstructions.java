package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.KontomatikIncomeCheckEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/KontomatikPluginLaunchInstructions;", "Lcom/revolut/feature/credit/application/models/initialization_contract/PluginLaunchInstructions;", "IncomeCheck", "Spinner", "Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/KontomatikPluginLaunchInstructions$IncomeCheck;", "Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/KontomatikPluginLaunchInstructions$Spinner;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KontomatikPluginLaunchInstructions extends PluginLaunchInstructions {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/KontomatikPluginLaunchInstructions$IncomeCheck;", "Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/KontomatikPluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncomeCheck implements KontomatikPluginLaunchInstructions {

        @NotNull
        public static final Parcelable.Creator<IncomeCheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KontomatikIncomeCheckEntryPoint f66922a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncomeCheck((KontomatikIncomeCheckEntryPoint) parcel.readParcelable(IncomeCheck.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeCheck[i];
            }
        }

        public IncomeCheck(KontomatikIncomeCheckEntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f66922a = entryPoint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IncomeCheck) && Intrinsics.f(this.f66922a, ((IncomeCheck) obj2).f66922a);
        }

        public final int hashCode() {
            return this.f66922a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66922a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/KontomatikPluginLaunchInstructions$Spinner;", "Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/KontomatikPluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Spinner implements KontomatikPluginLaunchInstructions {

        @NotNull
        public static final Parcelable.Creator<Spinner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpinnerConfiguration f66923a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Spinner((SpinnerConfiguration) parcel.readParcelable(Spinner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Spinner[i];
            }
        }

        public Spinner(SpinnerConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f66923a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Spinner) && Intrinsics.f(this.f66923a, ((Spinner) obj2).f66923a);
        }

        public final int hashCode() {
            return this.f66923a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66923a, i);
        }
    }
}
