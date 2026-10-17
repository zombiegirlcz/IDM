package com.fourthline.orca.internal;

import com.fourthline.orca.internal.q80;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class om1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gp f31697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q80.k f31698c;

    public /* synthetic */ om1(gp gpVar, q80.k kVar, int i) {
        this.f31696a = i;
        this.f31697b = gpVar;
        this.f31698c = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31696a) {
            case 0:
                return gp.a(this.f31697b, this.f31698c);
            case 1:
                return gp.b(this.f31697b, this.f31698c);
            default:
                return gp.c(this.f31697b, this.f31698c);
        }
    }
}
