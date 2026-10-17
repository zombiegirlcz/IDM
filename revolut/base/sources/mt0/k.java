package mt0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.internal.views.floatingbottombar.a f208711b;

    public /* synthetic */ k(com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar, int i) {
        this.f208710a = i;
        this.f208711b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f208710a) {
            case 0:
                Function0 function0 = this.f208711b.f;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 1:
                Function0 function02 = this.f208711b.f;
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.f186387a;
            case 2:
                com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar = this.f208711b;
                aVar.k = false;
                if (!aVar.f57053j) {
                    aVar.c();
                }
                return Unit.f186387a;
            case 3:
                com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar2 = this.f208711b;
                return new g(aVar2.f57048a, aVar2.f57049b, aVar2.f57050c, aVar2.d);
            default:
                Function0 function03 = this.f208711b.f;
                if (function03 != null) {
                    function03.invoke();
                }
                return Unit.f186387a;
        }
    }
}
