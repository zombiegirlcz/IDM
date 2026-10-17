package kui;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.List;
import k8d.t;
import koe.y;
import kotlin.jvm.internal.Intrinsics;
import ku1.f0;
import org.jetbrains.annotations.NotNull;
import rui.k;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f189829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rui.b f189830b;

    public j(k providerLogoMapper, rui.b cardItemsMapper) {
        Intrinsics.checkNotNullParameter(providerLogoMapper, "providerLogoMapper");
        Intrinsics.checkNotNullParameter(cardItemsMapper, "cardItemsMapper");
        this.f189829a = providerLogoMapper;
        this.f189830b = cardItemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(t1.t(domainState.f189819a, domainState.f189820b), new ksk.h(19), new f0(7), new t(14)), (List) iii.c.f(domainState.f189819a, new kog.k(this, 27), new f0(8), new y(this, domainState.f189821c, 5)));
    }
}
