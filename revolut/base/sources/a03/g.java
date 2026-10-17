package a03;

import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f121p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f121p = j.f175191a;
    }

    @Override // jki.g
    public final i r2() {
        return this.f121p;
    }
}
