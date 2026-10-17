package hnb;

import com.revolut.core.ui_kit.models.TextClause;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public String u;
    public TextClause v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f154081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f154082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f154083y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f154082x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f154081w = obj2;
        this.f154083y |= Integer.MIN_VALUE;
        return this.f154082x.b(null, null, this);
    }
}
