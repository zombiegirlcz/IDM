package hw3;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.c {
    public DocumentValidationConfig u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f156089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f156090x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, gim.c cVar) {
        super(cVar);
        this.f156089w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f156090x |= Integer.MIN_VALUE;
        return this.f156089w.c(null, null, this);
    }
}
