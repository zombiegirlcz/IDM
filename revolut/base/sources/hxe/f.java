package hxe;

import fmc.z;
import java.util.Optional;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public dj0.d u;
    public Optional v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f156578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f156579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f156580y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z zVar, gim.c cVar) {
        super(cVar);
        this.f156579x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f156578w = obj2;
        this.f156580y |= Integer.MIN_VALUE;
        return this.f156579x.c(null, null, null, this);
    }
}
