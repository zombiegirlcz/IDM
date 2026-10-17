package com.fourthline.orca.internal;

import androidx.content.NavGraphBuilder;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.ab0;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ss1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33129b;

    public /* synthetic */ ss1(Object obj2, int i) {
        this.f33128a = i;
        this.f33129b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f33128a) {
            case 0:
                return v40.a((ab0.c) this.f33129b, (gem.a) obj2);
            case 1:
                return vb0.a((vb0) this.f33129b, (NavGraphBuilder) obj2);
            case 2:
                return Boolean.valueOf(w10.a((r10) this.f33129b, (String) obj2));
            case 3:
                return we0.a((we0) this.f33129b, (qe0) obj2);
            case 4:
                return wl0.a((c81) this.f33129b, (sl0) obj2);
            case 5:
                return wp0.a((ukm.j0) this.f33129b, (yp0) obj2);
            case 6:
                return yb.a((yb) this.f33129b, (List) obj2);
            case 7:
                return yf1.a((yf1) this.f33129b, (NavGraphBuilder) obj2);
            case 8:
                return yo.a((yo) this.f33129b, (lo) obj2);
            case 9:
                return z2.a((z2) this.f33129b, (List) obj2);
            case 10:
                return z3.a((z3) this.f33129b, (NavGraphBuilder) obj2);
            case 11:
                return zb.a((zb) this.f33129b, (NavGraphBuilder) obj2);
            case 12:
                return zm0.a((zm0) this.f33129b, (NavGraphBuilder) obj2);
            default:
                return zq.a((DocumentType) this.f33129b, (sq) obj2);
        }
    }
}
