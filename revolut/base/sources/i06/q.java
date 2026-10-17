package i06;

import cli.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends oki.h implements j {

    @NotNull
    public static final n Companion = new n();
    public final t53.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t53.b f157305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n60.a f157306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f157307r;

    public q(cli.n stateMapper, t53.a tipsInteractor, t53.b tipsArticleInteractor, n60.a keyboardControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tipsInteractor, "tipsInteractor");
        Intrinsics.checkNotNullParameter(tipsArticleInteractor, "tipsArticleInteractor");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        this.o = tipsInteractor;
        this.f157305p = tipsArticleInteractor;
        this.f157306q = keyboardControllerExtension;
        this.f157307r = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    public static List I2(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Number) obj2).intValue() > 0) {
                arrayList.add(obj2);
            }
        }
        return d0.V0(d0.O0(d0.i1(arrayList)), 3);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, mo3.a.g(c8g.a.D(this.o.a(w4l.i.f294643c)), null, null, 3), null, null, new hp2.d(this, null, 27), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f157307r;
    }
}
