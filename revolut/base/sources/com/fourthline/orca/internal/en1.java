package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class en1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zp0 f28209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28210c;

    public /* synthetic */ en1(zp0 zp0Var, int i, int i2) {
        this.f28208a = i2;
        this.f28209b = zp0Var;
        this.f28210c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f28208a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return hi0.b(this.f28209b, this.f28210c, composer, iIntValue);
            default:
                return hi0.a(this.f28209b, this.f28210c, composer, iIntValue);
        }
    }
}
