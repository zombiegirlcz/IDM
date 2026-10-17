package com.revolut.feature.robo.impl.ui.flow.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/robo/impl/ui/flow/onboarding/OnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "Lcom/revolut/feature/robo/impl/ui/flow/onboarding/OnboardingFlowContract$Step;", "TEMPLATES", "PROJECTIONS", "STRATEGY_REVEAL", "AGREEMENTS", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingFlowContract$Step implements FlowStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnboardingFlowContract$Step[] $VALUES;
    public static final OnboardingFlowContract$Step AGREEMENTS;

    @NotNull
    public static final Parcelable.Creator<OnboardingFlowContract$Step> CREATOR;
    public static final OnboardingFlowContract$Step PROJECTIONS;
    public static final OnboardingFlowContract$Step STRATEGY_REVEAL;
    public static final OnboardingFlowContract$Step TEMPLATES;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return OnboardingFlowContract$Step.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingFlowContract$Step[i];
        }
    }

    static {
        OnboardingFlowContract$Step onboardingFlowContract$Step = new OnboardingFlowContract$Step("TEMPLATES", 0);
        TEMPLATES = onboardingFlowContract$Step;
        OnboardingFlowContract$Step onboardingFlowContract$Step2 = new OnboardingFlowContract$Step("PROJECTIONS", 1);
        PROJECTIONS = onboardingFlowContract$Step2;
        OnboardingFlowContract$Step onboardingFlowContract$Step3 = new OnboardingFlowContract$Step("STRATEGY_REVEAL", 2);
        STRATEGY_REVEAL = onboardingFlowContract$Step3;
        OnboardingFlowContract$Step onboardingFlowContract$Step4 = new OnboardingFlowContract$Step("AGREEMENTS", 3);
        AGREEMENTS = onboardingFlowContract$Step4;
        OnboardingFlowContract$Step[] onboardingFlowContract$StepArr = {onboardingFlowContract$Step, onboardingFlowContract$Step2, onboardingFlowContract$Step3, onboardingFlowContract$Step4};
        $VALUES = onboardingFlowContract$StepArr;
        $ENTRIES = s.n(onboardingFlowContract$StepArr);
        CREATOR = new a();
    }

    public static OnboardingFlowContract$Step valueOf(String str) {
        return (OnboardingFlowContract$Step) Enum.valueOf(OnboardingFlowContract$Step.class, str);
    }

    public static OnboardingFlowContract$Step[] values() {
        return (OnboardingFlowContract$Step[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
