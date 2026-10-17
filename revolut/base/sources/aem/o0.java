package aem;

import java.nio.charset.Charset;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class o0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3761a;

    public /* synthetic */ o0(int i) {
        this.f3761a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f3761a) {
            case 0:
                return cim.b.b(a1m.e.w((Charset) obj2), a1m.e.w((Charset) obj3));
            default:
                return cim.b.b((Float) ((Pair) obj3).f186386b, (Float) ((Pair) obj2).f186386b);
        }
    }
}
