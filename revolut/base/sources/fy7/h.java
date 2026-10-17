package fy7;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import te0.j;
import te0.v;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends iri.a implements e {
    public static final /* synthetic */ KProperty[] d = {o0.f186429a.j(new h0(h.class, "policyStartDate", "getPolicyStartDate()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f138963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f138964c;

    public h(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Date date = ((l80.f) dateProvider).g().toDate();
        Intrinsics.checkNotNullExpressionValue(date, "defaultDate(...)");
        j jVar = new j(date);
        this.f138963b = jVar;
        this.f138964c = new r(jVar.getValue(this, d[0]), 1);
    }

    @Override // fy7.e
    public final v i0() {
        return this.f138963b.getValue(this, d[0]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f138964c;
    }
}
