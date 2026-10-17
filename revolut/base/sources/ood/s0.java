package ood;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 implements cli.n {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rod.j f227078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rod.e f227079b;

    public s0(rod.j tripsListMapper, rod.e tripDetailsMapper, rod.g commonMapper) {
        Intrinsics.checkNotNullParameter(tripsListMapper, "tripsListMapper");
        Intrinsics.checkNotNullParameter(tripDetailsMapper, "tripDetailsMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.f227078a = tripsListMapper;
        this.f227079b = tripDetailsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f227028a, new o0(this, 1), new g0(4), new c1(this, domainState, 23));
        Data data = domainState.f227028a;
        return new j(list, (String) iii.c.f(domainState.f227029b, new o0(4), new g0(6), new ngh.i(23)), (f) iii.c.f(data, new o0(this, 3), new g0(5), new c1(this, 24, domainState, list)), (cr0.g) iii.c.f(data, new o0(2), new g0(3), new nrd.i(this, 21)));
    }
}
