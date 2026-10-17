package d7d;

import com.revolut.feature.shared.consent.prompt.builder.api.model.ConsentPromptData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentPromptData f111922a;

    public d(ConsentPromptData consentPromptData) {
        Intrinsics.checkNotNullParameter(consentPromptData, "consentPromptData");
        this.f111922a = consentPromptData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f111922a, ((d) obj2).f111922a);
    }

    public final int hashCode() {
        return this.f111922a.hashCode();
    }
}
