package gyg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f147850b;

    public /* synthetic */ a(m mVar, int i) {
        this.f147849a = i;
        this.f147850b = mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 function1 = (Function1) obj3;
        switch (this.f147849a) {
            case 0:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                break;
        }
        return this.f147850b.f147858a.c("PNL_CHART_LIST_ID");
    }
}
