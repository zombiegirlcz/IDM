package dzb;

import aw0.m6;
import aw0.n6;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.s7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ozb.e f121313a;

    public k(ozb.e disclaimerMapper) {
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        this.f121313a = disclaimerMapper;
    }

    public static CellDetailsDelegate.Model a(int i, Clause clause, String str) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), clause, null, null, null, null, 0, null, false, false, null, null, 28664);
    }

    public static cii.b b() {
        lw0.h hVar = new lw0.h(lw0.i.AVATAR);
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new s7("LOADING_ITEM_ID", 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        n6.Companion.getClass();
        return new cii.b(new aw0.e(false, null, null, m6.a(), null, null, 55), arrayList, hVar);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f121300a, new dz7.k(this, 1), new dug.d(this, 26), new dbg.b(this, 18));
    }
}
