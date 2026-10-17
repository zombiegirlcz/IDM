package vb4;

import java.util.List;
import sgm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.c {
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f287423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f287424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f287425y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.f287424x = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f287423w = obj2;
        this.f287425y |= Integer.MIN_VALUE;
        return this.f287424x.a(this, null, null);
    }
}
