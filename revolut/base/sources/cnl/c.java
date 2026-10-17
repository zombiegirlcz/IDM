package cnl;

import jki.g;
import jki.h;
import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f25469p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f25469p = j.f175191a;
    }

    @Override // jki.g
    public final i r2() {
        return this.f25469p;
    }
}
