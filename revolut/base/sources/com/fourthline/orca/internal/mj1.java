package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class mj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f31204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31205c;

    public /* synthetic */ mj1(int i, int i2, Function1 function1) {
        this.f31203a = i2;
        this.f31204b = function1;
        this.f31205c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f31203a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return bg1.a(this.f31204b, this.f31205c, composer, iIntValue);
            case 1:
                return mg0.a(this.f31204b, this.f31205c, composer, iIntValue);
            case 2:
                return r7.a(this.f31204b, this.f31205c, composer, iIntValue);
            default:
                return com.fourthline.vision.internal.v1.OnLifecycleEvent$lambda$1(this.f31204b, this.f31205c, composer, iIntValue);
        }
    }
}
