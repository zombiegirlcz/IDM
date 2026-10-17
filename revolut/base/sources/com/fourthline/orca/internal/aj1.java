package com.fourthline.orca.internal;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class aj1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f26824b;

    public /* synthetic */ aj1(float f, int i) {
        this.f26823a = i;
        this.f26824b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f26823a) {
            case 0:
                return a80.a(this.f26824b, (SemanticsPropertyReceiver) obj2);
            default:
                return o7.a(this.f26824b, (Density) obj2);
        }
    }
}
