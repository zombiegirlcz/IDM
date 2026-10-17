package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qf0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class or1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qf0 f31754b;

    public /* synthetic */ or1(qf0 qf0Var, int i) {
        this.f31753a = i;
        this.f31754b = qf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31753a) {
            case 0:
                return qf0.d.a(this.f31754b, (ff0) obj2);
            case 1:
                return qf0.a(this.f31754b, (ff0) obj2);
            case 2:
                return qf0.c(this.f31754b, (ff0) obj2);
            default:
                return qf0.b(this.f31754b, (ff0) obj2);
        }
    }
}
