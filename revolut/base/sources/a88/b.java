package a88;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public final /* synthetic */ d A;
    public int B;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JuniorBankingProfile f2127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public psg.a f2128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2129y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, false, this);
    }
}
