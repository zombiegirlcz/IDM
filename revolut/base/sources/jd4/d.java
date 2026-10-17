package jd4;

import jki.g;
import jki.h;
import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f172976p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f172976p = j.f175191a;
    }

    @Override // jki.g
    public final i r2() {
        return this.f172976p;
    }
}
