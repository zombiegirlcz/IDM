package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class dn1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27834a;

    public /* synthetic */ dn1(int i) {
        this.f27834a = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f27834a) {
            case 0:
                return hi0.a((Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return sa.a((ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                return va.b((ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 3:
                return va.c((ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 4:
                return va.a((ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return wa.a((AnimatedVisibilityScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }
}
