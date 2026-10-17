package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class tj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f33786b;

    public /* synthetic */ tj1(int i, Pair pair) {
        this.f33785a = i;
        this.f33786b = pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f33785a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return bz.a(this.f33786b, composer, iIntValue);
            default:
                return fn.a(this.f33786b, composer, iIntValue);
        }
    }
}
