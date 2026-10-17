package cke;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24822b;

    public e(List accountStates, String selectedAccountId) {
        Intrinsics.checkNotNullParameter(accountStates, "accountStates");
        Intrinsics.checkNotNullParameter(selectedAccountId, "selectedAccountId");
        this.f24821a = accountStates;
        this.f24822b = selectedAccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f24821a, eVar.f24821a) && Intrinsics.f(this.f24822b, eVar.f24822b);
    }

    public final int hashCode() {
        return this.f24822b.hashCode() + (this.f24821a.hashCode() * 31);
    }
}
