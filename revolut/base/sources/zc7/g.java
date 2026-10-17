package zc7;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public final /* synthetic */ i A;
    public int B;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f321249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f321250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f321251y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.A = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return i.i(this.A, null, null, null, null, null, this);
    }
}
