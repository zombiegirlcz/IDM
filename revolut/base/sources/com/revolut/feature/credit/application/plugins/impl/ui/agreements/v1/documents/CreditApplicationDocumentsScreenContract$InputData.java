package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/documents/CreditApplicationDocumentsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationDocumentsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationDocumentsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f67008b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationDocumentsScreenContract$InputData(parcel.readString(), (AnalyticsContext) parcel.readParcelable(CreditApplicationDocumentsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationDocumentsScreenContract$InputData[i];
        }
    }

    public CreditApplicationDocumentsScreenContract$InputData(String str, AnalyticsContext analyticsContext) {
        this.f67007a = str;
        this.f67008b = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationDocumentsScreenContract$InputData)) {
            return false;
        }
        CreditApplicationDocumentsScreenContract$InputData creditApplicationDocumentsScreenContract$InputData = (CreditApplicationDocumentsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67007a, creditApplicationDocumentsScreenContract$InputData.f67007a) && Intrinsics.f(this.f67008b, creditApplicationDocumentsScreenContract$InputData.f67008b);
    }

    public final int hashCode() {
        String str = this.f67007a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AnalyticsContext analyticsContext = this.f67008b;
        return iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67007a);
        dest.writeParcelable(this.f67008b, i);
    }

    public /* synthetic */ CreditApplicationDocumentsScreenContract$InputData(String str, AnalyticsContext analyticsContext, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : analyticsContext);
    }
}
