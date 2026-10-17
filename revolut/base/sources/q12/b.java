package q12;

import com.revolut.core.model.account.AccountId;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public AccountId u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f241312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f241313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f241314y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(continuation);
        this.f241313x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f241312w = obj2;
        this.f241314y |= Integer.MIN_VALUE;
        return this.f241313x.a(null, null, null, null, this);
    }
}
