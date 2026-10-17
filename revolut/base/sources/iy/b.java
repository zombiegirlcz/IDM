package iy;

import com.revolut.camerakit.revolut.ui.experiments.CameraKitToggles$CameraChecksDebugModeFeatureDefinition;
import com.revolut.camerakit.revolut.ui.experiments.CameraKitToggles$DocumentTypeClassificationFeatureDefinition;
import com.revolut.camerakit.revolut.ui.experiments.CameraKitToggles$NfcOnTouchActivationFeatureDefinition;
import com.revolut.camerakit.revolut.ui.experiments.CameraKitToggles$NfcToActiveLivenessFeatureDefinition;
import com.revolut.camerakit.revolut.ui.experiments.CameraKitToggles$RevampedCountryAndDocumentSelectionFeatureDefinition;
import com.revolut.camerakit.revolut.ui.experiments.CameraKitToggles$ZebraUiActiveLivenessFeatureDefinition;
import com.revolut.camerakit.revolut.ui.experiments.CameraKitToggles$ZebraUiFeatureDefinition;
import com.revolut.feature.crypto.gift.asset.api.CryptoGiftAssetApi$Toggles$CryptoGiftAsset;
import io3.i;
import io3.j;
import io3.k;
import io3.l;
import java.util.Iterator;
import jte.d;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f169575a;

    public b(gte.a featureToggleInteractor, g70.a androidEmulatorSimpleDetector) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(androidEmulatorSimpleDetector, "androidEmulatorSimpleDetector");
        this.f169575a = featureToggleInteractor;
    }

    public boolean a(a experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        a aVar = px.a.f240490a;
        if (Intrinsics.f(experiment, px.a.f240490a)) {
            return false;
        }
        boolean zF = Intrinsics.f(experiment, px.a.f240491b);
        gte.a aVar2 = this.f169575a;
        if (zF) {
            return ((d) aVar2).c(CameraKitToggles$CameraChecksDebugModeFeatureDefinition.f50778c);
        }
        if (Intrinsics.f(experiment, px.a.d)) {
            return ((d) aVar2).c(CameraKitToggles$NfcToActiveLivenessFeatureDefinition.f50784c);
        }
        if (Intrinsics.f(experiment, px.a.e)) {
            return ((d) aVar2).c(CameraKitToggles$DocumentTypeClassificationFeatureDefinition.f50780c);
        }
        if (Intrinsics.f(experiment, px.a.f)) {
            return ((d) aVar2).c(CameraKitToggles$RevampedCountryAndDocumentSelectionFeatureDefinition.f50786c);
        }
        if (Intrinsics.f(experiment, px.a.f240493g)) {
            return ((d) aVar2).c(CameraKitToggles$ZebraUiFeatureDefinition.f50791c);
        }
        if (Intrinsics.f(experiment, px.a.f240494h)) {
            return ((d) aVar2).c(CameraKitToggles$ZebraUiActiveLivenessFeatureDefinition.f50789c);
        }
        if (!Intrinsics.f(experiment, px.a.i)) {
            return false;
        }
        return ((d) aVar2).c(CameraKitToggles$NfcOnTouchActivationFeatureDefinition.f50782c);
    }

    public dj0.d b(Pair walletWithPockets, xi0.b currency) {
        Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Object obj2 = null;
        if (this.f169575a.a(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c)) {
            return null;
        }
        Iterator it8 = ((Iterable) walletWithPockets.f186386b).iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            io3.d dVar = (io3.d) next;
            if (Intrinsics.f(dVar.f163147c, currency.f306286a) && dVar.e == l.LOCKED_GIFT && dVar.f == k.ACTIVE && dVar.f163149h == i.INTERNAL && dVar.f163148g == j.PERSONAL) {
                obj2 = next;
                break;
            }
        }
        io3.d dVar2 = (io3.d) obj2;
        return new dj0.d(dVar2 != null ? dVar2.i : 0L, currency);
    }

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f169575a = featureToggleInteractor;
    }
}
