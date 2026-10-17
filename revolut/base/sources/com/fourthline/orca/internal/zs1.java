package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class zs1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f35709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35710c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f35711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f35712h;
    public final /* synthetic */ Object i;

    public /* synthetic */ zs1(Modifier modifier, Object obj2, boolean z, boolean z3, boolean z4, Function1 function1, int i, int i2, int i3) {
        this.f35708a = i3;
        this.f35709b = modifier;
        this.i = obj2;
        this.f35710c = z;
        this.d = z3;
        this.e = z4;
        this.f = function1;
        this.f35711g = i;
        this.f35712h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f35708a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return wg0.a(this.f35709b, (String) this.i, this.f35710c, this.d, this.e, this.f, this.f35711g, this.f35712h, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return wg0.a(this.f35709b, (kd1) this.i, this.f35710c, this.d, this.e, this.f, this.f35711g, this.f35712h, (Composer) obj2, iIntValue2);
        }
    }
}
