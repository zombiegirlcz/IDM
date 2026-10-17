package com.revolut.feature.security_hub.impl.ui.security_hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SecurityHubChecklist", "GlobalAccountsInfo", "HiddenTransactionsAuthentication", "Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step$GlobalAccountsInfo;", "Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step$HiddenTransactionsAuthentication;", "Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step$SecurityHubChecklist;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecurityHubScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step$GlobalAccountsInfo;", "Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GlobalAccountsInfo implements SecurityHubScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<GlobalAccountsInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f85637a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GlobalAccountsInfo((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GlobalAccountsInfo[i];
            }
        }

        public GlobalAccountsInfo(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f85637a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GlobalAccountsInfo) && Intrinsics.f(this.f85637a, ((GlobalAccountsInfo) obj2).f85637a);
        }

        public final int hashCode() {
            return this.f85637a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85637a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step$HiddenTransactionsAuthentication;", "Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HiddenTransactionsAuthentication implements SecurityHubScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HiddenTransactionsAuthentication f85638a = new HiddenTransactionsAuthentication();

        @NotNull
        public static final Parcelable.Creator<HiddenTransactionsAuthentication> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HiddenTransactionsAuthentication.f85638a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenTransactionsAuthentication[i];
            }
        }

        private HiddenTransactionsAuthentication() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step$SecurityHubChecklist;", "Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecurityHubChecklist implements SecurityHubScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<SecurityHubChecklist> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlotChecklistPayload f85639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f85640b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SecurityHubChecklist((SlotChecklistPayload) parcel.readParcelable(SecurityHubChecklist.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(SecurityHubChecklist.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityHubChecklist[i];
            }
        }

        public SecurityHubChecklist(SlotChecklistPayload payload, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f85639a = payload;
            this.f85640b = analyticsProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SecurityHubChecklist)) {
                return false;
            }
            SecurityHubChecklist securityHubChecklist = (SecurityHubChecklist) obj2;
            return Intrinsics.f(this.f85639a, securityHubChecklist.f85639a) && Intrinsics.f(this.f85640b, securityHubChecklist.f85640b);
        }

        public final int hashCode() {
            return this.f85640b.hashCode() + (this.f85639a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85639a, i);
            dest.writeParcelable(this.f85640b, i);
        }
    }
}
