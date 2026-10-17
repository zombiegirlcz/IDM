package pbk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanGiftingReceiverPickerScreenContract$InputData f234734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f234735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234736c;
    public final e4m.e d;
    public final e4m.e e;

    public e(b bVar, g gVar, PlanGiftingReceiverPickerScreenContract$InputData planGiftingReceiverPickerScreenContract$InputData) {
        this.f234735b = bVar;
        this.f234734a = planGiftingReceiverPickerScreenContract$InputData;
        this.f234736c = e4m.b.b(new ned.h(bVar, gVar, this, 1, 28));
        int i = 28;
        this.d = e4m.b.b(new ned.h(bVar, gVar, this, 2, i));
        this.e = e4m.b.b(new ned.h(bVar, gVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
