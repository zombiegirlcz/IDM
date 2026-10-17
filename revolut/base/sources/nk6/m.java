package nk6;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f216666a;

    public m(je6.h institutionLogoMapper) {
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        this.f216666a = institutionLogoMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f216657a, new njf.d(16), new nij.d(25), new c1(this, domainState, 2)));
    }
}
