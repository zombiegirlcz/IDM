package com.revolut.feature.slot_manager.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/api/navigation/SlotManagerFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Prompt", "PromptDestination", "Lcom/revolut/feature/slot_manager/api/navigation/SlotManagerFeatureConfig$Prompt;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SlotManagerFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/api/navigation/SlotManagerFeatureConfig$Prompt;", "Lcom/revolut/feature/slot_manager/api/navigation/SlotManagerFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt extends SlotManagerFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SlotDefaultPrompt f87347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AnalyticsProduct f87348h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt(SlotDefaultPrompt.CREATOR.createFromParcel(parcel), (AnalyticsProduct) parcel.readParcelable(Prompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Prompt(SlotDefaultPrompt prompt, AnalyticsProduct analyticsProduct) {
            super(null, new PromptDestination(prompt, analyticsProduct), false, null, 0, 61);
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f87347g = prompt;
            this.f87348h = analyticsProduct;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Prompt)) {
                return false;
            }
            Prompt prompt = (Prompt) obj2;
            return Intrinsics.f(this.f87347g, prompt.f87347g) && Intrinsics.f(this.f87348h, prompt.f87348h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f87348h.hashCode() + (this.f87347g.hashCode() * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f87347g.writeToParcel(dest, i);
            dest.writeParcelable(this.f87348h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/api/navigation/SlotManagerFeatureConfig$PromptDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PromptDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PromptDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlotDefaultPrompt f87349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f87350b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PromptDestination(SlotDefaultPrompt.CREATOR.createFromParcel(parcel), (AnalyticsProduct) parcel.readParcelable(PromptDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromptDestination[i];
            }
        }

        public PromptDestination(SlotDefaultPrompt prompt, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f87349a = prompt;
            this.f87350b = analyticsProduct;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF87350b() {
            return this.f87350b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SlotDefaultPrompt getF87349a() {
            return this.f87349a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PromptDestination)) {
                return false;
            }
            PromptDestination promptDestination = (PromptDestination) obj2;
            return Intrinsics.f(this.f87349a, promptDestination.f87349a) && Intrinsics.f(this.f87350b, promptDestination.f87350b);
        }

        public final int hashCode() {
            return this.f87350b.hashCode() + (this.f87349a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f87349a.writeToParcel(dest, i);
            dest.writeParcelable(this.f87350b, i);
        }
    }
}
