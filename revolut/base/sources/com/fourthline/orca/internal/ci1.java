package com.fourthline.orca.internal;

import android.hardware.Sensor;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import com.fourthline.orca.internal.lo;
import com.fourthline.orca.internal.wb;
import com.fourthline.orca.internal.zp0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ci1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27480b;

    public /* synthetic */ ci1(Object obj2, int i) {
        this.f27479a = i;
        this.f27480b = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f27479a) {
            case 0:
                return a30.a((b) this.f27480b, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return bz.a((bz) this.f27480b, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            case 2:
                return ii0.a((SnackbarHostState) this.f27480b, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return jf0.b((ff0) this.f27480b, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return jw.a((jw) this.f27480b, (Sensor) obj2, ((Integer) obj3).intValue());
            case 5:
                return re0.a((re0) this.f27480b, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            case 6:
                return so.b((lo.c) this.f27480b, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return ue0.a((Function1) this.f27480b, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            case 8:
                return wp0.a((zp0.g) this.f27480b, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            default:
                return xb.a((wb.c) this.f27480b, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
