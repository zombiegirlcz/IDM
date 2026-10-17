package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class po1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f32013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32014c;

    public /* synthetic */ po1(List list, int i, int i2) {
        this.f32012a = i2;
        this.f32013b = list;
        this.f32014c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f32012a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return k11.a(this.f32013b, this.f32014c, composer, iIntValue);
            default:
                return wp0.a(this.f32013b, this.f32014c, composer, iIntValue);
        }
    }
}
