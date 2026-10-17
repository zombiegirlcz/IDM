package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.fourthline.orca.internal.sq;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class uo1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34150a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f34151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34152c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f34153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f34154h;
    public final /* synthetic */ Object i;

    public /* synthetic */ uo1(Modifier modifier, sq.b bVar, String str, z10 z10Var, Function0 function0, String str2, int i, int i2) {
        this.e = modifier;
        this.f = bVar;
        this.f34153g = str;
        this.f34154h = z10Var;
        this.f34151b = function0;
        this.i = str2;
        this.f34152c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f34150a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return k31.a((c81) this.e, (p70) this.f, (a9) this.f34153g, this.f34151b, (Function0) this.f34154h, (Function0) this.i, this.f34152c, this.d, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return nq.a((Modifier) this.e, (sq.b) this.f, (String) this.f34153g, (z10) this.f34154h, this.f34151b, (String) this.i, this.f34152c, this.d, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return o2.a((r2) this.e, (String) this.f, (Function1) this.f34153g, (Function1) this.f34154h, (Function1) this.i, this.f34151b, this.f34152c, this.d, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ uo1(c81 c81Var, p70 p70Var, a9 a9Var, Function0 function0, Function0 function02, Function0 function03, int i, int i2) {
        this.e = c81Var;
        this.f = p70Var;
        this.f34153g = a9Var;
        this.f34151b = function0;
        this.f34154h = function02;
        this.i = function03;
        this.f34152c = i;
        this.d = i2;
    }

    public /* synthetic */ uo1(r2 r2Var, String str, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i, int i2) {
        this.e = r2Var;
        this.f = str;
        this.f34153g = function1;
        this.f34154h = function12;
        this.i = function13;
        this.f34151b = function0;
        this.f34152c = i;
        this.d = i2;
    }
}
