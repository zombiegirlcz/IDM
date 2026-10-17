package com.revolut.feature.select.payment.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.select.payment.api.models.IntroScreenConfiguration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Configuration", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectPaymentFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectPaymentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f85807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f85808b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$InputData$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Configuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntroScreenConfiguration f85809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f85810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f85811c;
        public final AnalyticsContext d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IntroScreenConfiguration introScreenConfiguration = (IntroScreenConfiguration) parcel.readParcelable(Configuration.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(Configuration.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new Configuration(introScreenConfiguration, z4, z3, analyticsContext, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(IntroScreenConfiguration introScreenConfiguration, boolean z, boolean z3, AnalyticsContext analyticsContext, boolean z4) {
            this.f85809a = introScreenConfiguration;
            this.f85810b = z;
            this.f85811c = z3;
            this.d = analyticsContext;
            this.e = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj2;
            return Intrinsics.f(this.f85809a, configuration.f85809a) && this.f85810b == configuration.f85810b && this.f85811c == configuration.f85811c && Intrinsics.f(this.d, configuration.d) && this.e == configuration.e;
        }

        public final int hashCode() {
            IntroScreenConfiguration introScreenConfiguration = this.f85809a;
            int iC = j6.a.c(j6.a.c((introScreenConfiguration == null ? 0 : introScreenConfiguration.hashCode()) * 31, 31, this.f85810b), 31, this.f85811c);
            AnalyticsContext analyticsContext = this.d;
            return Boolean.hashCode(this.e) + ((iC + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85809a, i);
            dest.writeInt(this.f85810b ? 1 : 0);
            dest.writeInt(this.f85811c ? 1 : 0);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectPaymentFlowContract$InputData((g) parcel.readSerializable(), Configuration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectPaymentFlowContract$InputData[i];
        }
    }

    public SelectPaymentFlowContract$InputData(g externalCard, Configuration configuration) {
        Intrinsics.checkNotNullParameter(externalCard, "externalCard");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f85807a = externalCard;
        this.f85808b = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectPaymentFlowContract$InputData)) {
            return false;
        }
        SelectPaymentFlowContract$InputData selectPaymentFlowContract$InputData = (SelectPaymentFlowContract$InputData) obj2;
        return Intrinsics.f(this.f85807a, selectPaymentFlowContract$InputData.f85807a) && Intrinsics.f(this.f85808b, selectPaymentFlowContract$InputData.f85808b);
    }

    public final int hashCode() {
        return this.f85808b.hashCode() + (this.f85807a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85807a);
        this.f85808b.writeToParcel(dest, i);
    }
}
