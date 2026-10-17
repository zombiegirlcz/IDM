package jlh;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public String u;
    public a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PopupMenuItem.NestedParent f175766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f175767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f175768y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f175768y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f175767x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f175768y.b(null, this, null);
    }
}
