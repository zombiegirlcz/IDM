package gw1;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public a5b.a u;
    public a5b.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f147266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f147267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f147268y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f147267x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f147266w = obj2;
        this.f147268y |= Integer.MIN_VALUE;
        return g.Z2(this.f147267x, null, null, null, null, this);
    }
}
