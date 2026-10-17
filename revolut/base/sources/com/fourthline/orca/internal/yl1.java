package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class yl1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f35384b;

    public /* synthetic */ yl1(Bitmap bitmap, int i) {
        this.f35383a = i;
        this.f35384b = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f35383a) {
            case 0:
                return fo0.a(this.f35384b, (bo0) obj2);
            case 1:
                return l21.a(this.f35384b, (c21) obj2);
            default:
                return yo.a(this.f35384b, (lo) obj2);
        }
    }
}
