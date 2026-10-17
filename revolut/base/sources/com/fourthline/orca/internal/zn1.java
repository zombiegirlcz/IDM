package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class zn1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35651a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35653c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zn1(int i, Bitmap bitmap, boolean z) {
        this.f35652b = i;
        this.d = bitmap;
        this.f35653c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f35651a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return j70.a(this.f35653c, this.f35652b, (p70) this.d, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return pe1.a(this.f35652b, (Bitmap) this.d, this.f35653c, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ zn1(boolean z, int i, p70 p70Var) {
        this.f35653c = z;
        this.f35652b = i;
        this.d = p70Var;
    }
}
