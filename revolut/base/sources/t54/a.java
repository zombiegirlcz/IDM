package t54;

import gim.c;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends c {
    public Function1 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f268037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f268038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f268039y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f268038x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f268037w = obj2;
        this.f268039y |= Integer.MIN_VALUE;
        return this.f268038x.Z2(null, null, this);
    }
}
