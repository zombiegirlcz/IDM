package af0;

import ael.r0;
import android.app.ActivityManager;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.animation.PathInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.view.result.ActivityResultRegistry;
import aoi.c;
import aoi.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.network.RetailCoreNetworkConfiguration;
import he0.k;
import he0.m;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import jkl.a1;
import jkl.a4;
import jkl.b1;
import jkl.b3;
import jkl.b4;
import jkl.c1;
import jkl.c3;
import jkl.c4;
import jkl.d1;
import jkl.d3;
import jkl.d4;
import jkl.e1;
import jkl.e3;
import jkl.e4;
import jkl.f1;
import jkl.f3;
import jkl.f4;
import jkl.g0;
import jkl.g1;
import jkl.g4;
import jkl.h1;
import jkl.h3;
import jkl.h4;
import jkl.i0;
import jkl.i1;
import jkl.i3;
import jkl.i4;
import jkl.j0;
import jkl.j1;
import jkl.j3;
import jkl.k0;
import jkl.k1;
import jkl.k3;
import jkl.l0;
import jkl.l1;
import jkl.l3;
import jkl.m0;
import jkl.m1;
import jkl.m3;
import jkl.n1;
import jkl.n3;
import jkl.o0;
import jkl.o1;
import jkl.o3;
import jkl.p0;
import jkl.p1;
import jkl.p3;
import jkl.q0;
import jkl.q1;
import jkl.q3;
import jkl.r1;
import jkl.r3;
import jkl.s1;
import jkl.s3;
import jkl.t1;
import jkl.t3;
import jkl.u1;
import jkl.u3;
import jkl.v1;
import jkl.v3;
import jkl.w1;
import jkl.w3;
import jkl.x;
import jkl.x1;
import jkl.x3;
import jkl.y0;
import jkl.y1;
import jkl.y3;
import jkl.z0;
import jkl.z3;
import kg.p;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import th0.l;
import ue0.e;
import w3f.a0;
import w3f.b0;
import w3f.c0;
import w3f.d0;
import w3f.e0;
import w3f.f;
import w3f.f0;
import w3f.h;
import w3f.h0;
import w3f.i;
import w3f.j;
import w3f.n;
import w3f.o;
import w3f.r;
import w3f.s;
import w3f.t;
import w3f.u;
import w3f.v;
import w3f.w;
import w3f.y;
import w3f.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3817a;

    public /* synthetic */ a(int i) {
        this.f3817a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = true;
        switch (this.f3817a) {
            case 0:
                Lazy lazy = b.f3818a;
                return e.b(Json.d, new r0(13));
            case 1:
                p pVar = new p();
                Type type = new TypeToken<String>() { // from class: com.revolut.core.faq.data.db.typeconverters.FaqListConverter$gson_delegate$lambda$0$$inlined$gsonTypeToken$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                pVar.c(new k(), type);
                return pVar.b();
            case 2:
                a2g.a aVar = g.f7996a;
                return aVar != null ? (c) aVar.invoke() : new g.a();
            case 3:
                return PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f);
            case 4:
                return Boolean.valueOf(RetailCoreNetworkConfiguration.needToSimulatedDelay$lambda$0());
            case 5:
                return RetailCoreNetworkConfiguration.versionName$lambda$0();
            case 6:
                return (th0.a) l.Companion.c();
            case 7:
                return new PathInterpolator(0.42f, BitmapDescriptorFactory.HUE_RED, 0.58f, 1.0f);
            case 8:
                HandlerThread handlerThread = new HandlerThread("PerfStat");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 9:
                return Boolean.valueOf(Log.isLoggable("LoadingAnalyticsActivityDelegate", 3));
            case 10:
                Lazy lazy2 = f3f.a.f131972a;
                p pVarA = ged.a.a();
                m mVarB = m.b(h0.class, "type");
                mVarB.c(d0.class, "TRADE");
                mVarB.c(n.class, "DIVIDENDS");
                mVarB.c(w3f.b.class, "BOND_COUPON");
                mVarB.c(i.class, "COUPON");
                mVarB.c(w3f.c.class, "BOND_REDEMPTION");
                mVarB.c(j.class, "REDEMPTION");
                mVarB.c(w3f.l.class, "CUSTODY_FEES");
                mVarB.c(w3f.e.class, "CASH");
                mVarB.c(z.class, "STOCK_LENDING_REBATE");
                mVarB.c(e0.class, "STOCK_TRANSFER_FEE");
                mVarB.c(w3f.g.class, "COMMISSION_REFUND");
                mVarB.c(y.class, "REFUND");
                mVarB.c(s.class, "MARGIN_TRADE");
                mVarB.c(u.class, "OVERNIGHT_FEE");
                mVarB.c(h.class, "COMMODITY_TRADE");
                mVarB.c(o.class, "EXCHANGE");
                mVarB.c(f0.class, "STOCK_TRANSFER");
                mVarB.c(f.class, "CASH_TRANSFER");
                mVarB.c(v.class, "PRICE_ADJUSTMENT");
                mVarB.c(w3f.p.class, "FEE");
                mVarB.c(w3f.m.class, "DEFICIT_ADJUSTMENT");
                mVarB.c(t.class, "MERGER");
                mVarB.c(a0.class, "SPINOFF");
                mVarB.c(c0.class, "STOCK_SPLIT");
                mVarB.c(x3f.a.class, "PRIVATE_MARKETS_TRADE");
                mVarB.c(b0.class, "STOCK_PROMOTION_CLAWBACK");
                ArrayList arrayList = pVarA.e;
                arrayList.add(mVarB);
                m mVarB2 = m.b(r.class, "type");
                mVarB2.c(w3f.a.class, "AMOUNT");
                mVarB2.c(w.class, "QUANTITY");
                arrayList.add(mVarB2);
                s90.a.a(pVarA);
                return pVarA.b();
            case 11:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            case 12:
                return new fo9.a(23);
            case 13:
                return new fnk.a(21);
            case 14:
                return ActivityResultRegistry.generateRandomNumber$lambda$0();
            case 15:
                return FrameworkSQLiteDatabase.getThreadSessionMethod_delegate$lambda$7();
            case 16:
                return FrameworkSQLiteDatabase.beginTransactionMethod_delegate$lambda$8();
            case 17:
                zf.a aVarA = ((zf.g) pd.g.c().b(zf.g.class)).a("firebase");
                Intrinsics.checkNotNullExpressionValue(aVarA, "getInstance(...)");
                return aVarA;
            case 18:
                return e.b(Json.d, new igh.k(12));
            case 19:
                String[] iSOCountries = Locale.getISOCountries();
                Intrinsics.checkNotNullExpressionValue(iSOCountries, "getISOCountries(...)");
                Locale[] availableLocales = Locale.getAvailableLocales();
                Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales(...)");
                ArrayList arrayList2 = new ArrayList(availableLocales.length);
                for (Locale locale : availableLocales) {
                    arrayList2.add(locale.getCountry());
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((String) obj2).length() == 2) {
                        arrayList3.add(obj2);
                    }
                }
                return zhm.d0.d1(d.y0(zhm.p.z(iSOCountries, arrayList3)));
            case 20:
                return Unit.f186387a;
            case 21:
                Lazy lazy3 = ikl.a.f161999a;
                p pVar2 = new p();
                pVar2.c(new k(), new TypeToken<String>() { // from class: com.revolut.sso.impl.network.serialisation.GsonFactory$create$1
                }.getType());
                pVar2.c(new he0.e(), Instant.class);
                pVar2.c(new od7.a(), RegisteredIdentityId.class);
                he0.d dVar = new he0.d();
                ArrayList arrayList4 = pVar2.e;
                arrayList4.add(dVar);
                m mVar = new m("code", i4.class, false, true);
                mVar.c(b3.class, "9049");
                mVar.c(c3.class, "9000");
                mVar.c(d3.class, "9036");
                mVar.c(e3.class, "2102");
                mVar.c(f3.class, "1056");
                mVar.c(h3.class, "9047");
                mVar.c(i3.class, "4030");
                mVar.c(j3.class, "4021");
                mVar.c(k3.class, "9035");
                mVar.c(l3.class, "1053");
                mVar.c(m3.class, "9003");
                mVar.c(n3.class, "4032");
                mVar.c(o3.class, "9046");
                mVar.c(p3.class, "2101");
                mVar.c(q3.class, "4002");
                mVar.c(r3.class, "4004");
                mVar.c(s3.class, "4005");
                mVar.c(t3.class, "4006");
                mVar.c(u3.class, "4001");
                mVar.c(v3.class, "4010");
                mVar.c(w3.class, "4011");
                mVar.c(x3.class, "4013");
                mVar.c(y3.class, "4012");
                mVar.c(z3.class, "4031");
                mVar.c(a4.class, "4034");
                mVar.c(b4.class, "9004");
                mVar.c(c4.class, "9100");
                mVar.c(d4.class, "1055");
                mVar.c(e4.class, "9401");
                mVar.c(f4.class, "9110");
                mVar.c(g4.class, "9001");
                mVar.c(h4.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
                arrayList4.add(mVar);
                m mVar2 = new m("code", jkl.h.class, false, true);
                mVar2.c(jkl.a.class, jkl.b.CLAIM_REQUIRED.getValue());
                mVar2.c(jkl.c.class, jkl.b.EVIDENCE_REQUIRED.getValue());
                mVar2.c(jkl.d.class, jkl.b.EXISTING_ACCOUNT_FOUND.getValue());
                mVar2.c(jkl.f.class, jkl.b.PERMISSION_REQUIRED.getValue());
                mVar2.c(jkl.e.class, jkl.b.LOCATION_REQUESTED.getValue());
                mVar2.c(jkl.g.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar2, "registerFallbackSubtype(...)");
                arrayList4.add(mVar2);
                arrayList4.add(new bkl.f());
                m mVar3 = new m("method", y1.class, false, true);
                mVar3.c(y0.class, jkl.i.APP_LINK.getValue());
                mVar3.c(z0.class, jkl.i.BANK_ID.getValue());
                mVar3.c(a1.class, jkl.i.BIO_SIGNATURE.getValue());
                mVar3.c(b1.class, jkl.i.CARD_PIN.getValue());
                mVar3.c(c1.class, jkl.i.DAP.getValue());
                mVar3.c(d1.class, jkl.i.ID_DOC.getValue());
                mVar3.c(e1.class, jkl.i.EMAIL.getValue());
                mVar3.c(f1.class, jkl.i.FACE.getValue());
                mVar3.c(g1.class, jkl.i.FACE_OTP.getValue());
                mVar3.c(h1.class, jkl.i.GOOGLE.getValue());
                mVar3.c(i1.class, jkl.i.IN_SMS.getValue());
                mVar3.c(j1.class, jkl.i.OKTA.getValue());
                mVar3.c(k1.class, jkl.i.PASSWORD.getValue());
                mVar3.c(l1.class, jkl.i.PIN.getValue());
                mVar3.c(m1.class, jkl.i.PUSH.getValue());
                mVar3.c(n1.class, jkl.i.QR_DELEGATED.getValue());
                mVar3.c(o1.class, jkl.i.RCS.getValue());
                mVar3.c(p1.class, jkl.i.SIGNATURE.getValue());
                mVar3.c(q1.class, jkl.i.SILENT_AUTH.getValue());
                mVar3.c(r1.class, jkl.i.SMS.getValue());
                mVar3.c(s1.class, jkl.i.TELEPHONE.getValue());
                mVar3.c(t1.class, jkl.i.TOKEN.getValue());
                mVar3.c(u1.class, jkl.i.UAE_PASS.getValue());
                mVar3.c(w1.class, jkl.i.WEB_AUTHN.getValue());
                mVar3.c(x1.class, jkl.i.WHATSAPP.getValue());
                mVar3.c(v1.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar3, "registerFallbackSubtype(...)");
                arrayList4.add(mVar3);
                m mVar4 = new m("name", i0.class, false, true);
                mVar4.c(x.class, jkl.b0.BIO_PUBLIC_KEY.getValue());
                mVar4.c(jkl.y.class, jkl.b0.EMAIL.getValue());
                mVar4.c(jkl.z.class, jkl.b0.GOOGLE.getValue());
                mVar4.c(jkl.a0.class, jkl.b0.IDENTITY_ID.getValue());
                mVar4.c(jkl.d0.class, jkl.b0.PHONE.getValue());
                mVar4.c(jkl.f0.class, jkl.b0.PUBLIC_KEY.getValue());
                mVar4.c(jkl.h0.class, jkl.b0.WEBAUTHN.getValue());
                mVar4.c(g0.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar4, "registerFallbackSubtype(...)");
                arrayList4.add(mVar4);
                m mVar5 = new m("name", m0.class, false, true);
                mVar5.c(l0.class, j0.WEBAUTHN.getValue());
                mVar5.c(k0.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar5, "registerFallbackSubtype(...)");
                arrayList4.add(mVar5);
                m mVar6 = new m("type", xil.m.class, false, true);
                mVar6.c(xil.a.class, "AUTHORISED_CHANGE_EMAIL");
                mVar6.c(xil.e.class, "AUTHORISED_EXTERNAL_CLIENT");
                mVar6.c(xil.f.class, "AUTHORISED_REAUTHENTICATION");
                mVar6.c(xil.h.class, "UNAUTHORISED_ACCESS_RECOVERY");
                mVar6.c(xil.i.class, "UNAUTHORISED_COMBINED_AUTHENTICATION");
                mVar6.c(xil.j.class, "UNAUTHORISED_SIGN_IN");
                mVar6.c(xil.k.class, "UNAUTHORISED_SIGN_UP");
                mVar6.c(xil.l.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar6, "registerFallbackSubtype(...)");
                arrayList4.add(mVar6);
                m mVar7 = new m("type", xil.d.class, false, true);
                mVar7.c(xil.b.class, "CURRENT");
                mVar7.c(xil.c.class, "MULTIPLE");
                Intrinsics.checkNotNullExpressionValue(mVar7, "registerSubtype(...)");
                arrayList4.add(mVar7);
                m mVar8 = new m("code", jkl.r0.class, false, true);
                mVar8.c(p0.class, o0.DELEGATION_REQUIRED.getValue());
                mVar8.c(q0.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar8, "registerFallbackSubtype(...)");
                arrayList4.add(mVar8);
                pVar2.c(new he0.o(), ZonedDateTime.class);
                kg.o oVarB = pVar2.b();
                Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                return oVarB;
            case 22:
                AtomicBoolean atomicBoolean = io.a.f162980b;
                try {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance != 100) {
                        z = false;
                    }
                    atomicBoolean.set(z);
                    break;
                } catch (Exception e) {
                    atomicBoolean.set(false);
                }
                return Unit.f186387a;
            case 23:
                String DOOM = khi.a.a;
                Intrinsics.checkNotNullExpressionValue(DOOM, "DOOM");
                return DOOM;
            case 24:
                String TERRORBLADE = khi.a.c;
                Intrinsics.checkNotNullExpressionValue(TERRORBLADE, "TERRORBLADE");
                return TERRORBLADE;
            case 25:
                Lazy lazy4 = ix0.h1.f169241a;
                return new Handler(Looper.getMainLooper());
            case 26:
                boolean z3 = jo0.m.f176847a;
                return "Uninitialized";
            case 27:
                Random random = new Random();
                int iNextInt = random.nextInt(256);
                int iNextInt2 = random.nextInt(256);
                int iNextInt3 = random.nextInt(256);
                int iNextInt4 = random.nextInt(256);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(iNextInt);
                sb6.append(".");
                sb6.append(iNextInt2);
                sb6.append(".");
                sb6.append(iNextInt3);
                return com.google.android.gms.internal.mlkit_vision_face.a.s(sb6, ".", iNextInt4);
            case 28:
                Lazy lazy5 = GsonHolder.f60253a;
                p pVar3 = new p();
                kg.j0 j0Var = kg.j0.LONG_OR_DOUBLE;
                Objects.requireNonNull(j0Var);
                pVar3.f183887m = j0Var;
                Type type2 = new TypeToken<String>() { // from class: com.revolut.data.utils.gson.GsonHolder$instance_delegate$lambda$0$$inlined$gsonTypeToken$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                pVar3.c(new k(), type2);
                m mVar9 = new m("type", so3.a.class, false, false);
                mVar9.c(so3.b.class, so3.b.class.getSimpleName());
                mVar9.c(so3.c.class, so3.c.class.getSimpleName());
                pVar3.e.add(mVar9);
                s90.a.a(pVar3);
                return pVar3.b();
            default:
                return new le0.c();
        }
    }
}
