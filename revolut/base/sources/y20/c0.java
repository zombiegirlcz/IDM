package y20;

import com.revolut.chat.data.db.ChatDatabase;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 extends gim.c {
    public ChatDatabase u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f310474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ uvl.c f310475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f310476y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(uvl.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f310475x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310474w = obj2;
        this.f310476y |= Integer.MIN_VALUE;
        return uvl.c.f(this.f310475x, null, this);
    }
}
