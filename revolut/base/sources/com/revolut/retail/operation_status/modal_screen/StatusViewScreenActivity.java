package com.revolut.retail.operation_status.modal_screen;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.operation_status.modal_screen.StatusViewScreenContract$Configuration;
import h3l.f;
import h3l.m;
import ho.n;
import j3l.d;
import j3l.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import te0.j;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/operation_status/modal_screen/StatusViewScreenActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lh3l/l;", "Lh3l/f;", "Lin0/g;", "<init>", "()V", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatusViewScreenActivity extends BaseDelegatesActivity implements f {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f104327t0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f104328r0 = w.y0(new h1g.a(this, 3));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public e f104329s0;

    @Override // nri.b
    public final pri.e F0() {
        e eVar = this.f104329s0;
        if (eVar != null) {
            return eVar.b();
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return (String) this.f104328r0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        e eVar = this.f104329s0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f104329s0 = (e) ((j3l.a) ((d) c.l(this).b(null, getF82699s0())).d().h(rd0.e.g(this, bundle, null))).build();
        StatusViewScreenContract$Configuration statusViewScreenContract$Configuration = (StatusViewScreenContract$Configuration) G0();
        e eVar = this.f104329s0;
        if (eVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        h3l.e state = eVar.getState();
        if (statusViewScreenContract$Configuration instanceof StatusViewScreenContract$Configuration.Basic) {
            m mVar = (m) state;
            j jVar = mVar.f149248b;
            KProperty[] kPropertyArr = m.f149247j;
            StatusViewScreenContract$Configuration.Basic basic = (StatusViewScreenContract$Configuration.Basic) statusViewScreenContract$Configuration;
            jVar.getValue(mVar, kPropertyArr[0]).set(basic.f104333b);
            mVar.f149249c.getValue(mVar, kPropertyArr[1]).set(basic.f104334c);
            n nVar = basic.d;
            if (nVar != null) {
                mVar.d.getValue(mVar, kPropertyArr[2]).set(nVar);
            }
            mVar.e.getValue(mVar, kPropertyArr[3]).set(basic.e);
            n nVar2 = basic.f;
            if (nVar2 != null) {
                mVar.f.getValue(mVar, kPropertyArr[4]).set(nVar2);
            }
            mVar.f149250g.getValue(mVar, kPropertyArr[5]).set(basic.f104335g);
            mVar.f149251h.getValue(mVar, kPropertyArr[6]).set(basic.f104336h);
        } else if (!(statusViewScreenContract$Configuration instanceof StatusViewScreenContract$Configuration.Custom)) {
            throw new NoWhenBranchMatchedException();
        }
        super.onCreate(bundle);
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return ((StatusViewScreenContract$Configuration) G0()).getF104338b();
    }
}
