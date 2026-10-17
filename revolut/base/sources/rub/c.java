package rub;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f257511a;

    public c() {
        this.f257511a = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f257511a, ((c) obj2).f257511a);
    }

    public final int hashCode() {
        i iVar = this.f257511a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public /* synthetic */ c(int i, i iVar) {
        if (1 == (i & 1)) {
            this.f257511a = iVar;
        } else {
            j1.f(a.f257510a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
