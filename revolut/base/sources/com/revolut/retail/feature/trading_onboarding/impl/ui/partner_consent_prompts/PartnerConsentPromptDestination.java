package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_prompts/PartnerConsentPromptDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_prompts/PartnerConsentPromptDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "q0l/a", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PartnerConsentPromptDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PartnerConsentPromptDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0l.a f104256b;

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_prompts/PartnerConsentPromptDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0l.a f104257a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(q0l.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(q0l.a promptType) {
            Intrinsics.checkNotNullParameter(promptType, "promptType");
            this.f104257a = promptType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && this.f104257a == ((InputData) obj2).f104257a;
        }

        public final int hashCode() {
            return this.f104257a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104257a.name());
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PartnerConsentPromptDestination(q0l.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PartnerConsentPromptDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerConsentPromptDestination(q0l.a promptType) {
        super(new InputData(promptType));
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        this.f104256b = promptType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PartnerConsentPromptDestination) && this.f104256b == ((PartnerConsentPromptDestination) obj2).f104256b;
    }

    public final int hashCode() {
        return this.f104256b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104256b.name());
    }
}
