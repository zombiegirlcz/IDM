package com.revolut.feature.onboarding.impl.verifyaccount.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.onboarding.impl.verifyaccount.screen.VerifyAccountPromptScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/impl/verifyaccount/flow/VerifyAccountPromptFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "VerifyAccountPrompt", "Lcom/revolut/feature/onboarding/impl/verifyaccount/flow/VerifyAccountPromptFlowContract$Step$VerifyAccountPrompt;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface VerifyAccountPromptFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/verifyaccount/flow/VerifyAccountPromptFlowContract$Step$VerifyAccountPrompt;", "Lcom/revolut/feature/onboarding/impl/verifyaccount/flow/VerifyAccountPromptFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerifyAccountPrompt implements VerifyAccountPromptFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VerifyAccountPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VerifyAccountPromptScreenContract$InputData f78596a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerifyAccountPrompt(VerifyAccountPromptScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerifyAccountPrompt[i];
            }
        }

        public VerifyAccountPrompt(VerifyAccountPromptScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f78596a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VerifyAccountPrompt) && Intrinsics.f(this.f78596a, ((VerifyAccountPrompt) obj2).f78596a);
        }

        public final int hashCode() {
            return this.f78596a.f78597a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f78596a.writeToParcel(dest, i);
        }
    }
}
