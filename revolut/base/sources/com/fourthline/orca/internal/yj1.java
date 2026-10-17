package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.fourthline.orca.internal.c21;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class yj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35365c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f35366g;

    public /* synthetic */ yj1(z00 z00Var, z10 z10Var, p70 p70Var, String str, int i, int i2) {
        this.f35363a = 1;
        this.f = z00Var;
        this.f35364b = z10Var;
        this.f35366g = p70Var;
        this.f35365c = str;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f35363a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return c30.a((Modifier) this.f, (String) this.f35365c, (z10) this.f35364b, (Function0) this.f35366g, this.d, this.e, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return j21.a((z00) this.f, (z10) this.f35364b, (p70) this.f35366g, (String) this.f35365c, this.d, this.e, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return k31.a((c81) this.f, (p70) this.f35365c, (a9) this.f35364b, (Function0) this.f35366g, this.d, this.e, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return p9.a((Modifier) this.f, (a9) this.f35365c, (k41) this.f35364b, (Function1) this.f35366g, this.d, this.e, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return qy0.a((Modifier) this.f, (c21.b.c) this.f35365c, (Function1) this.f35364b, (Function1) this.f35366g, this.d, this.e, (Composer) obj2, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj3).intValue();
                return si0.a((Modifier) this.f, (Alignment.Horizontal) this.f35365c, (wz0) this.f35364b, (Function3) this.f35366g, this.d, this.e, (Composer) obj2, iIntValue6);
        }
    }

    public /* synthetic */ yj1(Object obj2, Object obj3, Object obj4, Function function, int i, int i2, int i3) {
        this.f35363a = i3;
        this.f = obj2;
        this.f35365c = obj3;
        this.f35364b = obj4;
        this.f35366g = function;
        this.d = i;
        this.e = i2;
    }
}
