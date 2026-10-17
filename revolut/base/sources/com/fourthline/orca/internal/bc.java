package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ac;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bc implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27092a;

    public bc(boolean z) {
        this.f27092a = z;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        ac[] elements = {b() ? ac.b.f26769a : null, new ac.a(null, 1, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public boolean b() {
        return this.f27092a;
    }
}
