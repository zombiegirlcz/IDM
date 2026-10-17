package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x extends u {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146860b;

    public /* synthetic */ x(int i, String str) {
        if (1 == (i & 1)) {
            this.f146860b = str;
        } else {
            qlm.j1.f(v.f146844a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f146860b, ((x) obj2).f146860b);
    }

    public final int hashCode() {
        return this.f146860b.hashCode();
    }

    public x(String policyId) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f146860b = policyId;
    }
}
