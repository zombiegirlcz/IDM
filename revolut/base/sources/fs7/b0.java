package fs7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b0 extends y {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f137616b;

    public /* synthetic */ b0(int i, u uVar) {
        if (1 == (i & 1)) {
            this.f137616b = uVar;
        } else {
            j1.f(z.f137655a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f137616b, ((b0) obj2).f137616b);
    }

    public final int hashCode() {
        return this.f137616b.hashCode();
    }

    public b0(u details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f137616b = details;
    }
}
