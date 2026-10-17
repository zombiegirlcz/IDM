package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class gp1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gj f28964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yj0 f28965c;

    public /* synthetic */ gp1(gj gjVar, yj0 yj0Var, int i) {
        this.f28963a = i;
        this.f28964b = gjVar;
        this.f28965c = yj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zD;
        switch (this.f28963a) {
            case 0:
                zD = l50.d(this.f28964b, this.f28965c);
                break;
            default:
                zD = l50.b(this.f28964b, this.f28965c);
                break;
        }
        return Boolean.valueOf(zD);
    }
}
