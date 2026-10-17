package fbm;

import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import p2m.g;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends u implements Function1 {
    public final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f133563h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1 function1, Function1 function12) {
        super(1);
        this.f133563h = function1;
        this.i = (u) function12;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.u] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                Iterable iterable = (Iterable) obj2;
                Intrinsics.checkNotNullParameter(iterable, "$this$null");
                ?? r06 = (u) this.i;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    if (((Boolean) r06.invoke(obj3)).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                return this.f133563h.invoke(arrayList);
            default:
                View it8 = (View) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f133563h.invoke((g) this.i);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function1 function1, g gVar) {
        super(1);
        this.f133563h = function1;
        this.i = gVar;
    }
}
