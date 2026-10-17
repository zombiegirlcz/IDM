package au0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.internal.views.navbar.d f9415b;

    public /* synthetic */ w2(com.revolut.core.ui_kit.internal.views.navbar.d dVar, int i) {
        this.f9414a = i;
        this.f9415b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String itemId = (String) obj2;
        switch (this.f9414a) {
            case 0:
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f9415b.f57403b.onNext(itemId);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f9415b.f57403b.onNext(itemId);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f9415b.f57403b.onNext(itemId);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f9415b.f57403b.onNext(itemId);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f9415b.f57403b.onNext(itemId);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f9415b.f57403b.onNext(itemId);
                break;
            default:
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f9415b.f57403b.onNext(itemId);
                break;
        }
        return Unit.f186387a;
    }
}
