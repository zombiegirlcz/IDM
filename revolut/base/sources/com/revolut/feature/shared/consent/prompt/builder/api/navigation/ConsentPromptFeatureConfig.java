package com.revolut.feature.shared.consent.prompt.builder.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.consent.prompt.builder.api.model.ConsentPromptData;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w6d.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/consent/prompt/builder/api/navigation/ConsentPromptFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Default", "Lcom/revolut/feature/shared/consent/prompt/builder/api/navigation/ConsentPromptFeatureConfig$Default;", "feature_shared_consent_prompt_builder_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConsentPromptFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/consent/prompt/builder/api/navigation/ConsentPromptFeatureConfig$Default;", "Lcom/revolut/feature/shared/consent/prompt/builder/api/navigation/ConsentPromptFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_shared_consent_prompt_builder_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends ConsentPromptFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentPromptData f86092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f86093b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(ConsentPromptData.CREATOR.createFromParcel(parcel), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(ConsentPromptData consentPromptData, b promptType) {
            Intrinsics.checkNotNullParameter(consentPromptData, "consentPromptData");
            Intrinsics.checkNotNullParameter(promptType, "promptType");
            this.f86092a = consentPromptData;
            this.f86093b = promptType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f86092a, r56.f86092a) && this.f86093b == r56.f86093b;
        }

        public final int hashCode() {
            return this.f86093b.hashCode() + (this.f86092a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f86092a.writeToParcel(dest, i);
            dest.writeString(this.f86093b.name());
        }
    }

    private ConsentPromptFeatureConfig() {
    }
}
