package ba8;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public String u;
    public FeatureCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NaviCommand f13987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f13989y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f13989y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f13988x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f13989y.c(null, null, null, this);
    }
}
