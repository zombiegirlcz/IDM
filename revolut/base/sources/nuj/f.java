package nuj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219325a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f219325a = str;
        } else {
            j1.f(d.f219324a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f219325a, ((f) obj2).f219325a);
    }

    public final int hashCode() {
        return this.f219325a.hashCode();
    }

    public f(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f219325a = type;
    }
}
