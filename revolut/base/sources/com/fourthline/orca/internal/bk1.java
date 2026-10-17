package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bk1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27153c;

    public /* synthetic */ bk1(Object obj2, Object obj3, int i) {
        this.f27151a = i;
        this.f27152b = obj2;
        this.f27153c = obj3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f27151a) {
            case 0:
                return c40.a((Modifier) this.f27152b, (Modifier) this.f27153c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return gn.a((dn) this.f27152b, (dn) this.f27153c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                return ku.a((bu) this.f27152b, (Function1) this.f27153c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 3:
                return ni.a((li) this.f27152b, (Function1) this.f27153c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 4:
                return o2.a((a01) this.f27152b, (Function1) this.f27153c, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 5:
                return s3.a((p3) this.f27152b, (Function1) this.f27153c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 6:
                return ue0.a((qe0) this.f27152b, (Function1) this.f27153c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 7:
                return vl0.a((Map.Entry) this.f27152b, (Function1) this.f27153c, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 8:
                return vv0.a((sv0) this.f27152b, (Function1) this.f27153c, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 9:
                return xb.a((fd) this.f27152b, (Function1) this.f27153c, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return xb.a((wb) this.f27152b, (Function1) this.f27153c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }
}
