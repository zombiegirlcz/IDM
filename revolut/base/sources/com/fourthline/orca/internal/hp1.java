package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class hp1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29370a;

    public /* synthetic */ hp1(int i) {
        this.f29370a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f29370a) {
            case 0:
                return Integer.valueOf(lj0.a((ky) obj2, (ky) obj3));
            case 1:
                return sa.a((Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return ta.a((Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return ua.a((Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return va.a((Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return xa.a((Composer) obj2, ((Integer) obj3).intValue());
            default:
                return ya.a((Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
