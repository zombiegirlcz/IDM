package u21;

import java.lang.reflect.Type;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f276526b;

    public /* synthetic */ c(k kVar, int i) {
        this.f276525a = i;
        this.f276526b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f276525a) {
            case 0:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f276526b.f276536b, "EXTERNAL_CARD_CHECKOUT_JAPAN_KEY", Boolean.TRUE);
                return Unit.f186387a;
            default:
                ue0.c cVar = this.f276526b.f276536b;
                Type type = l21.d.e;
                Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                Boolean bool = (Boolean) cVar.T2("EXTERNAL_CARD_CHECKOUT_JAPAN_KEY", type);
                return bool == null ? Boolean.FALSE : bool;
        }
    }
}
