package ol1;

import com.revolut.feature.apm.core.models.recipients.AaniContact;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public AaniContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f226312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226313x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f226312w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226313x |= Integer.MIN_VALUE;
        return this.f226312w.e(null, this);
    }
}
