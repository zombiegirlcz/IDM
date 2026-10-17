package a88;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public int A;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JuniorBankingProfile f2124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public io3.d f2125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f2126y;
    public final /* synthetic */ d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.z = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f2126y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, this);
    }
}
