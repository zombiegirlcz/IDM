package k50;

import com.revolut.chat.domain.model.ChatMessageToPass;

/* JADX INFO: loaded from: classes19.dex */
public final class w2 extends gim.c {
    public ChatMessageToPass u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f181270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j4 f181271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f181272y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.f181271x = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f181270w = obj2;
        this.f181272y |= Integer.MIN_VALUE;
        return this.f181271x.Y2(null, this);
    }
}
