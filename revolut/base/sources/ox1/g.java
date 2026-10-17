package ox1;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public nx1.e u;
    public LinkedHashMap v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinkedHashMap f230532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f230533x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f230534y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f230534y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f230533x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f230534y.b(null, null, this);
    }
}
