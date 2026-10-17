package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class de1 implements ce1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f27718a;

    public de1(Function0 resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f27718a = resources;
    }

    @Override // com.fourthline.orca.internal.ce1
    public String a(c81 resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        return d81.a(resource, this.f27718a);
    }
}
