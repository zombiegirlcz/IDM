package com.fourthline.orca.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class an1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f26857b;

    public /* synthetic */ an1(MutableState mutableState, int i) {
        this.f26856a = i;
        this.f26857b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f26856a) {
            case 0:
                return hi0.a(this.f26857b, (LayoutCoordinates) obj2);
            case 1:
                return jh0.a(this.f26857b, (LayoutCoordinates) obj2);
            case 2:
                return k21.a(this.f26857b, (Rect) obj2);
            case 3:
                return l2.a(this.f26857b, (ContentDrawScope) obj2);
            case 4:
                return q7.a(this.f26857b, (LayoutCoordinates) obj2);
            default:
                return xo.a(this.f26857b, (Rect) obj2);
        }
    }
}
