package vkm;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends gim.c {
    public CopyOnWriteArrayList u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290077w;

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f290077w |= Integer.MIN_VALUE;
        return qk.d.u(null, null, this);
    }
}
