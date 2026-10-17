package a10;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends gim.c {
    public Bitmap u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f460w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f461x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f462y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f462y = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f461x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f462y.e(null, null, this);
    }
}
