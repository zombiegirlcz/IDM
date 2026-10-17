package com.revolut.feature.credit.application.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import dt3.d;
import ft3.a1;
import ft3.d1;
import ft3.j1;
import ft3.q0;
import ft3.t0;
import ft3.y0;
import grl.r2;
import gt3.f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import org.jetbrains.annotations.NotNull;
import yp3.b;
import yp3.c;
import yp3.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\n\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "Ljava/io/Serializable;", "<init>", "()V", "StartApplication", "CancelApplication", "CreditPostRetailOnboarding", "CreditPostActivationWaiting", "RecommendedValuators", "yp3/d", "yp3/f", "yp3/e", "yp3/c", "yp3/b", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$CancelApplication;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$CreditPostActivationWaiting;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$CreditPostRetailOnboarding;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$RecommendedValuators;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$StartApplication;", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditApplicationFeatureConfig implements FeatureConfig, Serializable {

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$CancelApplication;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelApplication extends CreditApplicationFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CancelApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d1 f66198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a1 f66199c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelApplication(parcel.readString(), (d1) parcel.readSerializable(), (a1) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelApplication[i];
            }
        }

        public CancelApplication(String applicationId, d1 productClassification, a1 entryPointPayload, boolean z) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(productClassification, "productClassification");
            Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
            this.f66197a = applicationId;
            this.f66198b = productClassification;
            this.f66199c = entryPointPayload;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancelApplication)) {
                return false;
            }
            CancelApplication cancelApplication = (CancelApplication) obj2;
            return Intrinsics.f(this.f66197a, cancelApplication.f66197a) && Intrinsics.f(this.f66198b, cancelApplication.f66198b) && Intrinsics.f(this.f66199c, cancelApplication.f66199c) && this.d == cancelApplication.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f66199c.hashCode() + ((this.f66198b.hashCode() + (this.f66197a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66197a);
            dest.writeSerializable(this.f66198b);
            dest.writeSerializable(this.f66199c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$CreditPostActivationWaiting;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditPostActivationWaiting extends CreditApplicationFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditPostActivationWaiting f66200a = new CreditPostActivationWaiting();

        @NotNull
        public static final Parcelable.Creator<CreditPostActivationWaiting> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditPostActivationWaiting.f66200a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditPostActivationWaiting[i];
            }
        }

        private CreditPostActivationWaiting() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof CreditPostActivationWaiting);
        }

        public final int hashCode() {
            return -1828500840;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$CreditPostRetailOnboarding;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditPostRetailOnboarding extends CreditApplicationFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CreditPostRetailOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f66201a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditPostRetailOnboarding((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditPostRetailOnboarding[i];
            }
        }

        public CreditPostRetailOnboarding(d creditCardPostRetailOnboardingWithPlan) {
            Intrinsics.checkNotNullParameter(creditCardPostRetailOnboardingWithPlan, "creditCardPostRetailOnboardingWithPlan");
            this.f66201a = creditCardPostRetailOnboardingWithPlan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreditPostRetailOnboarding) && Intrinsics.f(this.f66201a, ((CreditPostRetailOnboarding) obj2).f66201a);
        }

        public final int hashCode() {
            return this.f66201a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66201a);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$RecommendedValuators;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecommendedValuators extends CreditApplicationFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecommendedValuators f66202a = new RecommendedValuators();

        @NotNull
        public static final Parcelable.Creator<RecommendedValuators> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecommendedValuators.f66202a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecommendedValuators[i];
            }
        }

        private RecommendedValuators() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private CreditApplicationFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig$StartApplication;", "Lcom/revolut/feature/credit/application/api/navigation/CreditApplicationFeatureConfig;", "", "", "toString", "()Ljava/lang/String;", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartApplication extends CreditApplicationFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<StartApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j1 f66203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f66204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wp3.a f66205c;
        public final yp3.d d;
        public final String e;
        public final yp3.f f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f66206g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e f66207h;
        public final b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f66208j;
        public final a1 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final IntendedPricingPlan f66209l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Integer f66210m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartApplication(j1.valueOf(parcel.readString()), (f) parcel.readSerializable(), wp3.a.valueOf(parcel.readString()), yp3.d.valueOf(parcel.readString()), parcel.readString(), yp3.f.valueOf(parcel.readString()), c.valueOf(parcel.readString()), e.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), (a1) parcel.readSerializable(), parcel.readInt() == 0 ? null : IntendedPricingPlan.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartApplication[i];
            }
        }

        public StartApplication(j1 productType, f fVar, wp3.a activeApplicationStrategy, yp3.d productArticleStrategy, String str, yp3.f productIntroStrategy, c planSelectionStrategy, e eligibilityStrategy, b kycStrategy, String str2, a1 entryPointPayload, IntendedPricingPlan intendedPricingPlan, Integer num) {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
            Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
            Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
            Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
            Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
            Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
            Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
            this.f66203a = productType;
            this.f66204b = fVar;
            this.f66205c = activeApplicationStrategy;
            this.d = productArticleStrategy;
            this.e = str;
            this.f = productIntroStrategy;
            this.f66206g = planSelectionStrategy;
            this.f66207h = eligibilityStrategy;
            this.i = kycStrategy;
            this.f66208j = str2;
            this.k = entryPointPayload;
            this.f66209l = intendedPricingPlan;
            this.f66210m = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StartApplication)) {
                return false;
            }
            StartApplication startApplication = (StartApplication) obj2;
            return this.f66203a == startApplication.f66203a && Intrinsics.f(this.f66204b, startApplication.f66204b) && this.f66205c == startApplication.f66205c && this.d == startApplication.d && Intrinsics.f(this.e, startApplication.e) && this.f == startApplication.f && this.f66206g == startApplication.f66206g && this.f66207h == startApplication.f66207h && this.i == startApplication.i && Intrinsics.f(this.f66208j, startApplication.f66208j) && Intrinsics.f(this.k, startApplication.k) && Intrinsics.f(this.f66209l, startApplication.f66209l) && Intrinsics.f(this.f66210m, startApplication.f66210m);
        }

        public final int hashCode() {
            int iHashCode = this.f66203a.hashCode() * 31;
            f fVar = this.f66204b;
            int iHashCode2 = (this.d.hashCode() + ((this.f66205c.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31;
            String str = this.e;
            int iHashCode3 = (this.i.hashCode() + ((this.f66207h.hashCode() + ((this.f66206g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
            String str2 = this.f66208j;
            int iHashCode4 = (this.k.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            IntendedPricingPlan intendedPricingPlan = this.f66209l;
            int iHashCode5 = (iHashCode4 + (intendedPricingPlan == null ? 0 : intendedPricingPlan.hashCode())) * 31;
            Integer num = this.f66210m;
            return iHashCode5 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66203a.name());
            dest.writeSerializable(this.f66204b);
            dest.writeString(this.f66205c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e);
            dest.writeString(this.f.name());
            dest.writeString(this.f66206g.name());
            dest.writeString(this.f66207h.name());
            dest.writeString(this.i.name());
            dest.writeString(this.f66208j);
            dest.writeSerializable(this.k);
            IntendedPricingPlan intendedPricingPlan = this.f66209l;
            if (intendedPricingPlan == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                intendedPricingPlan.writeToParcel(dest, i);
            }
            Integer num = this.f66210m;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public /* synthetic */ StartApplication(j1 j1Var, f fVar, wp3.a aVar, String str, a1 a1Var, int i) {
            this(j1Var, fVar, (i & 4) != 0 ? wp3.a.OPEN_EXISTING_APPLICATION : aVar, yp3.d.DEFAULT, null, yp3.f.SHOW_ALL, c.DEFAULT, e.SKIP_ON_TOGGLE_DISABLED, b.DEFAULT, str, a1Var, null, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StartApplication(r2 entryPointType, q0 product, wp3.a aVar, yp3.f fVar, e eVar, b bVar, int i) {
            y0 y0VarA = t0.f137874a;
            wp3.a activeApplicationStrategy = (i & 8) != 0 ? wp3.a.OPEN_EXISTING_APPLICATION : aVar;
            yp3.d productArticleStrategy = yp3.d.DEFAULT;
            yp3.f productIntroStrategy = (i & 64) != 0 ? yp3.f.SHOW_ALL : fVar;
            c planSelectionStrategy = c.DEFAULT;
            e eligibilityStrategy = (i & 256) != 0 ? e.SKIP_ON_TOGGLE_DISABLED : eVar;
            b kycStrategy = (i & 512) != 0 ? b.DEFAULT : bVar;
            y0VarA = (i & 2048) != 0 ? s.A(product.getF137851b()) : y0VarA;
            Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
            Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
            Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
            Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
            Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
            Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
            this(product.getF137852c(), product.getD(), activeApplicationStrategy, productArticleStrategy, null, productIntroStrategy, planSelectionStrategy, eligibilityStrategy, kycStrategy, product.getF137850a(), new a1(entryPointType, null, null, y0VarA, null, 16), null, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StartApplication(a1 entryPointPayload, q0 product, wp3.a aVar, yp3.d dVar, String str, yp3.f fVar, c cVar, e eVar, b bVar, IntendedPricingPlan intendedPricingPlan, int i) {
            wp3.a activeApplicationStrategy = (i & 4) != 0 ? wp3.a.OPEN_EXISTING_APPLICATION : aVar;
            yp3.d productArticleStrategy = (i & 8) != 0 ? yp3.d.DEFAULT : dVar;
            String str2 = (i & 16) != 0 ? null : str;
            yp3.f productIntroStrategy = (i & 32) != 0 ? yp3.f.SHOW_ALL : fVar;
            c planSelectionStrategy = (i & 64) != 0 ? c.DEFAULT : cVar;
            e eligibilityStrategy = (i & 128) != 0 ? e.SKIP_ON_TOGGLE_DISABLED : eVar;
            b kycStrategy = (i & 256) != 0 ? b.DEFAULT : bVar;
            IntendedPricingPlan intendedPricingPlan2 = (i & 512) != 0 ? null : intendedPricingPlan;
            Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
            Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
            Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
            Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
            Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
            Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
            this(product.getF137852c(), product.getD(), activeApplicationStrategy, productArticleStrategy, str2, productIntroStrategy, planSelectionStrategy, eligibilityStrategy, kycStrategy, product.getF137850a(), entryPointPayload, intendedPricingPlan2, null);
        }
    }
}
