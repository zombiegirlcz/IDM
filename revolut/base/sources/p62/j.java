package p62;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.iris.impl.ui.settings.a f233207b;

    public /* synthetic */ j(com.revolut.feature.apm.iris.impl.ui.settings.a aVar, int i) {
        this.f233206a = i;
        this.f233207b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f233206a) {
            case 0:
                Alias it8 = (Alias) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.apm.iris.impl.ui.settings.a aVar = this.f233207b;
                aVar.l2(new osk.m(aVar, it8, null, 22), new yi5.b(26));
                break;
            default:
                q62.d outputData = (q62.d) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof q62.b) {
                    this.f233207b.J2(((q62.b) outputData).f242449a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
