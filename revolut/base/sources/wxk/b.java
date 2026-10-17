package wxk;

import com.revolut.retail.core.navigation.NaviCommand;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public NaviCommand u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f301001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f301002x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f301003y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f301002x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f301001w = obj2;
        this.f301003y |= Integer.MIN_VALUE;
        return this.f301002x.a(null, null, this);
    }
}
