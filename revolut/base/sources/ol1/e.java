package ol1;

import com.revolut.feature.apm.core.models.recipients.AaniContact;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public AaniContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f226314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226315x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f226314w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226315x |= Integer.MIN_VALUE;
        return this.f226314w.h(null, this);
    }
}
