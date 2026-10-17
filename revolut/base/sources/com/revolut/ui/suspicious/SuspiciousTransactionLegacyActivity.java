package com.revolut.ui.suspicious;

import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import iri.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import twl.c;
import twl.e;
import twl.p;
import twl.q;
import u2l.a;
import vzc.g;
import vzc.j;
import w41.b;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/ui/suspicious/SuspiciousTransactionLegacyActivity;", "Lu2l/a;", "Ltwl/b;", "Ltwl/e;", "Lno/m;", "<init>", "()V", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public class SuspiciousTransactionLegacyActivity extends a implements e {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final k9 f107084s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f107085t0;
    public c u0;

    public SuspiciousTransactionLegacyActivity() {
        k9 value = k9.FinCrime;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f107084s0 = value;
    }

    @Override // nri.b
    public final pri.e F0() {
        b bVar = this.f107085t0;
        if (bVar != null) {
            return (twl.b) bVar.T.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF96913t0() {
        return null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return new AnalyticsProduct.Retail(this.f107084s0);
    }

    @Override // u2l.a
    public final w2l.a Z0() {
        b bVar = this.f107085t0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // u2l.a
    public final int c1() {
        return R.layout.activity_suspicious;
    }

    @Override // u2l.a
    public final m d1() {
        c cVar = this.u0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("state");
        throw null;
    }

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        twl.b bVar = (twl.b) this.f218652a0;
        if (bVar != null) {
            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, ((p) bVar).i);
        }
    }

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        dwl.a.a(this);
        phm.a aVar = (phm.a) j6.a.j(hf0.b.d, w41.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", w41.a.class, " is not found"));
        }
        w41.a aVar3 = ((w41.a) aVar2.b()).A;
        g gVar = new g();
        int i = 7;
        gVar.f293492a = e4m.b.b(new j(aVar3, gVar, 0, i));
        gVar.f293493b = e4m.b.b(new j(aVar3, gVar, 1, i));
        gVar.f293494c = e4m.b.b(new j(aVar3, gVar, 2, i));
        gVar.d = e4m.b.b(new j(aVar3, gVar, 4, i));
        gVar.e = e4m.b.b(new j(aVar3, gVar, 3, i));
        b bVar = new b(aVar3, gVar, new xoi.j(), this);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f107085t0 = bVar;
        this.u0 = (c) gVar.d.get();
        super.onCreate(bundle);
        SuspiciousTransactionContract$Configuration suspiciousTransactionContract$Configuration = (SuspiciousTransactionContract$Configuration) G0();
        c cVar = this.u0;
        if (cVar == null) {
            Intrinsics.r("state");
            throw null;
        }
        ((q) cVar).w0().set(suspiciousTransactionContract$Configuration.f107082a);
        c cVar2 = this.u0;
        if (cVar2 == null) {
            Intrinsics.r("state");
            throw null;
        }
        q qVar = (q) cVar2;
        qVar.f275069c.getValue(qVar, q.f[1]).set(Boolean.valueOf(suspiciousTransactionContract$Configuration.f107083b));
    }
}
