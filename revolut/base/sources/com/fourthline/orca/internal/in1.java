package com.fourthline.orca.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.geometry.Offset;
import com.fourthline.orca.internal.hi0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class in1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f29648b;

    public /* synthetic */ in1(int i, Function0 function0) {
        this.f29647a = i;
        this.f29648b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f29647a) {
            case 0:
                return hi0.b.a(this.f29648b, (Offset) obj2);
            case 1:
                return er0.a(this.f29648b, (kd1) obj2);
            case 2:
                return iw.a(this.f29648b, (kd1) obj2);
            case 3:
                return k31.a(this.f29648b, (kd1) obj2);
            case 4:
                return o2.a(this.f29648b, (KeyboardActionScope) obj2);
            case 5:
                return oe1.a(this.f29648b, (kd1) obj2);
            default:
                return oe1.b(this.f29648b, (kd1) obj2);
        }
    }
}
