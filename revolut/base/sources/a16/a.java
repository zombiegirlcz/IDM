package a16;

import b16.f;
import b16.j;
import kf0.c;
import kotlin.jvm.internal.Intrinsics;
import ui0.d;
import zjh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th0.a f548b;

    public a(c cVar, th0.a aVar) {
        this.f547a = cVar;
        this.f548b = aVar;
    }

    public final r10.a a() {
        d dVar = this.f547a.f183264b;
        th0.a aVar = this.f548b;
        i checksProvider = new i(new f(dVar, new ki0.c(t2d.c.A(aVar.f271230a), aVar.f271231b)));
        j destinationMapper = new j(aVar.h());
        Intrinsics.checkNotNullParameter(checksProvider, "checksProvider");
        Intrinsics.checkNotNullParameter(destinationMapper, "destinationMapper");
        r10.a aVar2 = new r10.a();
        aVar2.f250811a = checksProvider;
        aVar2.f250812b = destinationMapper;
        return aVar2;
    }
}
