package stj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265608a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f265608a = str;
        } else {
            j1.f(d.f265607a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f265608a, ((f) obj2).f265608a);
    }

    public final int hashCode() {
        return this.f265608a.hashCode();
    }

    public f(String challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.f265608a = challengeId;
    }
}
