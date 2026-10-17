package hxj;

import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State;
import gim.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {
    public UserOnboardingFlowContract$State.PhoneData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f156611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f156612x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f156611w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f156612x |= Integer.MIN_VALUE;
        return this.f156611w.a(null, this);
    }
}
