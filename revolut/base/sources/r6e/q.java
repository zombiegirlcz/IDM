package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountInfoPickerScreenContract$InputData f251793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f251794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251795c;

    public q(o oVar, f fVar, SubaccountInfoPickerScreenContract$InputData subaccountInfoPickerScreenContract$InputData) {
        this.f251793a = subaccountInfoPickerScreenContract$InputData;
        this.f251794b = e4m.b.b(new ppd.j(oVar, fVar, this, 1, 20));
        this.f251795c = e4m.b.b(new ppd.j(oVar, fVar, this, 0, 20));
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
