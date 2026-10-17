package com.revolut.sso.impl.ui.revolut_id.documents.document_photo;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.revolut_id.documents.document_photo.DocumentPhotoScreen;
import com.revolut.sso.impl.ui.revolut_id.documents.document_photo.DocumentPhotoScreenContract$InputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mjl.i;
import mjl.m;
import rk9.d;
import rlh.c;
import rpl.b;
import rpl.e;
import rpl.f;
import rpl.g;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/documents/document_photo/DocumentPhotoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrpl/e;", "Lcli/w;", "Lrpl/g;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentPhotoScreen extends ViewController<e> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DocumentPhotoScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenDocumentPhotoBinding;", 0))};
    public final DocumentPhotoScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public DocumentPhotoScreen(DocumentPhotoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_document_photo;
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: rpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentPhotoScreen f256419b;

            {
                this.f256419b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentPhotoScreen documentPhotoScreen = this.f256419b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentPhotoScreen.Q;
                        return n14.e.a(documentPhotoScreen, (f) documentPhotoScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentPhotoScreen.Q;
                        qji.b bVarU2 = documentPhotoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.documents.document_photo.di.DocumentPhotoScreenInjector");
                        mjl.j jVar = (mjl.j) bVarU2;
                        m mVar = jVar.f206089b;
                        mjl.j jVar2 = jVar.f206090c;
                        DocumentPhotoScreenContract$InputData documentPhotoScreenContract$InputData = documentPhotoScreen.K;
                        documentPhotoScreenContract$InputData.getClass();
                        return new mjl.i(mVar, jVar2, documentPhotoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DocumentPhotoScreen.Q;
                        return (f) ((mjl.i) documentPhotoScreen.O.getValue()).f206087c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: rpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentPhotoScreen f256419b;

            {
                this.f256419b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentPhotoScreen documentPhotoScreen = this.f256419b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentPhotoScreen.Q;
                        return n14.e.a(documentPhotoScreen, (f) documentPhotoScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentPhotoScreen.Q;
                        qji.b bVarU2 = documentPhotoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.documents.document_photo.di.DocumentPhotoScreenInjector");
                        mjl.j jVar = (mjl.j) bVarU2;
                        m mVar = jVar.f206089b;
                        mjl.j jVar2 = jVar.f206090c;
                        DocumentPhotoScreenContract$InputData documentPhotoScreenContract$InputData = documentPhotoScreen.K;
                        documentPhotoScreenContract$InputData.getClass();
                        return new mjl.i(mVar, jVar2, documentPhotoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DocumentPhotoScreen.Q;
                        return (f) ((mjl.i) documentPhotoScreen.O.getValue()).f206087c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: rpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentPhotoScreen f256419b;

            {
                this.f256419b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentPhotoScreen documentPhotoScreen = this.f256419b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentPhotoScreen.Q;
                        return n14.e.a(documentPhotoScreen, (f) documentPhotoScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentPhotoScreen.Q;
                        qji.b bVarU2 = documentPhotoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.documents.document_photo.di.DocumentPhotoScreenInjector");
                        mjl.j jVar = (mjl.j) bVarU2;
                        m mVar = jVar.f206089b;
                        mjl.j jVar2 = jVar.f206090c;
                        DocumentPhotoScreenContract$InputData documentPhotoScreenContract$InputData = documentPhotoScreen.K;
                        documentPhotoScreenContract$InputData.getClass();
                        return new mjl.i(mVar, jVar2, documentPhotoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DocumentPhotoScreen.Q;
                        return (f) ((mjl.i) documentPhotoScreen.O.getValue()).f206087c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LightboxGalleryView lightboxGalleryView = d3().f115647b;
        lightboxGalleryView.setMenuItems(uiState.f256422a);
        lightboxGalleryView.setGalleryItems(uiState.f256423b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LightboxGalleryView lightboxGalleryView = d3().f115647b;
        lightboxGalleryView.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        lightboxGalleryView.setToolbarTitle(new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_documents_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LightboxGalleryView lightboxGalleryView = d3().f115647b;
        a.g2(this, rd0.e.b(lightboxGalleryView.h0()), null, new c(this, null, 10), 3);
        a.g2(this, rd0.e.b(lightboxGalleryView.b()), null, new d(this, null, 16), 3);
    }

    public final dkl.f d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
