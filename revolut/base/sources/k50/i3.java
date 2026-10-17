package k50;

import com.revolut.chat.domain.model.ChatMode;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 extends gim.c {
    public ChatMode u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.f181109w = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181110x |= Integer.MIN_VALUE;
        return j4.N2(this.f181109w, this);
    }
}
