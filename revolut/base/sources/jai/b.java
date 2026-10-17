package jai;

import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContactsChooserInputData f172481b;

    public b(String workflowStepId, ContactsChooserInputData chooserInputData) {
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        Intrinsics.checkNotNullParameter(chooserInputData, "chooserInputData");
        this.f172480a = workflowStepId;
        this.f172481b = chooserInputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f172480a, bVar.f172480a) && Intrinsics.f(this.f172481b, bVar.f172481b);
    }

    public final int hashCode() {
        return this.f172481b.hashCode() + (this.f172480a.hashCode() * 31);
    }
}
