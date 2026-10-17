package qf0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gim.c {
    public Exception u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f245206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f245207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f245208y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f245207x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f245206w = obj2;
        this.f245208y |= Integer.MIN_VALUE;
        return this.f245207x.c(null, this);
    }
}
