package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class er1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po f28253b;

    public /* synthetic */ er1(po poVar, int i) {
        this.f28252a = i;
        this.f28253b = poVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28252a) {
            case 0:
                return po.a(this.f28253b);
            default:
                return po.b(this.f28253b);
        }
    }
}
