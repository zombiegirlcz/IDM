package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.foundation.text.KeyboardActionScope;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class jt1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f30036b;

    public /* synthetic */ jt1(int i, Function1 function1) {
        this.f30035a = i;
        this.f30036b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f30035a) {
            case 0:
                return xb.b(this.f30036b, (kd1) obj2);
            case 1:
                return xb.a(this.f30036b, (KeyboardActionScope) obj2);
            case 2:
                return xb.a(this.f30036b, ((Boolean) obj2).booleanValue());
            case 3:
                return xb.a(this.f30036b, (String) obj2);
            case 4:
                return xb.c(this.f30036b, (KeyboardActionScope) obj2);
            case 5:
                return xo.a(this.f30036b, ((Float) obj2).floatValue());
            case 6:
                return xo.a(this.f30036b, (Bitmap) obj2);
            case 7:
                return xo.a(this.f30036b, (Map) obj2);
            case 8:
                return yq.a(this.f30036b, (kd1) obj2);
            case 9:
                return yq.b(this.f30036b, (kd1) obj2);
            case 10:
                return z30.a(this.f30036b, (kd1) obj2);
            case 11:
                return z30.b(this.f30036b, (kd1) obj2);
            case 12:
                return zw0.a(this.f30036b, (KeyboardActionScope) obj2);
            case 13:
                return zw0.a(this.f30036b, ((Boolean) obj2).booleanValue());
            case 14:
                return zw0.a(this.f30036b, (String) obj2);
            case 15:
                return zw0.a(this.f30036b, (kd1) obj2);
            default:
                return zw0.b(this.f30036b, (kd1) obj2);
        }
    }
}
