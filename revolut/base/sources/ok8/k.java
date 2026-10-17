package ok8;

import com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.c {
    public JuniorProgressionPromptStage u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f225941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f225942x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, gim.c cVar) {
        super(cVar);
        this.f225941w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f225942x |= Integer.MIN_VALUE;
        return this.f225941w.K2(null, this);
    }
}
