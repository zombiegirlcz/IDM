package aqc;

import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public SalarySwitchPreview.Account u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f8311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8312x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f8311w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f8312x |= Integer.MIN_VALUE;
        return this.f8311w.d(null, this);
    }
}
