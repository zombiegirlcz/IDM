package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.animation.core.MutableTransitionState;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.orca.internal.hd0;
import com.fourthline.orca.internal.kr;
import com.fourthline.orca.internal.sq;
import com.fourthline.orca.internal.wb;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class vp1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34427c;

    public /* synthetic */ vp1(MutableTransitionState mutableTransitionState, Function0 function0) {
        this.f34425a = 6;
        this.f34427c = mutableTransitionState;
        this.f34426b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f34425a) {
            case 0:
                return ml0.a((Function0) this.f34426b, (ml0) this.f34427c);
            case 1:
                return o2.b((Function1) this.f34426b, (a01) this.f34427c);
            case 2:
                return o2.a((r2) this.f34426b, (Function1) this.f34427c);
            case 3:
                return oe1.a((Function1) this.f34426b, (Bitmap) this.f34427c);
            case 4:
                return qf0.a((qf0) this.f34426b, (hd0.e) this.f34427c);
            case 5:
                return qr.a((Function1) this.f34426b, (kr.a) this.f34427c);
            case 6:
                return so.a((MutableTransitionState) this.f34427c, (Function0) this.f34426b);
            case 7:
                return vl0.a((Map) this.f34426b, (Function1) this.f34427c);
            case 8:
                return vl0.a((Function1) this.f34426b, (Map.Entry) this.f34427c);
            case 9:
                return xb.a((wb.a) this.f34426b, (Function1) this.f34427c);
            case 10:
                return xb.a((Function1) this.f34426b, (fd) this.f34427c);
            case 11:
                return xd.a((MotionDataCollector) this.f34426b, (CoroutineScope) this.f34427c);
            case 12:
                return yq.a((Function1) this.f34426b, (sq.a) this.f34427c);
            default:
                return zw0.a((rw0) this.f34426b, (Function1) this.f34427c);
        }
    }

    public /* synthetic */ vp1(Object obj2, Object obj3, int i) {
        this.f34425a = i;
        this.f34426b = obj2;
        this.f34427c = obj3;
    }
}
