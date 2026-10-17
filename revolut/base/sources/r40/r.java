package r40;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f251363b;

    public /* synthetic */ r(u uVar, int i) {
        this.f251362a = i;
        this.f251363b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f251362a) {
            case 0:
                u uVar = this.f251363b;
                uVar.getClass();
                uVar.f = s.LOADING;
                break;
            default:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                u uVar2 = this.f251363b;
                m0 m0Var = uVar2.f251370b;
                List list = (List) it8.getContent();
                if (list == null && !it8.getLoading()) {
                    m0Var.invoke();
                } else if (list != null) {
                    qm2.c cVar = uVar2.f251371c;
                    s sVar = uVar2.f;
                    s sVar2 = s.NOTHING_TO_LOAD;
                    cVar.invoke(list, Boolean.valueOf(sVar == sVar2));
                    if (!it8.getLoading()) {
                        if (it8.getError() != null && list.isEmpty()) {
                            m0Var.invoke();
                        } else if (list.size() < 20) {
                            uVar2.f = sVar2;
                            uVar2.f251369a.invoke();
                        } else {
                            uVar2.f = s.IDLE;
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
