package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class fk1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f28548c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ fk1(long j2, Function1 function1, int i, int i2, int i3) {
        this.f28546a = i3;
        this.f28547b = j2;
        this.f28548c = function1;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f28546a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return cb1.a(this.f28547b, this.f28548c, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return cb1.b(this.f28547b, this.f28548c, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }
}
