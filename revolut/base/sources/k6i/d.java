package k6i;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public int A;
    public String u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JuniorBankingProfile f181726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f181728y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f181728y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(this, null, null);
    }
}
