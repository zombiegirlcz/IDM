package slm;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class z extends gim.c {
    public int A;
    public yhm.b u;
    public jx.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinkedHashMap f264294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f264295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f264296y;
    public final /* synthetic */ jx.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jx.e eVar, gim.a aVar) {
        super(aVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f264296y = obj2;
        this.A |= Integer.MIN_VALUE;
        return jx.e.a(this.z, null, this);
    }
}
