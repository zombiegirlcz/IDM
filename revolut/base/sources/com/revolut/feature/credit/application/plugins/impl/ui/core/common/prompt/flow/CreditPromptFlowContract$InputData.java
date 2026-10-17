package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import ht3.l0;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/flow/CreditPromptFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPromptFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditPromptFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv3.a f67347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f67348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPromptAnalyticsConfiguration f67349c;
    public final AnalyticsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPromptFlowContract$InputData(zv3.a.valueOf(parcel.readString()), (l0) parcel.readSerializable(), (CreditPromptAnalyticsConfiguration) parcel.readParcelable(CreditPromptFlowContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(CreditPromptFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPromptFlowContract$InputData[i];
        }
    }

    public CreditPromptFlowContract$InputData(zv3.a navigationIcon, l0 content, CreditPromptAnalyticsConfiguration analyticsConfiguration, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(analyticsConfiguration, "analyticsConfiguration");
        this.f67347a = navigationIcon;
        this.f67348b = content;
        this.f67349c = analyticsConfiguration;
        this.d = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPromptFlowContract$InputData)) {
            return false;
        }
        CreditPromptFlowContract$InputData creditPromptFlowContract$InputData = (CreditPromptFlowContract$InputData) obj2;
        return this.f67347a == creditPromptFlowContract$InputData.f67347a && Intrinsics.f(this.f67348b, creditPromptFlowContract$InputData.f67348b) && Intrinsics.f(this.f67349c, creditPromptFlowContract$InputData.f67349c) && Intrinsics.f(this.d, creditPromptFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f67349c.hashCode() + ((this.f67348b.hashCode() + (this.f67347a.hashCode() * 31)) * 31)) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67347a.name());
        dest.writeSerializable(this.f67348b);
        dest.writeParcelable(this.f67349c, i);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ CreditPromptFlowContract$InputData(l0 l0Var, CreditPromptAnalyticsConfiguration creditPromptAnalyticsConfiguration, CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration) {
        this(zv3.a.CLOSE, l0Var, creditPromptAnalyticsConfiguration, creditApplicationPluginFlowContract$Configuration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreditPromptFlowContract$InputData(zv3.a navigationIcon, l0 content, CreditPromptAnalyticsConfiguration analyticsConfiguration, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        this(navigationIcon, content, analyticsConfiguration, new AnalyticsContext(v7.m(pluginConfiguration, AnalyticsContext.INSTANCE)));
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(analyticsConfiguration, "analyticsConfiguration");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
    }
}
