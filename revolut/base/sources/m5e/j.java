package m5e;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a5e.f f202919b;

    public /* synthetic */ j(a5e.f fVar, int i) {
        this.f202918a = i;
        this.f202919b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202918a) {
            case 0:
                return h.c((h) obj2, this.f202919b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766);
            default:
                return x5e.c.a((x5e.c) obj2, this.f202919b, null, 2);
        }
    }
}
