package b16;

import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.c {
    public Uri u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r10.a f11743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11744y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r10.a aVar, gim.c cVar) {
        super(cVar);
        this.f11743x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f11742w = obj2;
        this.f11744y |= Integer.MIN_VALUE;
        return this.f11743x.E(null, this);
    }
}
