package mz6;

import com.revolut.retail.core.navigation.NaviCommand;
import gim.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public NaviCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f210716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f210717x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f210716w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f210717x |= Integer.MIN_VALUE;
        return this.f210716w.a(null, null, this);
    }
}
