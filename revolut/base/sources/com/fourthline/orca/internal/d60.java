package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c60;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d60 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27656a;

    public d60(boolean z) {
        this.f27656a = z;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        c60[] elements = {b() ? c60.d.f27381a : null, new c60.a(null, 1, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public boolean b() {
        return this.f27656a;
    }
}
