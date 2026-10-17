package k50;

import com.revolut.chat.domain.model.ChatMessageToPass;

/* JADX INFO: loaded from: classes19.dex */
public final class j3 extends gim.c {
    public int A;
    public ChatMessageToPass u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f181119w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181120x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f181121y;
    public final /* synthetic */ j4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.z = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f181121y = obj2;
        this.A |= Integer.MIN_VALUE;
        return j4.O2(this.z, null, this);
    }
}
