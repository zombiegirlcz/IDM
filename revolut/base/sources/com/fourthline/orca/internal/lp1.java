package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m21;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class lp1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m21 f30726b;

    public /* synthetic */ lp1(m21 m21Var, int i) {
        this.f30725a = i;
        this.f30726b = m21Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f30725a) {
            case 0:
                return m21.g.a(this.f30726b, (c21) obj2);
            case 1:
                return m21.k.a(this.f30726b, (c21) obj2);
            case 2:
                return m21.k.b(this.f30726b, (c21) obj2);
            case 3:
                return m21.l.a(this.f30726b, (c21) obj2);
            case 4:
                return m21.a(this.f30726b, (SelfieScannerEvent) obj2);
            case 5:
                return m21.c(this.f30726b, (c21) obj2);
            case 6:
                return m21.b(this.f30726b, (c21) obj2);
            default:
                return m21.a(this.f30726b, (c21) obj2);
        }
    }
}
