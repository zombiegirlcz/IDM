package vca;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public ApmDescriptor u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f287657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f287658x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f287657w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f287658x |= Integer.MIN_VALUE;
        return this.f287657w.b(null, this);
    }
}
