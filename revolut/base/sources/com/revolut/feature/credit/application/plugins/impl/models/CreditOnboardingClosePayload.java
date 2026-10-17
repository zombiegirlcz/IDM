package com.revolut.feature.credit.application.plugins.impl.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.close.models.CreditApplicationClosePayload;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/models/CreditOnboardingClosePayload;", "Lcom/revolut/feature/credit/application/close/models/CreditApplicationClosePayload;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditOnboardingClosePayload implements CreditApplicationClosePayload {

    @NotNull
    public static final Parcelable.Creator<CreditOnboardingClosePayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f66907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f66908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66909c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditOnboardingClosePayload((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditOnboardingClosePayload.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(CreditOnboardingClosePayload.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditOnboardingClosePayload[i];
        }
    }

    public CreditOnboardingClosePayload(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, AnalyticsContext analyticsContext, boolean z) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f66907a = pluginConfiguration;
        this.f66908b = analyticsContext;
        this.f66909c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditOnboardingClosePayload)) {
            return false;
        }
        CreditOnboardingClosePayload creditOnboardingClosePayload = (CreditOnboardingClosePayload) obj2;
        return Intrinsics.f(this.f66907a, creditOnboardingClosePayload.f66907a) && Intrinsics.f(this.f66908b, creditOnboardingClosePayload.f66908b) && this.f66909c == creditOnboardingClosePayload.f66909c;
    }

    public final int hashCode() {
        int iHashCode = this.f66907a.hashCode() * 31;
        AnalyticsContext analyticsContext = this.f66908b;
        return Boolean.hashCode(this.f66909c) + ((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66907a, i);
        dest.writeParcelable(this.f66908b, i);
        dest.writeInt(this.f66909c ? 1 : 0);
    }

    public /* synthetic */ CreditOnboardingClosePayload(CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, int i) {
        this(creditApplicationPluginFlowContract$Configuration, new AnalyticsContext(v7.m(creditApplicationPluginFlowContract$Configuration, AnalyticsContext.INSTANCE)), (i & 4) != 0);
    }
}
