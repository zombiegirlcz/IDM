package ax9;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import au6.z0;
import aw0.x4;
import axi.q;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreenContract$ProcessingState;
import com.revolut.feature.selfserve.sot.impl.ui.note.AddNoteFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.a;
import efm.d0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import le.u1;
import m1c.y;
import m1c.z;
import retrofit2.adapter.rxjava2.HttpException;
import svi.i0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zz9.s;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10896a;

    public /* synthetic */ a(int i) {
        this.f10896a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f10896a;
        od0.i iVar = od0.i.f224256b;
        int i2 = 1;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                xo9.h hVar = (xo9.h) obj3;
                xo9.i iVar2 = (xo9.i) pair.f186386b;
                if (hVar instanceof xo9.g) {
                    ufm.b bVarM = d0.m(new rw9.b(((xo9.g) hVar).f307745a));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                ufm.i iVar3 = new ufm.i(iVar2.a(hVar), new z0(new a(i2), 20), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 1:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new rw9.c(it8);
            case 2:
                e updateState = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                return e.a(ProfileScannerScreenContract$ProcessingState.Detecting.f79650b);
            case 3:
                ProfileScannerScreenContract$ProcessingState.Processing processing = new ProfileScannerScreenContract$ProcessingState.Processing(ProfileScannerScreenContract$ProcessingState.Processing.Type.CAMERA_STREAM);
                ((e) obj2).getClass();
                return e.a(processing);
            case 4:
                ((e) obj2).getClass();
                return e.a(ProfileScannerScreenContract$ProcessingState.Finished.f79652b);
            case 5:
                Intrinsics.checkNotNullParameter((axb.d) obj2, "$this$update");
                return new axb.d(0);
            case 6:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it9 = intRangeU.iterator();
                while (it9.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("SECTION_LOADING_PREFIX", it9.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 7:
                axi.l it10 = (axi.l) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f10953c;
            case 8:
                axi.l it11 = (axi.l) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f10955h;
            case 9:
                axi.l currentState = (axi.l) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                return t1.t(currentState.f10953c, zi0.c.P(u1.a(currentState.f), false, null, 3));
            case 10:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                i0 i0Var = (i0) pair2.f186385a;
                Optional optional = (Optional) pair2.f186386b;
                return optional.isPresent() ? ((svi.d0) optional.get()).f265895c : i0Var.f265922b.f265910b;
            case 11:
                return axi.l.a((axi.l) obj2, 0, null, null, null, null, true, null, null, null, null, null, 4031);
            case 12:
                return axi.l.a((axi.l) obj2, 0, null, null, null, null, false, null, null, null, null, null, 4031);
            case 13:
                return axi.l.a((axi.l) obj2, 0, null, null, null, null, false, null, null, null, null, null, 4031);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                pb0 pb0VarA = nb0.a(pb0.Companion, "list_id_loading_entries", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarA);
                eVarB.add(new gu("list_id_loading_points_section_header", 0, 0, 30));
                ip0.t1 t1Var = new ip0.t1("loading_points_option_1", null, 6);
                yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
                ip0.t1 t1Var2 = new ip0.t1("loading_points_option_2", null, 6);
                yp0.b.l(t1Var2, 0, 0, 0, 0, null, false, 63);
                ip0.t1 t1Var3 = new ip0.t1("loading_points_option_3", null, 6);
                yp0.b.l(t1Var3, 0, 0, 0, 0, null, false, 63);
                eVarB.add(new hg("list_id_revpoints_selector", v.k(t1Var, t1Var2, t1Var3), 3, x4.c.f10604a, null, new gg.b(false, 3), false, false, null, null, 0, R$attr.uikit_dp8, 0, 0, 28624));
                List listK = v.k(new s7("list_id_loading_points_discount", 0, 0, 0, 0, false, null, 126), new s7("list_id_loading_final_price", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return new q(u.a(eVarB), null, a.C0604a.f99054a);
            case 15:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM pix_contacts");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 16:
                z status = (z) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                if (status instanceof y) {
                    od0.h hVar2 = od0.i.Companion;
                    dj0.d dVar = ((y) status).f201475a.f201472c.f83960a;
                    hVar2.getClass();
                    return od0.h.a(dVar);
                }
                if (!(status instanceof z.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                od0.i.Companion.getClass();
                return iVar;
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return new Data(od0.i.f224256b, null, false, 6, null);
            case 19:
                gr2.y it12 = (gr2.y) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new ayc.e(it12);
            case 20:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return ((throwable instanceof HttpException) && ((HttpException) throwable).code() == 404) ? d0.m(new ayc.e(null)) : d0.l(throwable);
            case 21:
                jxf.b trip = (jxf.b) obj2;
                Intrinsics.checkNotNullParameter(trip, "trip");
                Iterator it13 = trip.e.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next = it13.next();
                        if (((jxf.d) next).d == jxf.c.STAYS) {
                        }
                    } else {
                        next = null;
                    }
                }
                jxf.d dVar2 = (jxf.d) next;
                if (dVar2 == null) {
                    return null;
                }
                return new jxf.a(dVar2, trip.f179195b, trip.f179196c, trip.d, trip.f.f179200a);
            case 22:
                LocationDomain location = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(location, "location");
                return new fxf.c(location.f78066a, location.f78067b);
            case 23:
                az.a update = (az.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (update != null) {
                    return new az.a(update.f11271a, !update.f11272b);
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                InputTextDelegate.TextData it14 = (InputTextDelegate.TextData) obj2;
                int i3 = AddNoteFragment.g0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f52598b;
            case 25:
                vf0.h hVar3 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar3, "<destruct>");
                boolean zBooleanValue = ((Boolean) hVar3.f288433a).booleanValue();
                List list = (List) hVar3.f288434b;
                dv9.j jVar = (dv9.j) hVar3.f288435c;
                boolean zBooleanValue2 = ((Boolean) hVar3.d).booleanValue();
                boolean zO = n14.k.o(list, iy9.a.BLOCK_USER, false);
                boolean zO2 = n14.k.o(list, iy9.a.PEER_TO_PEER_CHAT_MESSAGING, true);
                if (zO) {
                    return s.USER_IS_COMPLETELY_BLOCKED;
                }
                if (zO2 && zBooleanValue && jVar.f118070a && !zBooleanValue2) {
                    return s.ENABLED;
                }
                if (!zO2) {
                    return s.USER_IS_BLOCKED;
                }
                if (!zBooleanValue) {
                    return s.DISABLED_BY_PRIVACY;
                }
                dv9.i iVar4 = jVar.f118072c;
                return iVar4 == dv9.i.BLOCKED_BY_TOO_MANY_USERS ? s.BLOCKED_BY_TOO_MANY_USERS : iVar4 == dv9.i.UNSUPPORTED ? s.CHAT_IS_NOT_SUPPORTED_BY_CONTACT : iVar4 == dv9.i.OPTED_OUT ? s.DISABLED_BY_CONTACT : iVar4 == dv9.i.TEXT_NOT_SUPPORTED ? s.TEXT_NOT_SUPPORTED : zBooleanValue2 ? s.EMPTY_REMOTE_CONTACT : s.DISABLED;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 27:
                Boolean hasCompletedTransactions = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hasCompletedTransactions, "hasCompletedTransactions");
                return Boolean.valueOf(!hasCompletedTransactions.booleanValue());
            case 28:
                od0.i it15 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Boolean bool = (Boolean) it15.f224257a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            default:
                List contactSettings = (List) obj2;
                Intrinsics.checkNotNullParameter(contactSettings, "contactSettings");
                return n14.k.o(contactSettings, iy9.a.BLOCK_USER, false) ? s.USER_IS_COMPLETELY_BLOCKED : s.CHAT_IS_NOT_SUPPORTED_BY_CONTACT;
        }
    }
}
