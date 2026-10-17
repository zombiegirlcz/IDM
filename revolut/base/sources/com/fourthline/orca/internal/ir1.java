package com.fourthline.orca.internal;

import androidx.compose.runtime.MutableState;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ir1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29696c;
    public final /* synthetic */ Function d;

    public /* synthetic */ ir1(Object obj2, Object obj3, Function function, int i) {
        this.f29694a = i;
        this.f29695b = obj2;
        this.f29696c = obj3;
        this.d = function;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29694a) {
            case 0:
                return pr0.a((MutableState) this.f29695b, (MutableState) this.f29696c, (Function1) this.d);
            default:
                return Boolean.valueOf(rj.a((zc0) this.f29695b, (gj) this.f29696c, (Function0) this.d));
        }
    }
}
