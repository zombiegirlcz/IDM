package com.revolut.feature.document_view.impl.ui;

import android.os.Bundle;
import bq.i;
import com.revolut.feature.document_view.impl.R$id;
import com.revolut.feature.document_view.impl.R$layout;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import pri.e;
import w96.a;
import x96.b;
import x96.c;
import xpi.f;
import xpi.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/document_view/impl/ui/DocumentViewActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "", "Lw96/a;", "<init>", "()V", "feature_document_view_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentViewActivity extends BaseDelegatesActivity implements a {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f71956x0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final j90.a f71957r0 = u1.w(this, R$id.image_view);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final j90.a f71958s0 = u1.w(this, R$id.document_view);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final j90.a f71959t0 = u1.w(this, R$id.document_extension);
    public final j90.a u0 = u1.w(this, R$id.document_name);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final j90.a f71960v0 = u1.w(this, R$id.document_size);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public c f71961w0;

    static {
        h0 h0Var = new h0(DocumentViewActivity.class, "imageView", "getImageView()Lit/sephiroth/android/library/imagezoom/ImageViewTouch;", 0);
        p0 p0Var = o0.f186429a;
        f71956x0 = new KProperty[]{p0Var.j(h0Var), p.a.y(DocumentViewActivity.class, "documentView", "getDocumentView()Landroid/view/View;", 0, p0Var), p.a.y(DocumentViewActivity.class, "documentExtension", "getDocumentExtension()Landroidx/appcompat/widget/AppCompatTextView;", 0, p0Var), p.a.y(DocumentViewActivity.class, "documentName", "getDocumentName()Landroidx/appcompat/widget/AppCompatTextView;", 0, p0Var), p.a.y(DocumentViewActivity.class, "documentSize", "getDocumentSize()Landroidx/appcompat/widget/AppCompatTextView;", 0, p0Var)};
    }

    @Override // nri.b
    public final e F0() {
        c cVar = this.f71961w0;
        if (cVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        b bVar = (b) cVar;
        DocumentViewContract$Configuration documentViewContract$Configuration = bVar.f303583c;
        o80.b bVar2 = new o80.b();
        g gVar = (g) bVar.d.get();
        fsi.g gVar2 = bVar.f303581a;
        w96.b bVar3 = new w96.b(documentViewContract$Configuration, bVar2, gVar, i.l(gVar2));
        kli.a.p(bVar3, i.d(gVar2));
        return bVar3;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85901s0() {
        return null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        c cVar = this.f71961w0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x96.a aVar = new x96.a();
        aVar.f303578a = rd0.e.g(this, bundle, null);
        aVar.f303580c = (DocumentViewContract$Configuration) G0();
        f.Companion.getClass();
        aVar.f303579b = f.d;
        this.f71961w0 = (c) aVar.build();
        setContentView(R$layout.activity_document_view);
        super.onCreate(bundle);
    }
}
