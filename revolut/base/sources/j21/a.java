package j21;

import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import mmm.j;
import mmm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends u {
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, j delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = bVar;
    }

    @Override // mmm.u, mmm.q0
    public final void write(h source, long j2) {
        Intrinsics.checkNotNullParameter(source, "source");
        super.write(source, j2);
        this.d.f170654j.invoke(Long.valueOf(j2));
    }
}
