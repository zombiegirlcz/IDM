package xmf;

import gim.c;
import java.util.List;
import java.util.Set;
import zsc.h;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {
    public int A;
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f307239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f307240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f307241y;
    public final /* synthetic */ b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.z = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f307241y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, null, null, this);
    }
}
