package cn3;

import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContactsChooserInputData f25342a;

    public a(ContactsChooserInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f25342a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f25342a, ((a) obj2).f25342a);
    }

    public final int hashCode() {
        return this.f25342a.hashCode();
    }
}
