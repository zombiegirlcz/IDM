package nj1;

import com.revolut.feature.address.models.Address;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public boolean A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ h E;
    public int F;
    public Address u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f216326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f216327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f216328y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.E = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.e(null, null, false, null, this);
    }
}
