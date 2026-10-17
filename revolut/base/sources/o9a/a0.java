package o9a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8a.k f223144b;

    public /* synthetic */ a0(g8a.k kVar, int i) {
        this.f223143a = i;
        this.f223144b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f223143a) {
            case 0:
                g8a.k kVar = this.f223144b;
                return j.a((j) obj2, null, null, zi0.c.P(kVar, false, null, 3), null, kVar.f141319n, null, 87);
            case 1:
                return u9a.m.a((u9a.m) obj2, zi0.c.P(this.f223144b, false, null, 3), false, 14);
            case 2:
                return u9a.m.a((u9a.m) obj2, zi0.c.P(this.f223144b, false, null, 3), false, 14);
            default:
                g8a.k kVar2 = this.f223144b;
                return u9a.m.a((u9a.m) obj2, zi0.c.P(kVar2, false, null, 3), kVar2.f141319n, 10);
        }
    }
}
