package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ij1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29616b;

    public /* synthetic */ ij1(int i, int i2) {
        this.f29615a = i2;
        this.f29616b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f29615a) {
            case 0:
                return ax0.a(this.f29616b, (rw0) obj2);
            case 1:
                return lf0.a(this.f29616b, (ff0) obj2);
            case 2:
                return pe1.a(this.f29616b, (GraphicsLayerScope) obj2);
            case 3:
                return qy0.a(this.f29616b, (GraphicsLayerScope) obj2);
            case 4:
                return qy0.b(this.f29616b, (GraphicsLayerScope) obj2);
            case 5:
                return wp0.a(this.f29616b, (SemanticsPropertyReceiver) obj2);
            default:
                return com.fourthline.kyc.internal.g.a(this.f29616b, (com.fourthline.kyc.internal.e) obj2);
        }
    }
}
