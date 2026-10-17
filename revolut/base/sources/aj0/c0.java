package aj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class c0 implements d0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5345a;

    public /* synthetic */ c0(int i, String str) {
        if (1 == (i & 1)) {
            this.f5345a = str;
        } else {
            j1.f(a0.f5339a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f5345a, ((c0) obj2).f5345a);
    }

    public final int hashCode() {
        return this.f5345a.hashCode();
    }

    public c0(String paragraph) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        this.f5345a = paragraph;
    }
}
