package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import java.util.Set;
import y7a.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 implements z7a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerScreenContract$InputData f302124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7a.b f302125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f302126c;
    public final q d;
    public final e4m.e e;
    public final e4m.e f;

    public b0(p pVar, q qVar, PickerScreenContract$InputData pickerScreenContract$InputData, v7a.c cVar) {
        this.f302126c = pVar;
        this.d = qVar;
        this.f302124a = pickerScreenContract$InputData;
        this.f302125b = cVar;
        int i = 19;
        this.e = e4m.b.b(new vy9.a(this, 1, i));
        this.f = e4m.b.b(new vy9.a(this, 0, i));
    }

    @Override // z7a.b
    public final f0 a() {
        return (f0) this.f.get();
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302126c.V.get(), (yji.n) this.d.f302183r.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
