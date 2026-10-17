package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientSettingsNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipientSettingsNavigation$InputData.Id f20322a;

    public b0(ApmRecipientSettingsNavigation$InputData.Id inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f20322a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && this.f20322a.equals(((b0) obj2).f20322a);
    }

    public final int hashCode() {
        return this.f20322a.hashCode();
    }
}
