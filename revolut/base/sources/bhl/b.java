package bhl;

import ack.o;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.impl.analytics_cycle.network.TransactionAnalyticsService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;
import jqj.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.t;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15315a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15317c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15318g;

    public /* synthetic */ b(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z, boolean z3, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping) {
        this.e = legacyTextFieldState;
        this.f = focusRequester;
        this.f15317c = z;
        this.d = z3;
        this.f15318g = textFieldSelectionManager;
        this.f15316b = offsetMapping;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f15315a) {
            case 0:
                return ((c) this.e).f((LocalDate) this.f, (LocalDate) this.f15318g, this.f15317c, (String) this.f15316b, this.d, (SQLiteConnection) obj2);
            case 1:
                eqj.g gVar = (eqj.g) this.e;
                String groupId = (String) this.f15316b;
                String str = (String) this.f;
                dj0.d dVar = (dj0.d) this.f15318g;
                od0.i external = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(external, "external");
                m mVar = gVar.f128479a;
                boolean zF = Intrinsics.f(external.f224257a, Boolean.TRUE);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                TransactionAnalyticsService transactionAnalyticsService = mVar.f177746a;
                iqj.d dVar2 = this.f15317c ? iqj.d.ALL : iqj.d.CURRENT;
                boolean z = this.d;
                pfm.a aVarE = transactionAnalyticsService.updateTransactionAnalyticsExclusion(groupId, new iqj.g(zF, str, dVar2, (z && dVar == null) ? iqj.c.FORCE_EXCLUDED : (z && dVar == null) ? iqj.c.DEFAULT : iqj.c.DEFAULT, dVar != null ? new iqj.b(dVar.f115082a, dVar.f115083b.f306286a) : null)).e(pd.b.n(p0.f264003c, new o(groupId, z, dVar, mVar, (Continuation) null, 10)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                t tVarL = w.g0(aVarE).l(new hc7.a(13, str, mVar));
                Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                return tVarL;
            case 2:
                hp3.t tVar = (hp3.t) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) this.f15318g;
                kp3.b bVar2 = (kp3.b) this.f15316b;
                hp3.m update = (hp3.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Set set = tVar.d;
                String str2 = tVar.f;
                boolean z3 = !Intrinsics.f(set, update.f154414b);
                LocalDate localDate = bVar.f66145w;
                Intrinsics.checkNotNullExpressionValue(localDate, "access$getInitialDate$p(...)");
                return hp3.m.a(update, null, set, tVar.f154433c, z3, str2, arrayList, bVar2, g2e.t.j(localDate, arrayList), this.f15317c, this.d, null, null, 30723);
            default:
                return CoreTextFieldKt.CoreTextField$lambda$17$0((LegacyTextFieldState) this.e, (FocusRequester) this.f, this.f15317c, this.d, (TextFieldSelectionManager) this.f15318g, (OffsetMapping) this.f15316b, (Offset) obj2);
        }
    }

    public /* synthetic */ b(c cVar, LocalDate localDate, LocalDate localDate2, boolean z, String str, boolean z3) {
        this.e = cVar;
        this.f = localDate;
        this.f15318g = localDate2;
        this.f15317c = z;
        this.f15316b = str;
        this.d = z3;
    }

    public /* synthetic */ b(eqj.g gVar, String str, String str2, boolean z, boolean z3, dj0.d dVar) {
        this.e = gVar;
        this.f15316b = str;
        this.f = str2;
        this.f15317c = z;
        this.d = z3;
        this.f15318g = dVar;
    }

    public /* synthetic */ b(hp3.t tVar, g2e.t tVar2, ArrayList arrayList, com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar, kp3.b bVar2, boolean z, boolean z3) {
        this.e = tVar;
        this.f = arrayList;
        this.f15318g = bVar;
        this.f15316b = bVar2;
        this.f15317c = z;
        this.d = z3;
    }
}
