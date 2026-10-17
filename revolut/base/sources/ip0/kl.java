package ip0;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class kl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeaderDelegate.Model f165039b;

    public /* synthetic */ kl(HeaderDelegate.Model model, int i) {
        this.f165038a = i;
        this.f165039b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f165038a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f165039b;
    }
}
