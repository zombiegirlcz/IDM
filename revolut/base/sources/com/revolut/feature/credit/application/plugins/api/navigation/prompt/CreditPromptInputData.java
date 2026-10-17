package com.revolut.feature.credit.application.plugins.api.navigation.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.kompot.common.IOData$Input;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/prompt/CreditPromptInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPromptInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditPromptInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv3.a f66901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f66902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPromptAnalyticsConfiguration f66903c;
    public final AnalyticsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPromptInputData(zv3.a.valueOf(parcel.readString()), (l0) parcel.readSerializable(), CreditPromptAnalyticsConfiguration.CREATOR.createFromParcel(parcel), (AnalyticsContext) parcel.readParcelable(CreditPromptInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPromptInputData[i];
        }
    }

    public CreditPromptInputData(zv3.a navigationIcon, l0 content, CreditPromptAnalyticsConfiguration analyticsConfiguration, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(analyticsConfiguration, "analyticsConfiguration");
        this.f66901a = navigationIcon;
        this.f66902b = content;
        this.f66903c = analyticsConfiguration;
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
        if (!(obj2 instanceof CreditPromptInputData)) {
            return false;
        }
        CreditPromptInputData creditPromptInputData = (CreditPromptInputData) obj2;
        return this.f66901a == creditPromptInputData.f66901a && Intrinsics.f(this.f66902b, creditPromptInputData.f66902b) && Intrinsics.f(this.f66903c, creditPromptInputData.f66903c) && Intrinsics.f(this.d, creditPromptInputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f66903c.hashCode() + ((this.f66902b.hashCode() + (this.f66901a.hashCode() * 31)) * 31)) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66901a.name());
        dest.writeSerializable(this.f66902b);
        this.f66903c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ CreditPromptInputData(zv3.a aVar, l0 l0Var, CreditPromptAnalyticsConfiguration creditPromptAnalyticsConfiguration, AnalyticsContext analyticsContext, int i) {
        this((i & 1) != 0 ? zv3.a.CLOSE : aVar, l0Var, creditPromptAnalyticsConfiguration, (i & 8) != 0 ? null : analyticsContext);
    }
}
