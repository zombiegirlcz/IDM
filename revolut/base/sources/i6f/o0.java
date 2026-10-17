package i6f;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6f.a f158954b;

    public /* synthetic */ o0(j6f.a aVar, int i) {
        this.f158953a = i;
        this.f158954b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158953a) {
            case 0:
                return t.a((t) obj2, null, null, null, null, null, null, this.f158954b, null, null, null, null, null, null, null, null, null, null, null, 262079);
            case 1:
                return j8f.j.a((j8f.j) obj2, null, null, this.f158954b, null, null, null, null, 123);
            case 2:
                return n8f.h.a((n8f.h) obj2, null, null, null, null, this.f158954b, null, 47);
            default:
                ((r8f.d) obj2).getClass();
                j6f.a allocationItems = this.f158954b;
                Intrinsics.checkNotNullParameter(allocationItems, "allocationItems");
                return new r8f.d(allocationItems);
        }
    }
}
