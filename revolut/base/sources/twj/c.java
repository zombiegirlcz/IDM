package twj;

import efm.d0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nwj.d1;
import nwj.f1;
import ts5.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f275034b;

    public /* synthetic */ c(f fVar, int i) {
        this.f275033a = i;
        this.f275034b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List userAuthElementDtos = (List) obj2;
        switch (this.f275033a) {
            case 0:
                Intrinsics.h(userAuthElementDtos);
                List list = userAuthElementDtos;
                if ((list instanceof Collection) && list.isEmpty()) {
                    this.f275034b.f275039c.I0("WORKFLOW_STEP_ID");
                } else {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (((f1) it8.next()) instanceof d1) {
                        }
                    }
                    this.f275034b.f275039c.I0("WORKFLOW_STEP_ID");
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter(userAuthElementDtos, "userAuthElementDtos");
                f fVar = this.f275034b;
                d0 d0VarFirstOrError = rd0.e.c(fVar.b(), kotlin.coroutines.g.f186406a).firstOrError();
                o oVar = new o(23, new twg.a(fVar, userAuthElementDtos, 3));
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, oVar, 1);
        }
    }
}
