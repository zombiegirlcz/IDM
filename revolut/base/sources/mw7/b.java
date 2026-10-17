package mw7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209402a;

    public b(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f209402a = planId;
    }

    public final String a() {
        return j6.a.q("insurance-home-layout-", this.f209402a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f209402a, ((b) obj2).f209402a);
    }

    public final int hashCode() {
        return this.f209402a.hashCode();
    }
}
