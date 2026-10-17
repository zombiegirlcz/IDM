package hg0;

import com.revolut.core.model.faq.FaqNode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends gim.c {
    public int A;
    public List u;
    public HashSet v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f152056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FaqNode.Article f152057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f152058y;
    public final /* synthetic */ m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.z = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f152058y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, this);
    }
}
