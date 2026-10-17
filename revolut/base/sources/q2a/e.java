package q2a;

import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public PersistedBackground u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f241553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241554x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f241553w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241554x |= Integer.MIN_VALUE;
        return this.f241553w.c(null, this);
    }
}
