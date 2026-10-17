package com.revolut.feature.junior.account_activation.impl.ui.screen.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/screen/ScreenStates$RetainedDomain;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivationRequestScreenContract$RetainedState implements ScreenStates$RetainedDomain {

    @NotNull
    public static final Parcelable.Creator<ActivationRequestScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f76683c;
    public final bj0.b d;
    public final boolean e;
    public final OnboardingTerms f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wi0.b f76684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f76685h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            bj0.b bVarValueOf = bj0.b.valueOf(parcel.readString());
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            OnboardingTerms onboardingTerms = (OnboardingTerms) parcel.readParcelable(ActivationRequestScreenContract$RetainedState.class.getClassLoader());
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ActivationRequestScreenContract$MandatoryCheckbox.CREATOR, parcel, arrayList2, iA, i);
                }
                arrayList = arrayList2;
            }
            return new ActivationRequestScreenContract$RetainedState(string, string2, localDate, bVarValueOf, z, onboardingTerms, bVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivationRequestScreenContract$RetainedState[i];
        }
    }

    public ActivationRequestScreenContract$RetainedState(String firstName, String lastName, LocalDate birthDate, bj0.b gender, boolean z, OnboardingTerms onboardingTerms, wi0.b bVar, List list) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.f76681a = firstName;
        this.f76682b = lastName;
        this.f76683c = birthDate;
        this.d = gender;
        this.e = z;
        this.f = onboardingTerms;
        this.f76684g = bVar;
        this.f76685h = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivationRequestScreenContract$RetainedState)) {
            return false;
        }
        ActivationRequestScreenContract$RetainedState activationRequestScreenContract$RetainedState = (ActivationRequestScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f76681a, activationRequestScreenContract$RetainedState.f76681a) && Intrinsics.f(this.f76682b, activationRequestScreenContract$RetainedState.f76682b) && Intrinsics.f(this.f76683c, activationRequestScreenContract$RetainedState.f76683c) && this.d == activationRequestScreenContract$RetainedState.d && this.e == activationRequestScreenContract$RetainedState.e && Intrinsics.f(this.f, activationRequestScreenContract$RetainedState.f) && Intrinsics.f(this.f76684g, activationRequestScreenContract$RetainedState.f76684g) && Intrinsics.f(this.f76685h, activationRequestScreenContract$RetainedState.f76685h);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + y.a(p.a.c(this.f76681a.hashCode() * 31, 31, this.f76682b), 31, this.f76683c)) * 31, 31, this.e);
        OnboardingTerms onboardingTerms = this.f;
        int iHashCode = (iC + (onboardingTerms == null ? 0 : onboardingTerms.hashCode())) * 31;
        wi0.b bVar = this.f76684g;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        List list = this.f76685h;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76681a);
        dest.writeString(this.f76682b);
        dest.writeSerializable(this.f76683c);
        dest.writeString(this.d.name());
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f76684g);
        List list = this.f76685h;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((ActivationRequestScreenContract$MandatoryCheckbox) itQ.next()).writeToParcel(dest, i);
        }
    }
}
