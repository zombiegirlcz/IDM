package com.revolut.feature.onboarding.impl.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.onboarding.api.onboarding.models.EmailData;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingFlowContract$State implements FlowState, Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f78312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmailData f78313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78314c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Address address = (Address) j6.a.f(parcel, "parcel", OnboardingFlowContract$State.class);
            EmailData emailData = (EmailData) parcel.readParcelable(OnboardingFlowContract$State.class.getClassLoader());
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(my8.k.valueOf(parcel.readString()));
            }
            return new OnboardingFlowContract$State(address, emailData, string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingFlowContract$State[i];
        }
    }

    public OnboardingFlowContract$State(Address address, EmailData emailData, String str, Set kycConsents) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(kycConsents, "kycConsents");
        this.f78312a = address;
        this.f78313b = emailData;
        this.f78314c = str;
        this.d = kycConsents;
    }

    public static OnboardingFlowContract$State a(OnboardingFlowContract$State onboardingFlowContract$State, Address address, EmailData emailData, Set kycConsents, int i) {
        if ((i & 1) != 0) {
            address = onboardingFlowContract$State.f78312a;
        }
        if ((i & 2) != 0) {
            emailData = onboardingFlowContract$State.f78313b;
        }
        String str = (i & 4) != 0 ? onboardingFlowContract$State.f78314c : null;
        if ((i & 8) != 0) {
            kycConsents = onboardingFlowContract$State.d;
        }
        onboardingFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(kycConsents, "kycConsents");
        return new OnboardingFlowContract$State(address, emailData, str, kycConsents);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingFlowContract$State)) {
            return false;
        }
        OnboardingFlowContract$State onboardingFlowContract$State = (OnboardingFlowContract$State) obj2;
        return Intrinsics.f(this.f78312a, onboardingFlowContract$State.f78312a) && Intrinsics.f(this.f78313b, onboardingFlowContract$State.f78313b) && Intrinsics.f(this.f78314c, onboardingFlowContract$State.f78314c) && Intrinsics.f(this.d, onboardingFlowContract$State.d);
    }

    public final int hashCode() {
        int iHashCode = this.f78312a.hashCode() * 31;
        EmailData emailData = this.f78313b;
        int iHashCode2 = (iHashCode + (emailData == null ? 0 : emailData.hashCode())) * 31;
        String str = this.f78314c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78312a, i);
        dest.writeParcelable(this.f78313b, i);
        dest.writeString(this.f78314c);
        Iterator itV = ehe.n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((my8.k) itV.next()).name());
        }
    }
}
