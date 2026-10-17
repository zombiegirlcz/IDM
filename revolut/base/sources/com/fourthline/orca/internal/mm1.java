package com.fourthline.orca.internal;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class mm1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f31227b;

    public /* synthetic */ mm1(List list, int i) {
        this.f31226a = i;
        this.f31227b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31226a) {
            case 0:
                return gb.a(this.f31227b, (wb) obj2);
            case 1:
                return wp0.a(this.f31227b, (SemanticsPropertyReceiver) obj2);
            default:
                return y2.a(this.f31227b, (s2) obj2);
        }
    }
}
