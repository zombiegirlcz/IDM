package mb6;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.TextClause;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.c {
    public PromptMarketingContentDelegate.Model.BackgroundType.Dialog u;
    public TextClause v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f204167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f204168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f204169y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f204168x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204167w = obj2;
        this.f204169y |= Integer.MIN_VALUE;
        return this.f204168x.a(this);
    }
}
