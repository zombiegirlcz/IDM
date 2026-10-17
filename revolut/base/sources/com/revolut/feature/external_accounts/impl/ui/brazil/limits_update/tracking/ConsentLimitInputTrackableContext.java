package com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/tracking/ConsentLimitInputTrackableContext;", "Landroid/os/Parcelable;", "OutboundConsentLimit", "InboundConsentLimit", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/tracking/ConsentLimitInputTrackableContext$InboundConsentLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/tracking/ConsentLimitInputTrackableContext$OutboundConsentLimit;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConsentLimitInputTrackableContext extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/tracking/ConsentLimitInputTrackableContext$InboundConsentLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/tracking/ConsentLimitInputTrackableContext;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InboundConsentLimit implements ConsentLimitInputTrackableContext {

        @NotNull
        public static final Parcelable.Creator<InboundConsentLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72640b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InboundConsentLimit(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InboundConsentLimit[i];
            }
        }

        public InboundConsentLimit(String institutionId, String branchId) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(branchId, "branchId");
            this.f72639a = institutionId;
            this.f72640b = branchId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InboundConsentLimit)) {
                return false;
            }
            InboundConsentLimit inboundConsentLimit = (InboundConsentLimit) obj2;
            return Intrinsics.f(this.f72639a, inboundConsentLimit.f72639a) && Intrinsics.f(this.f72640b, inboundConsentLimit.f72640b);
        }

        public final int hashCode() {
            return this.f72640b.hashCode() + (this.f72639a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72639a);
            dest.writeString(this.f72640b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/tracking/ConsentLimitInputTrackableContext$OutboundConsentLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/tracking/ConsentLimitInputTrackableContext;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutboundConsentLimit implements ConsentLimitInputTrackableContext {

        @NotNull
        public static final Parcelable.Creator<OutboundConsentLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72641a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OutboundConsentLimit(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OutboundConsentLimit[i];
            }
        }

        public OutboundConsentLimit(String consentId) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72641a = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OutboundConsentLimit) && Intrinsics.f(this.f72641a, ((OutboundConsentLimit) obj2).f72641a);
        }

        public final int hashCode() {
            return this.f72641a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72641a);
        }
    }
}
