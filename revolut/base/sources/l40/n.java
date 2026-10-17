package l40;

import com.revolut.chat.data.repository.chat.AgentInfo;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends gim.c {
    public int A;
    public UUID u;
    public UUID v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r f192004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AgentInfo f192005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f192006y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, gim.c cVar) {
        super(cVar);
        this.z = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f192006y = obj2;
        this.A |= Integer.MIN_VALUE;
        return q.k3(this.z, null, null, null, null, this);
    }
}
