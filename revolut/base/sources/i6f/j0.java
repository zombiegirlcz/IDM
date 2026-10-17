package i6f;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b7f.c f158940b;

    public /* synthetic */ j0(b7f.c cVar, int i) {
        this.f158939a = i;
        this.f158940b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158939a) {
            case 0:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, this.f158940b, null, null, null, null, null, null, null, null, null, 261887);
            case 1:
                return j8f.j.a((j8f.j) obj2, null, null, null, null, null, this.f158940b, null, 95);
            default:
                return n8f.h.a((n8f.h) obj2, null, null, this.f158940b, null, null, null, 59);
        }
    }
}
