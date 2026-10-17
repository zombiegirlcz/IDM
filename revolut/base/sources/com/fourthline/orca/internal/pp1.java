package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class pp1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ColumnScope f32020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f32021c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ pp1(ColumnScope columnScope, List list, Function1 function1, int i, int i2) {
        this.f32019a = i2;
        this.f32020b = columnScope;
        this.f32021c = list;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f32019a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return mb1.a(this.f32020b, this.f32021c, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return yq.a(this.f32020b, this.f32021c, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }
}
