package ch;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class o extends PhantomReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f24045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f24046b;

    public /* synthetic */ o(a aVar, ReferenceQueue referenceQueue, Set set, n nVar) {
        super(aVar, referenceQueue);
        this.f24045a = set;
        this.f24046b = nVar;
    }
}
