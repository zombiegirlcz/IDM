package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ak0 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26830a;

    public ak0(boolean z) {
        this.f26830a = z;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        ck0[] elements = {b() ? ck0.c.f27494a : null, new ck0.a(null, 1, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public boolean b() {
        return this.f26830a;
    }
}
