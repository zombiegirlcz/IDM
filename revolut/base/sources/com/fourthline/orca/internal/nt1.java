package com.fourthline.orca.internal;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class nt1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31482a;

    public /* synthetic */ nt1(int i) {
        this.f31482a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31482a) {
            case 0:
                return Boolean.valueOf(xh1.a((String) obj2));
            case 1:
                return xo.a((SemanticsPropertyReceiver) obj2);
            case 2:
                return yo.a((lo) obj2);
            default:
                return zw0.a((SemanticsPropertyReceiver) obj2);
        }
    }
}
