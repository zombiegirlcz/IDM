package b8d;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 extends gim.c {
    public List u;
    public aj0.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f13168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.article.c f13169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13170y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f13169x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f13168w = obj2;
        this.f13170y |= Integer.MIN_VALUE;
        return com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.A2(this.f13169x, null, this);
    }
}
