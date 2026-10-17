package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ok1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f31682b;

    public /* synthetic */ ok1(d dVar, int i) {
        this.f31681a = i;
        this.f31682b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31681a) {
            case 0:
                return d.b(this.f31682b);
            case 1:
                return Boolean.valueOf(d.c(this.f31682b));
            case 2:
                return d.d(this.f31682b);
            default:
                return d.a(this.f31682b);
        }
    }
}
