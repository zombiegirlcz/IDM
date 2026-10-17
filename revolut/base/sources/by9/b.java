package by9;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final RecipientPaymentsSettings a(dy9.b bVar) {
        iy9.d dVar;
        RecipientPaymentsSettings.Setting setting;
        iy9.c cVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f121078a;
        dy9.c cVar2 = bVar.f121079b;
        Intrinsics.checkNotNullParameter(cVar2, "<this>");
        int i = a.f19779a[cVar2.ordinal()];
        if (i == 1) {
            dVar = iy9.d.USER;
        } else if (i == 2) {
            dVar = iy9.d.BENEFICIARY;
        } else if (i == 3) {
            dVar = iy9.d.CARD_OWNER;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = iy9.d.COMPANY;
        }
        List<dy9.a> list = bVar.f121080c;
        ArrayList arrayList = new ArrayList();
        for (dy9.a aVar : list) {
            iy9.c[] cVarArrValues = iy9.c.values();
            int length = cVarArrValues.length;
            int i2 = 0;
            while (true) {
                setting = null;
                if (i2 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i2];
                if (Intrinsics.f(cVar.a(), aVar.getName())) {
                    break;
                }
                i2++;
            }
            if (cVar != null && aVar.getValue() != null) {
                Object value = aVar.getValue();
                if (value instanceof Number) {
                    setting = new RecipientPaymentsSettings.Setting(cVar, new RecipientPaymentsSettings.Setting.Value.LongNumber(((Number) aVar.getValue()).longValue()));
                } else if (value instanceof Boolean) {
                    setting = new RecipientPaymentsSettings.Setting(cVar, new RecipientPaymentsSettings.Setting.Value.Binary(((Boolean) aVar.getValue()).booleanValue()));
                }
            }
            if (setting != null) {
                arrayList.add(setting);
            }
        }
        return new RecipientPaymentsSettings(str, dVar, arrayList);
    }
}
