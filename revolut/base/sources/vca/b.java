package vca;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public ApmDescriptor u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f287655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f287656x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f287655w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f287656x |= Integer.MIN_VALUE;
        return this.f287655w.a(null, this);
    }
}
