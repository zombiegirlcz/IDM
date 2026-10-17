package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ym1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hh f35393b;

    public /* synthetic */ ym1(hh hhVar, int i) {
        this.f35392a = i;
        this.f35393b = hhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35392a) {
            case 0:
                return hh.b(this.f35393b);
            default:
                return hh.a(this.f35393b);
        }
    }
}
