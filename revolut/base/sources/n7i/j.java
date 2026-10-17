package n7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public final /* synthetic */ k A;
    public int B;
    public AccountWrapper u;
    public j8l.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ref$BooleanRef f213117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FeatureCommand f213118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f213119y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.A = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, null, 0L, null, this);
    }
}
