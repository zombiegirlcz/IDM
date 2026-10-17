package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class jp1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gq f29999b;

    public /* synthetic */ jp1(gq gqVar, int i) {
        this.f29998a = i;
        this.f29999b = gqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29998a) {
            case 0:
                return m00.b(this.f29999b);
            case 1:
                return m00.c(this.f29999b);
            case 2:
                return m00.a(this.f29999b);
            default:
                return m00.d(this.f29999b);
        }
    }
}
