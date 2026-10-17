package t38;

import com.revolut.core.model.account.AccountId;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public io3.d u;
    public AccountId.Joint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f267682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f267683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f267684y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, Continuation continuation) {
        super(continuation);
        this.f267683x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f267682w = obj2;
        this.f267684y |= Integer.MIN_VALUE;
        return this.f267683x.c3(null, this);
    }
}
