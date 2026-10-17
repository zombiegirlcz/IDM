package zji;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f322870b;

    @Override // zji.d, zji.e
    public final void a(Object obj2) {
        this.f322870b = obj2;
        super.a(obj2);
    }

    @Override // zji.d
    public final b b(e observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Object obj2 = this.f322870b;
        if (obj2 != null) {
            observer.a(obj2);
        }
        return super.b(observer);
    }
}
