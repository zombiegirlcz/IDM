package qb0;

import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import gim.c;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends c {
    public HtmlPromptScreen u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f244075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f244076x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f244075w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f244076x |= Integer.MIN_VALUE;
        return this.f244075w.d3(null, this);
    }
}
