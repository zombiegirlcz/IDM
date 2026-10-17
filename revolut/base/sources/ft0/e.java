package ft0;

import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConditionalAmountDelegate$ConditionalAmountItem$ActionChip f137754a;

    public e(ConditionalAmountDelegate$ConditionalAmountItem$ActionChip model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f137754a = model;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52424a() {
        return this.f137754a.f52117a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f137754a, ((e) obj2).f137754a);
    }

    public final int hashCode() {
        return this.f137754a.hashCode();
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        e eVar = oldItem instanceof e ? (e) oldItem : null;
        if (eVar == null) {
            return null;
        }
        ConditionalAmountDelegate$ConditionalAmountItem$ActionChip conditionalAmountDelegate$ConditionalAmountItem$ActionChip = eVar.f137754a;
        Image image = conditionalAmountDelegate$ConditionalAmountItem$ActionChip.f52118b;
        ConditionalAmountDelegate$ConditionalAmountItem$ActionChip conditionalAmountDelegate$ConditionalAmountItem$ActionChip2 = this.f137754a;
        return new d((Intrinsics.f(image, conditionalAmountDelegate$ConditionalAmountItem$ActionChip2.f52118b) && Intrinsics.f(conditionalAmountDelegate$ConditionalAmountItem$ActionChip.f52119c, conditionalAmountDelegate$ConditionalAmountItem$ActionChip2.f52119c) && conditionalAmountDelegate$ConditionalAmountItem$ActionChip.d == conditionalAmountDelegate$ConditionalAmountItem$ActionChip2.d) ? false : true);
    }
}
