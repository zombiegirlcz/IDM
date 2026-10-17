package com.revolut.feature.credit.forbearance.application.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import it3.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "ForbearanceApplicationQuestionnaire", "FinancialDifficultiesFlow", "ForbearanceSpinner", "Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig$FinancialDifficultiesFlow;", "Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig$ForbearanceApplicationQuestionnaire;", "Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig$ForbearanceSpinner;", "feature_credit_forbearance_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ForbearanceFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes22.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig$FinancialDifficultiesFlow;", "Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinancialDifficultiesFlow extends ForbearanceFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<FinancialDifficultiesFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackendFlowContract$Configuration f69922a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FinancialDifficultiesFlow((BackendFlowContract$Configuration) parcel.readParcelable(FinancialDifficultiesFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinancialDifficultiesFlow[i];
            }
        }

        public FinancialDifficultiesFlow(BackendFlowContract$Configuration baseConfiguration) {
            Intrinsics.checkNotNullParameter(baseConfiguration, "baseConfiguration");
            this.f69922a = baseConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FinancialDifficultiesFlow) && Intrinsics.f(this.f69922a, ((FinancialDifficultiesFlow) obj2).f69922a);
        }

        public final int hashCode() {
            return this.f69922a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69922a, i);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig$ForbearanceApplicationQuestionnaire;", "Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForbearanceApplicationQuestionnaire extends ForbearanceFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ForbearanceApplicationQuestionnaire> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackendFlowContract$Configuration f69923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69924b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForbearanceApplicationQuestionnaire((BackendFlowContract$Configuration) parcel.readParcelable(ForbearanceApplicationQuestionnaire.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForbearanceApplicationQuestionnaire[i];
            }
        }

        public ForbearanceApplicationQuestionnaire(BackendFlowContract$Configuration baseConfiguration, String facilityId) {
            Intrinsics.checkNotNullParameter(baseConfiguration, "baseConfiguration");
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f69923a = baseConfiguration;
            this.f69924b = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForbearanceApplicationQuestionnaire)) {
                return false;
            }
            ForbearanceApplicationQuestionnaire forbearanceApplicationQuestionnaire = (ForbearanceApplicationQuestionnaire) obj2;
            return Intrinsics.f(this.f69923a, forbearanceApplicationQuestionnaire.f69923a) && Intrinsics.f(this.f69924b, forbearanceApplicationQuestionnaire.f69924b);
        }

        public final int hashCode() {
            return this.f69924b.hashCode() + (this.f69923a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69923a, i);
            dest.writeString(this.f69924b);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig$ForbearanceSpinner;", "Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForbearanceSpinner extends ForbearanceFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ForbearanceSpinner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f69925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f69926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Parcelable f69927c;
        public final List d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int i2 = 0;
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ForbearanceSpinner.class, parcel, arrayList, iE, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iE2 = 0;
                while (iE2 != i3) {
                    iE2 = j6.a.e(ForbearanceSpinner.class, parcel, arrayList2, iE2, 1);
                }
                Parcelable parcelable = parcel.readParcelable(ForbearanceSpinner.class.getClassLoader());
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (true) {
                    String string = parcel.readString();
                    if (i2 == i5) {
                        return new ForbearanceSpinner(arrayList, arrayList2, parcelable, arrayList3, string, parcel.readString());
                    }
                    arrayList3.add(f.valueOf(string));
                    i2++;
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForbearanceSpinner[i];
            }
        }

        public ForbearanceSpinner(List titles, List descriptions, Parcelable parcelable, List terminationCondition, String flowName, String applicationId) {
            Intrinsics.checkNotNullParameter(titles, "titles");
            Intrinsics.checkNotNullParameter(descriptions, "descriptions");
            Intrinsics.checkNotNullParameter(terminationCondition, "terminationCondition");
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            this.f69925a = titles;
            this.f69926b = descriptions;
            this.f69927c = parcelable;
            this.d = terminationCondition;
            this.e = flowName;
            this.f = applicationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForbearanceSpinner)) {
                return false;
            }
            ForbearanceSpinner forbearanceSpinner = (ForbearanceSpinner) obj2;
            return Intrinsics.f(this.f69925a, forbearanceSpinner.f69925a) && Intrinsics.f(this.f69926b, forbearanceSpinner.f69926b) && Intrinsics.f(this.f69927c, forbearanceSpinner.f69927c) && Intrinsics.f(this.d, forbearanceSpinner.d) && Intrinsics.f(this.e, forbearanceSpinner.e) && Intrinsics.f(this.f, forbearanceSpinner.f);
        }

        public final int hashCode() {
            int iD = p.a.d(this.f69925a.hashCode() * 31, 31, this.f69926b);
            Parcelable parcelable = this.f69927c;
            return this.f.hashCode() + p.a.c(p.a.d((iD + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f69925a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f69926b, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
            dest.writeParcelable(this.f69927c, i);
            Iterator itV3 = p.a.v(this.d, dest);
            while (itV3.hasNext()) {
                dest.writeString(((f) itV3.next()).name());
            }
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    private ForbearanceFeatureConfig() {
    }
}
