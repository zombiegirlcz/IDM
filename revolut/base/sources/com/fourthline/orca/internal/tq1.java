package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class tq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f33834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33835c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ tq1(Modifier modifier, String str, int i, int i2, int i3) {
        this.f33833a = i3;
        this.f33834b = modifier;
        this.f33835c = str;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f33833a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return oe1.a(this.f33834b, this.f33835c, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return so.a(this.f33834b, this.f33835c, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }
}
