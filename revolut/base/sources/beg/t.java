package beg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ieg.e f14850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final feg.c f14851b;

    public t(ieg.e filtersMapper, feg.c roomsSelectionCommonMapper) {
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        Intrinsics.checkNotNullParameter(roomsSelectionCommonMapper, "roomsSelectionCommonMapper");
        this.f14850a = filtersMapper;
        this.f14851b = roomsSelectionCommonMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        feg.e domainState = (feg.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new feg.f((List) iii.c.f(domainState.f134609b, new bbh.a(this, 28), new bb2.t(19), new b88.o(this, 4)), this.f14850a.a(domainState.f134610c));
    }
}
