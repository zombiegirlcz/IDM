package gya;

import god.k;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f147840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, Continuation continuation) {
        super(continuation);
        this.f147840w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f147840w.emit(null, this);
    }
}
