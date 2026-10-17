package l98;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public String u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f193113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f193114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f193115y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f193114x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f193113w = obj2;
        this.f193115y |= Integer.MIN_VALUE;
        return this.f193114x.d(null, null, null, null, this);
    }
}
