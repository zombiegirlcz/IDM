package bt9;

import bs9.i0;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreenContract$InputData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends bji.b implements m {

    @NotNull
    public static final o Companion = new o();
    public final j A;
    public final GroupDetailsBillScreenContract$InputData u;
    public final et9.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dt9.a f18480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j60.a f18481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m1a.q f18482y;
    public final ihm.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(GroupDetailsBillScreenContract$InputData inputData, et9.a actionsMapper, dt9.a interactor, j60.a bottomExpandableDialog, jki.p stateMapper, m1a.q splitBillItemizationItemsMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(splitBillItemizationItemsMapper, "splitBillItemizationItemsMapper");
        this.u = inputData;
        this.v = actionsMapper;
        this.f18480w = interactor;
        this.f18481x = bottomExpandableDialog;
        this.f18482y = splitBillItemizationItemsMapper;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.z = bVarE;
        this.A = new j(new Data(null, null, true, 3, null), false);
    }

    public final k B2() {
        Object content = ((j) t2()).f18463a.getContent();
        if (content != null) {
            return (k) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void C2(Function1 function1) {
        if (ofm.q.G(B2().f18466b)) {
            l2(new v(0, null, function1), new yi5.b(26));
        } else {
            this.v.getClass();
            X1(et9.a.a());
        }
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarSwitchMap = this.z.switchMap(new i0(6, new bq7.j(this, 9)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new bi2.n(this, null, 29), 3);
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.A;
    }
}
