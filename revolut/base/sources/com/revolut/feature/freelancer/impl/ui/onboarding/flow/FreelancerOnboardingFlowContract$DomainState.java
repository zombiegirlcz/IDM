package com.revolut.feature.freelancer.impl.ui.onboarding.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.onboarding.OnboardingVerificationStep;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$DomainState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOnboardingFlowContract$DomainState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerOnboardingFlowContract$DomainState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f73975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73977c;
    public final String d;
    public final String e;
    public final KompotDestination f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(FreelancerOnboardingFlowContract$DomainState.class, parcel, arrayList, iE, 1);
            }
            return new FreelancerOnboardingFlowContract$DomainState(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (KompotDestination) parcel.readParcelable(FreelancerOnboardingFlowContract$DomainState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOnboardingFlowContract$DomainState[i];
        }
    }

    public FreelancerOnboardingFlowContract$DomainState() {
        this(0);
    }

    public static FreelancerOnboardingFlowContract$DomainState a(FreelancerOnboardingFlowContract$DomainState freelancerOnboardingFlowContract$DomainState, List list, String str, String str2, String str3, String str4, KompotDestination kompotDestination, int i) {
        if ((i & 1) != 0) {
            list = freelancerOnboardingFlowContract$DomainState.f73975a;
        }
        List verificationSteps = list;
        if ((i & 2) != 0) {
            str = freelancerOnboardingFlowContract$DomainState.f73976b;
        }
        String businessCategoryId = str;
        if ((i & 4) != 0) {
            str2 = freelancerOnboardingFlowContract$DomainState.f73977c;
        }
        String businessDescription = str2;
        if ((i & 8) != 0) {
            str3 = freelancerOnboardingFlowContract$DomainState.d;
        }
        String businessUrl = str3;
        if ((i & 16) != 0) {
            str4 = freelancerOnboardingFlowContract$DomainState.e;
        }
        String str5 = str4;
        if ((i & 32) != 0) {
            kompotDestination = freelancerOnboardingFlowContract$DomainState.f;
        }
        freelancerOnboardingFlowContract$DomainState.getClass();
        Intrinsics.checkNotNullParameter(verificationSteps, "verificationSteps");
        Intrinsics.checkNotNullParameter(businessCategoryId, "businessCategoryId");
        Intrinsics.checkNotNullParameter(businessDescription, "businessDescription");
        Intrinsics.checkNotNullParameter(businessUrl, "businessUrl");
        return new FreelancerOnboardingFlowContract$DomainState(verificationSteps, businessCategoryId, businessDescription, businessUrl, str5, kompotDestination);
    }

    public final OnboardingVerificationStep.ActivityProof b() {
        List list = this.f73975a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof OnboardingVerificationStep.ActivityProof) {
                arrayList.add(obj2);
            }
        }
        return (OnboardingVerificationStep.ActivityProof) d0.d0(arrayList);
    }

    public final OnboardingVerificationStep.UrlSpecification c() {
        List list = this.f73975a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof OnboardingVerificationStep.UrlSpecification) {
                arrayList.add(obj2);
            }
        }
        return (OnboardingVerificationStep.UrlSpecification) d0.d0(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOnboardingFlowContract$DomainState)) {
            return false;
        }
        FreelancerOnboardingFlowContract$DomainState freelancerOnboardingFlowContract$DomainState = (FreelancerOnboardingFlowContract$DomainState) obj2;
        return Intrinsics.f(this.f73975a, freelancerOnboardingFlowContract$DomainState.f73975a) && Intrinsics.f(this.f73976b, freelancerOnboardingFlowContract$DomainState.f73976b) && Intrinsics.f(this.f73977c, freelancerOnboardingFlowContract$DomainState.f73977c) && Intrinsics.f(this.d, freelancerOnboardingFlowContract$DomainState.d) && Intrinsics.f(this.e, freelancerOnboardingFlowContract$DomainState.e) && Intrinsics.f(this.f, freelancerOnboardingFlowContract$DomainState.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f73975a.hashCode() * 31, 31, this.f73976b), 31, this.f73977c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        KompotDestination kompotDestination = this.f;
        return iHashCode + (kompotDestination != null ? kompotDestination.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f73975a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f73976b);
        dest.writeString(this.f73977c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
    }

    public FreelancerOnboardingFlowContract$DomainState(List verificationSteps, String businessCategoryId, String businessDescription, String businessUrl, String str, KompotDestination kompotDestination) {
        Intrinsics.checkNotNullParameter(verificationSteps, "verificationSteps");
        Intrinsics.checkNotNullParameter(businessCategoryId, "businessCategoryId");
        Intrinsics.checkNotNullParameter(businessDescription, "businessDescription");
        Intrinsics.checkNotNullParameter(businessUrl, "businessUrl");
        this.f73975a = verificationSteps;
        this.f73976b = businessCategoryId;
        this.f73977c = businessDescription;
        this.d = businessUrl;
        this.e = str;
        this.f = kompotDestination;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FreelancerOnboardingFlowContract$DomainState(int i) {
        f0 f0Var = f0.f322471a;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        m70.a.c(t0Var);
        m70.a.c(t0Var);
        this(f0Var, "", "", "", null, null);
    }
}
