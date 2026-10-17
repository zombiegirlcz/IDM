package zc0;

import com.revolut.core.backend_flow.ui.screen.BackendScreenFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f321145b;

    public /* synthetic */ w(i iVar, int i) {
        this.f321144a = i;
        this.f321145b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        switch (this.f321144a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                ((BackendScreenFragment) this.f321145b).setItems(it8);
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter(it8, "mappedItems");
                return new pfm.h(new xza.a(this.f321145b, it8, 15), 2);
        }
    }
}
