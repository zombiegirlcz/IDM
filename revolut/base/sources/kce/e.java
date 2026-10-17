package kce;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.chat.domain.model.ChatMessageToPass;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.data.model.Data;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nvg.z;
import v20.f0;
import v30.p0;
import v30.t;
import v30.v0;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182706a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f182707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f182708c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f182709g;

    public /* synthetic */ e(LegacyTextFieldState legacyTextFieldState, boolean z, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        this.f182708c = legacyTextFieldState;
        this.f182707b = z;
        this.d = windowInfo;
        this.e = textFieldSelectionManager;
        this.f = textFieldValue;
        this.f182709g = offsetMapping;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f182706a) {
            case 0:
                Data data = (Data) this.f182708c;
                xi0.b bVar = (xi0.b) this.d;
                b9e.e eVar = (b9e.e) this.e;
                List list = (List) this.f;
                Throwable th10 = (Throwable) this.f182709g;
                Data ratesData = (Data) obj2;
                Intrinsics.checkNotNullParameter(ratesData, "ratesData");
                if (ratesData.getContent() == null) {
                    return new Data(null, null, true, 3, null);
                }
                Object content = ratesData.getContent();
                Intrinsics.h(content);
                List list2 = (List) content;
                Map mapG = (Map) data.getContent();
                if (mapG == null) {
                    mapG = r0.g();
                }
                return new Data(new b9e.c(bVar, eVar, list2, list, mapG), th10, this.f182707b);
            case 1:
                return CoreTextFieldKt.CoreTextField$lambda$20$0((LegacyTextFieldState) this.f182708c, this.f182707b, (WindowInfo) this.d, (TextFieldSelectionManager) this.e, (TextFieldValue) this.f, (OffsetMapping) this.f182709g, (LayoutCoordinates) obj2);
            case 2:
                n30.n nVar = (n30.n) this.f182708c;
                List list3 = (List) this.f;
                NewTicketContext.Transaction transaction = (NewTicketContext.Transaction) this.d;
                UUID uuid = (UUID) this.e;
                ChatMessageToPass chatMessageToPass = (ChatMessageToPass) this.f182709g;
                yhm.m mVar = (yhm.m) obj2;
                v20.o oVar = nVar.f211647a;
                String str = transaction.f51065a;
                Intrinsics.h(mVar);
                Object obj3 = mVar.f314193a;
                if (obj3 instanceof yhm.n) {
                    obj3 = null;
                }
                return ((f0) oVar).b(new p0(list3, null, new v0(str, (bef.a) obj3), 6), t.DEFAULT, this.f182707b, uuid, chatMessageToPass);
            default:
                iwg.a aVar = (iwg.a) this.f182708c;
                eel.c cVar = (eel.c) this.d;
                iwg.c cVar2 = (iwg.c) this.e;
                boolean z = this.f182707b;
                String str2 = (String) this.f;
                String str3 = (String) this.f182709g;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM `complex_analytics_contributors` WHERE `asset_type` = ? AND `time_span` = ? AND `method` = ? AND `sector` = ? AND `portfolio_id` = ? AND `currency` = ?");
                try {
                    String strA = pvg.t.a(aVar);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    String strC = pvg.t.c(cVar);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strC);
                    }
                    String strB = pvg.t.b(cVar2);
                    if (strB == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, strB);
                    }
                    sQLiteStatementPrepare.bindLong(4, z ? 1L : 0L);
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, str2);
                    }
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(6);
                    } else {
                        sQLiteStatementPrepare.bindText(6, str3);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare.close();
                    throw th11;
                }
        }
    }

    public /* synthetic */ e(Data data, xi0.b bVar, b9e.e eVar, List list, Throwable th10, boolean z) {
        this.f182708c = data;
        this.d = bVar;
        this.e = eVar;
        this.f = list;
        this.f182709g = th10;
        this.f182707b = z;
    }

    public /* synthetic */ e(n30.n nVar, List list, NewTicketContext.Transaction transaction, boolean z, UUID uuid, ChatMessageToPass chatMessageToPass) {
        this.f182708c = nVar;
        this.f = list;
        this.d = transaction;
        this.f182707b = z;
        this.e = uuid;
        this.f182709g = chatMessageToPass;
    }

    public /* synthetic */ e(z zVar, iwg.a aVar, eel.c cVar, iwg.c cVar2, boolean z, String str, String str2) {
        this.f182708c = aVar;
        this.d = cVar;
        this.e = cVar2;
        this.f182707b = z;
        this.f = str;
        this.f182709g = str2;
    }
}
