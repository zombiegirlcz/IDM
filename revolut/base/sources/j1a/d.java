package j1a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringSplitFlowContract$InputData f170292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f170293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f170294c;
    public final e4m.e d;

    public d(i iVar, RecurringSplitFlowContract$InputData recurringSplitFlowContract$InputData) {
        this.f170293b = iVar;
        this.f170292a = recurringSplitFlowContract$InputData;
        int i = 13;
        this.f170294c = e4m.b.b(new iwb.b(iVar, this, 0, i));
        this.d = e4m.b.b(new iwb.b(iVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f170294c.get());
    }
}
