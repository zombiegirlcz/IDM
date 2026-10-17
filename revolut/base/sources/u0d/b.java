package u0d;

import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0d.l;
import tyg.g;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf8.b f276164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f276165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f276166c;

    public b(hf8.b juniorErrorResolver, f teenInfoMapper, e highlightsMapper, c documentsMapper) {
        Intrinsics.checkNotNullParameter(juniorErrorResolver, "juniorErrorResolver");
        Intrinsics.checkNotNullParameter(teenInfoMapper, "teenInfoMapper");
        Intrinsics.checkNotNullParameter(highlightsMapper, "highlightsMapper");
        Intrinsics.checkNotNullParameter(documentsMapper, "documentsMapper");
        this.f276164a = juniorErrorResolver;
        this.f276165b = teenInfoMapper;
        this.f276166c = highlightsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        s0d.f domainState = (s0d.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(t1.t(domainState.f258942b, domainState.f258941a), new g(this, 17), new tp8.l(this, 18), new tch.c(this, 14));
    }
}
