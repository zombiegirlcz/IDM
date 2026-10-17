package o6i;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public int A;
    public String u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TeenProfile f222603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f222604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f222605y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f222605y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(this, null, null);
    }
}
