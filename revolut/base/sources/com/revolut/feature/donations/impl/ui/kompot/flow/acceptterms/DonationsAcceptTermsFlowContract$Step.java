package com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/flow/acceptterms/DonationsAcceptTermsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AcceptTerms", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/acceptterms/DonationsAcceptTermsFlowContract$Step$AcceptTerms;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DonationsAcceptTermsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/acceptterms/DonationsAcceptTermsFlowContract$Step$AcceptTerms;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/acceptterms/DonationsAcceptTermsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptTerms extends DonationsAcceptTermsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AcceptTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f72013a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcceptTerms((PromptMarketingScreenContract$InputData) parcel.readParcelable(AcceptTerms.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptTerms[i];
            }
        }

        public AcceptTerms(PromptMarketingScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f72013a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AcceptTerms) && Intrinsics.f(this.f72013a, ((AcceptTerms) obj2).f72013a);
        }

        public final int hashCode() {
            return this.f72013a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72013a, i);
        }
    }

    private DonationsAcceptTermsFlowContract$Step() {
    }
}
