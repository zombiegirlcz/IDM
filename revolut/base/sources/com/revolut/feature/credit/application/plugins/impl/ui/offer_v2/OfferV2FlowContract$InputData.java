package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import hs3.j0;
import hs3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "Config", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OfferV2FlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<OfferV2FlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Config f68089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f68090b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config;", "Landroid/os/Parcelable;", "Intro", "Insurance", "Summary", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config$Insurance;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config$Summary;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Config extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config$Insurance;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Insurance implements Config {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Insurance f68091a = new Insurance();

            @NotNull
            public static final Parcelable.Creator<Insurance> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Insurance.f68091a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Insurance[i];
                }
            }

            private Insurance() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData.Config
            /* JADX INFO: renamed from: g9 */
            public final hs3.c getF68095b() {
                return null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Intro implements Config {

            @NotNull
            public static final Parcelable.Creator<Intro> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l0 f68092a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final hs3.c f68093b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Intro(l0.valueOf(parcel.readString()), (hs3.c) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Intro[i];
                }
            }

            public Intro(l0 entry, hs3.c cVar) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                this.f68092a = entry;
                this.f68093b = cVar;
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
                return this.f68092a == intro.f68092a && Intrinsics.f(this.f68093b, intro.f68093b);
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData.Config
            /* JADX INFO: renamed from: g9, reason: from getter */
            public final hs3.c getF68095b() {
                return this.f68093b;
            }

            public final int hashCode() {
                int iHashCode = this.f68092a.hashCode() * 31;
                hs3.c cVar = this.f68093b;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f68092a.name());
                dest.writeSerializable(this.f68093b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config$Summary;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Summary implements Config {

            @NotNull
            public static final Parcelable.Creator<Summary> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j0 f68094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final hs3.c f68095b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Summary((hs3.c) parcel.readSerializable(), j0.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Summary[i];
                }
            }

            public Summary(hs3.c cVar, j0 layout) {
                Intrinsics.checkNotNullParameter(layout, "layout");
                this.f68094a = layout;
                this.f68095b = cVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Summary)) {
                    return false;
                }
                Summary summary = (Summary) obj2;
                return this.f68094a == summary.f68094a && Intrinsics.f(this.f68095b, summary.f68095b);
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData.Config
            /* JADX INFO: renamed from: g9, reason: from getter */
            public final hs3.c getF68095b() {
                return this.f68095b;
            }

            public final int hashCode() {
                int iHashCode = this.f68094a.hashCode() * 31;
                hs3.c cVar = this.f68095b;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f68094a.name());
                dest.writeSerializable(this.f68095b);
            }
        }

        /* JADX INFO: renamed from: g9 */
        hs3.c getF68095b();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferV2FlowContract$InputData((Config) parcel.readParcelable(OfferV2FlowContract$InputData.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(OfferV2FlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfferV2FlowContract$InputData[i];
        }
    }

    public OfferV2FlowContract$InputData(Config config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68089a = config;
        this.f68090b = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68090b() {
        return this.f68090b;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f68090b.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f68090b.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OfferV2FlowContract$InputData)) {
            return false;
        }
        OfferV2FlowContract$InputData offerV2FlowContract$InputData = (OfferV2FlowContract$InputData) obj2;
        return Intrinsics.f(this.f68089a, offerV2FlowContract$InputData.f68089a) && Intrinsics.f(this.f68090b, offerV2FlowContract$InputData.f68090b);
    }

    public final int hashCode() {
        return this.f68090b.hashCode() + (this.f68089a.hashCode() * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68090b().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68089a, i);
        dest.writeParcelable(this.f68090b, i);
    }
}
