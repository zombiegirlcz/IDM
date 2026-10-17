package com.fourthline.orca.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class em1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28202c;
    public final /* synthetic */ Object d;

    public /* synthetic */ em1(Object obj2, Object obj3, boolean z, int i) {
        this.f28200a = i;
        this.f28202c = obj2;
        this.d = obj3;
        this.f28201b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f28200a) {
            case 0:
                return g0.a(this.f28201b, (g0) this.f28202c, (b0) this.d, (f0) obj2);
            case 1:
                return gz.a((yk) this.f28202c, (gz) this.d, this.f28201b, (az) obj2);
            case 2:
                return im.a(this.f28201b, (im) this.f28202c, (dm) this.d, (fm) obj2);
            case 3:
                return xc0.a(this.f28201b, (xc0) this.f28202c, (tc0) this.d, (vc0) obj2);
            case 4:
                return y2.a((a01) this.f28202c, (y2) this.d, this.f28201b, (s2) obj2);
            default:
                return com.fourthline.vision.internal.u1.DebugView$lambda$0$0(this.f28201b, (Rect) this.f28202c, (List) this.d, (DrawScope) obj2);
        }
    }

    public /* synthetic */ em1(boolean z, Object obj2, Object obj3, int i) {
        this.f28200a = i;
        this.f28201b = z;
        this.f28202c = obj2;
        this.d = obj3;
    }
}
