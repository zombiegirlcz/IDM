package z32;

import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public ContactImage u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f319123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f319124x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.f319123w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f319124x |= Integer.MIN_VALUE;
        return this.f319123w.a(null, this);
    }
}
