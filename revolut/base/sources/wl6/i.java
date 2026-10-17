package wl6;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f298442a;

    public i(je6.h institutionLogoMapper) {
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        this.f298442a = institutionLogoMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f298438a;
        ph6.b bVar = (ph6.b) data.getContent();
        String str = bVar != null ? bVar.f236219b : null;
        ph6.b bVar2 = (ph6.b) data.getContent();
        return new g(str, bVar2 != null ? bVar2.f236220c : null, (List) iii.c.f(data, new wl3.d(5), new wf0.b(24), new vjh.c(this, 27)));
    }
}
