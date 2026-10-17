package ish;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public WidgetContext u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f168271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f168272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f168273y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z zVar, gim.c cVar) {
        super(cVar);
        this.f168272x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f168271w = obj2;
        this.f168273y |= Integer.MIN_VALUE;
        return this.f168272x.a(null, null, null, this);
    }
}
