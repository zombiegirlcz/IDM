package w20;

import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.c {
    public DraftRoutingKey u;
    public o30.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f293909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f293910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f293911y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(continuation);
        this.f293910x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f293909w = obj2;
        this.f293911y |= Integer.MIN_VALUE;
        return this.f293910x.f(null, null, this);
    }
}
