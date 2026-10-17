package et6;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends gim.c {
    public List A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ d2 D;
    public int E;
    public FreelancerOrder u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f129205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f129206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FreelancerOrder f129207y;
    public gt6.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, gim.c cVar) {
        super(cVar);
        this.D = d2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, this);
    }
}
