package com.fourthline.orca.internal;

import com.fourthline.vision.document.compose.DocumentScannerEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class uk1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dp f34120b;

    public /* synthetic */ uk1(dp dpVar, int i) {
        this.f34119a = i;
        this.f34120b = dpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f34119a) {
            case 0:
                return dp.c(this.f34120b, (lo) obj2);
            case 1:
                return dp.a(this.f34120b, (DocumentScannerEvent) obj2);
            case 2:
                return dp.b(this.f34120b, (lo) obj2);
            default:
                return dp.a(this.f34120b, (lo) obj2);
        }
    }
}
