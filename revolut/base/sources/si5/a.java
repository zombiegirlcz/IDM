package si5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public ec5.c u;
    public ec5.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f263512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f263513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f263514y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(continuation);
        this.f263513x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f263512w = obj2;
        this.f263514y |= Integer.MIN_VALUE;
        return b.c3(this.f263513x, null, this);
    }
}
