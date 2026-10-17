package q09;

import androidx.room.RoomDatabase;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.e9;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.ui0;
import ip0.zi0;
import j19.g2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import org.bouncycastle.asn1.eac.CertificateBody;
import z0h.p1;
import z0h.t1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241176a;

    public /* synthetic */ a(int i) {
        this.f241176a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String upperCase = null;
        switch (this.f241176a) {
            case 0:
                FullScreenStateDelegate.Model it8 = (FullScreenStateDelegate.Model) obj2;
                KProperty[] kPropertyArr = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return s.f241210a;
            case 1:
                ty0.a clickData = (ty0.a) obj2;
                KProperty[] kPropertyArr2 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof u09.b) {
                    return (u09.b) obj3;
                }
                return null;
            case 2:
                u09.b card = (u09.b) obj2;
                KProperty[] kPropertyArr3 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(card, "card");
                return new p(new k(card.f276101b, f0.ContentCard));
            case 3:
                Unit it9 = (Unit) obj2;
                KProperty[] kPropertyArr4 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return o.f241206a;
            case 4:
                zi0 event = (zi0) obj2;
                KProperty[] kPropertyArr5 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(event, "event");
                return new m(event);
            case 5:
                ui0 it10 = (ui0) obj2;
                KProperty[] kPropertyArr6 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return n.f241205a;
            case 6:
                PlainTextDelegate.Model item = (PlainTextDelegate.Model) obj2;
                KProperty[] kPropertyArr7 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj4 = item.k;
                u09.a aVar = obj4 instanceof u09.a ? (u09.a) obj4 : null;
                if (aVar != null) {
                    return aVar.d;
                }
                return null;
            case 7:
                String deepLink = (String) obj2;
                KProperty[] kPropertyArr8 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                return new p(new k(deepLink, f0.ContentCard));
            case 8:
                return l.a((l) obj2, null, r0.g(), null, 5);
            case 9:
                com.revolut.feature.rev_points.impl.ui.transactions.list.b update = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return update instanceof q0c.l ? q0c.l.a((q0c.l) update, null, null, null, null, false, null, null, null, false, false, RoomDatabase.MAX_BIND_PARAMETER_CNT) : update;
            case 10:
                com.revolut.feature.rev_points.impl.ui.transactions.list.b update2 = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                boolean z = update2 instanceof q0c.l;
                if (z) {
                    q0c.l lVar = (q0c.l) update2;
                    if (lVar.i) {
                        return q0c.l.a(lVar, null, null, null, null, false, null, null, null, false, true, 511);
                    }
                }
                return z ? q0c.l.a((q0c.l) update2, null, null, null, null, false, null, null, null, false, false, 959) : update2;
            case 11:
                com.revolut.feature.rev_points.impl.ui.transactions.list.b bVar = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                if (!(bVar instanceof q0c.l)) {
                    return bVar;
                }
                q0c.l lVar2 = (q0c.l) bVar;
                return lVar2.d != null ? q0c.l.a(lVar2, null, null, null, null, true, null, null, null, false, false, 1007) : bVar;
            case 12:
                List dto = (List) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(dto, "<this>");
                List<e0g.a> list = dto;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (e0g.a aVar2 : list) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    arrayList.add(new ryf.a(aVar2.getId(), aVar2.getPrivacyPolicyUrl()));
                }
                return arrayList;
            case 13:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                Set set = config.U;
                HashSet hashSet = new HashSet();
                Iterator it11 = set.iterator();
                while (it11.hasNext()) {
                    hashSet.add(((xi0.b) it11.next()).f306286a);
                }
                return hashSet;
            case 14:
                Address it12 = (Address) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new p13.c(it12);
            case 15:
                e16.b account = (e16.b) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return account.f121888c;
            case 16:
                String word = (String) obj2;
                Intrinsics.checkNotNullParameter(word, "word");
                Character chR0 = kotlin.text.f0.R0(0, word);
                if (chR0 != null) {
                    String strValueOf = String.valueOf(chR0.charValue());
                    Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                }
                return upperCase == null ? "" : upperCase;
            case 17:
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                Links links = disclaimersData.f318563a;
                hel.b bVar2 = disclaimersData.f318564b;
                return new p1(zhm.u.c(new z0h.g0(links, bVar2)), bVar2);
            case 18:
                return g2.Companion.serializer();
            case 19:
                return l19.l.INSTANCE.serializer();
            case 20:
                return null;
            case 21:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255100b = false;
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                p0 p0Var = o0.f186429a;
                fVar.b(p0Var.b(j19.k.class), new a(18));
                fVar.b(p0Var.b(l19.b.class), new a(19));
                fVar.b(p0Var.b(j19.c.class), new a(20));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 22:
                Throwable error = ((Data) obj2).getError();
                if (error != null) {
                    gom.e.f145194a.e(error);
                }
                return Unit.f186387a;
            case 23:
                q22.a update3 = (q22.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return q22.a.a(update3, null, null, null, null, null, null, null, !update3.f241487h, false, 383);
            case 24:
                return q22.a.a((q22.a) obj2, null, null, null, null, null, null, null, true, true, CertificateBody.profileType);
            case 25:
                p13.d it13 = (p13.d) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.a();
            case 26:
                LocationDomain locationDomain = (LocationDomain) obj2;
                return zi0.c.P(new co3.a(locationDomain.f78066a, locationDomain.f78067b), false, null, 3);
            case 27:
                return Boolean.valueOf(((l93.d) obj2) != l93.d.SELF_EDIT);
            case 28:
                return q23.q.a((q23.q) obj2, null, false, null, null, null, null, null, null, null, false, null, 4071);
            default:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new e9("PLAIN_MAP_LIST_ID", zhm.f0.f322471a, false, yv0.j.DP_180, 482);
        }
    }
}
