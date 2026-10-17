package lyd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pcd.j;
import pcd.l0;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements l {

    @NotNull
    private static final v Companion = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f200804c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f200805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f200806b;

    static {
        l0[] elements = {l0.REGULAR, l0.GROUP};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f200804c = kotlin.collections.d.y0(elements);
    }

    public w(wsg.b walletsInteractor, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.f200805a = walletsInteractor;
        this.f200806b = vaultsInteractor;
    }

    @Override // lyd.l
    public final Flow a() {
        wsg.b bVar = this.f200805a;
        w4l.i iVar = w4l.i.f294643c;
        return nim.a.v(u0.m(nim.a.v(bVar.e(iVar), new b(9)), nim.a.v(rd0.e.b(((ypg.p) this.f200806b).l(iVar, new pcd.h(j.d.f234867a))), new b(8))), new b(7));
    }

    @Override // lyd.l
    public final t getType() {
        return t.CURRENCIES;
    }
}
