package com.fourthline.orca.internal;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qo1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f32505b;

    public /* synthetic */ qo1(MutableState mutableState, int i) {
        this.f32504a = i;
        this.f32505b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32504a) {
            case 0:
                return k21.b(this.f32505b);
            case 1:
                return q7.c(this.f32505b);
            case 2:
                return ue0.a(this.f32505b);
            default:
                return xo.b(this.f32505b);
        }
    }
}
