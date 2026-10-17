package q78;

import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public TabAccountsInitialPayload.Action u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f242772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f242773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f242774y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(continuation);
        this.f242774y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f242773x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f242774y.g(null, null, null, false, this);
    }
}
