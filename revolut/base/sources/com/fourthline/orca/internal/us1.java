package com.fourthline.orca.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class us1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f34176b;

    public /* synthetic */ us1(int i, Function1 function1) {
        this.f34175a = i;
        this.f34176b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f34175a) {
            case 0:
                return vl0.a(this.f34176b, (String) obj2);
            case 1:
                return vl0.b(this.f34176b, ((Boolean) obj2).booleanValue());
            case 2:
                return vl0.b(this.f34176b, (String) obj2);
            case 3:
                return vl0.c(this.f34176b, ((Boolean) obj2).booleanValue());
            case 4:
                return vl0.c(this.f34176b, (String) obj2);
            case 5:
                return vl0.a(this.f34176b, (kd1) obj2);
            case 6:
                return vl0.b(this.f34176b, (kd1) obj2);
            case 7:
                return vl0.d(this.f34176b, ((Boolean) obj2).booleanValue());
            case 8:
                return vl0.a(this.f34176b, ((Boolean) obj2).booleanValue());
            case 9:
                return vv0.a(this.f34176b, (Map) obj2);
            case 10:
                return vv0.a(this.f34176b, (kd1) obj2);
            case 11:
                return wc0.b(this.f34176b, ((Boolean) obj2).booleanValue());
            case 12:
                return wc0.b(this.f34176b, (String) obj2);
            case 13:
                return wc0.a(this.f34176b, (kd1) obj2);
            case 14:
                return wc0.b(this.f34176b, (kd1) obj2);
            case 15:
                return wc0.a(this.f34176b, ((Boolean) obj2).booleanValue());
            case 16:
                return wc0.a(this.f34176b, (String) obj2);
            case 17:
                return wp0.d(this.f34176b, (kd1) obj2);
            case 18:
                return wp0.a(this.f34176b, (kd1) obj2);
            case 19:
                return wp0.b(this.f34176b, (kd1) obj2);
            case 20:
                return wp0.e(this.f34176b, (kd1) obj2);
            case 21:
                return wp0.f(this.f34176b, (kd1) obj2);
            case 22:
                return wp0.a(this.f34176b, ((Integer) obj2).intValue());
            case 23:
                return wp0.c(this.f34176b, (kd1) obj2);
            case 24:
                return xb.c(this.f34176b, ((Boolean) obj2).booleanValue());
            case 25:
                return xb.c(this.f34176b, (String) obj2);
            case 26:
                return xb.b(this.f34176b, (KeyboardActionScope) obj2);
            case 27:
                return xb.b(this.f34176b, ((Boolean) obj2).booleanValue());
            case 28:
                return xb.b(this.f34176b, (String) obj2);
            default:
                return xb.a(this.f34176b, (kd1) obj2);
        }
    }
}
