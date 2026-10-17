package pjl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236843a;

    public r(List accounts) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f236843a = accounts;
    }

    public final List a() {
        return this.f236843a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f236843a, ((r) obj2).f236843a);
    }

    public final int hashCode() {
        return this.f236843a.hashCode();
    }
}
