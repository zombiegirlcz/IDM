package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ld0;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class md0 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31163a;

    public md0(boolean z) {
        this.f31163a = z;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        return zhm.u.c(b() ? ld0.a.f30588a : new ld0.b(null, 1, null));
    }

    public boolean b() {
        return this.f31163a;
    }
}
