package gw1;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public a5b.a u;
    public a5b.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f147261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f147262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f147263y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f147262x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f147261w = obj2;
        this.f147263y |= Integer.MIN_VALUE;
        return e.Z2(this.f147262x, null, null, null, null, this);
    }
}
