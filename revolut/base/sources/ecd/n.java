package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f124622a;

    public /* synthetic */ n(int i, m mVar) {
        if (1 == (i & 1)) {
            this.f124622a = mVar;
        } else {
            qlm.j1.f(i.f124568a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f124622a, ((n) obj2).f124622a);
    }

    public final int hashCode() {
        m mVar = this.f124622a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public n(m mVar) {
        this.f124622a = mVar;
    }
}
