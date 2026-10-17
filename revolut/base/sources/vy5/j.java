package vy5;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.c {
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f293169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f293170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f293171y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w wVar, gim.c cVar) {
        super(cVar);
        this.f293170x = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f293169w = obj2;
        this.f293171y |= Integer.MIN_VALUE;
        return this.f293170x.b3(null, this);
    }
}
