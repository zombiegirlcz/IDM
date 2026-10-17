package aui;

import a2f.q;
import aqd.h1;
import au6.e2;
import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xo8.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jvi.b f9837b;

    public k(jvi.b airportItemsMapper, int i) {
        this.f9836a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(airportItemsMapper, "airportItemsMapper");
                this.f9837b = airportItemsMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(airportItemsMapper, "airportItemsMapper");
                this.f9837b = airportItemsMapper;
                break;
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        switch (this.f9836a) {
            case 0:
                e domainState = (e) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return new i((List) iii.c.f(domainState.f9830a, new e2(this, 5), new h1(17), new q(this, 20)));
            default:
                xti.e domainState2 = (xti.e) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                return new xti.h((List) iii.c.f(domainState2.f308825b, new xrl.a(this, 21), new xti.k(0), new j0(this, 4)));
        }
    }
}
