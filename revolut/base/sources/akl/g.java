package akl;

import com.revolut.sso.api.models.UserInfo;
import jkl.r2;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public r2 u;
    public UserInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f6017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6018y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f6017x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f6016w = obj2;
        this.f6018y |= Integer.MIN_VALUE;
        return h.d(this.f6017x, null, null, null, this);
    }
}
