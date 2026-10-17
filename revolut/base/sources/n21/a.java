package n21;

import android.content.SharedPreferences;
import com.google.gson.reflect.TypeToken;
import ij.e;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.d0;
import p21.b;
import we0.g;
import wim.z;
import x61.c;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g {
    public final Type d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b openBankingMapper) {
        super(1, 2, 1);
        Intrinsics.checkNotNullParameter(openBankingMapper, "openBankingMapper");
        this.d = new TypeToken<c>() { // from class: com.revolut.data.prefs.base.migration.openbanking.OpenBankingPrefMigrationV1V2$ibanStatusType$1
        }.getType();
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            Intrinsics.h(str);
            if (d0.J(str, "INSTITUTION_IBAN_STATUS_ID_KEY", false)) {
                arrayList.add(obj2);
            }
        }
        for (String str2 : arrayList) {
            Intrinsics.h(str2);
            try {
                String string = sharedPref.getString(str2, null);
                if (string != null) {
                    Type ibanStatusType = this.d;
                    Intrinsics.checkNotNullExpressionValue(ibanStatusType, "ibanStatusType");
                    c model = (c) mapper.b(string, ibanStatusType);
                    Intrinsics.checkNotNullParameter(model, "model");
                    eVarEdit.g(str2, (String) mapper.c(new p21.a(model.f303010a, model.f303011b), z.d(o0.b(p21.a.class))));
                }
            } catch (Exception e) {
                IllegalStateException illegalStateException = new IllegalStateException("Failed to migrate iban status", e);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                eVarEdit.i(str2);
            }
        }
        eVarEdit.commit();
    }
}
