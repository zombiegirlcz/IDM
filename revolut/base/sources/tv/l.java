package tv;

import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.client.api.models.HintMessage;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import th9.t;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes16.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitUiSettings f274652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f274653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f274654c;
    public final d d;
    public final f e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fv.e f274655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f274656h;
    public final j2 i;

    public l(CameraKitUiSettings cameraKitUiSettings, h faceMessageMapper, e documentFrontMessageMapper, d documentBackMessageMapper, f documentFrontTiltMessageMapper, a activeLivenessMessageMapper, n passportMessageMapper, fv.e customHintMapperFactory) {
        Intrinsics.checkNotNullParameter(cameraKitUiSettings, "cameraKitUiSettings");
        Intrinsics.checkNotNullParameter(faceMessageMapper, "faceMessageMapper");
        Intrinsics.checkNotNullParameter(documentFrontMessageMapper, "documentFrontMessageMapper");
        Intrinsics.checkNotNullParameter(documentBackMessageMapper, "documentBackMessageMapper");
        Intrinsics.checkNotNullParameter(documentFrontTiltMessageMapper, "documentFrontTiltMessageMapper");
        Intrinsics.checkNotNullParameter(activeLivenessMessageMapper, "activeLivenessMessageMapper");
        Intrinsics.checkNotNullParameter(passportMessageMapper, "passportMessageMapper");
        Intrinsics.checkNotNullParameter(customHintMapperFactory, "customHintMapperFactory");
        this.f274652a = cameraKitUiSettings;
        this.f274653b = faceMessageMapper;
        this.f274654c = documentFrontMessageMapper;
        this.d = documentBackMessageMapper;
        this.e = documentFrontTiltMessageMapper;
        this.f = passportMessageMapper;
        this.f274655g = customHintMapperFactory;
        this.f274656h = yhm.j.c(yhm.k.NONE, new t(this, 21));
        this.i = q.c(cameraKitUiSettings.f50711c);
    }

    public final j a(HintMessage hintMessage) {
        if (hintMessage instanceof HintMessage.Face) {
            return this.f274653b;
        }
        if (hintMessage instanceof HintMessage.DocumentFront.Default) {
            return this.f274654c;
        }
        if (hintMessage instanceof HintMessage.DocumentFront.Passport) {
            return this.f;
        }
        if (hintMessage instanceof HintMessage.DocumentBack) {
            return this.d;
        }
        if (hintMessage instanceof HintMessage.DocumentFrontTilt) {
            return this.e;
        }
        if ((hintMessage instanceof HintMessage.ActiveLiveness) || (hintMessage instanceof HintMessage.QrCode) || (hintMessage instanceof HintMessage.Processing) || (hintMessage instanceof HintMessage.Empty) || hintMessage == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final rz.f b(i iVar) {
        m mVar;
        Integer num;
        Integer num2;
        Integer num3;
        Integer numValueOf = null;
        rz.k kVar = (iVar == null || (num3 = iVar.f274648a) == null) ? null : new rz.k(new rz.h(num3.intValue()), null);
        rz.k kVar2 = (iVar == null || (num2 = iVar.f274649b) == null) ? null : new rz.k(new rz.h(num2.intValue()), null);
        Mask mask = this.f274652a.f50709a;
        mask.getClass();
        if ((((mask instanceof Mask.FaceZebra) || (mask instanceof Mask.DocumentZebra)) ? rz.g.ZEBRA : rz.g.DEFAULT) == rz.g.ZEBRA) {
            if (iVar == null || (num = iVar.d) == null) {
                if (iVar == null || (mVar = iVar.f274650c) == null) {
                    mVar = m.NEUTRAL;
                }
                int i = k.f274651a[mVar.ordinal()];
                if (i == 1) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_exclamation_triangle);
                } else if (i == 2) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_size);
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                numValueOf = num;
            }
        }
        return new rz.f(kVar, kVar2, numValueOf, 4);
    }
}
