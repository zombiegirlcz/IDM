package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class lo1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv f30720b;

    public /* synthetic */ lo1(jv jvVar, int i) {
        this.f30719a = i;
        this.f30720b = jvVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f30719a) {
            case 0:
                return jv.a(this.f30720b, (ff0) obj2);
            case 1:
                return jv.b(this.f30720b, (ff0) obj2);
            default:
                return jv.c(this.f30720b, (ff0) obj2);
        }
    }
}
