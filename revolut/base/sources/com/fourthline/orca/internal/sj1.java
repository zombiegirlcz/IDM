package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import com.fourthline.orca.internal.zp0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class sj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zp0.b f33038b;

    public /* synthetic */ sj1(zp0.b bVar, int i) {
        this.f33037a = i;
        this.f33038b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f33037a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return bz.c(this.f33038b, composer, iIntValue);
            case 1:
                return bz.d(this.f33038b, composer, iIntValue);
            case 2:
                return bz.a(this.f33038b, composer, iIntValue);
            default:
                return bz.b(this.f33038b, composer, iIntValue);
        }
    }
}
