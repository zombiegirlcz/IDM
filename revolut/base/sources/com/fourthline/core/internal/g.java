package com.fourthline.core.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class g extends n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IntRange f26352h;
    private final List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String mrz) {
        super(mrz, true, null, 4, null);
        Intrinsics.checkNotNullParameter(mrz, "mrz");
        this.f26352h = kotlin.ranges.f.o(36, 48);
        this.i = zhm.f0.f322471a;
    }

    @Override // com.fourthline.core.internal.n
    public List d() {
        return this.i;
    }

    @Override // com.fourthline.core.internal.n
    public IntRange f() {
        return this.f26352h;
    }
}
