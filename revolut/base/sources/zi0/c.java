package zi0;

import android.os.Parcelable;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import ar9.s;
import ar9.t;
import ar9.u;
import aw0.d8;
import aw0.e8;
import aw0.h8;
import aw0.i8;
import aw0.l6;
import aw0.v7;
import aw0.x7;
import br9.g;
import br9.i;
import c7i.d0;
import cfl.j;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_feed.dependencies.fiatbalances.RevolutXFiatBalancesContract$RevolutXFiatBalanceData;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesCampaign;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.feature.travel.miles.api.model.TravelMilesRateDisplay;
import cu8.z0;
import d8b.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.CharsKt;
import kotlinx.coroutines.flow.Flow;
import mw0.p;
import my8.r;
import oq9.l;
import oq9.m;
import oq9.n;
import oq9.o;
import qfm.j0;
import qfm.j1;
import rfm.f0;
import sdl.l0;
import sdl.m0;
import vel.d;
import vel.e;
import vkm.f;
import vkm.q;
import yhm.m;
import yhm.w;
import yy0.k;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c {
    public static final boolean A(r rVar, List onlyCitizensSupportedCountries, wi0.b userCountry) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onlyCitizensSupportedCountries, "onlyCitizensSupportedCountries");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        switch (z0.f108914a[rVar.ordinal()]) {
            case 8:
            case 11:
            case 12:
                if (!onlyCitizensSupportedCountries.contains(userCountry)) {
                    return true;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean B(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        switch (z0.f108914a[rVar.ordinal()]) {
            case 1:
            case 2:
            case 7:
            case 10:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean C(dpg.a aVar, String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return Intrinsics.f(aVar != null ? aVar.f116878b : null, username);
    }

    public static final boolean D(Data data) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        return data.getLoading() && data.getContent() == null;
    }

    public static final boolean E(Data data) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        return !data.getLoading() && data.getError() == null;
    }

    public static final efm.r F(efm.r rVar, Object obj2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r map = rVar.map(new zh7.a(8, new sx4.b(obj2, 23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final efm.r G(efm.r rVar, Object obj2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r map = rVar.map(new zh7.a(7, new sx4.b(obj2, 22)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final byte[] H(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final Object I(Data data) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Object content = data.getContent();
        if (content != null) {
            return content;
        }
        throw new IllegalStateException("content must not be null");
    }

    public static final efm.r J(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarSkipWhile = rVar.skipWhile(new zh7.a(15, new zg6.c(24)));
        Intrinsics.checkNotNullExpressionValue(rVarSkipWhile, "skipWhile(...)");
        return rVarSkipWhile;
    }

    public static final efm.r K(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarThrottleFirst = rVar.throttleFirst(ViewConfiguration.getDoubleTapTimeout(), TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleFirst, "throttleFirst(...)");
        return rVarThrottleFirst;
    }

    public static final f L(Flow timeoutUnlessCompleted, Object obj2, long j2) {
        Intrinsics.checkNotNullParameter(timeoutUnlessCompleted, "$this$timeoutUnlessCompleted");
        return q.m(new d0(j2, timeoutUnlessCompleted, obj2, (Continuation) null, 3));
    }

    public static final f M(Flow timeoutUnlessEmittedLazy, Object obj2, long j2, String str) {
        Intrinsics.checkNotNullParameter(timeoutUnlessEmittedLazy, "$this$timeoutUnlessEmitted");
        h provideSourceName = new h(str, 11);
        Intrinsics.checkNotNullParameter(timeoutUnlessEmittedLazy, "$this$timeoutUnlessEmittedLazy");
        Intrinsics.checkNotNullParameter(provideSourceName, "provideSourceName");
        return q.m(new b6i.d0(timeoutUnlessEmittedLazy, j2, provideSourceName, obj2, (Continuation) null, 10));
    }

    public static final String N(vel.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if ((fVar instanceof vel.b) || (fVar instanceof vel.c)) {
            return null;
        }
        if (fVar instanceof d) {
            if (cp5.d.y(((d) fVar).f288352a)) {
                return "commodity";
            }
            return null;
        }
        if (fVar instanceof e) {
            return "instrument";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Data O(Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        return new Data(null, th10, false, 1, null);
    }

    public static Data P(Object obj2, boolean z, Throwable th10, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            th10 = null;
        }
        return new Data(obj2, th10, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.travel.miles.api.model.TravelMilesProvider Q(qfg.f r17) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r3 = r0.f245320a
            java.lang.String r4 = r0.f245321b
            java.lang.String r5 = r0.f245322c
            java.lang.String r6 = r0.d
            java.lang.String r7 = r0.e
            qfg.a r2 = r0.f
            if (r2 == 0) goto L2e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.revolut.feature.travel.miles.api.model.TravelMilesAccount r9 = new com.revolut.feature.travel.miles.api.model.TravelMilesAccount
            java.lang.String r10 = r2.getId()
            java.lang.String r11 = r2.getMembershipNumber()
            java.util.List r2 = r2.getPrimaryAirlines()
            if (r2 != 0) goto L2a
            zhm.f0 r2 = zhm.f0.f322471a
        L2a:
            r9.<init>(r10, r11, r2)
            goto L2f
        L2e:
            r9 = 0
        L2f:
            qfg.g r2 = r0.f245323g
            if (r2 == 0) goto L56
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.revolut.feature.travel.miles.api.model.TravelMilesRate r10 = new com.revolut.feature.travel.miles.api.model.TravelMilesRate
            double r11 = r2.f245326a
            jo3.b r13 = r2.f245327b
            dj0.d r13 = hx7.a.v(r13)
            qfg.i r2 = r2.f245328c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.revolut.feature.travel.miles.api.model.TravelMilesRateDisplay r14 = new com.revolut.feature.travel.miles.api.model.TravelMilesRateDisplay
            int r15 = r2.getPoints()
            int r2 = r2.getReward()
            r14.<init>(r15, r2)
            r10.<init>(r11, r13, r14)
            goto L57
        L56:
            r10 = 0
        L57:
            java.lang.String r2 = r0.f245324h
            hfg.t0[] r11 = hfg.t0.values()
            int r12 = r11.length
            r13 = 0
            r14 = r13
        L60:
            r15 = 1
            if (r14 >= r12) goto L73
            r16 = r11[r14]
            java.lang.String r8 = r16.name()
            boolean r8 = kotlin.text.a0.z(r8, r2, r15)
            if (r8 == 0) goto L70
            goto L75
        L70:
            int r14 = r14 + 1
            goto L60
        L73:
            r16 = 0
        L75:
            if (r16 != 0) goto L79
            hfg.t0 r16 = hfg.t0.MILES
        L79:
            qfg.e r2 = r0.i
            if (r2 == 0) goto L8f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.revolut.feature.travel.miles.api.model.TravelMilesCampaign r1 = new com.revolut.feature.travel.miles.api.model.TravelMilesCampaign
            java.lang.String r8 = r2.getId()
            java.lang.String r2 = r2.getDescription()
            r1.<init>(r8, r2)
            r11 = r1
            goto L90
        L8f:
            r11 = 0
        L90:
            java.lang.String r0 = r0.f245325j
            if (r0 == 0) goto Lb1
            hfg.x[] r1 = hfg.x.values()
            int r2 = r1.length
        L99:
            if (r13 >= r2) goto Lab
            r8 = r1[r13]
            java.lang.String r12 = r8.name()
            boolean r12 = kotlin.text.a0.z(r12, r0, r15)
            if (r12 == 0) goto La8
            goto Lac
        La8:
            int r13 = r13 + 1
            goto L99
        Lab:
            r8 = 0
        Lac:
            if (r8 != 0) goto Laf
            goto Lb1
        Laf:
            r12 = r8
            goto Lb4
        Lb1:
            hfg.x r8 = hfg.x.UNKNOWN
            goto Laf
        Lb4:
            com.revolut.feature.travel.miles.api.model.TravelMilesProvider r2 = new com.revolut.feature.travel.miles.api.model.TravelMilesProvider
            r8 = r9
            r9 = r10
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zi0.c.Q(qfg.f):com.revolut.feature.travel.miles.api.model.TravelMilesProvider");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.travel.miles.api.model.TravelMilesProvider R(xfg.t r17) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r2 = r1.getId()
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = r1.getDescription()
            java.lang.String r5 = r1.getLogoUrl()
            java.lang.String r6 = r1.getSignupUrl()
            xfg.b r7 = r1.getAccount()
            if (r7 == 0) goto L3b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.revolut.feature.travel.miles.api.model.TravelMilesAccount r9 = new com.revolut.feature.travel.miles.api.model.TravelMilesAccount
            java.lang.String r10 = r7.getId()
            java.lang.String r11 = r7.getExternalId()
            java.util.List r7 = r7.getPrimaryAirlines()
            if (r7 != 0) goto L36
            zhm.f0 r7 = zhm.f0.f322471a
        L36:
            r9.<init>(r10, r11, r7)
            r7 = r9
            goto L3c
        L3b:
            r7 = 0
        L3c:
            xfg.w r9 = r1.getRate()
            if (r9 == 0) goto L47
            com.revolut.feature.travel.miles.api.model.TravelMilesRate r9 = a.a.E(r9)
            goto L48
        L47:
            r9 = 0
        L48:
            java.lang.String r10 = r1.getUnit()
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L6c
            hfg.t0[] r13 = hfg.t0.values()
            int r14 = r13.length
            r15 = r11
        L56:
            if (r15 >= r14) goto L68
            r16 = r13[r15]
            java.lang.String r8 = r16.name()
            boolean r8 = kotlin.text.a0.z(r8, r10, r12)
            if (r8 == 0) goto L65
            goto L6a
        L65:
            int r15 = r15 + 1
            goto L56
        L68:
            r16 = 0
        L6a:
            if (r16 != 0) goto L6e
        L6c:
            hfg.t0 r16 = hfg.t0.MILES
        L6e:
            xfg.j r8 = r1.getCampaign()
            if (r8 == 0) goto L86
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.revolut.feature.travel.miles.api.model.TravelMilesCampaign r0 = new com.revolut.feature.travel.miles.api.model.TravelMilesCampaign
            java.lang.String r10 = r8.getId()
            java.lang.String r8 = r8.getDescription()
            r0.<init>(r10, r8)
            r10 = r0
            goto L87
        L86:
            r10 = 0
        L87:
            java.lang.String r0 = r1.getAccountLinkType()
            if (r0 == 0) goto Lab
            hfg.x[] r1 = hfg.x.values()
            int r8 = r1.length
        L92:
            if (r11 >= r8) goto La5
            r13 = r1[r11]
            java.lang.String r14 = r13.name()
            boolean r14 = kotlin.text.a0.z(r14, r0, r12)
            if (r14 == 0) goto La2
            r8 = r13
            goto La6
        La2:
            int r11 = r11 + 1
            goto L92
        La5:
            r8 = 0
        La6:
            if (r8 != 0) goto La9
            goto Lab
        La9:
            r11 = r8
            goto Lae
        Lab:
            hfg.x r8 = hfg.x.UNKNOWN
            goto La9
        Lae:
            com.revolut.feature.travel.miles.api.model.TravelMilesProvider r1 = new com.revolut.feature.travel.miles.api.model.TravelMilesProvider
            r8 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zi0.c.R(xfg.t):com.revolut.feature.travel.miles.api.model.TravelMilesProvider");
    }

    public static final ArrayList S(List list) {
        String str;
        o lVar;
        String str2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<t> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (t tVar : list2) {
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            u uVar = tVar.e;
            Boolean bool = tVar.i;
            String str3 = tVar.f8585h;
            String str4 = tVar.f8584g;
            String str5 = tVar.f;
            s sVar = tVar.d;
            s sVar2 = tVar.f8583c;
            String str6 = tVar.f8582b;
            String str7 = tVar.f8581a;
            int i = i.f17961a[uVar.ordinal()];
            if (i == 1) {
                String str8 = tVar.f8581a;
                String str9 = tVar.f8582b;
                if (sVar2 == null) {
                    throw new NullPointerException(a0.d.s("inviterId must be non-null for ACTIVE memberId=", str8, ", groupId=", str9));
                }
                oq9.r rVarA = g.a(sVar2);
                if (sVar == null) {
                    throw new NullPointerException(a0.d.s("contactId must be non-null for ACTIVE memberId=", str7, ", groupId=", str6));
                }
                oq9.r rVarA2 = g.a(sVar);
                if (str5 == null) {
                    m70.a.c(t0.f186434a);
                    str5 = "";
                }
                if (str4 == null) {
                    m70.a.c(t0.f186434a);
                    str = "";
                } else {
                    str = str4;
                }
                wi0.b bVarC = str3 != null ? com.bumptech.glide.d.c(str3) : null;
                if (bool == null) {
                    throw new NullPointerException(a0.d.s("isRevolut must be non-null for ACTIVE memberId=", str7, ", groupId=", str6));
                }
                lVar = new l(str8, str9, rVarA, rVarA2, str5, str, bVarC, bool.booleanValue(), null);
            } else if (i == 2) {
                String str10 = tVar.f8581a;
                String str11 = tVar.f8582b;
                if (sVar2 == null) {
                    throw new NullPointerException(a0.d.s("inviterId must be non-null for PENDING memberId=", str10, ", groupId=", str11));
                }
                oq9.r rVarA3 = g.a(sVar2);
                if (sVar == null) {
                    throw new NullPointerException(a0.d.s("contactId must be non-null for PENDING memberId=", str7, ", groupId=", str6));
                }
                oq9.r rVarA4 = g.a(sVar);
                if (str5 == null) {
                    m70.a.c(t0.f186434a);
                    str5 = "";
                }
                if (str4 == null) {
                    m70.a.c(t0.f186434a);
                    str2 = "";
                } else {
                    str2 = str4;
                }
                wi0.b bVarC2 = str3 != null ? com.bumptech.glide.d.c(str3) : null;
                if (bool == null) {
                    throw new NullPointerException(a0.d.s("isRevolut must be non-null for PENDING memberId=", str7, ", groupId=", str6));
                }
                lVar = new m(str10, str11, rVarA3, rVarA4, str5, str2, bVarC2, bool.booleanValue(), null);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar = new n(str7, str6);
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public static final o0j.a T(nwj.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new o0j.a(bVar.getRegisteredIdentityId(), a.a.C(bVar.getToken()), bVar.getAcceptMarketingConsent());
    }

    public static final wel.d U(gdl.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = tcl.c.f269878a[cVar.f143199a.ordinal()];
        if (i == 1) {
            return wel.a.f296815a;
        }
        if (i == 2) {
            return wel.b.f296816a;
        }
        if (i == 3) {
            return wel.c.f296817a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xzg.d V(f7h.a aVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f132611a;
        xzg.o oVar = aVar.f132612b;
        String str2 = aVar.f132613c;
        String str3 = aVar.d;
        String str4 = aVar.f;
        String str5 = aVar.f132614g;
        String str6 = aVar.f132615h;
        String str7 = aVar.i;
        List list = aVar.f132616j;
        List list2 = aVar.k;
        if (list2 != null) {
            List<f7h.b> list3 = list2;
            arrayList = new ArrayList(w.t(list3, 10));
            for (f7h.b bVar : list3) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList.add(new xzg.e(bVar.f132618a, bVar.f132619b));
            }
        } else {
            arrayList = null;
        }
        return new xzg.d(str, str2, str3, str4, str5, str6, str7, aVar.f132617l, aVar.e, list, arrayList, oVar);
    }

    public static final l0 W(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        int i = m0.f261982b[jVar.ordinal()];
        if (i == 1) {
            return l0.PERSONAL;
        }
        if (i == 2) {
            return l0.PERSONAL_JOINT;
        }
        if (i == 3) {
            return l0.YOUTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final qfg.f X(TravelMilesProvider travelMilesProvider) {
        qfg.a aVar;
        qfg.g gVar;
        qfg.e eVar;
        Intrinsics.checkNotNullParameter(travelMilesProvider, "<this>");
        String str = travelMilesProvider.f94103a;
        String str2 = travelMilesProvider.f94104b;
        String str3 = travelMilesProvider.f94105c;
        String str4 = travelMilesProvider.d;
        String str5 = travelMilesProvider.e;
        TravelMilesAccount travelMilesAccount = travelMilesProvider.f;
        if (travelMilesAccount != null) {
            Intrinsics.checkNotNullParameter(travelMilesAccount, "<this>");
            aVar = new qfg.a(travelMilesAccount.f94082a, travelMilesAccount.f94083b, travelMilesAccount.f94084c);
        } else {
            aVar = null;
        }
        TravelMilesRate travelMilesRate = travelMilesProvider.f94106g;
        if (travelMilesRate != null) {
            Intrinsics.checkNotNullParameter(travelMilesRate, "<this>");
            double d = travelMilesRate.f94112a;
            jo3.b bVarA = hx7.a.A(travelMilesRate.f94113b);
            TravelMilesRateDisplay travelMilesRateDisplay = travelMilesRate.f94114c;
            Intrinsics.checkNotNullParameter(travelMilesRateDisplay, "<this>");
            gVar = new qfg.g(d, bVarA, new qfg.i(travelMilesRateDisplay.f94115a, travelMilesRateDisplay.f94116b));
        } else {
            gVar = null;
        }
        String strName = travelMilesProvider.f94107h.name();
        TravelMilesCampaign travelMilesCampaign = travelMilesProvider.i;
        if (travelMilesCampaign != null) {
            Intrinsics.checkNotNullParameter(travelMilesCampaign, "<this>");
            eVar = new qfg.e(travelMilesCampaign.f94094a, travelMilesCampaign.f94095b);
        } else {
            eVar = null;
        }
        return new qfg.f(str, str2, str3, str4, str5, aVar, gVar, strName, eVar, travelMilesProvider.f94108j.name());
    }

    public static final j Y(l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        int i = m0.f261981a[l0Var.ordinal()];
        if (i == 1) {
            return j.PERSONAL;
        }
        if (i == 2) {
            return j.PERSONAL_JOINT;
        }
        if (i == 3) {
            return j.YOUTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int Z(int i, int i2) {
        return Intrinsics.k(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static float a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final int a0(long j2, long j3) {
        return Intrinsics.l(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    public static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final long b0(long j2, long j3) {
        if (j3 < 0) {
            if (Long.compareUnsigned(j2, j3) < 0) {
                return j2;
            }
            long j5 = j2 - j3;
            w.Companion aVar = yhm.w.INSTANCE;
            return j5;
        }
        if (j2 >= 0) {
            long j16 = j2 % j3;
            w.Companion aVar2 = yhm.w.INSTANCE;
            return j16;
        }
        long j22 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        w.Companion aVar3 = yhm.w.INSTANCE;
        if (Long.compareUnsigned(j22, j3) < 0) {
            j3 = 0;
        }
        return j22 - j3;
    }

    public static final mw0.a c(List sections, mw0.c cVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        List list = sections;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new p(null, (List) it8.next()));
        }
        return new mw0.a(arrayList, cVar, parcelable);
    }

    public static final double c0(long j2) {
        return ((j2 >>> 11) * ((double) 2048)) + (j2 & 2047);
    }

    public static mw0.a d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return c(zhm.u.c(items), null, null);
    }

    public static final String d0(int i, long j2) {
        if (j2 >= 0) {
            String string = Long.toString(j2, CharsKt.checkRadix(i));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j3 = i;
        long j5 = ((j2 >>> 1) / j3) << 1;
        long j16 = j2 - (j5 * j3);
        if (j16 >= j3) {
            j16 -= j3;
            j5++;
        }
        StringBuilder sb6 = new StringBuilder();
        String string2 = Long.toString(j5, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb6.append(string2);
        String string3 = Long.toString(j16, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb6.append(string3);
        return sb6.toString();
    }

    public static int e(c cVar) {
        cVar.getClass();
        throw null;
    }

    public static final void f(ImageView imageView, yy0.l imageUiElement, boolean z, Function0 clickListenerSetter) {
        ImageView view;
        boolean z3;
        Object objA;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(imageUiElement, "imageUiElement");
        Intrinsics.checkNotNullParameter(clickListenerSetter, "clickListenerSetter");
        if (z) {
            or0.u.k(imageView).Q().f(imageView, nz8.d.m(imageUiElement));
            view = imageView;
            yy0.f.e(or0.u.k(imageView).Q(), imageUiElement.getImage(), view, null, null, 12);
        } else {
            view = imageView;
        }
        ArrayList arrayList = or0.m.f228024a;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_accessibility_companion);
        gq0.o oVar = tag2 instanceof gq0.o ? (gq0.o) tag2 : null;
        boolean z4 = true;
        if (oVar == null) {
            Intrinsics.checkNotNullParameter(view, "view");
            oVar = new gq0.o();
            oVar.f145507a = true;
            view.setTag(R$id.internal_accessibility_companion, oVar);
        }
        oVar.f145507a = false;
        Intrinsics.checkNotNullParameter(imageUiElement, "<this>");
        if ((imageUiElement instanceof yy0.j) || (imageUiElement instanceof yy0.g)) {
            or0.u.o(view);
        } else {
            if (!(imageUiElement instanceof yy0.h) && !(imageUiElement instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            oVar.f145507a = true;
            clickListenerSetter.invoke();
            oVar.f145507a = false;
            try {
                m.Companion aVar = yhm.m.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion aVar2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            if (!view.isClickable() || !view.hasOnClickListeners()) {
                throw new AssertionError("Click listener not set");
            }
            objA = Unit.f186387a;
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
        }
        if (z) {
            if (!nz8.d.m(imageUiElement)) {
                pd.b.p(view, imageUiElement.getF60056c());
            }
            Intrinsics.checkNotNullParameter(imageUiElement, "<this>");
            boolean z6 = imageUiElement instanceof yy0.j;
            if (z6) {
                z3 = false;
            } else {
                if (!(imageUiElement instanceof yy0.g) && !(imageUiElement instanceof yy0.h) && !(imageUiElement instanceof k)) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = true;
            }
            pd.b.q(view, z3);
            Intrinsics.checkNotNullParameter(imageUiElement, "<this>");
            if (z6) {
                z4 = false;
            } else if (!(imageUiElement instanceof yy0.g) && !(imageUiElement instanceof yy0.h) && !(imageUiElement instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            view.setScreenReaderFocusable(z4);
        }
    }

    public static final void g(ImageView imageView, Image image) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setVisibility(image != null ? 0 : 8);
        yy0.f.e(or0.u.k(imageView).Q(), image, imageView, null, null, 12);
    }

    public static final void h(ImageView imageView, yy0.l lVar, boolean z, Function0 clickListenerSetter, boolean z3) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(clickListenerSetter, "clickListenerSetter");
        if (lVar == null) {
            imageView.setVisibility(z3 ? 4 : 8);
        } else {
            imageView.setVisibility(0);
            f(imageView, lVar, z, clickListenerSetter);
        }
    }

    public static final go.g i(Object obj2) {
        return new go.g(new Data(obj2, null, false, 6, null), 2);
    }

    public static final efm.r j(Object obj2) {
        efm.r rVarF = z9h.n.f(obj2, null, false, 6, null);
        Intrinsics.checkNotNullExpressionValue(rVarF, "just(...)");
        return rVarF;
    }

    public static final t38.e k(Flow a7, Flow b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return u0.m(a7, b4);
    }

    public static void l(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
    }

    public static final long m(InputStream inputStream, OutputStream out, int i) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j2 = 0;
        while (i2 >= 0) {
            out.write(bArr, 0, i2);
            j2 += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j2;
    }

    public static final efm.r o(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r map = rVar.map(new zh7.a(16, new zg6.c(26)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static int p(float f, int i, int i2) {
        if (i == i2 || f <= BitmapDescriptorFactory.HUE_RED) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f4 = ((i >> 24) & 255) / 255.0f;
        float f5 = ((i2 >> 24) & 255) / 255.0f;
        float fA = a(((i >> 16) & 255) / 255.0f);
        float fA2 = a(((i >> 8) & 255) / 255.0f);
        float fA3 = a((i & 255) / 255.0f);
        float fA4 = a(((i2 >> 16) & 255) / 255.0f);
        float fA5 = a(((i2 >> 8) & 255) / 255.0f);
        float fA6 = a((i2 & 255) / 255.0f);
        float fA7 = j6.a.a(f5, f4, f, f4);
        float fA8 = j6.a.a(fA4, fA, f, fA);
        float fA9 = j6.a.a(fA5, fA2, f, fA2);
        float fA10 = j6.a.a(fA6, fA3, f, fA3);
        float fB = b(fA8) * 255.0f;
        float fB2 = b(fA9) * 255.0f;
        return Math.round(b(fA10) * 255.0f) | (Math.round(fB) << 16) | (Math.round(fA7 * 255.0f) << 24) | (Math.round(fB2) << 8);
    }

    public static final efm.r q(efm.r rVar, Object obj2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r map = rVar.filter(new zh7.a(12, new zg6.c(23))).map(new zh7.a(13, new sx4.b(obj2, 24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final j1 r(qfm.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        j1 j1Var = new j1(new j0(lVar, new zh7.a(10, new zg6.c(21)), 0), new zh7.a(11, new zg6.c(22)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }

    public static final f0 s(efm.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        zh7.a aVar = new zh7.a(4, new zg6.c(17));
        d0Var.getClass();
        f0 f0VarO = new rfm.m(new rfm.j(d0Var, aVar, 0), new zh7.a(5, new zg6.c(18)), 1).o();
        Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
        return f0VarO;
    }

    public static final f0 t(efm.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        zh7.a aVar = new zh7.a(6, new zg6.c(19));
        d0Var.getClass();
        ufm.i iVar = new ufm.i(d0Var, aVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return s(iVar);
    }

    public static final efm.r u(efm.r rVar, Function1 condition) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(condition, "condition");
        efm.r rVarFilter = rVar.filter(new zh7.a(14, new v1.m(15, condition)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    public static final efm.r v(efm.r rVar, Function1 expired) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(expired, "expired");
        efm.r map = rVar.map(new zh7.a(17, new v1.m(16, expired)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final zfd.e w(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return new zfd.e(flow, 4);
    }

    public static final dj0.d x(RevolutXFiatBalancesContract$RevolutXFiatBalanceData revolutXFiatBalancesContract$RevolutXFiatBalanceData) {
        Intrinsics.checkNotNullParameter(revolutXFiatBalancesContract$RevolutXFiatBalanceData, "<this>");
        Intrinsics.checkNotNullParameter(revolutXFiatBalancesContract$RevolutXFiatBalanceData, "<this>");
        xi0.b bVar = revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71355a;
        BigDecimal bigDecimal = revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71357c;
        xi0.b bVar2 = revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71356b;
        boolean zF = Intrinsics.f(bVar, bVar2);
        xi0.b bVar3 = revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71355a;
        long j2 = revolutXFiatBalancesContract$RevolutXFiatBalanceData.d;
        if (zF) {
            return new dj0.d(j2, bVar3);
        }
        if (bigDecimal != null) {
            return pyd.c.L(new dj0.d(j2, bVar3), bigDecimal, bVar2);
        }
        return null;
    }

    public static final l6 y(i8 i8Var) {
        Intrinsics.checkNotNullParameter(i8Var, "<this>");
        if (i8Var instanceof d8) {
            return ((d8) i8Var).f10282a;
        }
        if (i8Var instanceof v7) {
            return ((v7) i8Var).f10573a;
        }
        if (i8Var instanceof x7) {
            return ((x7) i8Var).f10607a;
        }
        if (i8Var instanceof h8) {
            return ((x7) zhm.d0.b0(((h8) i8Var).f10346a)).f10607a;
        }
        if (i8Var instanceof e8) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x9m.f z(x9m.f m3) {
        Intrinsics.checkNotNullParameter(m3, "m");
        float f = 1.0f;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        x9m.d x3 = new x9m.d(f, f4, f4, 14);
        x9m.d y2 = new x9m.d(f4, f, f4, 13);
        x9m.d z = new x9m.d(f4, f4, f, 11);
        x9m.d w3 = new x9m.d(f4, f4, f4, 7);
        Intrinsics.checkNotNullParameter(x3, "x");
        Intrinsics.checkNotNullParameter(y2, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        Intrinsics.checkNotNullParameter(w3, "w");
        x9m.d dVar = m3.f303758c;
        float f5 = dVar.f303755c;
        x9m.d dVar2 = m3.d;
        float f6 = dVar2.d;
        float f32 = f5 * f6;
        float f35 = dVar2.f303755c;
        float f36 = dVar.d;
        float f37 = f35 * f36;
        x9m.d dVar3 = m3.f303757b;
        float f41 = dVar3.f303755c;
        float f42 = f41 * f6;
        float f57 = dVar3.d;
        float f69 = f35 * f57;
        float f75 = f41 * f36;
        float f77 = f5 * f57;
        x9m.d dVar4 = m3.f303756a;
        float f81 = dVar4.f303755c;
        float f82 = f6 * f81;
        float f93 = dVar4.d;
        float f94 = f35 * f93;
        float f99 = f36 * f81;
        float f100 = f5 * f93;
        float f101 = f57 * f81;
        float f102 = f41 * f93;
        float f103 = dVar3.f303754b;
        float f104 = f32 * f103;
        float f105 = dVar.f303754b;
        float f106 = (f69 * f105) + f104;
        float f107 = dVar2.f303754b;
        x3.f303753a = ((f75 * f107) + f106) - ((f77 * f107) + ((f42 * f105) + (f37 * f103)));
        float f108 = (f100 * f107) + (f105 * f82) + (dVar4.f303754b * f37);
        x3.f303754b = f108;
        x3.f303754b = f108 - ((dVar2.f303754b * f99) + ((dVar.f303754b * f94) + (dVar4.f303754b * f32)));
        float f109 = dVar4.f303754b;
        float f110 = f42 * f109;
        float f111 = dVar3.f303754b;
        float f112 = (f94 * f111) + f110;
        float f113 = dVar2.f303754b;
        x3.f303755c = ((f101 * f113) + f112) - ((f113 * f102) + ((f82 * f111) + (f69 * f109)));
        float f114 = (f99 * f111) + (f77 * f109);
        float f115 = dVar.f303754b;
        x3.d = ((f102 * f115) + f114) - ((f115 * f101) + ((f111 * f100) + (f109 * f75)));
        float f116 = (dVar2.f303753a * f77) + (dVar.f303753a * f42) + (dVar3.f303753a * f37);
        y2.f303753a = f116;
        y2.f303753a = f116 - ((dVar2.f303753a * f75) + ((dVar.f303753a * f69) + (dVar3.f303753a * f32)));
        float f117 = dVar4.f303753a;
        float f118 = f32 * f117;
        float f119 = dVar.f303753a;
        float f120 = (f94 * f119) + f118;
        float f121 = dVar2.f303753a;
        y2.f303754b = ((f99 * f121) + f120) - ((f100 * f121) + ((f82 * f119) + (f37 * f117)));
        float f122 = dVar3.f303753a;
        float f123 = f101 * f121;
        y2.f303755c = ((f102 * f121) + ((f82 * f122) + (f69 * f117))) - (f123 + ((f94 * f122) + (f42 * f117)));
        float f124 = f101 * f119;
        float f125 = f102 * f119;
        y2.d = (f124 + ((f100 * f122) + (f75 * f117))) - (f125 + ((f99 * f122) + (f77 * f117)));
        float f126 = dVar2.f303754b;
        float f127 = f119 * f126;
        float f128 = dVar.f303754b;
        float f129 = f121 * f128;
        float f130 = f122 * f126;
        float f131 = dVar3.f303754b;
        float f132 = f121 * f131;
        float f133 = f122 * f128;
        float f134 = f119 * f131;
        float f135 = f126 * f117;
        float f136 = dVar4.f303754b;
        float f137 = f121 * f136;
        float f138 = f128 * f117;
        float f139 = f119 * f136;
        float f140 = f131 * f117;
        float f141 = f122 * f136;
        float f142 = dVar3.d;
        float f143 = f127 * f142;
        float f144 = dVar.d;
        float f145 = (f132 * f144) + f143;
        float f146 = dVar2.d;
        z.f303753a = ((f133 * f146) + f145) - ((f134 * f146) + ((f130 * f144) + (f129 * f142)));
        float f147 = dVar4.d;
        z.f303754b = ((f139 * f146) + ((f135 * f144) + (f129 * f147))) - ((f138 * f146) + ((f137 * f144) + (f127 * f147)));
        z.f303755c = ((f140 * f146) + ((f137 * f142) + (f130 * f147))) - ((f141 * f146) + ((f135 * f142) + (f132 * f147)));
        float f148 = (f141 * f144) + (f142 * f138) + (f134 * f147);
        z.d = f148;
        z.d = f148 - ((dVar.d * f140) + ((dVar3.d * f139) + (dVar4.d * f133)));
        float f149 = dVar.f303755c;
        float f150 = f130 * f149;
        float f151 = dVar2.f303755c;
        float f152 = (f134 * f151) + f150;
        float f153 = dVar3.f303755c;
        float f154 = ((f129 * f153) + f152) - ((f132 * f149) + ((f127 * f153) + (f133 * f151)));
        w3.f303753a = f154;
        float f155 = f138 * f151;
        float f156 = dVar4.f303755c;
        float f157 = f129 * f156;
        float f158 = ((f137 * f149) + ((f127 * f156) + f155)) - (f157 + ((f139 * f151) + (f135 * f149)));
        w3.f303754b = f158;
        float f159 = f132 * f156;
        float f160 = f159 + (f141 * f151) + (f135 * f153);
        w3.f303755c = f160;
        float f161 = f160 - ((f137 * dVar3.f303755c) + ((f130 * dVar4.f303755c) + (dVar2.f303755c * f140)));
        w3.f303755c = f161;
        float f162 = dVar.f303755c;
        float f163 = dVar4.f303755c;
        float f164 = dVar3.f303755c;
        float f165 = f139 * f164;
        float f166 = f134 * f163;
        float f167 = (f165 + ((f133 * f163) + (f140 * f162))) - (f166 + ((f141 * f162) + (f138 * f164)));
        w3.d = f167;
        float f168 = dVar4.f303753a;
        float f169 = x3.f303753a;
        float f170 = dVar3.f303753a;
        float f171 = x3.f303754b;
        float f172 = (f170 * f171) + (f168 * f169);
        float f173 = dVar.f303753a;
        float f174 = x3.f303755c;
        float f175 = dVar2.f303753a;
        float f176 = x3.d;
        float f177 = (f175 * f176) + (f173 * f174) + f172;
        return new x9m.f(new x9m.d(f169 / f177, f171 / f177, f174 / f177, f176 / f177), new x9m.d(y2.f303753a / f177, y2.f303754b / f177, y2.f303755c / f177, y2.d / f177), new x9m.d(z.f303753a / f177, z.f303754b / f177, z.f303755c / f177, z.d / f177), new x9m.d(f154 / f177, f158 / f177, f161 / f177, f167 / f177));
    }
}
