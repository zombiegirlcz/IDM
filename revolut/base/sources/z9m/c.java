package z9m;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.c {
    public final /* synthetic */ e A;
    public int B;
    public e u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JSONArray f320516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f320517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f320518y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.A = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, false, this);
    }
}
