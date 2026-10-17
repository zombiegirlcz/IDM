package w9m;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes23.dex */
public final class g extends gim.c {
    public Object u;
    public m0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f295773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f295774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f295775y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f295774x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f295773w = obj2;
        this.f295775y |= Integer.MIN_VALUE;
        return this.f295774x.d(null, null, 0, BitmapDescriptorFactory.HUE_RED, false, this);
    }
}
