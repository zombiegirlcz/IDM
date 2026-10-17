package com.fourthline.orca.internal;

import com.fourthline.orca.internal.i91;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o81 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31606a;

    public o81(boolean z) {
        this.f31606a = z;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        i91[] elements = {b() ? i91.d.f29538a : null, new i91.b(null, 1, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public boolean b() {
        return this.f31606a;
    }
}
