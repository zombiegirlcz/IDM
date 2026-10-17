package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class nk1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31440c;
    public final /* synthetic */ int d;

    public /* synthetic */ nk1(int i, int i2, int i3, int i5) {
        this.f31438a = i5;
        this.f31439b = i;
        this.f31440c = i2;
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f31438a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return ci0.a(this.f31439b, this.f31440c, this.d, composer, iIntValue);
            default:
                return jf0.a(this.f31439b, this.f31440c, this.d, composer, iIntValue);
        }
    }
}
