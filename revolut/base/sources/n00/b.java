package n00;

import android.graphics.Bitmap;
import xv.m;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends gim.c {
    public m u;
    public m00.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Bitmap f210837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f210838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f210839y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f210839y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210838x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f210839y.c(null, this);
    }
}
