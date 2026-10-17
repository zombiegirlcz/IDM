package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class oi1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f31672b;

    public /* synthetic */ oi1(int i, Function2 function2) {
        this.f31671a = i;
        this.f31672b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f31671a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return a30.a(this.f31672b, (Composer) obj2, iIntValue);
            case 1:
                return a40.a(this.f31672b, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return pq0.a(this.f31672b, (Composer) obj2, iIntValue2);
        }
    }
}
