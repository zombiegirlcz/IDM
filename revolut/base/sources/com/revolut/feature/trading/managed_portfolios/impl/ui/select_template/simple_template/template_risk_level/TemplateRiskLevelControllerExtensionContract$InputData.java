package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.template_risk_level;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/select_template/simple_template/template_risk_level/TemplateRiskLevelControllerExtensionContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TemplateRiskLevelControllerExtensionContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TemplateRiskLevelControllerExtensionContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91483c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TemplateRiskLevelControllerExtensionContract$InputData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TemplateRiskLevelControllerExtensionContract$InputData[i];
        }
    }

    public TemplateRiskLevelControllerExtensionContract$InputData(String templateId, String str, String recommendedTemplateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(recommendedTemplateId, "recommendedTemplateId");
        this.f91481a = templateId;
        this.f91482b = str;
        this.f91483c = recommendedTemplateId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TemplateRiskLevelControllerExtensionContract$InputData)) {
            return false;
        }
        TemplateRiskLevelControllerExtensionContract$InputData templateRiskLevelControllerExtensionContract$InputData = (TemplateRiskLevelControllerExtensionContract$InputData) obj2;
        return Intrinsics.f(this.f91481a, templateRiskLevelControllerExtensionContract$InputData.f91481a) && Intrinsics.f(this.f91482b, templateRiskLevelControllerExtensionContract$InputData.f91482b) && Intrinsics.f(this.f91483c, templateRiskLevelControllerExtensionContract$InputData.f91483c);
    }

    public final int hashCode() {
        int iHashCode = this.f91481a.hashCode() * 31;
        String str = this.f91482b;
        return this.f91483c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91481a);
        dest.writeString(this.f91482b);
        dest.writeString(this.f91483c);
    }
}
