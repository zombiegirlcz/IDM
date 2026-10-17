package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class z6 implements lb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f35526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d3 f35527b;

    public z6(List supportedTypes, d3 bundle) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f35526a = supportedTypes;
        this.f35527b = bundle;
    }

    @Override // com.fourthline.orca.internal.lb1
    public List getSupportedTypes() {
        return this.f35526a;
    }

    @Override // com.fourthline.orca.internal.lb1
    public void a(t5 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f35527b.a(type);
    }
}
