package og6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f225046a;

    public g(ArrayList groupedLinkedAccounts) {
        Intrinsics.checkNotNullParameter(groupedLinkedAccounts, "groupedLinkedAccounts");
        this.f225046a = groupedLinkedAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f225046a.equals(((g) obj2).f225046a);
    }

    public final int hashCode() {
        return this.f225046a.hashCode();
    }
}
