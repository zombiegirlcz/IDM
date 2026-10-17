package ht1;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends jki.g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ps1.b f155213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final it1.a f155214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f155215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f155216s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ps1.b interactor, it1.a deregistrationMapper, j60.a expandableDialogExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(deregistrationMapper, "deregistrationMapper");
        Intrinsics.checkNotNullParameter(expandableDialogExtension, "expandableDialogExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f155213p = interactor;
        this.f155214q = deregistrationMapper;
        this.f155215r = expandableDialogExtension;
        this.f155216s = new a(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        l2(new j(this, null, 1), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f155216s;
    }
}
