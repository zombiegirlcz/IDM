package e0a;

import com.revolut.feature.payments.messaging.data.api.model.MessageType;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.c {
    public MessageType u;
    public zm3.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f121539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f121540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f121541y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f121540x = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121539w = obj2;
        this.f121541y |= Integer.MIN_VALUE;
        return b0.Z2(this.f121540x, null, null, this);
    }
}
