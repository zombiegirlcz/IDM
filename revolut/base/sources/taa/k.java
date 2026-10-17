package taa;

import cli.y;
import com.revolut.feature.pix.api.model.PixKeys;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements dli.b {

    @NotNull
    public static final j Companion = new j();
    public final MyAliasesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f8a.a f269301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f269302q;

    public k(m stateMapper, MyAliasesScreenContract$InputData inputData, f8a.a pixAreaInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pixAreaInteractor, "pixAreaInteractor");
        this.o = inputData;
        this.f269301p = pixAreaInteractor;
        this.f269302q = mra.d.b(this, new e(new PixKeys(0), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, f8a.a.a(this.f269301p), null, null, new t9h.b(this, null, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f269302q;
    }
}
