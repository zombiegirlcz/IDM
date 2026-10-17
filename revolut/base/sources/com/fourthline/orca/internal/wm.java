package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wm implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f34740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xm f34741b;

    public wm(boolean z, xm productRepository) {
        Intrinsics.checkNotNullParameter(productRepository, "productRepository");
        this.f34740a = z;
        this.f34741b = productRepository;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        return zhm.u.c(this.f34741b.j() ? zi.f35606a : new bj(null, 1, null));
    }
}
