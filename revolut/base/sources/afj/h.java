package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimDevicePickerControllerScreenContract$InputData f4263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f4264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4265c;

    public h(b bVar, m mVar, EsimDevicePickerControllerScreenContract$InputData esimDevicePickerControllerScreenContract$InputData) {
        this.f4263a = esimDevicePickerControllerScreenContract$InputData;
        int i = 10;
        this.f4264b = e4m.b.b(new a1e.c(bVar, this, 1, i));
        this.f4265c = e4m.b.b(new a1e.c(bVar, this, 0, i));
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
