package di3;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public AccountId u;
    public pi3.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hha.d f114877w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f114878x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f114879y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.f114879y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114878x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f114879y.b(null, null, this);
    }
}
