package ona;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f226931a = w.y0(new ok7.b(16));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f226932b = w.y0(new ok7.b(17));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f226933c = w.y0(new ok7.b(18));
    public final Object d = w.y0(new ok7.b(19));

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e((List) iii.c.f(domainState.f226920a, new ok7.c(this, 14), new oa4.c(this, 27), new nrd.i(this, 19)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List b() {
        List listK = v.k((RowDelegate.Model) this.f226932b.getValue(), (RowDelegate.Model) this.f226933c.getValue(), (RowDelegate.Model) this.d.getValue());
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }
}
