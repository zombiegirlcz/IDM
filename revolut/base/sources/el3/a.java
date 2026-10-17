package el3;

import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddContactInputData f127235a;

    public a(AddContactInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f127235a = inputData;
    }

    public final AddContactInputData b() {
        return this.f127235a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f127235a, ((a) obj2).f127235a);
    }

    public final int hashCode() {
        return this.f127235a.hashCode();
    }
}
