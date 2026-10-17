package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 implements z7a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerScreenContract$InputData f247263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7a.b f247264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f247265c;
    public final e4m.e d;
    public final e4m.e e;

    public c2(k0 k0Var, q qVar, PickerScreenContract$InputData pickerScreenContract$InputData, v7a.c cVar) {
        this.f247265c = k0Var;
        this.f247263a = pickerScreenContract$InputData;
        this.f247264b = cVar;
        int i = 26;
        this.d = e4m.b.b(new t(this, 1, i));
        this.e = e4m.b.b(new t(this, 0, i));
    }

    @Override // z7a.b
    public final y7a.f0 a() {
        return (y7a.f0) this.e.get();
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
