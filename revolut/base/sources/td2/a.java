package td2;

import c12.f;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlow;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends n implements f {

    @NotNull
    public static final C1508a Companion = new C1508a();

    /* JADX INFO: renamed from: td2.a$a, reason: collision with other inner class name */
    public static final class C1508a {
        private C1508a() {
        }
    }

    @Override // c12.f
    public final boolean A(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String strE0 = d0.e0(value, "PT");
        if (strE0.length() == 9) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < strE0.length(); i++) {
                Integer numB = kotlin.text.a.b(strE0.charAt(i));
                if (numB != null) {
                    arrayList.add(numB);
                }
            }
            if (arrayList.size() == 9) {
                Iterator it8 = zhm.d0.k1(zhm.d0.V0(arrayList, 8)).iterator();
                int iA = 0;
                while (true) {
                    kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
                    if (!((Iterator) dVar.f186416c).hasNext()) {
                        break;
                    }
                    IndexedValue indexedValue = (IndexedValue) dVar.next();
                    iA = v0.a.a(9, indexedValue.f186391a, ((Number) indexedValue.f186392b).intValue(), iA);
                }
                int i2 = iA % 11;
                if (i2 < 0 || i2 >= 2) {
                    if (((Number) zhm.d0.m0(arrayList)).intValue() + i2 == 11) {
                        return true;
                    }
                } else if (((Number) zhm.d0.m0(arrayList)).intValue() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c12.f
    public final String t0(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return a0.H(value, "PT", false) ? value : "PT".concat(value);
    }

    @Override // c12.f
    public final void x(ApmContact contact, hrf.f direction) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!(contact instanceof SpinContact)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        A2(new com.revolut.kompot.common.b(new SpinTransferFlow(new SpinTransferFlowContract$InputData((SpinContact) contact)), (ModalDestination.Style) null, 6));
    }
}
