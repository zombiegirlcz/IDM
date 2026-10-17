package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class vq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f34435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34436c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f34437g;

    public /* synthetic */ vq1(Modifier modifier, a9 a9Var, boolean z, Function1 function1, int i, int i2) {
        this.f34434a = 1;
        this.f34435b = modifier;
        this.f = a9Var;
        this.f34436c = z;
        this.f34437g = function1;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f34434a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return oz.a(this.f34435b, (l80) this.f, (l80) this.f34437g, this.f34436c, this.d, this.e, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return wg0.a(this.f34435b, (a9) this.f, this.f34436c, (Function1) this.f34437g, this.d, this.e, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return com.fourthline.vision.internal.u1.DebugView$lambda$1(this.f34435b, (Rect) this.f, (List) this.f34437g, this.f34436c, this.d, this.e, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ vq1(Modifier modifier, Object obj2, Object obj3, boolean z, int i, int i2, int i3) {
        this.f34434a = i3;
        this.f34435b = modifier;
        this.f = obj2;
        this.f34437g = obj3;
        this.f34436c = z;
        this.d = i;
        this.e = i2;
    }
}
