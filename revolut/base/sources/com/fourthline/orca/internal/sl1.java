package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class sl1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33057a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33059c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sl1(hw hwVar, boolean z, Function0 function0, int i, int i2) {
        this.e = hwVar;
        this.f33058b = z;
        this.f = function0;
        this.f33059c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f33057a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return er0.a((p70) this.e, this.f33058b, this.f33059c, (c81) this.f, this.d, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return iw.a((hw) this.e, this.f33058b, (Function0) this.f, this.f33059c, this.d, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ sl1(p70 p70Var, boolean z, int i, c81 c81Var, int i2) {
        this.e = p70Var;
        this.f33058b = z;
        this.f33059c = i;
        this.f = c81Var;
        this.d = i2;
    }
}
