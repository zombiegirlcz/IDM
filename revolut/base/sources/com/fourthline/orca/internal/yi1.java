package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class yi1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f35356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f35357c;
    public final /* synthetic */ float d;

    public /* synthetic */ yi1(float f, float f4, long j2, int i) {
        this.f35355a = i;
        this.f35356b = j2;
        this.f35357c = f;
        this.d = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f35355a) {
            case 0:
                return a80.a(this.f35356b, this.f35357c, this.d, (DrawScope) obj2);
            case 1:
                return fz.a(this.f35356b, this.f35357c, this.d, (DrawScope) obj2);
            case 2:
                return kb1.a(this.f35356b, this.f35357c, this.d, (DrawScope) obj2);
            case 3:
                return kb1.b(this.f35356b, this.f35357c, this.d, (DrawScope) obj2);
            case 4:
                return mr.a(this.f35356b, this.f35357c, this.d, (DrawScope) obj2);
            default:
                return nq.a(this.f35356b, this.f35357c, this.d, (DrawScope) obj2);
        }
    }
}
