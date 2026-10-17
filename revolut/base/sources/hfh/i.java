package hfh;

import cli.j;
import cli.n;
import cli.o;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import mx0.d7;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1h.h f151919b;

    public i(d1h.h disclaimersMapper, int i) {
        this.f151918a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
                this.f151919b = disclaimersMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
                this.f151919b = disclaimersMapper;
                break;
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        switch (this.f151918a) {
            case 0:
                d domainState = (d) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                aim.e eVarB = u.b();
                Collection collection = domainState.f151913b;
                if (collection == null) {
                    collection = f0.f322471a;
                }
                eVarB.addAll(collection);
                eVarB.addAll(((gah.g) this.f151919b).c(domainState.f151912a, d7.DISCLAIMER));
                return new e(u.a(eVarB));
            default:
                jfh.d domainState2 = (jfh.d) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                aim.e eVarB2 = u.b();
                Collection collection2 = domainState2.f173876b;
                if (collection2 == null) {
                    collection2 = f0.f322471a;
                }
                eVarB2.addAll(collection2);
                eVarB2.addAll(((gah.g) this.f151919b).c(domainState2.f173875a, d7.DISCLAIMER));
                return new jfh.e(u.a(eVarB2));
        }
    }
}
