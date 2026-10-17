package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class on1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sj0 f31702b;

    public /* synthetic */ on1(sj0 sj0Var, int i) {
        this.f31701a = i;
        this.f31702b = sj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zA;
        switch (this.f31701a) {
            case 0:
                zA = hn0.a(this.f31702b);
                break;
            case 1:
                zA = hp.a(this.f31702b);
                break;
            case 2:
                zA = lt0.a(this.f31702b);
                break;
            case 3:
                zA = rj.a(this.f31702b);
                break;
            default:
                zA = s01.a(this.f31702b);
                break;
        }
        return Boolean.valueOf(zA);
    }
}
