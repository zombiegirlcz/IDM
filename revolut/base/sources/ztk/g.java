package ztk;

import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements n {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytk.a f325179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1j.b f325180b;

    public g(ytk.a indicatorRowMapper, t1j.b rankRowItemMapper) {
        Intrinsics.checkNotNullParameter(indicatorRowMapper, "indicatorRowMapper");
        Intrinsics.checkNotNullParameter(rankRowItemMapper, "rankRowItemMapper");
        this.f325179a = indicatorRowMapper;
        this.f325180b = rankRowItemMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f325175a;
        Data data2 = domainState.f325176b;
        Data dataT = (data == null || data2 == null) ? null : t1.t(data, data2);
        List list = dataT != null ? (List) iii.c.f(dataT, new zr2.o(this, 18), new zs4.d(this, 2), new y(this, 25)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new e(list);
    }
}
