package nc8;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public String u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public kc8.a f214161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f214162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f214163y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f214163y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f214162x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f214163y.b(null, null, null, this);
    }
}
