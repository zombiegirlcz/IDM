package com.revolut.retail.operation_status.screen;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.operation_status.R$id;
import com.revolut.retail.operation_status.R$layout;
import hqi.i;
import ihm.f;
import iqi.g;
import java.io.Serializable;
import java.util.Collection;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l3l.d;
import l3l.n;
import l3l.t;
import o3l.q;
import pri.e;
import q3l.b;
import vc.s;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/operation_status/screen/OperationStatusActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Ll3l/n;", "Ll3l/d;", "Lq3l/b;", "Ldri/a;", "", "<init>", "()V", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OperationStatusActivity extends BaseDelegatesActivity implements d, b, dri.a {
    public static final /* synthetic */ int u0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public n3l.a f104400s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lazy f104399r0 = j.b(new Function0() { // from class: com.revolut.retail.operation_status.screen.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = OperationStatusActivity.u0;
            String str = ((OperationStatusFlowContract$ConfigurationImpl) ((OperationStatusFlowContract$Configuration) this.f104420a.G0())).f104417w;
            return str == null ? "OPERATION_STATUS_FLOW" : str;
        }
    });

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final f f104401t0 = v0.a.d("create(...)");

    @Override // dri.a
    public final boolean D0() {
        return ((OperationStatusFlowContract$ConfigurationImpl) ((OperationStatusFlowContract$Configuration) G0())).E;
    }

    @Override // q3l.b
    public final q E0() {
        n3l.a aVar = this.f104400s0;
        if (aVar != null) {
            return aVar.E0();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    public final e F0() {
        n3l.a aVar = this.f104400s0;
        if (aVar != null) {
            return (n) aVar.u.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return (String) this.f104399r0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        n3l.a aVar = this.f104400s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f104401t0.onNext(Unit.f186387a);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        OperationStatusFlowContract$Configuration operationStatusFlowContract$Configuration = (OperationStatusFlowContract$Configuration) G0();
        n3l.b bVar = ((n3l.b) c.l(this).b(null, getF82699s0())).e;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        i.Companion.getClass();
        i iVar = i.f154714c;
        iVar.getClass();
        g.Companion.getClass();
        n3l.a aVar = new n3l.a(bVar, dVarG, iVar);
        this.f104400s0 = aVar;
        n3l.c.Companion.getClass();
        h0 h0Var = h0.f322473a;
        s.k(h0Var);
        ImmutableSet.copyOf((Collection) h0Var);
        l3l.c cVar = (l3l.c) aVar.f212183c.f212200j.get();
        if (bundle == null) {
            if (cVar == null) {
                Intrinsics.r("state");
                throw null;
            }
            OperationStatusFlowContract$ConfigurationImpl operationStatusFlowContract$ConfigurationImpl = (OperationStatusFlowContract$ConfigurationImpl) operationStatusFlowContract$Configuration;
            Clause clause = operationStatusFlowContract$ConfigurationImpl.f104410m;
            Clause clause2 = operationStatusFlowContract$ConfigurationImpl.f104403a;
            if (clause2 != null) {
                ((t) cVar).f191983b.r().set(clause2);
            }
            Clause clause3 = operationStatusFlowContract$ConfigurationImpl.f104404b;
            if (clause3 != null) {
                ((t) cVar).f191983b.c().set(clause3);
            }
            CharSequence charSequence = operationStatusFlowContract$ConfigurationImpl.f104405c;
            if (charSequence != null) {
                ((t) cVar).f191983b.p0().set(charSequence);
            }
            NaviCommand naviCommand = operationStatusFlowContract$ConfigurationImpl.d;
            if (naviCommand != null) {
                ((t) cVar).f191983b.I().set(naviCommand);
            }
            String str = operationStatusFlowContract$ConfigurationImpl.e;
            if (str != null) {
                ((t) cVar).f191983b.B().set(str);
            }
            v01.b bVar2 = operationStatusFlowContract$ConfigurationImpl.f;
            if (bVar2 != null) {
                ((t) cVar).f191983b.Y().set(bVar2);
            }
            Clause clause4 = operationStatusFlowContract$ConfigurationImpl.i;
            if (clause4 != null) {
                ((t) cVar).f191983b.m0().set(clause4);
            }
            Boolean bool = operationStatusFlowContract$ConfigurationImpl.f104408j;
            if (bool != null) {
                ((t) cVar).f191983b.W().set(bool);
            }
            NaviCommand naviCommand2 = operationStatusFlowContract$ConfigurationImpl.k;
            if (naviCommand2 != null) {
                ((t) cVar).f191983b.k0().set(naviCommand2);
            }
            String str2 = operationStatusFlowContract$ConfigurationImpl.f104409l;
            if (str2 != null) {
                ((t) cVar).f191983b.m().set(str2);
            }
            if (clause != null) {
                ((t) cVar).f191983b.M().set(clause);
            }
            t tVar = (t) cVar;
            o3l.f fVar = tVar.f191983b;
            fVar.L().set(Boolean.valueOf(Intrinsics.f(operationStatusFlowContract$ConfigurationImpl.f104411n, Boolean.TRUE) && clause != null));
            NaviCommand naviCommand3 = operationStatusFlowContract$ConfigurationImpl.o;
            if (naviCommand3 != null) {
                fVar.d0().set(naviCommand3);
            }
            Clause clause5 = operationStatusFlowContract$ConfigurationImpl.f104406g;
            if (clause5 != null) {
                fVar.t().set(clause5);
            }
            NaviCommand naviCommand4 = operationStatusFlowContract$ConfigurationImpl.f104407h;
            if (naviCommand4 != null) {
                fVar.p().set(naviCommand4);
            }
            fVar.X().set(Integer.valueOf(operationStatusFlowContract$ConfigurationImpl.f104412p));
            Integer num = operationStatusFlowContract$ConfigurationImpl.f104413q;
            if (num != null) {
                fVar.T().set(Integer.valueOf(num.intValue()));
            }
            NaviCommand naviCommand5 = operationStatusFlowContract$ConfigurationImpl.f104414r;
            if (naviCommand5 != null) {
                fVar.Q().set(naviCommand5);
            }
            te0.j jVar = tVar.f191984c;
            KProperty[] kPropertyArr = t.f191982j;
            jVar.getValue(tVar, kPropertyArr[0]).set(Boolean.valueOf(operationStatusFlowContract$ConfigurationImpl.f104415s));
            Image image = operationStatusFlowContract$ConfigurationImpl.f104416t;
            if (image != null) {
                fVar.getImage().set(image);
            }
            fVar.l().set(Boolean.valueOf(operationStatusFlowContract$ConfigurationImpl.u));
            Long l2 = operationStatusFlowContract$ConfigurationImpl.v;
            if (l2 != null) {
                tVar.d.getValue(tVar, kPropertyArr[1]).set(Long.valueOf(l2.longValue()));
            }
            Serializable serializable = operationStatusFlowContract$ConfigurationImpl.f104419y;
            if (serializable != null) {
                tVar.e.getValue(tVar, kPropertyArr[2]).set(serializable);
            }
            Integer num2 = operationStatusFlowContract$ConfigurationImpl.f104418x;
            if (num2 != null) {
                fVar.o0().set(Integer.valueOf(num2.intValue()));
            }
            ho.n nVar = operationStatusFlowContract$ConfigurationImpl.z;
            if (nVar != null) {
                tVar.f.set(nVar);
            }
            ho.n nVar2 = operationStatusFlowContract$ConfigurationImpl.A;
            if (nVar2 != null) {
                tVar.f191985g.set(nVar2);
            }
            ho.n nVar3 = operationStatusFlowContract$ConfigurationImpl.B;
            if (nVar3 != null) {
                tVar.f191986h.set(nVar3);
            }
            ho.n nVar4 = operationStatusFlowContract$ConfigurationImpl.C;
            if (nVar4 != null) {
                tVar.i.set(nVar4);
            }
            Video video = operationStatusFlowContract$ConfigurationImpl.D;
            if (video != null) {
                fVar.N().set(video);
            }
            fVar.C().set(Boolean.valueOf(operationStatusFlowContract$ConfigurationImpl.F));
            fVar.O().set(operationStatusFlowContract$ConfigurationImpl.G);
        }
        super.onCreate(bundle);
        setContentView(R$layout.activity_operation_status_screen);
    }
}
