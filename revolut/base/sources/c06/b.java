package c06;

import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomTipScreenContract$InputData f20170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f20172c;
    public final e4m.e d;

    public b(c cVar, CustomTipScreenContract$InputData customTipScreenContract$InputData) {
        this.f20171b = cVar;
        this.f20170a = customTipScreenContract$InputData;
        int i = 5;
        this.f20172c = e4m.b.b(new bt7.e(cVar, this, 1, i));
        this.d = e4m.b.b(new bt7.e(cVar, this, 0, i));
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
