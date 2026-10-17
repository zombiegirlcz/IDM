package vdb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$InputData;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomerDetailsScreenContract$InputData f287839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f287840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f287841c;
    public final e4m.e d;
    public final e4m.e e;

    public c(j jVar, CustomerDetailsScreenContract$InputData customerDetailsScreenContract$InputData) {
        this.f287840b = jVar;
        this.f287839a = customerDetailsScreenContract$InputData;
        int i = 12;
        this.f287841c = e4m.b.b(new r2(jVar, this, 1, i));
        this.d = e4m.b.b(new r2(jVar, this, 2, i));
        this.e = e4m.b.b(new r2(jVar, this, 0, i));
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
