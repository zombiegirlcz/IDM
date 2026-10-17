package pzk;

import jki.g;
import jki.h;
import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f241013p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f241013p = j.f175191a;
    }

    @Override // jki.g
    public final i r2() {
        return this.f241013p;
    }
}
