package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32511a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f32513c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f32515h;
    public final /* synthetic */ Object i;

    public /* synthetic */ qq1(ColumnScope columnScope, Bitmap bitmap, boolean z, Color color, z10 z10Var, Function1 function1, int i, int i2) {
        this.f = columnScope;
        this.f32514g = bitmap;
        this.f32512b = z;
        this.f32515h = color;
        this.i = z10Var;
        this.f32513c = function1;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f32511a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return oe1.a((ColumnScope) this.f, (Bitmap) this.f32514g, this.f32512b, (Color) this.f32515h, (z10) this.i, this.f32513c, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return p9.a((Modifier) this.f, (String) this.f32514g, (kd1) this.f32515h, this.f32512b, (k41) this.i, this.f32513c, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ qq1(Modifier modifier, String str, kd1 kd1Var, boolean z, k41 k41Var, Function1 function1, int i, int i2) {
        this.f = modifier;
        this.f32514g = str;
        this.f32515h = kd1Var;
        this.f32512b = z;
        this.i = k41Var;
        this.f32513c = function1;
        this.d = i;
        this.e = i2;
    }
}
