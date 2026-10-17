package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ws1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag f34786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34787c;

    public /* synthetic */ ws1(ag agVar, int i, int i2) {
        this.f34785a = i2;
        this.f34786b = agVar;
        this.f34787c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f34785a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return wg.b(this.f34786b, this.f34787c, composer, iIntValue);
            default:
                return wg.a(this.f34786b, this.f34787c, composer, iIntValue);
        }
    }
}
