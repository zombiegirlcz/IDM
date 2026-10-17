package t0c;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import ip0.s7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lw0.h;
import lw0.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ozb.e f267001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f267002b;

    public g(f01.c uiKitResources, ozb.e disclaimerMapper) {
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f267001a = disclaimerMapper;
        this.f267002b = uiKitResources;
    }

    public static cii.b a() {
        h hVar = new h(i.AVATAR);
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(new s7("LOADING_ITEM_ID", 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        n6.Companion.getClass();
        return new cii.b(new aw0.e(false, null, null, m6.a(), null, null, 55), arrayList, hVar);
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f266994a, new szb.g(this, 9), new szb.f(this, 6), new sa5.b(this, 22));
    }
}
