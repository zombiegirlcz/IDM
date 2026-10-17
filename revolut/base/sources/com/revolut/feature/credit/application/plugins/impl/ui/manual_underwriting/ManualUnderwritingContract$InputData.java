package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingSummary;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import hs3.z1;
import java.io.Serializable;
import ju3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "Config", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManualUnderwritingContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<ManualUnderwritingContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Config f67888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67889b;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Intro", "AdditionalInfoRequired", "Waiting", "TicketorProgress", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config$AdditionalInfoRequired;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config$TicketorProgress;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config$Waiting;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Config extends Parcelable, Serializable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config$AdditionalInfoRequired;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AdditionalInfoRequired implements Config {

            @NotNull
            public static final Parcelable.Creator<AdditionalInfoRequired> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManualUnderwritingSummary f67890a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ManualUnderwritingScreenConfig f67891b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f67892c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AdditionalInfoRequired((ManualUnderwritingSummary) parcel.readParcelable(AdditionalInfoRequired.class.getClassLoader()), (ManualUnderwritingScreenConfig) parcel.readParcelable(AdditionalInfoRequired.class.getClassLoader()), g.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AdditionalInfoRequired[i];
                }
            }

            public AdditionalInfoRequired(ManualUnderwritingSummary summary, ManualUnderwritingScreenConfig screenConfig, g waitingPopupType) {
                Intrinsics.checkNotNullParameter(summary, "summary");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                Intrinsics.checkNotNullParameter(waitingPopupType, "waitingPopupType");
                this.f67890a = summary;
                this.f67891b = screenConfig;
                this.f67892c = waitingPopupType;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData.Config
            /* JADX INFO: renamed from: I, reason: from getter */
            public final ManualUnderwritingScreenConfig getF67899a() {
                return this.f67891b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AdditionalInfoRequired)) {
                    return false;
                }
                AdditionalInfoRequired additionalInfoRequired = (AdditionalInfoRequired) obj2;
                return Intrinsics.f(this.f67890a, additionalInfoRequired.f67890a) && Intrinsics.f(this.f67891b, additionalInfoRequired.f67891b) && this.f67892c == additionalInfoRequired.f67892c;
            }

            public final int hashCode() {
                return this.f67892c.hashCode() + ((this.f67891b.hashCode() + (this.f67890a.hashCode() * 31)) * 31);
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData.Config
            /* JADX INFO: renamed from: k3, reason: from getter */
            public final ManualUnderwritingSummary getF67893a() {
                return this.f67890a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f67890a, i);
                dest.writeParcelable(this.f67891b, i);
                dest.writeString(this.f67892c.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Intro implements Config {

            @NotNull
            public static final Parcelable.Creator<Intro> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManualUnderwritingSummary f67893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ManualUnderwritingScreenConfig f67894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f67895c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Intro((ManualUnderwritingSummary) parcel.readParcelable(Intro.class.getClassLoader()), (ManualUnderwritingScreenConfig) parcel.readParcelable(Intro.class.getClassLoader()), g.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Intro[i];
                }
            }

            public Intro(ManualUnderwritingSummary summary, ManualUnderwritingScreenConfig screenConfig, g waitingPopupType) {
                Intrinsics.checkNotNullParameter(summary, "summary");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                Intrinsics.checkNotNullParameter(waitingPopupType, "waitingPopupType");
                this.f67893a = summary;
                this.f67894b = screenConfig;
                this.f67895c = waitingPopupType;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData.Config
            /* JADX INFO: renamed from: I, reason: from getter */
            public final ManualUnderwritingScreenConfig getF67899a() {
                return this.f67894b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Intro)) {
                    return false;
                }
                Intro intro = (Intro) obj2;
                return Intrinsics.f(this.f67893a, intro.f67893a) && Intrinsics.f(this.f67894b, intro.f67894b) && this.f67895c == intro.f67895c;
            }

            public final int hashCode() {
                return this.f67895c.hashCode() + ((this.f67894b.hashCode() + (this.f67893a.hashCode() * 31)) * 31);
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData.Config
            /* JADX INFO: renamed from: k3, reason: from getter */
            public final ManualUnderwritingSummary getF67893a() {
                return this.f67893a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f67893a, i);
                dest.writeParcelable(this.f67894b, i);
                dest.writeString(this.f67895c.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config$TicketorProgress;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TicketorProgress implements Config {

            @NotNull
            public static final Parcelable.Creator<TicketorProgress> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z1 f67896a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ManualUnderwritingScreenConfig f67897b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f67898c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TicketorProgress((z1) parcel.readSerializable(), (ManualUnderwritingScreenConfig) parcel.readParcelable(TicketorProgress.class.getClassLoader()), g.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TicketorProgress[i];
                }
            }

            public TicketorProgress(z1 metadata, ManualUnderwritingScreenConfig screenConfig, g waitingPopupType) {
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                Intrinsics.checkNotNullParameter(waitingPopupType, "waitingPopupType");
                this.f67896a = metadata;
                this.f67897b = screenConfig;
                this.f67898c = waitingPopupType;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData.Config
            /* JADX INFO: renamed from: I, reason: from getter */
            public final ManualUnderwritingScreenConfig getF67899a() {
                return this.f67897b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TicketorProgress)) {
                    return false;
                }
                TicketorProgress ticketorProgress = (TicketorProgress) obj2;
                return Intrinsics.f(this.f67896a, ticketorProgress.f67896a) && Intrinsics.f(this.f67897b, ticketorProgress.f67897b) && this.f67898c == ticketorProgress.f67898c;
            }

            public final int hashCode() {
                return this.f67898c.hashCode() + ((this.f67897b.hashCode() + (this.f67896a.hashCode() * 31)) * 31);
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData.Config
            /* JADX INFO: renamed from: k3 */
            public final ManualUnderwritingSummary getF67893a() {
                return null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67896a);
                dest.writeParcelable(this.f67897b, i);
                dest.writeString(this.f67898c.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config$Waiting;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Waiting implements Config {

            @NotNull
            public static final Parcelable.Creator<Waiting> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManualUnderwritingScreenConfig f67899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final g f67900b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Waiting((ManualUnderwritingScreenConfig) parcel.readParcelable(Waiting.class.getClassLoader()), g.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Waiting[i];
                }
            }

            public Waiting(ManualUnderwritingScreenConfig screenConfig, g waitingPopupType) {
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                Intrinsics.checkNotNullParameter(waitingPopupType, "waitingPopupType");
                this.f67899a = screenConfig;
                this.f67900b = waitingPopupType;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData.Config
            /* JADX INFO: renamed from: I, reason: from getter */
            public final ManualUnderwritingScreenConfig getF67899a() {
                return this.f67899a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Waiting)) {
                    return false;
                }
                Waiting waiting = (Waiting) obj2;
                return Intrinsics.f(this.f67899a, waiting.f67899a) && this.f67900b == waiting.f67900b;
            }

            public final int hashCode() {
                return this.f67900b.hashCode() + (this.f67899a.hashCode() * 31);
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData.Config
            /* JADX INFO: renamed from: k3 */
            public final ManualUnderwritingSummary getF67893a() {
                return null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f67899a, i);
                dest.writeString(this.f67900b.name());
            }
        }

        /* JADX INFO: renamed from: I */
        ManualUnderwritingScreenConfig getF67899a();

        /* JADX INFO: renamed from: k3 */
        ManualUnderwritingSummary getF67893a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManualUnderwritingContract$InputData((Config) parcel.readParcelable(ManualUnderwritingContract$InputData.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(ManualUnderwritingContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManualUnderwritingContract$InputData[i];
        }
    }

    public ManualUnderwritingContract$InputData(Config config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67888a = config;
        this.f67889b = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF67889b() {
        return this.f67889b;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f67889b.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f67889b.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManualUnderwritingContract$InputData)) {
            return false;
        }
        ManualUnderwritingContract$InputData manualUnderwritingContract$InputData = (ManualUnderwritingContract$InputData) obj2;
        return Intrinsics.f(this.f67888a, manualUnderwritingContract$InputData.f67888a) && Intrinsics.f(this.f67889b, manualUnderwritingContract$InputData.f67889b);
    }

    public final int hashCode() {
        return this.f67889b.hashCode() + (this.f67888a.hashCode() * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF67889b().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67888a, i);
        dest.writeParcelable(this.f67889b, i);
    }
}
