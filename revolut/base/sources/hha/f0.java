package hha;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152305a;

    public f0() {
        this(null);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(d dVar, d dVar2) {
        int i = dVar != null ? dVar.f152294m : 0;
        int i2 = dVar2 != null ? dVar2.f152294m : 0;
        if (i != i2) {
            return Intrinsics.k(i, i2);
        }
        String str = dVar != null ? dVar.f152287a : null;
        String str2 = dVar2 != null ? dVar2.f152287a : null;
        String str3 = this.f152305a;
        if (Intrinsics.f(str, str3)) {
            return -1;
        }
        return Intrinsics.f(str2, str3) ? 1 : 0;
    }

    public f0(String str) {
        this.f152305a = str;
    }
}
