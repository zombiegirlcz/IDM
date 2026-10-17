package kh2;

import com.revolut.feature.apm.core.models.recipients.WeroContact;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public WeroContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f184042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184043x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f184042w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184043x |= Integer.MIN_VALUE;
        return this.f184042w.h(null, this);
    }
}
