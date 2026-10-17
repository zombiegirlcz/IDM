package jj9;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ai9.c f174794b;

    public /* synthetic */ k(ai9.c cVar, int i) {
        this.f174793a = i;
        this.f174794b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f174793a) {
            case 0:
                return c.a((c) obj2, null, null, null, null, null, this.f174794b, 31);
            default:
                return lk9.n.a((lk9.n) obj2, null, this.f174794b, 1);
        }
    }
}
