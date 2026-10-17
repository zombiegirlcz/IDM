package a0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StatementPeriod f377b;

    public /* synthetic */ x(StatementPeriod statementPeriod, int i) {
        this.f376a = i;
        this.f377b = statementPeriod;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f376a) {
            case 0:
                rlm.t putJsonObject = (rlm.t) obj2;
                Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
                StatementPeriod statementPeriod = this.f377b;
                hx7.q.S(putJsonObject, "from", statementPeriod.getStart().toString());
                hx7.q.S(putJsonObject, "to", statementPeriod.getEnd().toString());
                return Unit.f186387a;
            case 1:
                return azd.d.a((azd.d) obj2, null, this.f377b, 1);
            case 2:
                e0e.e update = (e0e.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e0e.e.a(update, null, this.f377b, null, 59);
            case 3:
                e0e.e update2 = (e0e.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return e0e.e.a(update2, null, this.f377b, null, 59);
            case 4:
                return k0e.e.a((k0e.e) obj2, null, null, null, this.f377b, null, null, LDSFile.EF_SOD_TAG);
            case 5:
                return p0e.d.a((p0e.d) obj2, null, this.f377b, 1);
            case 6:
                return pzd.p.a((pzd.p) obj2, null, null, this.f377b, null, null, null, 507);
            case 7:
                return tzd.g.a((tzd.g) obj2, null, this.f377b, null, 5);
            default:
                return wyd.x.a((wyd.x) obj2, null, null, null, this.f377b, null, 23);
        }
    }
}
