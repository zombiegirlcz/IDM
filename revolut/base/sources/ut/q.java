package ut;

import cli.y;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.impl.ui.step.document.new_document_picker.BiometricVerificationNewDocumentPickerScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class q extends oki.h implements dli.b {
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f283012p;

    public q(BiometricVerificationNewDocumentPickerScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        ArrayList arrayList = inputData.f50611a;
        this.o = arrayList;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((BiometricVerificationDocument) it8.next()).f50376b);
        }
        wi0.b bVar = (wi0.b) d0.d0(d0.U(arrayList2));
        if (bVar == null) {
            throw new IllegalStateException("Documents list must be not empty");
        }
        ArrayList arrayList3 = this.o;
        this.f283012p = mra.d.b(this, new g(bVar, arrayList3, (BiometricVerificationDocument) d0.d0(arrayList3)), stateMapper, null, false, 12);
    }

    public final void I2(l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, j.f283005a)) {
            C2(m.f283007a);
            return;
        }
        boolean z = event instanceof k;
        y yVar = this.f283012p;
        if (z) {
            H2(yVar, new um7.d(event, 28));
            return;
        }
        if (!Intrinsics.f(event, i.f283004a)) {
            if (!Intrinsics.f(event, h.f283003a)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
        } else {
            BiometricVerificationDocument biometricVerificationDocument = ((g) ((j2) yVar.f22677a).getValue()).f283002c;
            if (biometricVerificationDocument == null) {
                return;
            }
            C2(new n(biometricVerificationDocument));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f283012p;
    }
}
