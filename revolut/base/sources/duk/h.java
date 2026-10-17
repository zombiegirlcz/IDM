package duk;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements n {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytk.a f117994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1j.b f117995b;

    public h(ytk.a indicatorRowMapper, t1j.b rankRowItemMapper, ytk.b numberClauseMapper) {
        Intrinsics.checkNotNullParameter(indicatorRowMapper, "indicatorRowMapper");
        Intrinsics.checkNotNullParameter(rankRowItemMapper, "rankRowItemMapper");
        Intrinsics.checkNotNullParameter(numberClauseMapper, "numberClauseMapper");
        this.f117994a = indicatorRowMapper;
        this.f117995b = rankRowItemMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f117989a;
        List list = data != null ? (List) iii.c.f(data, new ds4.b(this, 7), new dug.d(this, 1), new dbg.b(this, 12)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new e(list);
    }
}
