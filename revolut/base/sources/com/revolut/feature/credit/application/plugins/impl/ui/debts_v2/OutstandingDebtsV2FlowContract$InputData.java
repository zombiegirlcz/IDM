package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.kompot.common.IOData$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "Intro", "DebtsHub", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$InputData$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$InputData$Intro;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OutstandingDebtsV2FlowContract$InputData extends IOData$Input, PluginFlowContract$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$InputData$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DebtsHub implements OutstandingDebtsV2FlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DebtsHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f67449a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DebtsHub((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(DebtsHub.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebtsHub[i];
            }
        }

        public DebtsHub(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f67449a = pluginConfiguration;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        /* JADX INFO: renamed from: O0, reason: from getter */
        public final CreditApplicationPluginFlowContract$Configuration getF67826a() {
            return this.f67449a;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final r2 P9() {
            return this.f67449a.f66893c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final j1 R2() {
            return this.f67449a.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DebtsHub) && Intrinsics.f(this.f67449a, ((DebtsHub) obj2).f67449a);
        }

        public final int hashCode() {
            return this.f67449a.hashCode();
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final String k8() {
            return getF68043a().f66892b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67449a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$InputData$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements OutstandingDebtsV2FlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f67450a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(Intro.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f67450a = pluginConfiguration;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        /* JADX INFO: renamed from: O0, reason: from getter */
        public final CreditApplicationPluginFlowContract$Configuration getF68511a() {
            return this.f67450a;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final r2 P9() {
            return this.f67450a.f66893c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final j1 R2() {
            return this.f67450a.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f67450a, ((Intro) obj2).f67450a);
        }

        public final int hashCode() {
            return this.f67450a.hashCode();
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final String k8() {
            return getF68511a().f66892b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67450a, i);
        }
    }
}
