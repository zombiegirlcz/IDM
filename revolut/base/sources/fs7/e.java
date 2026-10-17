package fs7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137621a;

    public /* synthetic */ e(int i, String str) {
        if (1 == (i & 1)) {
            this.f137621a = str;
        } else {
            j1.f(c.f137617a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f137621a, ((e) obj2).f137621a);
    }

    public final int hashCode() {
        return this.f137621a.hashCode();
    }

    public e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f137621a = text;
    }
}
