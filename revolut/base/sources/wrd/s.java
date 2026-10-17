package wrd;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends oki.h implements d {

    @NotNull
    private static final o Companion = new o();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tsj.g f299570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f299571q;

    public s(c inputData, tsj.g customAssetsInteractor, w stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f299570p = customAssetsInteractor;
        this.f299571q = mra.d.b(this, new a(inputData.f299554a, inputData.f299555b, false), stateMapper, null, false, 12);
    }

    public static final Object I2(s sVar, int i, gim.i iVar) {
        Object objZ = vkm.q.z(sVar.X1(new y0(null, new z(new TextLocalisedClause(i, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5)), iVar);
        return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : Unit.f186387a;
    }

    public static final Object J2(s sVar, int i, gim.i iVar) {
        Object objZ = vkm.q.z(sVar.X1(new mii.k("historical_value_success", new TextLocalisedClause(i, null, null, 14), null, null, null, 28)), iVar);
        return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : Unit.f186387a;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.d(vkm.q.q(new v0b.b(mo3.a.g(this.f299570p.f(w4l.i.f294643c), null, new wm9.k(23), 1), this, 26)), h0.f322473a), null, new wka.e(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f299571q;
    }
}
