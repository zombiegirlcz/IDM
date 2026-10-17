package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class gq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28966a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28968c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gq1(k41 k41Var, kd1 kd1Var, String str, boolean z) {
        this.d = k41Var;
        this.f28967b = str;
        this.f28968c = z;
        this.e = kd1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f28966a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return nq.a(this.f28967b, (p41) this.e, (String) this.d, this.f28968c, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return wg0.a((k41) this.d, this.f28967b, this.f28968c, (kd1) this.e, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ gq1(String str, p41 p41Var, String str2, boolean z) {
        this.f28967b = str;
        this.e = p41Var;
        this.d = str2;
        this.f28968c = z;
    }
}
