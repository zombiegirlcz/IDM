package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class xk1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p70 f35018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35019c;

    public /* synthetic */ xk1(p70 p70Var, int i, int i2) {
        this.f35017a = i2;
        this.f35018b = p70Var;
        this.f35019c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f35017a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return dr0.a(this.f35018b, this.f35019c, composer, iIntValue);
            default:
                return hi0.a(this.f35018b, this.f35019c, composer, iIntValue);
        }
    }
}
