package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.fourthline.orca.internal.tr0;
import com.fourthline.orca.internal.wb;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class cn1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27527c;

    public /* synthetic */ cn1(Object obj2, Object obj3, int i) {
        this.f27525a = i;
        this.f27526b = obj2;
        this.f27527c = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f27525a) {
            case 0:
                return hi0.a((List) this.f27526b, (Function1) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return kb1.a((p41) this.f27526b, (String) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return ni.b((gi) this.f27526b, (Function1) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return o2.a((r2) this.f27526b, (Function1) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return pe1.a((p70) this.f27526b, (String) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return pr0.b((tr0.a) this.f27526b, (Function1) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return q7.a((MutableState) this.f27526b, (MutableState) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return so.a((Modifier) this.f27526b, (String) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return vl0.a((Map) this.f27526b, (Function1) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return xb.b((wb.a) this.f27526b, (Function1) this.f27527c, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
