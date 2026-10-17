package com.fourthline.orca.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class vm1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f34402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f34403c;

    public /* synthetic */ vm1(MutableState mutableState, Function1 function1, int i) {
        this.f34401a = i;
        this.f34402b = mutableState;
        this.f34403c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f34401a) {
            case 0:
                return h21.a(this.f34402b, this.f34403c, (Rect) obj2);
            case 1:
                return ke1.a(this.f34402b, this.f34403c, (LayoutCoordinates) obj2);
            case 2:
                return qy0.a(this.f34402b, this.f34403c, (LayoutCoordinates) obj2);
            default:
                return so.a(this.f34402b, this.f34403c, (Rect) obj2);
        }
    }
}
