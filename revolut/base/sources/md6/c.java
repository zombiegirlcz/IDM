package md6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ld6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f204488a;

    public c(ArrayList accounts) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f204488a = accounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f204488a.equals(((c) obj2).f204488a);
    }

    public final int hashCode() {
        return this.f204488a.hashCode();
    }
}
