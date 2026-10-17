package zhm;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements Iterable, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322478a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f322479b;

    public q(Object[] objArr) {
        this.f322479b = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f322478a) {
            case 0:
                return kotlin.jvm.internal.u0.h((Object[]) this.f322479b);
            default:
                return new kotlin.jvm.internal.d((Iterator) ((Function0) this.f322479b).invoke());
        }
    }

    public q(Function0 iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f322479b = iteratorFactory;
    }
}
