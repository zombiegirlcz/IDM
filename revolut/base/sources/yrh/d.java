package yrh;

import jki.g;
import jki.h;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f316319p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f316319p = c.f316318a;
    }

    @Override // jki.g
    public final i r2() {
        return this.f316319p;
    }
}
