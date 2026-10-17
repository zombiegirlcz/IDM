package n29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f211466b;

    public /* synthetic */ e0(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(c0.f211461a.getDescriptor(), i, 3);
            throw null;
        }
        this.f211465a = str;
        this.f211466b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f211465a, e0Var.f211465a) && this.f211466b == e0Var.f211466b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211466b) + (this.f211465a.hashCode() * 31);
    }

    public e0(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f211465a = text;
        this.f211466b = z;
    }
}
