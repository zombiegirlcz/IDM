package g2f;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import e2f.y;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f140042b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(int i, Function1 function1) {
        this.f140041a = i;
        this.f140042b = (kotlin.jvm.internal.q) function1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140041a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = (List) this.f140042b.invoke();
                m70.a.c(t0.f186434a);
                return new y(list, e2f.q.f122082a, new e2f.m(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false));
            case 1:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                this.f140042b.invoke(bool);
                return Unit.f186387a;
            case 2:
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                this.f140042b.invoke(bool2);
                return Unit.f186387a;
            case 3:
                this.f140042b.invoke((RevPointsSpareChangeControllerApi$Result) obj2);
                return Unit.f186387a;
            case 4:
                igk.c output = (igk.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output == null) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f140042b.invoke(output);
                return Unit.f186387a;
            default:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return pd.b.n(p0.f264003c, new y83.d((Function1) this.f140042b, pagedData, (Continuation) null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(Function0 function0) {
        this.f140041a = 0;
        this.f140042b = (kotlin.jvm.internal.q) function0;
    }
}
