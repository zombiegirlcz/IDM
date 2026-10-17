package cie;

import android.text.Editable;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.internal.LinkedTreeMap;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.AllDocumentsRemoteDataSourceImpl;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.android.sdk.capture.ui.camera.NfcPropertiesService;
import com.onfido.android.sdk.capture.ui.userconsent.UserConsentRepository;
import com.onfido.api.client.data.DocumentUpload;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements kfm.o, efm.x, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, Continuation, wb.g, com.google.gson.internal.r, igm.o, Easing {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24452a;

    public /* synthetic */ b(int i) {
        this.f24452a = i;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    @Override // com.google.gson.internal.r
    public Object construct() {
        switch (this.f24452a) {
            case 9:
                return new LinkedTreeMap();
            case 10:
                return new LinkedHashMap();
            case 11:
                return new TreeMap();
            case 12:
                return new ConcurrentHashMap();
            case 13:
                return new ConcurrentSkipListMap();
            case 14:
                return new ArrayList();
            case 15:
                return new LinkedHashSet();
            case 16:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return 403;
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        return EasingKt.LinearEasing$lambda$0(f);
    }

    @Override // efm.x
    public efm.w apply(efm.r it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.distinctUntilChanged();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f24452a) {
            case 0:
                n nVar = n.f;
                KProperty[] kPropertyArr = AccountsController.O0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sfe.u) nVar.invoke(p0);
            case 1:
                o oVar = o.f;
                KProperty[] kPropertyArr2 = AccountsController.O0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sfe.w) oVar.invoke(p0);
            case 2:
                p pVar = p.f;
                KProperty[] kPropertyArr3 = AccountsController.O0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sfe.v) pVar.invoke(p0);
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(p0, "it");
                return Boolean.TRUE;
            case 4:
                cle.m mVar = cle.m.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cle.b) mVar.invoke(p0);
            case 8:
                kf.f fVar = (kf.f) p0;
                fVar.getClass();
                jpf.a aVar = com.google.firebase.messaging.p.f49519a;
                aVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    aVar.l(fVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 18:
                return AllDocumentsRemoteDataSourceImpl.allSupportedDocuments$lambda$0((Throwable) p0);
            case 19:
                return CapturePresenter.uploadDocumentMedia$lambda$22((Throwable) p0);
            case 20:
                return NfcPropertiesService.get$lambda$0((Throwable) p0);
            case 21:
                return UserConsentRepository.shouldShowUserConsent$lambda$1((Throwable) p0);
            case 22:
                return ((DocumentUpload) p0).getId();
            case 24:
                d6j.g gVar = d6j.g.f;
                CommodityAssetDetailsScreen.Companion aVar2 = CommodityAssetDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) gVar.invoke(p0);
            case 25:
                d6j.h hVar = d6j.h.f;
                CommodityAssetDetailsScreen.Companion aVar3 = CommodityAssetDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) hVar.invoke(p0);
            case 26:
                d8j.d dVar = d8j.d.f;
                KProperty[] kPropertyArr4 = BaseCryptoAssetDetailsScreen.Y;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) dVar.invoke(p0);
            case 27:
                d8j.e eVar = d8j.e.f;
                KProperty[] kPropertyArr5 = BaseCryptoAssetDetailsScreen.Y;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) eVar.invoke(p0);
            case 28:
                dqg.i iVar = dqg.i.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) iVar.invoke(p0);
        }
    }
}
