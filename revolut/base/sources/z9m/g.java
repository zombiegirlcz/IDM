package z9m;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.c {
    public k u;
    public JSONObject v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f320526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f320527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f320528y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f320527x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f320526w = obj2;
        this.f320528y |= Integer.MIN_VALUE;
        return this.f320527x.c(null, this);
    }
}
