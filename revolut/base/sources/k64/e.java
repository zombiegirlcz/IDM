package k64;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public DropOutConfig.Action u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f181625w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181626x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f181625w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181626x |= Integer.MIN_VALUE;
        return this.f181625w.c(null, this);
    }
}
