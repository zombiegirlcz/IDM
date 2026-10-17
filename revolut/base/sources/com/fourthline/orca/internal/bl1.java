package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import com.fourthline.orca.internal.tr0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bl1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr0.a f27155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f27156c;
    public final /* synthetic */ int d;

    public /* synthetic */ bl1(tr0.a aVar, Function1 function1, int i, int i2) {
        this.f27154a = i2;
        this.f27155b = aVar;
        this.f27156c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f27154a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return ds0.a(this.f27155b, this.f27156c, this.d, composer, iIntValue);
            default:
                return pr0.a(this.f27155b, this.f27156c, this.d, composer, iIntValue);
        }
    }
}
