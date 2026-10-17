package r40;

import android.R;
import android.content.DialogInterface;
import androidx.content.fragment.FragmentNavigator;
import aw0.o9;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.meshconnect.link.ui.LinkActivity;
import com.revolut.core.android.model.country.CountryInfo;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.retail.trading.core.domain.PocketOwnerInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import tof.a3;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f251357b;

    public /* synthetic */ n0(String str, int i) {
        this.f251356a = i;
        this.f251357b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        do3.e eVar;
        Address address;
        String country;
        int i = this.f251356a;
        Object obj3 = null;
        Object obj4 = null;
        bVarC = null;
        bVarC = null;
        bVarC = null;
        wi0.b bVarC = null;
        Pair pair = null;
        String str = this.f251357b;
        switch (i) {
            case 0:
                a updateState = (a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return a.a(updateState, null, false, null, this.f251357b, null, null, 39);
            case 1:
                r4g.g update = (r4g.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r4g.g.a(update, null, str, false, 5);
            case 2:
                return Boolean.valueOf(FragmentNavigator.addPendingOps$lambda$16(str, (Pair) obj2));
            case 3:
                Map uiStatesMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(uiStatesMap, "uiStatesMap");
                sf8.h hVar = (sf8.h) uiStatesMap.get(str);
                return Boolean.valueOf(hVar != null && c8g.a.l(hVar));
            case 4:
                List walletProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
                Iterator it8 = walletProfiles.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next3 = it8.next();
                        if (Intrinsics.f(((psg.a) next3).f239485b, str)) {
                            obj3 = next3;
                        }
                    }
                }
                psg.a aVar = (psg.a) obj3;
                return Boolean.valueOf(aVar != null && ta6.a.y(aVar));
            case 5:
                r84.e updateState2 = (r84.e) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                if (kotlin.text.d0.W(str)) {
                    str = null;
                }
                return r84.e.a(updateState2, str, null, false, 14);
            case 6:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                String str2 = profile.f77099b;
                String strT = ta6.a.t(profile);
                String str3 = profile.o;
                if (str3 != null) {
                    return new r88.g(str, str2, strT, str3);
                }
                a78.b.f1778a.getClass();
                throw new IllegalArgumentException(a78.a.f1777b.toString());
            case 7:
                List walletWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                Iterator it9 = walletWithPockets.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Pair pair2 = (Pair) it9.next();
                        fo3.c cVar = (fo3.c) pair2.f186385a;
                        Iterator it10 = ((List) pair2.f186386b).iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (Intrinsics.f(((io3.d) next).f163145a, str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        io3.d dVar = (io3.d) next;
                        Pair pair3 = dVar != null ? new Pair(cVar, dVar) : null;
                        if (pair3 != null) {
                            pair = pair3;
                        }
                    }
                }
                if (pair != null) {
                    return pair;
                }
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            case 8:
                List registeredIdentitiesInfo = (List) obj2;
                Intrinsics.checkNotNullParameter(registeredIdentitiesInfo, "registeredIdentitiesInfo");
                Iterator it11 = registeredIdentitiesInfo.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next2 = it11.next();
                        if (Intrinsics.f(((zlg.c) next2).f323250a.f116395a, str)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                zlg.c cVar2 = (zlg.c) next2;
                if (cVar2 != null && (eVar = cVar2.f323250a) != null && (address = eVar.e) != null && (country = address.getCountry()) != null) {
                    bVarC = com.bumptech.glide.d.c(country);
                }
                return new PocketOwnerInfo(bVarC, registeredIdentitiesInfo.size() > 1, cVar2 != null ? cVar2.f323251b : true);
            case 9:
                rgi.e update2 = (rgi.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return rgi.e.a(update2, null, new TextClause(this.f251357b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 1);
            case 10:
                return rgi.e.a((rgi.e) obj2, new rgi.j(str), null, 2);
            case 11:
                CountryInfo countryInfo = (CountryInfo) obj2;
                Intrinsics.checkNotNullParameter(countryInfo, "countryInfo");
                String str4 = countryInfo.f51204a;
                return new ChooserScreenContract$Model(str4, countryInfo.f51205b, qi3.p.ACCOUNT_CELL_ITEM, countryInfo.f51206c, null, new CountryImage(str4, (Integer) null, (ez0.e) null, 14), Intrinsics.f(countryInfo.f51204a, str), countryInfo, 20836);
            case 12:
                MaterialAlertDialogBuilder alertDialog = (MaterialAlertDialogBuilder) obj2;
                int i2 = LinkActivity.f49860d0;
                Intrinsics.checkNotNullParameter(alertDialog, "$this$alertDialog");
                alertDialog.setMessage((CharSequence) str);
                alertDialog.setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null);
                alertDialog.setCancelable(false);
                alertDialog.show();
                return Unit.f186387a;
            case 13:
                rk3.e update3 = (rk3.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return rk3.e.a(update3, this.f251357b, 0L, false, null, null, ISO781611.SMT_TAG);
            case 14:
                return rk3.e.a((rk3.e) obj2, null, 0L, false, this.f251357b, null, LDSFile.EF_DG15_TAG);
            case 15:
                return rk3.e.a((rk3.e) obj2, null, 0L, false, this.f251357b, null, LDSFile.EF_DG15_TAG);
            case 16:
                return rk3.e.a((rk3.e) obj2, null, 0L, false, this.f251357b, null, LDSFile.EF_DG15_TAG);
            case 17:
                rm2.h update4 = (rm2.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return rm2.h.a(update4, null, this.f251357b, false, null, 29);
            case 18:
                rm2.h update5 = (rm2.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Map map = update5.f255186a;
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                for (em2.b bVar : zhm.d0.d1(map.keySet())) {
                    if (Intrinsics.f(bVar.getId(), str)) {
                        return rm2.h.a(update5, null, null, false, bVar, 23);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 19:
                rn6.d update6 = (rn6.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return rn6.d.a(update6, str, null, null, 6);
            case 20:
                List<psg.a> it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                for (psg.a aVar2 : it12) {
                    if (Intrinsics.f(aVar2.f239485b, str)) {
                        return aVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 21:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return str;
            case 22:
                rp9.a updateState3 = (rp9.a) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return rp9.a.a(updateState3, null, null, str, 3);
            case 23:
                Iterator it13 = ((List) obj2).iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next4 = it13.next();
                        if (Intrinsics.f(((a3) next4).f272581b, str)) {
                            obj4 = next4;
                        }
                    }
                }
                return (a3) obj4;
            case 24:
                ru5.j updateState4 = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                pt5.b.Companion.getClass();
                return ru5.j.a(updateState4, pt5.a.a(str), null, null, null, null, null, null, null, false, null, null, 4094);
            case 25:
                ru5.j updateState5 = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return ru5.j.a(updateState5, null, null, null, null, null, null, this.f251357b, null, false, null, null, 4031);
            case 26:
                ru5.j updateState6 = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState6, "$this$updateState");
                return ru5.j.a(updateState6, null, null, null, null, null, null, null, null, false, this.f251357b, null, 3583);
            case 27:
                ru5.j updateState7 = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState7, "$this$updateState");
                return ru5.j.a(updateState7, null, null, null, null, null, null, null, null, false, null, this.f251357b, 2559);
            case 28:
                ruk.i updateState8 = (ruk.i) obj2;
                Intrinsics.checkNotNullParameter(updateState8, "$this$updateState");
                return ruk.i.a(updateState8, ruk.h.valueOf(str), null, null, null, null, null, null, 0, 254);
            default:
                rv7.f update7 = (rv7.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                Data documents = update7.f257722a;
                Intrinsics.checkNotNullParameter(documents, "documents");
                return new rv7.f(documents, str);
        }
    }
}
