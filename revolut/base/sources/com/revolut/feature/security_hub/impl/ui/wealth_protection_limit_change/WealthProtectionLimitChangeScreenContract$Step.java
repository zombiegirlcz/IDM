package com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.api.models.StreetModeDelayDurationDisclaimer;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LimitExceedingAmount", "LimitSetToZero", "SecurityDelayDurations", "SecurityDelayDurationDisclaimer", "Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step$LimitExceedingAmount;", "Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step$LimitSetToZero;", "Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step$SecurityDelayDurationDisclaimer;", "Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step$SecurityDelayDurations;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthProtectionLimitChangeScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step$LimitExceedingAmount;", "Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitExceedingAmount implements WealthProtectionLimitChangeScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<LimitExceedingAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f85777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f85778b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitExceedingAmount((d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitExceedingAmount[i];
            }
        }

        public LimitExceedingAmount(d oldMoney, d newMoney) {
            Intrinsics.checkNotNullParameter(oldMoney, "oldMoney");
            Intrinsics.checkNotNullParameter(newMoney, "newMoney");
            this.f85777a = oldMoney;
            this.f85778b = newMoney;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitExceedingAmount)) {
                return false;
            }
            LimitExceedingAmount limitExceedingAmount = (LimitExceedingAmount) obj2;
            return Intrinsics.f(this.f85777a, limitExceedingAmount.f85777a) && Intrinsics.f(this.f85778b, limitExceedingAmount.f85778b);
        }

        public final int hashCode() {
            return this.f85778b.hashCode() + (this.f85777a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85777a);
            dest.writeSerializable(this.f85778b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step$LimitSetToZero;", "Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitSetToZero implements WealthProtectionLimitChangeScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<LimitSetToZero> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f85779a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitSetToZero((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitSetToZero[i];
            }
        }

        public LimitSetToZero(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f85779a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LimitSetToZero) && Intrinsics.f(this.f85779a, ((LimitSetToZero) obj2).f85779a);
        }

        public final int hashCode() {
            return this.f85779a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85779a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step$SecurityDelayDurationDisclaimer;", "Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecurityDelayDurationDisclaimer implements WealthProtectionLimitChangeScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<SecurityDelayDurationDisclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StreetModeDelayDurationDisclaimer f85781b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SecurityDelayDurationDisclaimer(parcel.readString(), (StreetModeDelayDurationDisclaimer) parcel.readParcelable(SecurityDelayDurationDisclaimer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityDelayDurationDisclaimer[i];
            }
        }

        public SecurityDelayDurationDisclaimer(String durationCode, StreetModeDelayDurationDisclaimer disclaimer) {
            Intrinsics.checkNotNullParameter(durationCode, "durationCode");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            this.f85780a = durationCode;
            this.f85781b = disclaimer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SecurityDelayDurationDisclaimer)) {
                return false;
            }
            SecurityDelayDurationDisclaimer securityDelayDurationDisclaimer = (SecurityDelayDurationDisclaimer) obj2;
            return Intrinsics.f(this.f85780a, securityDelayDurationDisclaimer.f85780a) && Intrinsics.f(this.f85781b, securityDelayDurationDisclaimer.f85781b);
        }

        public final int hashCode() {
            return this.f85781b.hashCode() + (this.f85780a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85780a);
            dest.writeParcelable(this.f85781b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step$SecurityDelayDurations;", "Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecurityDelayDurations implements WealthProtectionLimitChangeScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<SecurityDelayDurations> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f85782a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SecurityDelayDurations.class, parcel, arrayList, iE, 1);
                }
                return new SecurityDelayDurations(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityDelayDurations[i];
            }
        }

        public SecurityDelayDurations(List delayDurations) {
            Intrinsics.checkNotNullParameter(delayDurations, "delayDurations");
            this.f85782a = delayDurations;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SecurityDelayDurations) && Intrinsics.f(this.f85782a, ((SecurityDelayDurations) obj2).f85782a);
        }

        public final int hashCode() {
            return this.f85782a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f85782a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
