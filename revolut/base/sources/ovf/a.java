package ovf;

import com.revolut.retail.core.navigation.FeatureCommand;
import gim.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {
    public FeatureCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f230178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f230179x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f230178w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f230179x |= Integer.MIN_VALUE;
        return this.f230178w.a(null, this);
    }
}
