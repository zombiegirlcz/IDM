package ah1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw2.a f4871a;

    public s(lw2.a sharedCardComponentItemMapper) {
        Intrinsics.checkNotNullParameter(sharedCardComponentItemMapper, "sharedCardComponentItemMapper");
        this.f4871a = sharedCardComponentItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f4851a;
        Data data2 = domainState.e;
        return new j((Clause) iii.c.f(data2, new agh.h(8), new p(0), new a2g.m(this, 15)), (List) iii.c.f(data, new agh.h(7), new a9d.p(29), new a15.n(this, domainState, 13)), (domainState.f4851a.getContent() == null || data2.getLoading()) ? false : true);
    }
}
