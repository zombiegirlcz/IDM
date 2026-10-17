package com.fourthline.orca.internal;

import com.fourthline.orca.internal.l01;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class m01 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30917a;

    public m01(boolean z) {
        this.f30917a = z;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        return zhm.u.c(b() ? l01.a.f30497a : new l01.b(null, 1, null));
    }

    public boolean b() {
        return this.f30917a;
    }
}
