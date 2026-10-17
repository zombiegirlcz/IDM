package g5a;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.payments.who_to_transfer.impl.R$plurals;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3j.n f140715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aqa.c f140716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io5.b f140717c;
    public final dl3.f d;
    public final nq9.b e;
    public final e3a.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f140718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lx1.i f140719h;
    public final tn9.a i;

    public u(m3j.n beneficiaryItemViewMapper, aqa.c cardOwnersMapper, io5.b cryptoAddressItemMapper, dl3.f contactsMapper, nq9.b groupsMapper, e3a.b chatInfoMapper, s actionsMapper, fa6.a charityItemsMapper, lx1.i apmRecipientMapper, tn9.a paymentCounterpartyMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(cryptoAddressItemMapper, "cryptoAddressItemMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(chatInfoMapper, "chatInfoMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(charityItemsMapper, "charityItemsMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        this.f140715a = beneficiaryItemViewMapper;
        this.f140716b = cardOwnersMapper;
        this.f140717c = cryptoAddressItemMapper;
        this.d = contactsMapper;
        this.e = groupsMapper;
        this.f = chatInfoMapper;
        this.f140718g = actionsMapper;
        this.f140719h = apmRecipientMapper;
        this.i = paymentCounterpartyMapper;
    }

    public static wh d(RowDelegate.Model model, List list) {
        return new wh(model.f53228a, model, list, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final ArrayList a(List contactRecipients, boolean z) {
        Intrinsics.checkNotNullParameter(contactRecipients, "contactRecipients");
        List<zm3.i> list = contactRecipients;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (zm3.i contact : list) {
            xl3.d dVar = (xl3.d) this.d;
            Intrinsics.checkNotNullParameter(contact, "contact");
            arrayList.add(new RowDelegate.Model(hx7.q.E(contact), dVar.i(contact, i1.SIZE_56_56), new TextClause(hx7.q.v(contact), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 1, dl3.f.a(dVar, contact), null, null, 1, null, false, null, false, null, null, null, null, null, null, contact, null, 0, 0, 0, 0, 532610760));
        }
        List listL = zhm.v.l((!z || arrayList.isEmpty()) ? null : new ListSubheaderDelegate.Model("REVOLUT_CONTACTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedQuantityClause(R$plurals.payments_chat_section_revolut_contacts_header, Integer.valueOf(arrayList.size()), (List) null, (Style) null, 28), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return d0.E0(arrayList, listL);
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[LOOP:8: B:75:0x0181->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[LOOP:9: B:94:0x01c2->B:192:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(java.util.List r28, java.util.List r29, e3a.a r30, n38.a r31, java.util.List r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5a.u.b(java.util.List, java.util.List, e3a.a, n38.a, java.util.List, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.wh c(jq9.k r38, e3a.a r39, boolean r40, n38.a r41, boolean r42) {
        /*
            Method dump skipped, instruction units count: 1821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5a.u.c(jq9.k, e3a.a, boolean, n38.a, boolean):com.revolut.core.ui_kit.delegates.wh");
    }

    public final RowDelegate.Model e(RowDelegate.Model model, jq9.k kVar, boolean z, e3a.a aVar, n38.a aVar2) {
        a aVar3 = (a) this.f;
        Clause clauseA = aVar3.a(kVar, aVar, aVar2);
        Clause clause = model.f;
        Pair pair = clause == null ? new Pair(clauseA, null) : new Pair(clause, clauseA);
        return RowDelegate.Model.x(model, null, null, null, (Clause) pair.f186385a, (Clause) pair.f186386b, 0, aVar3.b(kVar, z), false, null, kVar, 0, 0, 0, 0, null, -4195489, 15);
    }
}
