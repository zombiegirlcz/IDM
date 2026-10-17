package yl6;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xo8.j0;
import yjh.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f314662a;

    public h(je6.h institutionLogoMapper) {
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        this.f314662a = institutionLogoMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f314658a;
        ph6.f fVar = (ph6.f) data.getContent();
        String str = fVar != null ? fVar.f236228a : null;
        ph6.f fVar2 = (ph6.f) data.getContent();
        return new g(str, fVar2 != null ? fVar2.f236229b : null, (List) iii.c.f(data, new yjj.j(7), new b0(6), new j0(this, 28)));
    }
}
