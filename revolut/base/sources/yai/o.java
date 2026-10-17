package yai;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f312038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f312039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.email.screen.a f312040y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature_retail_user_declarations.email.screen.a aVar, Continuation continuation) {
        super(continuation);
        this.f312040y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f312039x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature_retail_user_declarations.email.screen.a.I2(this.f312040y, null, this);
    }
}
