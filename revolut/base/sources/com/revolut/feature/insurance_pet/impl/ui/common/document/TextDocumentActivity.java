package com.revolut.feature.insurance_pet.impl.ui.common.document;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import gsi.a;
import hpi.d;
import hpi.k;
import hq1.f;
import hul.c;
import hy7.e;
import java.util.List;
import jy7.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jmrtd.cbeff.ISO781611;
import te0.w;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/common/document/TextDocumentActivity;", "Lhpi/d;", "Lhy7/i;", "Lhy7/e;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TextDocumentActivity extends d implements e {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f76259v0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f76261t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f76260s0 = j.b(new f(this, 13));
    public final Object u0 = w.y0(new c(17));

    @Override // nri.b
    public final pri.e F0() {
        b bVar = this.f76261t0;
        if (bVar != null) {
            return bVar.e();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF71175s0() {
        return (String) this.f76260s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        b bVar = this.f76261t0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h08.k kVar = (h08.k) ((jy7.a) com.bumptech.glide.c.l(this).b(null, getF71175s0())).d().h(rd0.e.g(this, bundle, null));
        xpi.f.Companion.getClass();
        this.f76261t0 = (b) ((h08.k) kVar.k()).build();
        TextDocumentContract$Configuration textDocumentContract$Configuration = (TextDocumentContract$Configuration) G0();
        b bVar = this.f76261t0;
        if (bVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        hy7.k kVar2 = (hy7.k) bVar.f();
        te0.j jVar = kVar2.f156755b;
        KProperty[] kPropertyArr = hy7.k.d;
        jVar.getValue(kVar2, kPropertyArr[0]).set(textDocumentContract$Configuration.f76263b);
        kVar2.f156756c.getValue(kVar2, kPropertyArr[1]).set(textDocumentContract$Configuration.f76264c);
        super.onCreate(bundle);
        vyl.a.b(Z0(), (z4l.j) this.u0.getValue(), new hoi.j(null, 7), new o31.b(), 8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.u0.getValue()).c(items);
    }
}
