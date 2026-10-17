package k50;

import aw0.k8;
import aw0.l8;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.domain.model.ChatMode;
import com.revolut.chat.domain.model.draft.SelectedUploadDraft;
import com.revolut.core.chaosmanagement.ui.model.ChaosManagementIncidentUiItem;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181166a;

    public /* synthetic */ l2(int i) {
        this.f181166a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181166a) {
            case 0:
                h0 update = (h0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h0.a(update, null, null, null, null, o0.a(update.e, null, 0L, null, null, false, null, null, 63), null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435439);
            case 1:
                h0 update2 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return h0.a(update2, null, null, null, null, o0.a(update2.e, null, 0L, null, null, false, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG), null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435439);
            case 2:
                h0 it8 = (h0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                UUID uuid = it8.f181079a;
                if (uuid == null || uuid.equals(null)) {
                    return null;
                }
                return uuid;
            case 3:
                h0 update3 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                a1.Companion.getClass();
                return h0.a(update3, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, a1.f, 201326591);
            case 4:
                h0 state = (h0) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                ChatMode chatMode = state.i;
                UUID uuid2 = null;
                if (chatMode == null) {
                    return null;
                }
                if (chatMode instanceof ChatMode.Feed) {
                    uuid2 = ((ChatMode.Feed) chatMode).f51044a;
                } else if (!chatMode.equals(ChatMode.SingleFeed.f51045a) && !(chatMode instanceof ChatMode.Default)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new Pair(state.f181083h, uuid2);
            case 5:
                h0 update4 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return h0.a(update4, null, null, null, null, null, v30.i.a(update4.f, false, null, false, null, false, 27), null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435423);
            case 6:
                h0 update5 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return h0.a(update5, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268369919);
            case 7:
                h0 update6 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return h0.a(update6, null, null, null, null, null, v30.i.a(update6.f, false, null, false, new Data(null, null, false, 7, null), false, 23), null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435423);
            case 8:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (ChaosManagementIncidentUiItem) zhm.d0.d0(it9);
            case 9:
                h0 update7 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return h0.a(update7, null, null, null, null, null, null, null, null, null, null, true, false, null, null, null, null, false, null, null, null, null, null, null, null, 268434431);
            case 10:
                h0 update8 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                v30.i iVarA = v30.i.a(update8.f, false, null, false, null, false, 27);
                l8.Companion.getClass();
                return h0.a(update8, null, null, null, null, null, iVarA, null, null, null, null, false, false, null, null, null, null, false, k8.a(j0.f181115a), null, null, null, null, null, null, 267386847);
            case 11:
                h0 update9 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return h0.a(update9, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, a1.a(update9.A, null, null, 0, 14), 201326591);
            case 12:
                h0 state2 = (h0) obj2;
                Intrinsics.checkNotNullParameter(state2, "state");
                v20.n nVar = (v20.n) zhm.d0.o0(state2.d.f181178a);
                return Boolean.valueOf((nVar != null ? nVar.getAuthor() : null) instanceof ChatAgent.Live);
            case 13:
                h0 it10 = (h0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f181080b;
            case 14:
                h0 it11 = (h0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (it11.f181079a == null) {
                    return null;
                }
                return it11.f181080b;
            case 15:
                h0 it12 = (h0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12;
            case 16:
                h0 update10 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                l8.Companion.getClass();
                return h0.a(update10, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, k8.a(j0.f181115a), null, null, null, null, null, null, 267386879);
            case 17:
                h0 h0Var = (h0) obj2;
                return h0.a(h0Var, null, null, null, m1.a(h0Var.d, null, null, zhm.f0.f322471a, null, null, null, null, 0, null, 1019), null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435447);
            case 18:
                h0 h0Var2 = (h0) obj2;
                if (h0Var2.d.f181178a.isEmpty() && h0Var2.f181080b.getContent() == null) {
                    return null;
                }
                return h0Var2;
            case 19:
                h0 h0Var3 = (h0) obj2;
                return h0.a(h0Var3, null, null, null, null, null, null, null, null, null, null, false, false, null, null, b1.a(h0Var3.f181090r, zhm.f0.f322471a, null, null, v0.MESSAGES, 14), null, false, null, null, null, null, null, null, null, 268304383);
            case 20:
                s2 s2Var = (s2) obj2;
                return Long.valueOf((s2Var.f181239b || s2Var.f181238a.length() == 0) ? 0L : kotlin.time.b.f(j4.A0));
            case 21:
                h0 h0Var4 = (h0) obj2;
                if (h0Var4.f181080b.getContent() == null && h0Var4.f181080b.getLoading()) {
                    return null;
                }
                return h0Var4;
            case 22:
                k8 k8Var = l8.Companion;
                k0 k0Var = new k0(false);
                k8Var.getClass();
                return h0.a((h0) obj2, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, k8.a(k0Var), null, null, null, null, null, null, 267386879);
            case 23:
                h0 h0Var5 = (h0) obj2;
                return h0.a(h0Var5, null, null, null, null, null, v30.i.a(h0Var5.f, false, null, false, null, false, 27), null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435423);
            case 24:
                h0 h0Var6 = (h0) obj2;
                m1 m1Var = h0Var6.d;
                return h0.a(h0Var6, null, null, null, m1.a(m1Var, null, null, null, null, null, null, null, m1Var.f181182h + 1, null, 767), null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435447);
            case 25:
                o0 o0Var = ((h0) obj2).e;
                Intrinsics.checkNotNullParameter(o0Var, "<this>");
                CharSequence charSequence = o0Var.f181192a;
                v20.n nVar2 = o0Var.f181194c;
                if (kotlin.text.d0.W(charSequence)) {
                    charSequence = null;
                }
                String string = charSequence != null ? charSequence.toString() : null;
                UUID serverId = nVar2 != null ? nVar2.getServerId() : null;
                String str = o0Var.d;
                List<v20.u0> list = o0Var.f;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (v20.u0 u0Var : list) {
                    String absolutePath = u0Var.f285576a.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    arrayList.add(new SelectedUploadDraft(absolutePath, u0Var.f285577b));
                }
                x30.c cVar = o0Var.f181195g;
                Instant EPOCH = Instant.EPOCH;
                Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
                Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
                return new o30.c(new x30.b(string, serverId, str, arrayList, cVar, EPOCH, EPOCH), nVar2);
            case 26:
                return ((h0) obj2).d.f;
            case 27:
                h0 h0Var7 = (h0) obj2;
                return h0.a(h0Var7, null, null, null, null, null, v30.i.a(h0Var7.f, true, null, false, null, false, 26), null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435423);
            case 28:
                v0 v0Var = ((h0) obj2).f181094x;
                if (v0Var == v0.MESSAGES) {
                    return v0Var;
                }
                return null;
            default:
                return h0.a((h0) obj2, null, null, null, null, null, null, null, null, ChatMode.SingleFeed.f51045a, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435199);
        }
    }
}
