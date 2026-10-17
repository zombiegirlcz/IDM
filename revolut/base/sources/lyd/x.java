package lyd;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.j;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f200807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f200808b;

    public x(wsg.b walletsInteractor, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.f200807a = walletsInteractor;
        this.f200808b = vaultsInteractor;
    }

    @Override // lyd.l
    public final Flow a() {
        wsg.b bVar = this.f200807a;
        w4l.i iVar = w4l.i.f294643c;
        return nim.a.v(u0.m(nim.a.v(bVar.e(iVar), new b(12)), nim.a.v(rd0.e.b(((ypg.p) this.f200808b).l(iVar, new pcd.h(j.d.f234867a))), new b(11))), new b(10));
    }

    @Override // lyd.l
    public final t getType() {
        return t.CURRENCIES;
    }
}
