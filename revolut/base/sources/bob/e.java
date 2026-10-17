package bob;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public ArrayList u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f17364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f17365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17366y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, gim.c cVar) {
        super(cVar);
        this.f17365x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17364w = obj2;
        this.f17366y |= Integer.MIN_VALUE;
        return this.f17365x.b(null, null, null, this);
    }
}
