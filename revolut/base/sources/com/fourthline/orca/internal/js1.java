package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class js1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv0 f30026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30027c;

    public /* synthetic */ js1(dv0 dv0Var, int i, int i2) {
        this.f30025a = i2;
        this.f30026b = dv0Var;
        this.f30027c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f30025a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return u00.a(this.f30026b, this.f30027c, composer, iIntValue);
            case 1:
                return u00.b(this.f30026b, this.f30027c, composer, iIntValue);
            case 2:
                return u00.d(this.f30026b, this.f30027c, composer, iIntValue);
            case 3:
                return u00.c(this.f30026b, this.f30027c, composer, iIntValue);
            default:
                return u00.e(this.f30026b, this.f30027c, composer, iIntValue);
        }
    }
}
