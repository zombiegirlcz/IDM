package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class zj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35620c;
    public final /* synthetic */ int d;

    public /* synthetic */ zj1(Object obj2, int i, int i2, int i3) {
        this.f35618a = i3;
        this.f35619b = obj2;
        this.f35620c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f35618a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return c40.a((Modifier) this.f35619b, this.f35620c, this.d, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return o7.a((Modifier) this.f35619b, this.f35620c, this.d, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return wg0.a((br0) this.f35619b, this.f35620c, this.d, (Composer) obj2, iIntValue3);
        }
    }
}
