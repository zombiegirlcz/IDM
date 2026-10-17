package gp9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.bills_chooser.api.navigation.CustomBillInputData;
import g9g.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomBillInputData f145372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f145373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f145374c;
    public final e4m.e d;
    public final e4m.e e;

    public f(d dVar, CustomBillInputData customBillInputData) {
        this.f145372a = customBillInputData;
        int i = 18;
        this.f145373b = e4m.b.b(new e0(dVar, this, 1, i));
        this.f145374c = e4m.b.b(new e0(dVar, this, 2, i));
        this.d = e4m.b.b(new e0(dVar, this, 3, i));
        this.e = e4m.b.b(new e0(dVar, this, 0, i));
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
