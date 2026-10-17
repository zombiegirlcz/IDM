package com.fourthline.orca.internal;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fw extends Painter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fw f28672a = new fw();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f28673b = Size.INSTANCE.m1874getUnspecifiedNHjbRc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28674c = 8;

    private fw() {
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2255getIntrinsicSizeNHjbRc() {
        return f28673b;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
    }
}
