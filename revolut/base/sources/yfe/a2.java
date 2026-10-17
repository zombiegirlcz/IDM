package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class a2 implements f2 {

    @NotNull
    public static final z1 Companion = new z1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313241a;

    public /* synthetic */ a2(int i, String str) {
        if (1 == (i & 1)) {
            this.f313241a = str;
        } else {
            qlm.j1.f(y1.f313327a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a2) && Intrinsics.f(this.f313241a, ((a2) obj2).f313241a);
    }

    public final int hashCode() {
        return this.f313241a.hashCode();
    }

    public a2(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f313241a = code;
    }
}
