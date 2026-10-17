package com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.consent.prompt.builder.api.model.ConsentPromptData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w6d.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/consent/prompt/builder/impl/ui/flow/ConsentPromptFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_consent_prompt_builder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentPromptFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ConsentPromptFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentPromptData f86096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f86097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86098c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentPromptFlowContract$InputData((ConsentPromptData) parcel.readParcelable(ConsentPromptFlowContract$InputData.class.getClassLoader()), b.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentPromptFlowContract$InputData[i];
        }
    }

    public ConsentPromptFlowContract$InputData(ConsentPromptData consentPromptData, b consentPromptType, boolean z) {
        Intrinsics.checkNotNullParameter(consentPromptData, "consentPromptData");
        Intrinsics.checkNotNullParameter(consentPromptType, "consentPromptType");
        this.f86096a = consentPromptData;
        this.f86097b = consentPromptType;
        this.f86098c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentPromptFlowContract$InputData)) {
            return false;
        }
        ConsentPromptFlowContract$InputData consentPromptFlowContract$InputData = (ConsentPromptFlowContract$InputData) obj2;
        return Intrinsics.f(this.f86096a, consentPromptFlowContract$InputData.f86096a) && this.f86097b == consentPromptFlowContract$InputData.f86097b && this.f86098c == consentPromptFlowContract$InputData.f86098c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86098c) + ((this.f86097b.hashCode() + (this.f86096a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86096a, i);
        dest.writeString(this.f86097b.name());
        dest.writeInt(this.f86098c ? 1 : 0);
    }
}
