package fjd;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wid.a f135604b;

    public /* synthetic */ z(wid.a aVar, int i) {
        this.f135603a = i;
        this.f135604b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f135603a) {
            case 0:
                return o.a((o) obj2, null, null, null, null, null, null, null, null, null, false, null, null, null, this.f135604b.f297880a, 8191);
            case 1:
                return xid.c.a((xid.c) obj2, null, null, null, null, this.f135604b.f297880a, 31);
            default:
                return yid.i.a((yid.i) obj2, null, false, this.f135604b.f297880a, 3);
        }
    }
}
