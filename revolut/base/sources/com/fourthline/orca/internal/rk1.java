package com.fourthline.orca.internal;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class rk1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32765b;

    public /* synthetic */ rk1(boolean z, int i) {
        this.f32764a = i;
        this.f32765b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f32764a) {
            case 0:
                return d40.a(this.f32765b, (s30) obj2);
            case 1:
                return d91.a(this.f32765b, (v81) obj2);
            case 2:
                return e70.a(this.f32765b, (b70) obj2);
            case 3:
                return es0.a(this.f32765b, (tr0) obj2);
            case 4:
                return es0.b(this.f32765b, (tr0) obj2);
            case 5:
                return g0.a(this.f32765b, (f0) obj2);
            case 6:
                return gb.a(this.f32765b, (wb) obj2);
            case 7:
                return nb1.a(this.f32765b, (gb1) obj2);
            case 8:
                return s6.a(this.f32765b, (o6) obj2);
            case 9:
                return t3.a(this.f32765b, (p3) obj2);
            case 10:
                return wg0.a(this.f32765b, (SemanticsPropertyReceiver) obj2);
            case 11:
                return wl0.a(this.f32765b, (sl0) obj2);
            case 12:
                return xe.b(this.f32765b, (li) obj2);
            case 13:
                return xe.a(this.f32765b, (li) obj2);
            default:
                return yo.a(this.f32765b, (lo) obj2);
        }
    }
}
