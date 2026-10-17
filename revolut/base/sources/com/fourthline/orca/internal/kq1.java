package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class kq1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f30364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30365c;

    public /* synthetic */ kq1(float f, float f4, int i) {
        this.f30363a = i;
        this.f30364b = f;
        this.f30365c = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f30363a) {
            case 0:
                return o7.a(this.f30364b, this.f30365c, (Density) obj2);
            default:
                return qy0.a(this.f30364b, this.f30365c, (DrawScope) obj2);
        }
    }
}
