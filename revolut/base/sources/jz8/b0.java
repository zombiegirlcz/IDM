package jz8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b0 extends s {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179605b;

    public /* synthetic */ b0(int i, String str) {
        if (1 == (i & 1)) {
            this.f179605b = str;
        } else {
            j1.f(z.f179682a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f179605b, ((b0) obj2).f179605b);
    }

    public final int hashCode() {
        return this.f179605b.hashCode();
    }

    public b0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f179605b = text;
    }
}
