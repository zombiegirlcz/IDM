package cze;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public WebView u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f110224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f110225x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f110224w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f110225x |= Integer.MIN_VALUE;
        return this.f110224w.a(null, this);
    }
}
