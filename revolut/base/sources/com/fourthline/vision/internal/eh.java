package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class eh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fa f36151b;

    public /* synthetic */ eh(fa faVar, int i) {
        this.f36150a = i;
        this.f36151b = faVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36150a) {
            case 0:
                return o6.process$lambda$1(this.f36151b, (fa) obj2);
            default:
                return p6.process$lambda$1(this.f36151b, (fa) obj2);
        }
    }
}
