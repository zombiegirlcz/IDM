package cze;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public WebView u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f110226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f110227x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f110226w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f110227x |= Integer.MIN_VALUE;
        return this.f110226w.b(null, null, null, this);
    }
}
