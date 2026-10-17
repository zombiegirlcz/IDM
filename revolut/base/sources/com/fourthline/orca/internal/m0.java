package com.fourthline.orca.internal;

import com.fourthline.orca.internal.l0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m0 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30916a;

    public m0(boolean z) {
        this.f30916a = z;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        l0[] elements = {b() ? l0.b.f30496a : null, new l0.a(null, 1, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public boolean b() {
        return this.f30916a;
    }
}
