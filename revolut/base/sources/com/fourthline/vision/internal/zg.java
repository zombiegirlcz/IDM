package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class zg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y7 f37205b;

    public /* synthetic */ zg(y7 y7Var, int i) {
        this.f37204a = i;
        this.f37205b = y7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37204a) {
            case 0:
                return this.f37205b.config();
            case 1:
                return j5.buildDaggerSubcomponent$lambda$2(this.f37205b);
            default:
                return j5.LegacyDocumentScanner$lambda$5$1$0(this.f37205b);
        }
    }
}
