package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class tm1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33807b;

    public /* synthetic */ tm1(int i, int i2) {
        this.f33806a = i2;
        this.f33807b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f33806a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return h21.a(this.f33807b, composer, iIntValue);
            case 1:
                return je0.a(this.f33807b, composer, iIntValue);
            case 2:
                return o7.a(this.f33807b, composer, iIntValue);
            case 3:
                return o7.b(this.f33807b, composer, iIntValue);
            case 4:
                return qf.a(this.f33807b, composer, iIntValue);
            default:
                return com.fourthline.vision.internal.wf.KeepScreenOn$lambda$1(this.f33807b, composer, iIntValue);
        }
    }
}
