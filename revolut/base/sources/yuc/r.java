package yuc;

import com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.c {
    public SecurityHubProductArticleKey u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f316990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f316991x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, gim.c cVar) {
        super(cVar);
        this.f316990w = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f316991x |= Integer.MIN_VALUE;
        return u.I2(this.f316990w, null, this);
    }
}
