package tz1;

import com.revolut.feature.apm.core.api.product.ApmProduct;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public ApmProduct u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f275737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f275738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f275739y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f275738x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f275737w = obj2;
        this.f275739y |= Integer.MIN_VALUE;
        return this.f275738x.a(null, null, this);
    }
}
