package y20;

import com.revolut.chat.data.db.ChatDatabase;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.c {
    public p u;
    public ChatDatabase v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f310478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f310479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f310480y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f310479x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310478w = obj2;
        this.f310480y |= Integer.MIN_VALUE;
        return f.a(this.f310479x, null, this);
    }
}
