package com.fourthline.orca.internal;

import androidx.compose.ui.focus.FocusManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ln1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f30689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FocusManager f30690c;

    public /* synthetic */ ln1(Function1 function1, FocusManager focusManager, int i) {
        this.f30688a = i;
        this.f30689b = function1;
        this.f30690c = focusManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30688a) {
            case 0:
                return hm.a(this.f30689b, this.f30690c);
            case 1:
                return i0.a(this.f30689b, this.f30690c);
            default:
                return o2.a(this.f30689b, this.f30690c);
        }
    }
}
