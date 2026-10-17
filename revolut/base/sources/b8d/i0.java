package b8d;

import com.revolut.core.model.faq.FaqAction;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends gim.c {
    public FaqAction u;
    public aj0.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f13165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.article.c f13166x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13167y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f13166x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f13165w = obj2;
        this.f13167y |= Integer.MIN_VALUE;
        return com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.z2(this.f13166x, null, this);
    }
}
