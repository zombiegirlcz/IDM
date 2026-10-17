package exa;

import android.content.SharedPreferences;
import h30.l;
import ij.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import l8h.f;
import we0.g;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2, int i3) {
        super(i, i2, 1);
        this.d = i3;
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        switch (this.d) {
            case 0:
                ij.a sharedPref = (ij.a) sharedPreferences;
                Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Set setB = sharedPref.b();
                Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setB) {
                    String str = (String) obj2;
                    Intrinsics.h(str);
                    if (a0.H(str, "REF_CAMPAIGN_PARAMS_V4_KEY", false)) {
                        arrayList.add(obj2);
                    }
                }
                e eVarEdit = sharedPref.edit();
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    eVarEdit.i((String) it8.next());
                }
                eVarEdit.commit();
                break;
            case 1:
                ij.a sharedPref2 = (ij.a) sharedPreferences;
                Intrinsics.checkNotNullParameter(sharedPref2, "sharedPref");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                e eVarEdit2 = sharedPref2.edit();
                Set setB2 = sharedPref2.b();
                Intrinsics.checkNotNullExpressionValue(setB2, "keys(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : setB2) {
                    String str2 = (String) obj3;
                    Intrinsics.h(str2);
                    if (a0.H(str2, "EodRatesStorage", false)) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    eVarEdit2.i((String) it9.next());
                }
                eVarEdit2.commit();
                break;
            case 2:
                ij.a sharedPref3 = (ij.a) sharedPreferences;
                Intrinsics.checkNotNullParameter(sharedPref3, "sharedPref");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                e eVarEdit3 = sharedPref3.edit();
                Set setB3 = sharedPref3.b();
                Intrinsics.checkNotNullExpressionValue(setB3, "keys(...)");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : setB3) {
                    String str3 = (String) obj4;
                    Intrinsics.h(str3);
                    if (a0.H(str3, "MOST_OWNED_STORAGE_KEY", false)) {
                        arrayList3.add(obj4);
                    }
                }
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    eVarEdit3.i((String) it10.next());
                }
                eVarEdit3.commit();
                break;
            case 3:
                ij.a sharedPref4 = (ij.a) sharedPreferences;
                Intrinsics.checkNotNullParameter(sharedPref4, "sharedPref");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                e eVarEdit4 = sharedPref4.edit();
                Set setB4 = sharedPref4.b();
                Intrinsics.checkNotNullExpressionValue(setB4, "keys(...)");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : setB4) {
                    String str4 = (String) obj5;
                    Intrinsics.h(str4);
                    l8h.g.Companion.getClass();
                    if (a0.H(str4, f.a(), false)) {
                        arrayList4.add(obj5);
                    }
                }
                Iterator it11 = arrayList4.iterator();
                while (it11.hasNext()) {
                    eVarEdit4.i((String) it11.next());
                }
                eVarEdit4.commit();
                break;
            case 4:
                ij.a sharedPref5 = (ij.a) sharedPreferences;
                Intrinsics.checkNotNullParameter(sharedPref5, "sharedPref");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                e eVarEdit5 = sharedPref5.edit();
                Set setB5 = sharedPref5.b();
                Intrinsics.checkNotNullExpressionValue(setB5, "keys(...)");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : setB5) {
                    String str5 = (String) obj6;
                    Intrinsics.h(str5);
                    if (a0.H(str5, "STOCK", false) || a0.H(str5, "CRYPTO", false)) {
                        arrayList5.add(obj6);
                    }
                }
                Iterator it12 = arrayList5.iterator();
                while (it12.hasNext()) {
                    eVarEdit5.i((String) it12.next());
                }
                eVarEdit5.commit();
                break;
            case 5:
                ij.a sharedPref6 = (ij.a) sharedPreferences;
                Intrinsics.checkNotNullParameter(sharedPref6, "sharedPref");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                e eVarEdit6 = sharedPref6.edit();
                eVarEdit6.a();
                eVarEdit6.commit();
                break;
            default:
                ij.a sharedPref7 = (ij.a) sharedPreferences;
                Intrinsics.checkNotNullParameter(sharedPref7, "sharedPref");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                l.C(sharedPref7, "STORAGE_KEY_CRYPTO_CONFIG");
                break;
        }
    }
}
