package oli;

import androidx.view.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public ActivityResultLauncher u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f226421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226422x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f226421w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226422x |= Integer.MIN_VALUE;
        return this.f226421w.k(null, this);
    }
}
