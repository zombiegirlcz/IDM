package com.fourthline.orca.internal;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class zi1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35608b;

    public /* synthetic */ zi1(String str, int i) {
        this.f35607a = i;
        this.f35608b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f35607a) {
            case 0:
                return a80.c(this.f35608b, (SemanticsPropertyReceiver) obj2);
            case 1:
                return a80.a(this.f35608b, (SemanticsPropertyReceiver) obj2);
            case 2:
                return a80.b(this.f35608b, (SemanticsPropertyReceiver) obj2);
            case 3:
                return c40.a(this.f35608b, (SemanticsPropertyReceiver) obj2);
            case 4:
                return gb.c(this.f35608b, (wb) obj2);
            case 5:
                return gb.a(this.f35608b, (wb) obj2);
            case 6:
                return gb.b(this.f35608b, (wb) obj2);
            case 7:
                return ri0.a(this.f35608b, (SemanticsPropertyReceiver) obj2);
            case 8:
                return wl0.a(this.f35608b, (sl0) obj2);
            case 9:
                return wl0.b(this.f35608b, (sl0) obj2);
            case 10:
                return wl0.c(this.f35608b, (sl0) obj2);
            case 11:
                return xe.c(this.f35608b, (li) obj2);
            case 12:
                return xe.b(this.f35608b, (li) obj2);
            case 13:
                return xe.a(this.f35608b, (li) obj2);
            case 14:
                return y2.b(this.f35608b, (s2) obj2);
            default:
                return y2.a(this.f35608b, (s2) obj2);
        }
    }
}
