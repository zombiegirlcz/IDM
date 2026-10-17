package k9c;

import com.revolut.data.model.Data;
import jki.p;
import jv.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q7c.q;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f182314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f182315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h60.d f182316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f182317s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q revolutPayInteractor, k termsAndConditionsUrlBuilder, p stateMapper, h60.d lottieAnimationControllerExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(revolutPayInteractor, "revolutPayInteractor");
        Intrinsics.checkNotNullParameter(termsAndConditionsUrlBuilder, "termsAndConditionsUrlBuilder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(lottieAnimationControllerExtension, "lottieAnimationControllerExtension");
        this.f182314p = revolutPayInteractor;
        this.f182315q = termsAndConditionsUrlBuilder;
        this.f182316r = lottieAnimationControllerExtension;
        this.f182317s = new f(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f182317s;
    }

    public final void y2() {
        yji.l.a1(this, vkm.q.q(rd0.e.b(this.f182314p.f242830a.f181989c.f(Unit.f186387a, true))), null, null, new o(this, null, 27), 3);
    }
}
