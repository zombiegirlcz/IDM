package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.m21;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class op1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c21.b.C0176b f31711b;

    public /* synthetic */ op1(c21.b.C0176b c0176b, int i) {
        this.f31710a = i;
        this.f31711b = c0176b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31710a) {
            case 0:
                return m21.l.a(this.f31711b, (c21) obj2);
            default:
                return m21.a(this.f31711b, (c21) obj2);
        }
    }
}
