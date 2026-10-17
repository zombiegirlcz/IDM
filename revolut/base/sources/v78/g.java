package v78;

import com.revolut.feature.junior.accounts.api.navigation.JuniorSelectionInputData;
import efm.r;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import v6l.b0;
import v6l.e0;
import yji.l;
import zf8.k;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends jki.g implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JuniorSelectionInputData f286573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f286574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f286575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f286576s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JuniorSelectionInputData inputData, p stateMapper, j60.a bottomExpandableDialogControllerExtension, k juniorAccountInfoProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        this.f286573p = inputData;
        this.f286574q = bottomExpandableDialogControllerExtension;
        this.f286575r = juniorAccountInfoProvider;
        this.f286576s = b.f286571a;
    }

    @Override // yji.l
    public final void I1() {
        r map = m70.a.g(k.a(this.f286575r, w4l.h.f294642c), null, new d(0), 1).map(new e0(15, new b0(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.a1(this, rd0.e.b(map), null, null, new e(this, null), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f286576s;
    }
}
