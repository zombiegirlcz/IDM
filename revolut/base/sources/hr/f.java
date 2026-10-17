package hr;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes17.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154747a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f154747a = str;
        } else {
            j1.f(d.f154746a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f154747a, ((f) obj2).f154747a);
    }

    public final int hashCode() {
        return this.f154747a.hashCode();
    }

    public f(String nonce) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        this.f154747a = nonce;
    }
}
