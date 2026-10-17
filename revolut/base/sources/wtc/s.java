package wtc;

import com.revolut.feature.security_hub.api.navigation.SecurityDelayType;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.c {
    public String u;
    public SecurityDelayType v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public cuc.r f299903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f299904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ufm.d f299905y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ufm.d dVar, gim.c cVar) {
        super(cVar);
        this.f299905y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f299904x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f299905y.m(null, null, this);
    }
}
