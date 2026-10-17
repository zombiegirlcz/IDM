package rp0;

import com.revolut.core.ui_kit.views.DialogHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f256106b;

    public /* synthetic */ k(m mVar, int i) {
        this.f256105a = i;
        this.f256106b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f256105a) {
            case 0:
                this.f256106b.o.onNext((DialogHeaderView.b) obj2);
                return Unit.f186387a;
            case 1:
                this.f256106b.f256126p.onNext((ty0.a) obj2);
                return Unit.f186387a;
            case 2:
                a0 it8 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f256106b.i;
            default:
                DialogHeaderView.b item = (DialogHeaderView.b) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return new q(item.a(), this.f256106b.k);
        }
    }
}
