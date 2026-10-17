package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import com.fourthline.orca.internal.c21;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class sm1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f33065c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;

    public /* synthetic */ sm1(c21.b bVar, Function1 function1, Function0 function0, Function1 function12, int i, int i2) {
        this.f33063a = i2;
        this.f33064b = bVar;
        this.f33065c = function1;
        this.d = function0;
        this.e = function12;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f33063a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return h21.a((c21.b) this.f33064b, this.f33065c, (Function0) this.d, (Function1) this.e, this.f, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return h21.b((c21.b) this.f33064b, this.f33065c, (Function0) this.d, (Function1) this.e, this.f, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return vv0.a((String) this.f33064b, (z10) this.e, (z10) this.d, this.f33065c, this.f, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ sm1(String str, z10 z10Var, z10 z10Var2, Function1 function1, int i) {
        this.f33063a = 2;
        this.f33064b = str;
        this.e = z10Var;
        this.d = z10Var2;
        this.f33065c = function1;
        this.f = i;
    }
}
