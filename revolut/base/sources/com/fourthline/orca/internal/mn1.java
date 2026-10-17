package com.fourthline.orca.internal;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.view.result.ActivityResult;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class mn1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f31234b;

    public /* synthetic */ mn1(int i, Function1 function1) {
        this.f31233a = i;
        this.f31234b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31233a) {
            case 0:
                return hm.b(this.f31234b, (kd1) obj2);
            case 1:
                return hv.a(this.f31234b, (ActivityResult) obj2);
            case 2:
                return hv.a(this.f31234b, (DisposableEffectScope) obj2);
            case 3:
                return i0.a(this.f31234b, ((Boolean) obj2).booleanValue());
            case 4:
                return i0.a(this.f31234b, (String) obj2);
            case 5:
                return i0.a(this.f31234b, (a01) obj2);
            case 6:
                return i0.b(this.f31234b, ((Boolean) obj2).booleanValue());
            case 7:
                return i0.b(this.f31234b, (String) obj2);
            case 8:
                return i0.c(this.f31234b, ((Boolean) obj2).booleanValue());
            case 9:
                return i0.c(this.f31234b, (String) obj2);
            case 10:
                return i0.a(this.f31234b, (kd1) obj2);
            case 11:
                return i0.b(this.f31234b, (kd1) obj2);
            case 12:
                return i0.d(this.f31234b, ((Boolean) obj2).booleanValue());
            case 13:
                return i0.d(this.f31234b, (String) obj2);
            case 14:
                return i0.e(this.f31234b, ((Boolean) obj2).booleanValue());
            case 15:
                return i0.e(this.f31234b, (String) obj2);
            case 16:
                return i0.f(this.f31234b, ((Boolean) obj2).booleanValue());
            case 17:
                return i0.f(this.f31234b, (String) obj2);
            case 18:
                return jf0.a(this.f31234b, (ActivityResult) obj2);
            case 19:
                return jf0.a(this.f31234b, (DisposableEffectScope) obj2);
            case 20:
                return k11.a(this.f31234b, (kd1) obj2);
            case 21:
                return k11.b(this.f31234b, (kd1) obj2);
            case 22:
                return k21.a(this.f31234b, ((Float) obj2).floatValue());
            case 23:
                return k21.a(this.f31234b, (Map) obj2);
            case 24:
                return ku.a(this.f31234b, (kd1) obj2);
            case 25:
                return ku.b(this.f31234b, (kd1) obj2);
            case 26:
                return ku.a(this.f31234b, (String) obj2);
            case 27:
                return ku.b(this.f31234b, (String) obj2);
            case 28:
                return mb1.a(this.f31234b, (kd1) obj2);
            default:
                return mb1.b(this.f31234b, (kd1) obj2);
        }
    }
}
