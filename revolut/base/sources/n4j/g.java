package n4j;

import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public Collection A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ h E;
    public int F;
    public wi0.b u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f212454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f212455x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public BankFieldDefinition f212456y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.E = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.c(null, null, null, this);
    }
}
