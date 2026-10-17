package com.revolut.feature.shared.consent.prompt.builder.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.consent.prompt.builder.api.model.ConsentPromptData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w6d.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/consent/prompt/builder/impl/ConsentPromptBridgeFeatureConfig$ConsentPromptDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shared_consent_prompt_builder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentPromptBridgeFeatureConfig$ConsentPromptDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ConsentPromptBridgeFeatureConfig$ConsentPromptDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentPromptData f86094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f86095b;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentPromptBridgeFeatureConfig$ConsentPromptDestination((ConsentPromptData) parcel.readParcelable(ConsentPromptBridgeFeatureConfig$ConsentPromptDestination.class.getClassLoader()), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentPromptBridgeFeatureConfig$ConsentPromptDestination[i];
        }
    }

    public ConsentPromptBridgeFeatureConfig$ConsentPromptDestination(ConsentPromptData consentPromptData, b consentPromptType) {
        Intrinsics.checkNotNullParameter(consentPromptData, "consentPromptData");
        Intrinsics.checkNotNullParameter(consentPromptType, "consentPromptType");
        this.f86094a = consentPromptData;
        this.f86095b = consentPromptType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentPromptBridgeFeatureConfig$ConsentPromptDestination)) {
            return false;
        }
        ConsentPromptBridgeFeatureConfig$ConsentPromptDestination consentPromptBridgeFeatureConfig$ConsentPromptDestination = (ConsentPromptBridgeFeatureConfig$ConsentPromptDestination) obj2;
        return Intrinsics.f(this.f86094a, consentPromptBridgeFeatureConfig$ConsentPromptDestination.f86094a) && this.f86095b == consentPromptBridgeFeatureConfig$ConsentPromptDestination.f86095b;
    }

    public final int hashCode() {
        return this.f86095b.hashCode() + (this.f86094a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86094a, i);
        dest.writeString(this.f86095b.name());
    }
}
