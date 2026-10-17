package com.fourthline.orca.internal;

import com.fourthline.orca.internal.kp0;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class lp0 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30724a;

    public lp0(boolean z) {
        this.f30724a = z;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        return zhm.u.c(b() ? kp0.a.f30355a : new kp0.b(null, 1, null));
    }

    public boolean b() {
        return this.f30724a;
    }
}
