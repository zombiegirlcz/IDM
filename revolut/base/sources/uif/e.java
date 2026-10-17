package uif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f280432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f280433c;

    public /* synthetic */ e(g gVar, Long l2, int i) {
        this.f280431a = i;
        this.f280432b = gVar;
        this.f280433c = l2;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f280431a) {
            case 0:
                Long l2 = this.f280433c;
                Intrinsics.h(l2);
                this.f280432b.b(l2.longValue());
                break;
            case 1:
                Long l3 = this.f280433c;
                Intrinsics.h(l3);
                this.f280432b.b(l3.longValue());
                break;
            case 2:
                Long l4 = this.f280433c;
                Intrinsics.h(l4);
                this.f280432b.b(l4.longValue());
                break;
            default:
                Long l5 = this.f280433c;
                Intrinsics.h(l5);
                this.f280432b.b(l5.longValue());
                break;
        }
    }
}
