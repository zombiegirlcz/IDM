package bwk;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.c {
    public m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f19377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19378x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, gim.c cVar) {
        super(cVar);
        this.f19377w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f19378x |= Integer.MIN_VALUE;
        return m.J2(this.f19377w, null, null, BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
