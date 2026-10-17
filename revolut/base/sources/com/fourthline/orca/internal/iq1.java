package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class iq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f29681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29682c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f29683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f29684h;

    public /* synthetic */ iq1(Modifier modifier, String str, String str2, String str3, Function0 function0, int i, int i2, int i3) {
        this.f29680a = i3;
        this.f29681b = modifier;
        this.f29682c = str;
        this.d = str2;
        this.e = str3;
        this.f = function0;
        this.f29683g = i;
        this.f29684h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f29680a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return o2.a(this.f29681b, this.f29682c, this.d, this.e, this.f, this.f29683g, this.f29684h, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return xb.a(this.f29681b, this.f29682c, this.d, this.e, this.f, this.f29683g, this.f29684h, (Composer) obj2, iIntValue2);
        }
    }
}
