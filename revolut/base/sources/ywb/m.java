package ywb;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends oki.h implements h {

    @NotNull
    public static final j Companion = new j();
    public final jwb.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f317410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f317411q;

    public m(cli.n stateMapper, jwb.e revPointsGiftcardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        this.o = revPointsGiftcardsInteractor;
        this.f317410p = mra.d.b(this, new d(0), stateMapper, null, false, 12);
        this.f317411q = q.c("");
    }

    @Override // yji.l
    public final void T1(long j2) {
        jwb.e eVar = this.o;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, eVar.e(hVar), null, null, new l(this, null, 2), 3);
        yji.l.a1(this, eVar.c(null, hVar), null, null, new l(this, null, 1), 3);
        yji.l.b1(this, q.q(new y5j.e(t1.d(this.f317411q, 300L), 22)), null, new l(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317410p;
    }
}
