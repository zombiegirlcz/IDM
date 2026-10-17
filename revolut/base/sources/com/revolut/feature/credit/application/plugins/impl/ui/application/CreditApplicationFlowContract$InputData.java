package com.revolut.feature.credit.application.plugins.impl.ui.application;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.kompot.common.IOData$Input;
import ft3.a1;
import ft3.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yp3.e;
import yp3.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationFlowContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f67053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f67054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wp3.a f67055c;
    public final yp3.d d;
    public final String e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yp3.c f67056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f67057h;
    public final yp3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f67058j;
    public final IntendedPricingPlan k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f67059l;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CreditApplicationFlowContract$InputData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationFlowContract$InputData((d1) parcel.readSerializable(), (a1) parcel.readSerializable(), wp3.a.valueOf(parcel.readString()), yp3.d.valueOf(parcel.readString()), parcel.readString(), f.valueOf(parcel.readString()), yp3.c.valueOf(parcel.readString()), e.valueOf(parcel.readString()), yp3.b.valueOf(parcel.readString()), parcel.readString(), (IntendedPricingPlan) parcel.readParcelable(CreditApplicationFlowContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationFlowContract$InputData[i];
        }
    }

    public CreditApplicationFlowContract$InputData(d1 productClassification, a1 entryPointPayload, wp3.a activeApplicationStrategy, yp3.d productArticleStrategy, String str, f productIntroStrategy, yp3.c planSelectionStrategy, e eligibilityStrategy, yp3.b kycStrategy, String str2, IntendedPricingPlan intendedPricingPlan, String str3) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
        Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
        Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
        Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
        Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
        Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
        this.f67053a = productClassification;
        this.f67054b = entryPointPayload;
        this.f67055c = activeApplicationStrategy;
        this.d = productArticleStrategy;
        this.e = str;
        this.f = productIntroStrategy;
        this.f67056g = planSelectionStrategy;
        this.f67057h = eligibilityStrategy;
        this.i = kycStrategy;
        this.f67058j = str2;
        this.k = intendedPricingPlan;
        this.f67059l = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationFlowContract$InputData)) {
            return false;
        }
        CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData = (CreditApplicationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f67053a, creditApplicationFlowContract$InputData.f67053a) && Intrinsics.f(this.f67054b, creditApplicationFlowContract$InputData.f67054b) && this.f67055c == creditApplicationFlowContract$InputData.f67055c && this.d == creditApplicationFlowContract$InputData.d && Intrinsics.f(this.e, creditApplicationFlowContract$InputData.e) && this.f == creditApplicationFlowContract$InputData.f && this.f67056g == creditApplicationFlowContract$InputData.f67056g && this.f67057h == creditApplicationFlowContract$InputData.f67057h && this.i == creditApplicationFlowContract$InputData.i && Intrinsics.f(this.f67058j, creditApplicationFlowContract$InputData.f67058j) && Intrinsics.f(this.k, creditApplicationFlowContract$InputData.k) && Intrinsics.f(this.f67059l, creditApplicationFlowContract$InputData.f67059l);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f67055c.hashCode() + ((this.f67054b.hashCode() + (this.f67053a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (this.i.hashCode() + ((this.f67057h.hashCode() + ((this.f67056g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f67058j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IntendedPricingPlan intendedPricingPlan = this.k;
        int iHashCode4 = (iHashCode3 + (intendedPricingPlan == null ? 0 : intendedPricingPlan.hashCode())) * 31;
        String str3 = this.f67059l;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67053a);
        dest.writeSerializable(this.f67054b);
        dest.writeString(this.f67055c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeString(this.f67056g.name());
        dest.writeString(this.f67057h.name());
        dest.writeString(this.i.name());
        dest.writeString(this.f67058j);
        dest.writeParcelable(this.k, i);
        dest.writeString(this.f67059l);
    }
}
