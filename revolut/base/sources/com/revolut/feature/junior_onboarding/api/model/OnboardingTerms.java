package com.revolut.feature.junior_onboarding.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_core.models.configuration.Links;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/model/OnboardingTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f76954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f76955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Links f76956c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingTerms(parcel.readInt() != 0, (b) parcel.readSerializable(), (Links) parcel.readParcelable(OnboardingTerms.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingTerms[i];
        }
    }

    public OnboardingTerms(boolean z, b userCountry, Links links) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f76954a = z;
        this.f76955b = userCountry;
        this.f76956c = links;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingTerms)) {
            return false;
        }
        OnboardingTerms onboardingTerms = (OnboardingTerms) obj2;
        return this.f76954a == onboardingTerms.f76954a && Intrinsics.f(this.f76955b, onboardingTerms.f76955b) && Intrinsics.f(this.f76956c, onboardingTerms.f76956c);
    }

    public final int hashCode() {
        return this.f76956c.hashCode() + p.a.c(Boolean.hashCode(this.f76954a) * 31, 31, this.f76955b.f297794a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f76954a ? 1 : 0);
        dest.writeSerializable(this.f76955b);
        dest.writeParcelable(this.f76956c, i);
    }
}
