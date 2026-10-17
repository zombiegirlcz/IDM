package x8h;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements efm.x, cy8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f303334a;

    public e(List redirectionUrls, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(redirectionUrls, "redirectionUrls");
                this.f303334a = redirectionUrls;
                break;
            default:
                Intrinsics.checkNotNullParameter(redirectionUrls, "collectionsForScreen");
                this.f303334a = redirectionUrls;
                break;
        }
    }

    @Override // efm.x
    public efm.w apply(efm.r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return te0.w.a0(te0.w.q0(upstream), new d(this, 1));
    }

    @Override // cy8.a
    public Object i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        List list = this.f303334a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (kotlin.text.a0.H(url2, (String) it8.next(), false)) {
                return url2;
            }
        }
        return null;
    }

    @Override // cy8.a
    public /* bridge */ /* synthetic */ av1.c m() {
        return tx8.h.f275351c;
    }
}
