package qrl;

import android.content.SharedPreferences;
import ij.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import we0.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g {

    @NotNull
    public static final C1360a Companion = new C1360a();

    /* JADX INFO: renamed from: qrl.a$a, reason: collision with other inner class name */
    public static final class C1360a {
        private C1360a() {
        }
    }

    public a() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            Intrinsics.h(str);
            if (d0.J(str, "INVEST_ORDERS_LAST_MODIFIED_DATE", false)) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            eVarEdit.i((String) it8.next());
        }
        eVarEdit.commit();
    }
}
