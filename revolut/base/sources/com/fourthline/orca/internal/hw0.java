package com.fourthline.orca.internal;

import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.z11;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hw0 extends a3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p80 f29425c;
    private final q80.b d;

    public hw0() {
        p80 p80Var = new p80(false, false, false, new sp0(q80.u.e.f32326b, false, false, 4, null), 7, null);
        this.f29425c = p80Var;
        this.d = new q80.b(p80Var);
    }

    @Override // com.fourthline.orca.internal.a3
    public q80 a(z11.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof z11.a.C0320a) {
            return this.d;
        }
        if (aVar instanceof z11.a.c) {
            return new q80.u.a(this.f29425c);
        }
        if (aVar instanceof z11.a.d) {
            return this.d;
        }
        if (aVar instanceof z11.a.b) {
            return new q80.l(((z11.a.b) aVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
