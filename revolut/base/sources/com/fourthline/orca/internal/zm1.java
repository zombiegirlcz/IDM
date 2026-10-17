package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class zm1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zp0 f35642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f35643c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f35644g;

    public /* synthetic */ zm1(zp0 zp0Var, Function1 function1, Function1 function12, Function2 function2, int i, int i2, int i3) {
        this.f35641a = i3;
        this.f35642b = zp0Var;
        this.f35643c = function1;
        this.d = function12;
        this.e = function2;
        this.f = i;
        this.f35644g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f35641a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return hi0.b(this.f35642b, this.f35643c, this.d, this.e, this.f, this.f35644g, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return hi0.a(this.f35642b, this.f35643c, this.d, this.e, this.f, this.f35644g, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                zp0 zp0Var = this.f35642b;
                Function1 function1 = this.f35643c;
                Function1 function12 = this.d;
                return hi0.a(zp0Var, this.e, function1, function12, this.f, this.f35644g, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ zm1(zp0 zp0Var, Function2 function2, Function1 function1, Function1 function12, int i, int i2) {
        this.f35641a = 2;
        this.f35642b = zp0Var;
        this.e = function2;
        this.f35643c = function1;
        this.d = function12;
        this.f = i;
        this.f35644g = i2;
    }
}
