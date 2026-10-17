package zq5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public f5j.a u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f324363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f324364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f324365y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f324364x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f324363w = obj2;
        this.f324365y |= Integer.MIN_VALUE;
        return this.f324364x.c(null, this);
    }
}
