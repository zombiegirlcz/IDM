package com.fourthline.orca.internal;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class sk1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f33044b;

    public /* synthetic */ sk1(Context context, int i) {
        this.f33043a = i;
        this.f33044b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33043a) {
            case 0:
                return d70.a(this.f33044b);
            case 1:
                return k21.a(this.f33044b);
            case 2:
                return q7.a(this.f33044b);
            default:
                return xo.a(this.f33044b);
        }
    }
}
