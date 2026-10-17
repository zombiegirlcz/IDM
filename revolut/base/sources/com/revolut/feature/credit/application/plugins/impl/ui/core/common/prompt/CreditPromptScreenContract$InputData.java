package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/CreditPromptScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPromptScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditPromptScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv3.a f67329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPromptAnalyticsConfiguration f67330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f67331c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPromptScreenContract$InputData(zv3.a.valueOf(parcel.readString()), (CreditPromptAnalyticsConfiguration) parcel.readParcelable(CreditPromptScreenContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(CreditPromptScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPromptScreenContract$InputData[i];
        }
    }

    public CreditPromptScreenContract$InputData(zv3.a navigationIcon, CreditPromptAnalyticsConfiguration analyticsPromptConfiguration, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(analyticsPromptConfiguration, "analyticsPromptConfiguration");
        this.f67329a = navigationIcon;
        this.f67330b = analyticsPromptConfiguration;
        this.f67331c = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPromptScreenContract$InputData)) {
            return false;
        }
        CreditPromptScreenContract$InputData creditPromptScreenContract$InputData = (CreditPromptScreenContract$InputData) obj2;
        return this.f67329a == creditPromptScreenContract$InputData.f67329a && Intrinsics.f(this.f67330b, creditPromptScreenContract$InputData.f67330b) && Intrinsics.f(this.f67331c, creditPromptScreenContract$InputData.f67331c);
    }

    public final int hashCode() {
        int iHashCode = (this.f67330b.hashCode() + (this.f67329a.hashCode() * 31)) * 31;
        AnalyticsContext analyticsContext = this.f67331c;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67329a.name());
        dest.writeParcelable(this.f67330b, i);
        dest.writeParcelable(this.f67331c, i);
    }
}
