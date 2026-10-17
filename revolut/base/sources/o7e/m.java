package o7e;

import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.a f222785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f222786b;

    public m(a9e.a billsItemMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(billsItemMapper, "billsItemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f222785a = billsItemMapper;
        this.f222786b = dateProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f222771a, new o69.b(13), new o4a.a(15), new lk7.p(this, 10, ((l80.f) this.f222786b).k(), domainState.f222772b));
    }
}
