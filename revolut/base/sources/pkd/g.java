package pkd;

import android.content.SharedPreferences;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends we0.g {
    public g() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        String string;
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setB) {
            SlotChecklist slotChecklist = null;
            try {
                string = sharedPref.getString((String) obj2, null);
            } catch (Throwable unused) {
            }
            if (string != null) {
                slotChecklist = (SlotChecklist) mapper.b(string, SlotChecklist.class);
                if (slotChecklist != null) {
                    arrayList.add(obj2);
                }
            }
        }
        ij.e eVarEdit = sharedPref.edit();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            eVarEdit.i((String) it8.next());
        }
        eVarEdit.commit();
    }
}
