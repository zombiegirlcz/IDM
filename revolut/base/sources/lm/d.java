package lm;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import com.revolut.RevolutApplication;
import com.revolut.core.ui_kit.views.KeypadView;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature_account_widget.impl.R$string;
import com.revolut.network.auth.RetailRevolutVisionConfiguration;
import com.revolut.network.auth.RetailSsoConfiguration;
import iq.g;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import kg.o;
import kg.p;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import mp.j;
import o7h.a;
import pqg.v;
import q75.n;
import rp0.m;
import th0.l;
import voi.i;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196834a;

    public /* synthetic */ d(int i) {
        this.f196834a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        hf0.a aVarJ;
        switch (this.f196834a) {
            case 0:
                RevolutApplication.a aVar = RevolutApplication.Companion;
                return (i41.c) ((l41.a) ((ip.a) hf0.b.d.g()).b().f197975u3.get()).f192032c.get();
            case 1:
                RevolutApplication.a aVar2 = RevolutApplication.Companion;
                return i.e().f();
            case 2:
                return Unit.f186387a;
            case 3:
                return new hza.a() { // from class: mp.c
                };
            case 4:
                return RetailSsoConfiguration.INSTANCE;
            case 5:
                return RetailRevolutVisionConfiguration.INSTANCE;
            case 6:
                return "https://api.revolut.com";
            case 7:
                return new bda.a();
            case 8:
                return new j();
            case 9:
                return new g(R$string.account_widget_sign_in, R$string.account_widget_kyc_request, R$string.account_widget_kyc_in_progress);
            case 10:
                return new vo.a();
            case 11:
                Intrinsics.checkNotNullParameter("https://chat.revolut.com", "rest");
                Intrinsics.checkNotNullParameter("https://chat.revolut.com/api/client/ws", "websocket");
                return new kf3.a();
            case 12:
                return (gl0.a) gl0.d.Companion.c();
            case 13:
                return Boolean.TRUE;
            case 14:
                KeypadView.a aVar3 = KeypadView.Companion;
                return new KeypadView.b();
            case 15:
                return nhi.d.f215500a;
            case 16:
                return Collections.newSetFromMap(new ConcurrentHashMap());
            case 17:
                return new Constraints.Builder().setRequiresBatteryNotLow(true).setRequiredNetworkType(NetworkType.CONNECTED).build();
            case 18:
                return new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            case 19:
                return new m();
            case 20:
                Lazy lazy = p8h.a.f234155a;
                o oVarA = GsonHolder.a();
                oVarA.getClass();
                p pVar = new p(oVarA);
                Intrinsics.checkNotNullExpressionValue(pVar, "newBuilder(...)");
                ged.a.b(pVar);
                he0.m mVar = new he0.m("type", o7h.a.class, true, false);
                mVar.c(a.c.class, "FUND");
                mVar.c(a.b.class, "ETF");
                mVar.c(a.d.class, "FALLBACK_SUBTYPE_LABEL");
                pVar.e.add(mVar);
                return pVar.b();
            case 21:
                return new v(6);
            case 22:
                return new pni.a(7);
            case 23:
                Lazy lazy2 = q77.a.f242766a;
                return ue0.e.b(Json.d, new n(3));
            case 24:
                Pattern patternCompile = Pattern.compile("[0-9]{9}", 0);
                Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
                return patternCompile;
            case 25:
                Pattern patternCompile2 = Pattern.compile("^(?:[a-zA-Z]+(?:\\d*[a-zA-Z_]*)*)(?:\\.[a-zA-Z]+(?:\\d*[a-zA-Z_]*)*)+$", 0);
                Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(...)");
                return patternCompile2;
            case 26:
                Lazy lazy3 = r4d.a.f251442a;
                return new p(new o()).b();
            case 27:
                th0.a aVar4 = null;
                try {
                    Context context = rli.e.f255086b;
                    if (context != null && (aVarJ = ue0.e.j(context)) != null) {
                        aVar4 = (th0.a) ue0.e.i(aVarJ, th0.a.class);
                    }
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                return aVar4 == null ? (th0.a) l.Companion.e(new re3.d(24)) : aVar4;
            case 28:
                return ((th0.a) rli.e.f255087c.getValue()).d();
            default:
                rli.e eVar = rli.e.f255085a;
                return new rli.c((fh0.c) rli.e.d.getValue());
        }
    }
}
