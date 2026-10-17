package com.fourthline.orca.internal;

import androidx.view.result.ActivityResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class to1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ub.a f33818b;

    public /* synthetic */ to1(ub.a aVar, int i) {
        this.f33817a = i;
        this.f33818b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f33817a) {
            case 0:
                return k21.a(this.f33818b, (ActivityResult) obj2);
            case 1:
                return q7.a(this.f33818b, (ActivityResult) obj2);
            default:
                return xo.a(this.f33818b, (ActivityResult) obj2);
        }
    }
}
