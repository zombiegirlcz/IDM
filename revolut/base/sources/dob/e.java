package dob;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public Set u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f116478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f116479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f116480y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f116480y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f116479x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f116480y.a(null, this);
    }
}
