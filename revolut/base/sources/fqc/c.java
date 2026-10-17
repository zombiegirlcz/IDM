package fqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137242a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f137242a = str;
        } else {
            j1.f(a.f137241a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f137242a, ((c) obj2).f137242a);
    }

    public final int hashCode() {
        return this.f137242a.hashCode();
    }

    public c(String disputeReason) {
        Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
        this.f137242a = disputeReason;
    }
}
