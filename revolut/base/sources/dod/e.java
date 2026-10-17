package dod;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f116541b;

    public e(ArrayList accountIds) {
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        this.f116541b = accountIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f116541b.equals(((e) obj2).f116541b);
    }

    public final int hashCode() {
        return this.f116541b.hashCode();
    }
}
