package com.fourthline.core.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class e0 extends n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IntRange f26348h;
    private final List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String mrz, boolean z) {
        super(mrz, z, null, 4, null);
        Intrinsics.checkNotNullParameter(mrz, "mrz");
        this.f26348h = kotlin.ranges.f.o(36, 45);
        this.i = zhm.v.k(kotlin.ranges.f.o(64, 64), kotlin.ranges.f.o(64, 66));
    }

    @Override // com.fourthline.core.internal.n
    public List d() {
        return this.i;
    }

    @Override // com.fourthline.core.internal.n
    public IntRange f() {
        return this.f26348h;
    }
}
