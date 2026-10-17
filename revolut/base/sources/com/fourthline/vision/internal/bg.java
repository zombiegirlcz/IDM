package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b8 f36028b;

    public /* synthetic */ bg(b8 b8Var, int i) {
        this.f36027a = i;
        this.f36028b = b8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36027a) {
            case 0:
                return a8.LegacySelfieScanner$lambda$4$1$0(this.f36028b);
            case 1:
                return this.f36028b.config();
            default:
                return a8.buildDaggerSubcomponent$lambda$2(this.f36028b);
        }
    }
}
