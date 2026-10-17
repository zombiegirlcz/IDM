package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class yg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i8 f37172b;

    public /* synthetic */ yg(i8 i8Var, int i) {
        this.f37171a = i;
        this.f37172b = i8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f37171a) {
            case 0:
                return i8.createMediaCodec$lambda$1(this.f37172b, (Throwable) obj2);
            default:
                return i8.tryReset$lambda$1(this.f37172b, (Throwable) obj2);
        }
    }
}
