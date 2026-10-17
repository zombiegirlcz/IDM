package ccg;

import at.r;
import aw0.m6;
import aw0.n6;
import ce9.p;
import cli.n;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o97.h0;
import wbg.q0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23095a;

    public /* synthetic */ a(int i) {
        this.f23095a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f23095a;
        q0.a aVar = q0.a.f296195a;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return aVar;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return aVar;
            case 2:
                Throwable error = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                AccountId.Joint joint = (AccountId.Joint) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (joint == null) {
                    return error4;
                }
                return null;
            case 6:
                Throwable error5 = (Throwable) obj2;
                AccountId.Joint joint2 = (AccountId.Joint) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (joint2 == null) {
                    return error5;
                }
                return null;
            case 7:
                p s110 = (p) obj2;
                p s2 = (p) obj3;
                Intrinsics.checkNotNullParameter(s110, "s1");
                Intrinsics.checkNotNullParameter(s2, "s2");
                return Boolean.valueOf(s110.f23436a == s2.f23436a && s110.f23437b == s2.f23437b && s110.f23438c == s2.f23438c && s110.d == s2.d && s110.e == s2.e && s110.f == s2.f);
            case 8:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 10:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 11:
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke(new iii.d(14, null, false, false, null));
            case 12:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 13:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return r.a();
            case 15:
                Throwable error6 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list3 == null) {
                    return error6;
                }
                return null;
            case 16:
                SlotChecklistPayload old2 = (SlotChecklistPayload) obj2;
                SlotChecklistPayload slotChecklistPayload = (SlotChecklistPayload) obj3;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(slotChecklistPayload, "new");
                return Boolean.valueOf(!(slotChecklistPayload instanceof SlotChecklistFetchConfig) && Intrinsics.f(old2, slotChecklistPayload));
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 19:
                Function1 getDefaultErrorMapper = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorMapper, "getDefaultErrorMapper");
                return (List) getDefaultErrorMapper.invoke(new iii.d(8, null, true, true, "ERROR_ITEM_ID"));
            case 20:
                Throwable error7 = (Throwable) obj2;
                qha.a aVar2 = (qha.a) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (aVar2 == null) {
                    return error7;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new cii.b(null, f0.f322471a, new lw0.h(lw0.i.AVATAR));
            case 22:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new cjj.h((List) getDefaultErrorItems5.invoke(ynj.h.f315483a), false);
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new lw0.h(lw0.i.TITLE_SUBTITLE);
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ck2.h.a();
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 26:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(14, null, false, false, null));
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zi0.c.P(v.k(new o97.f0(new TextLocalisedClause(R$string.search_block_indexes_name, null, null, 14), "INDEXES-list-id"), h0.f223107a), false, null, 3);
            default:
                States$PersistentDomain restored = (States$PersistentDomain) obj3;
                Intrinsics.checkNotNullParameter((States$PersistentDomain) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(restored, "restored");
                return restored;
        }
    }

    public /* synthetic */ a(n nVar, int i) {
        this.f23095a = i;
    }
}
