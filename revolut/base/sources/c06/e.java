package c06;

import com.revolut.feature.customer_present.tips.impl.screen.select_tip.SelectTipScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectTipScreenContract$InputData f20178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f20179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f20180c;

    public e(c cVar, SelectTipScreenContract$InputData selectTipScreenContract$InputData) {
        this.f20178a = selectTipScreenContract$InputData;
        int i = 6;
        this.f20179b = e4m.b.b(new bt7.e(cVar, this, 1, i));
        this.f20180c = e4m.b.b(new bt7.e(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
