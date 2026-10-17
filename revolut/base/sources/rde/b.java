package rde;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.support.impl.transfer_tracker.ui.date_picker.DatePickerScreenContract$InputData;
import java.util.Set;
import ql7.d2;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatePickerScreenContract$InputData f253412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f253413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f253414c;
    public final e4m.e d;

    public b(h hVar, DatePickerScreenContract$InputData datePickerScreenContract$InputData) {
        this.f253412a = datePickerScreenContract$InputData;
        int i = 19;
        this.f253413b = e4m.b.b(new d2(this, 2, i));
        this.f253414c = e4m.b.b(new d2(this, 1, i));
        this.d = e4m.b.b(new d2(this, 0, i));
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
