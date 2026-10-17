package y1a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public ArrayList u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f310353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f310354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.e f310355y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.e eVar, gim.c cVar) {
        super(cVar);
        this.f310355y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310354x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f310355y.a(null, null, this);
    }
}
