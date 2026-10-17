package com.revolut.feature.freelancer.impl.ui.prompt.restrictions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/freelancer/impl/ui/prompt/restrictions/AccountRestrictionsPromptFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AccountRestrictionsPrompt", "Lcom/revolut/feature/freelancer/impl/ui/prompt/restrictions/AccountRestrictionsPromptFlowContract$Step$AccountRestrictionsPrompt;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AccountRestrictionsPromptFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/prompt/restrictions/AccountRestrictionsPromptFlowContract$Step$AccountRestrictionsPrompt;", "Lcom/revolut/feature/freelancer/impl/ui/prompt/restrictions/AccountRestrictionsPromptFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountRestrictionsPrompt extends AccountRestrictionsPromptFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountRestrictionsPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f74104a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRestrictionsPrompt((PromptMarketingScreenContract$InputData) parcel.readParcelable(AccountRestrictionsPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRestrictionsPrompt[i];
            }
        }

        public AccountRestrictionsPrompt(PromptMarketingScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f74104a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountRestrictionsPrompt) && Intrinsics.f(this.f74104a, ((AccountRestrictionsPrompt) obj2).f74104a);
        }

        public final int hashCode() {
            return this.f74104a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74104a, i);
        }
    }

    private AccountRestrictionsPromptFlowContract$Step() {
    }
}
