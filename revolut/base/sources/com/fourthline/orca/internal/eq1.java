package com.fourthline.orca.internal;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.view.result.ActivityResult;
import com.fourthline.orca.internal.tr0;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class eq1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f28229b;

    public /* synthetic */ eq1(int i, Function1 function1) {
        this.f28228a = i;
        this.f28229b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f28228a) {
            case 0:
                return ni.a(this.f28229b, (kd1) obj2);
            case 1:
                return ni.b(this.f28229b, (kd1) obj2);
            case 2:
                return ni.a(this.f28229b, ((Boolean) obj2).booleanValue());
            case 3:
                return ni.a(this.f28229b, (String) obj2);
            case 4:
                return ni.b(this.f28229b, ((Boolean) obj2).booleanValue());
            case 5:
                return ni.b(this.f28229b, (String) obj2);
            case 6:
                return ni.c(this.f28229b, ((Boolean) obj2).booleanValue());
            case 7:
                return ni.d(this.f28229b, ((Boolean) obj2).booleanValue());
            case 8:
                return ni.c(this.f28229b, (String) obj2);
            case 9:
                return o2.a(this.f28229b, ((Boolean) obj2).booleanValue());
            case 10:
                return o2.a(this.f28229b, (String) obj2);
            case 11:
                return o2.a(this.f28229b, (a01) obj2);
            case 12:
                return o2.a(this.f28229b, (kd1) obj2);
            case 13:
                return o2.b(this.f28229b, (kd1) obj2);
            case 14:
                return o2.b(this.f28229b, (String) obj2);
            case 15:
                return o7.a(this.f28229b, (kd1) obj2);
            case 16:
                return pr0.a(this.f28229b, (tr0.a.InterfaceC0287a) obj2);
            case 17:
                return pr0.a(this.f28229b, ((Boolean) obj2).booleanValue());
            case 18:
                return pr0.b(this.f28229b, ((Boolean) obj2).booleanValue());
            case 19:
                return q7.a(this.f28229b, (Map) obj2);
            case 20:
                return qr.a(this.f28229b, (kd1) obj2);
            case 21:
                return qr.b(this.f28229b, (kd1) obj2);
            case 22:
                return s3.a(this.f28229b, ((Boolean) obj2).booleanValue());
            case 23:
                return s3.a(this.f28229b, (String) obj2);
            case 24:
                return s3.a(this.f28229b, (kd1) obj2);
            case 25:
                return s3.b(this.f28229b, (kd1) obj2);
            case 26:
                return ue0.a(this.f28229b, (DisposableEffectScope) obj2);
            case 27:
                return ue0.a(this.f28229b, (ActivityResult) obj2);
            case 28:
                return ue0.a(this.f28229b, (kd1) obj2);
            default:
                return ue0.b(this.f28229b, (kd1) obj2);
        }
    }
}
