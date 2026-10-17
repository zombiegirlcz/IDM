package c8g;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PathMeasure;
import android.view.View;
import androidx.core.view.ViewCompat;
import aw0.o9;
import bxa.b0;
import bxa.e;
import cjl.m;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.api.product.ApmProductComplete;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.models.recipients.AaniContact;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payments.messaging.data.api.model.Bill;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.messaging.data.api.model.DonationItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MoneyRequestItem;
import com.revolut.feature.payments.messaging.data.api.model.Reminder;
import com.revolut.feature.payments.messaging.data.api.model.Settlement;
import com.revolut.feature.payments.messaging.data.api.model.TransactionItem;
import com.revolut.feature.payments.messaging.data.api.model.TransferLinkItem;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.EligibilityCriteria;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Step;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLogistics;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLogisticsLocation;
import com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmationStage;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewPayment;
import com.revolut.feature.travel.flights.models.domain.booking.BookingStatus;
import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import dv9.d;
import dv9.t;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jfb.v0;
import jkl.m2;
import kg.u;
import kg.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import l7g.r;
import l7g.s;
import l7g.z;
import mgb.i;
import mgb.j;
import n8i.k;
import net.sf.scuba.smartcards.ISO7816;
import org.joda.time.DateTime;
import pwa.p;
import s7g.e2;
import s7g.g;
import s7g.m1;
import sf8.h;
import vkm.q;
import vkm.v1;
import ygc.f;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final m A(m2 m2Var) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        String strA = m2Var.getOperation();
        Map mapB = m2Var.getProperties();
        if (mapB != null) {
            linkedHashMap = new LinkedHashMap(q0.b(mapB.size()));
            for (Map.Entry entry : mapB.entrySet()) {
                linkedHashMap.put(entry.getKey(), N((u) entry.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        return new m(linkedHashMap, strA);
    }

    public static final String B(int i) {
        if (i == -100) {
            return "INTERNAL_ERROR";
        }
        switch (i) {
            case -15:
                return "APP_NOT_OWNED";
            case -14:
                return "PLAY_STORE_NOT_FOUND";
            case -13:
                return "SPLITCOMPAT_COPY_ERROR";
            case -12:
                return "SPLITCOMPAT_EMULATION_ERROR";
            case -11:
                return "SPLITCOMPAT_VERIFICATION_ERROR";
            case -10:
                return "INSUFFICIENT_STORAGE";
            case -9:
                return "SERVICE_DIED";
            case -8:
                return "INCOMPATIBLE_WITH_EXISTING_SESSION";
            case -7:
                return "ACCESS_DENIED";
            case -6:
                return "NETWORK_ERROR";
            case -5:
                return "API_NOT_AVAILABLE";
            case -4:
                return "SESSION_NOT_FOUND";
            case BillingClient.BillingResponseCode.SERVICE_TIMEOUT /* -3 */:
                return "INVALID_REQUEST";
            case -2:
                return "MODULE_UNAVAILABLE";
            case -1:
                return "ACTIVE_SESSIONS_LIMIT_EXCEEDED";
            case 0:
                return "NO_ERROR";
            default:
                return String.valueOf(i);
        }
    }

    public static final boolean C(ChatItem chatItem) {
        String str;
        Intrinsics.checkNotNullParameter(chatItem, "<this>");
        return (k(chatItem) != t.UNKNOWN) && (!(chatItem instanceof MessageItem) ? !(chatItem instanceof TransactionItem) || ((str = ((TransactionItem) chatItem).f79576g.f272592g1) != null && str.length() != 0) : ((MessageItem) chatItem).f79536j == d.SENT);
    }

    public static final v1 D(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return q.R(flow, new hr4.b(3, 2, null));
    }

    public static final TextClause E(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f205245a;
        ArrayList arrayList = jVar.f205246b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            i iVar = (i) obj2;
            Integer num = null;
            int i3 = 28;
            arrayList2.add(new TextClause(iVar.f205243a, (Style) new Click(i3, num, (Object) iVar.f205244b, a0.d.n("SALARY_HUB_TERMS_AND_CONDITIONS_", i), false), (Integer) null, false, (o9) null, (List) null, 124));
            i = i2;
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) arrayList2, 94);
    }

    public static final vzi.d F(List list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return vzi.d.NONE;
        }
        List list2 = list;
        boolean z3 = list2 instanceof Collection;
        boolean z4 = true;
        if (z3 && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((CustomAsset) it8.next()).k) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z3 && list2.isEmpty()) {
            z4 = false;
        } else {
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                if (!((CustomAsset) it9.next()).k) {
                    break;
                }
            }
            z4 = false;
        }
        return (z && z4) ? vzi.d.MIXED : z ? vzi.d.AI_ONLY : z4 ? vzi.d.STATIC_ONLY : vzi.d.NONE;
    }

    public static final Step G(b0 b0Var) {
        p pVar;
        ArrayList arrayList;
        AdditionalInfo additionalInfo;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        String strB = b0Var.getCode();
        p[] pVarArrValues = p.values();
        int length = pVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                pVar = null;
                break;
            }
            pVar = pVarArrValues[i];
            if (a0.z(pVar.name(), strB, true)) {
                break;
            }
            i++;
        }
        if (pVar == null) {
            pVar = p.UNKNOWN;
        }
        p pVar2 = pVar;
        String strC = b0Var.getDescription();
        String strG = b0Var.getTitle();
        List listD = b0Var.getEligibilityCriteria();
        if (listD != null) {
            List<cxa.a> list = listD;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (cxa.a aVar : list) {
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                arrayList2.add(new EligibilityCriteria(aVar.getIcon(), aVar.getTitle(), aVar.getDescription()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        e eVarA = b0Var.getAdditionalInfo();
        if (eVarA != null) {
            Intrinsics.checkNotNullParameter(eVarA, "<this>");
            additionalInfo = new AdditionalInfo(eVarA.getTitle(), eVarA.getSubtitle());
        } else {
            additionalInfo = null;
        }
        jo3.a aVarF = b0Var.getReward();
        return new Step(pVar2, strC, strG, arrayList, additionalInfo, aVarF != null ? mo3.a.o(aVarF) : null, b0Var.getIcon());
    }

    public static final BookingStatus H(m1 m1Var) {
        String str;
        Intrinsics.checkNotNullParameter(m1Var, "<this>");
        String str2 = m1Var.f260762a;
        l7g.p pVar = l7g.q.Companion;
        String str3 = m1Var.f260763b;
        pVar.getClass();
        l7g.q qVarA = l7g.p.a(str3);
        Boolean bool = m1Var.f260764c;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Iterable<g> iterable = m1Var.d;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (g gVar : iterable) {
            Boolean bool2 = gVar.f260722a;
            BookingConfirmationStage bookingConfirmationStage = null;
            if (bool2 != null) {
                boolean zBooleanValue2 = bool2.booleanValue();
                String str4 = gVar.f260723b;
                if (str4 != null && (str = gVar.f260724c) != null) {
                    bookingConfirmationStage = new BookingConfirmationStage(zBooleanValue2, str4, str);
                }
            }
            if (bookingConfirmationStage != null) {
                arrayList.add(bookingConfirmationStage);
            }
        }
        return new BookingStatus(str2, qVarA, zBooleanValue, arrayList);
    }

    public static final TravelHotelsCampaign I(nfi.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strC = aVar.getId();
        String strD = aVar.getImage();
        DateTime dateTimeWithTimeAtStartOfDay = new DateTime(aVar.getStartDate()).withTimeAtStartOfDay();
        Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
        return new TravelHotelsCampaign(strC, strD, dateTimeWithTimeAtStartOfDay, jli.b.k(new DateTime(aVar.getEndDate())), aVar.getName(), aVar.getDiscount(), aVar.getRank());
    }

    public static final dgc.a J(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new dgc.a(fVar.f313603a, fVar.f313604b, fVar.f313605c);
    }

    public static final z K(e2 e2Var) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        String str = e2Var.f260704a;
        String str2 = e2Var.f260705b;
        String str3 = e2Var.f260706c;
        r rVar = s.Companion;
        String str4 = e2Var.d;
        rVar.getClass();
        s sVarA = r.a(str4);
        LocalDate localDate = LocalDate.parse(e2Var.e);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        String str5 = e2Var.f;
        return new z(str, str2, str3, sVarA, localDate, str5 != null ? LocalDate.parse(str5) : null, e2Var.f260707g, e2Var.f260708h);
    }

    public static final f L(dgc.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new f(aVar.f114613a, aVar.f114614b, aVar.f114615c);
    }

    public static final b0 M(Step step) {
        ArrayList arrayList;
        e eVar;
        Intrinsics.checkNotNullParameter(step, "<this>");
        String strName = step.f81776a.name();
        String str = step.f81777b;
        String str2 = step.f81778c;
        List list = step.d;
        if (list != null) {
            List<EligibilityCriteria> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (EligibilityCriteria eligibilityCriteria : list2) {
                Intrinsics.checkNotNullParameter(eligibilityCriteria, "<this>");
                arrayList2.add(new cxa.a(eligibilityCriteria.f81720a, eligibilityCriteria.f81721b, eligibilityCriteria.f81722c));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        AdditionalInfo additionalInfo = step.e;
        if (additionalInfo != null) {
            Intrinsics.checkNotNullParameter(additionalInfo, "<this>");
            eVar = new e(additionalInfo.f81711a, additionalInfo.f81712b);
        } else {
            eVar = null;
        }
        dj0.d dVar = step.f;
        return new b0(eVar, strName, str, str2, step.f81779g, arrayList, dVar != null ? mo3.a.p(dVar) : null);
    }

    public static final String N(u uVar) {
        if (uVar == null || (uVar instanceof kg.v)) {
            return null;
        }
        if (uVar instanceof x) {
            return uVar.f();
        }
        if (uVar instanceof kg.r) {
            kg.r rVarB = uVar.b();
            Intrinsics.checkNotNullExpressionValue(rVarB, "getAsJsonArray(...)");
            ArrayList arrayList = new ArrayList();
            for (u uVar2 : rVarB.f183889a) {
                uVar2.getClass();
                String strN = uVar2 instanceof kg.v ? null : N(uVar2);
                if (strN != null) {
                    arrayList.add(strN);
                }
            }
            return d0.k0(arrayList, ",", null, null, 0, null, 62);
        }
        return null;
    }

    public static final dj0.d O(BookingPreviewPayment bookingPreviewPayment, PointsRedeemOption pointsRedeemOption) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(bookingPreviewPayment, "<this>");
        dj0.d dVar2 = bookingPreviewPayment.f93452a;
        dj0.d dVar3 = null;
        if (pointsRedeemOption != null && (dVar = pointsRedeemOption.f93541c) != null && dVar.f(dj0.d.e)) {
            dVar3 = dVar;
        }
        return pyd.c.H(dVar2, dVar3);
    }

    public static final void a(View view, ny0.c filter, Function1 listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ny0.w wVar = new ny0.w(ref$ObjectRef, filter, listener);
        view.addOnAttachStateChangeListener(new ny0.v(wVar, ref$ObjectRef, filter, listener));
        if (view.isAttachedToWindow()) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityI = z92.f.i(context);
            if (activityI == null) {
                return;
            }
            activityI.registerComponentCallbacks(wVar);
            ref$ObjectRef.f186409a = new Configuration(view.getContext().getResources().getConfiguration());
        }
    }

    public static void c(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        Intrinsics.checkNotNullParameter(productAccountDescriptor$Value, "<this>");
        if (productAccountDescriptor$Value.getF89727a() == ProductId.FAVORITE) {
            throw new IllegalArgumentException("FAVORITE descriptor isn't allowed here");
        }
    }

    public static Float d(PathMeasure pathMeasure, float[] positionArray, float f, float f4, float f5, or0.d contourDirection) {
        Intrinsics.checkNotNullParameter(pathMeasure, "<this>");
        Intrinsics.checkNotNullParameter(positionArray, "positionArray");
        Intrinsics.checkNotNullParameter(contourDirection, "contourDirection");
        if (f5 >= BitmapDescriptorFactory.HUE_RED) {
            while (f4 - f > 2.0f) {
                float f6 = (f4 + f) / 2.0f;
                if (pathMeasure.getPosTan(f6, positionArray, null) && Math.abs(positionArray[0] - f5) < 1.0f) {
                    return Float.valueOf(f6);
                }
                int i = or0.e.f228009a[contourDirection.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (positionArray[0] > f5) {
                        f = f6;
                    } else {
                        f4 = f6;
                    }
                } else if (positionArray[0] < f5) {
                    f = f6;
                } else {
                    f4 = f6;
                }
            }
        }
        return null;
    }

    public static final String e(int i, int i2, byte[] bArr) {
        int i3;
        int i5;
        int i6;
        int i21;
        int i22;
        int i32 = i;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i32 < 0 || i2 > bArr.length || i32 > i2) {
            StringBuilder sb6 = new StringBuilder("size=");
            t61.a.x(sb6, bArr.length, " beginIndex=", i32, " endIndex=");
            sb6.append(i2);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        char[] cArr = new char[i2 - i32];
        int i33 = 0;
        while (i32 < i2) {
            byte b4 = bArr[i32];
            if (b4 >= 0) {
                i3 = i33 + 1;
                cArr[i33] = (char) b4;
                i32++;
                while (i32 < i2) {
                    byte b5 = bArr[i32];
                    if (b5 < 0) {
                        break;
                    }
                    i32++;
                    cArr[i3] = (char) b5;
                    i3++;
                }
                Unit unit = Unit.f186387a;
            } else {
                if ((b4 >> 5) == -2) {
                    int i43 = i32 + 1;
                    if (i2 <= i43) {
                        i3 = i33 + 1;
                        cArr[i33] = (char) 65533;
                    } else {
                        byte b7 = bArr[i43];
                        if ((b7 & ISO7816.INS_GET_RESPONSE) == 128) {
                            int i59 = (b4 << 6) ^ (b7 ^ 3968);
                            if (i59 < 128) {
                                i3 = i33 + 1;
                                cArr[i33] = (char) 65533;
                            } else {
                                i3 = i33 + 1;
                                cArr[i33] = (char) i59;
                            }
                            Unit unit2 = Unit.f186387a;
                        } else {
                            i3 = i33 + 1;
                            cArr[i33] = (char) 65533;
                        }
                    }
                    Unit unit3 = Unit.f186387a;
                } else if ((b4 >> 4) == -2) {
                    int i66 = i32 + 2;
                    if (i2 <= i66) {
                        i3 = i33 + 1;
                        cArr[i33] = (char) 65533;
                        Unit unit4 = Unit.f186387a;
                        int i74 = i32 + 1;
                        i5 = (i2 <= i74 || (bArr[i74] & ISO7816.INS_GET_RESPONSE) != 128) ? 1 : 2;
                    } else {
                        byte b13 = bArr[i32 + 1];
                        if ((b13 & ISO7816.INS_GET_RESPONSE) == 128) {
                            byte b15 = bArr[i66];
                            if ((b15 & ISO7816.INS_GET_RESPONSE) == 128) {
                                int i92 = (b4 << 12) ^ ((b15 ^ (-123008)) ^ (b13 << 6));
                                if (i92 < 2048) {
                                    i3 = i33 + 1;
                                    cArr[i33] = (char) 65533;
                                } else if (55296 > i92 || i92 >= 57344) {
                                    i3 = i33 + 1;
                                    cArr[i33] = (char) i92;
                                } else {
                                    i3 = i33 + 1;
                                    cArr[i33] = (char) 65533;
                                }
                                Unit unit5 = Unit.f186387a;
                                i5 = 3;
                            } else {
                                i3 = i33 + 1;
                                cArr[i33] = (char) 65533;
                                Unit unit6 = Unit.f186387a;
                            }
                        } else {
                            i3 = i33 + 1;
                            cArr[i33] = (char) 65533;
                            Unit unit7 = Unit.f186387a;
                        }
                    }
                } else {
                    if ((b4 >> 3) == -2) {
                        int i96 = i32 + 3;
                        if (i2 <= i96) {
                            i6 = i33 + 1;
                            cArr[i33] = 65533;
                            Unit unit8 = Unit.f186387a;
                            int i99 = i32 + 1;
                            if (i2 > i99 && (bArr[i99] & ISO7816.INS_GET_RESPONSE) == 128) {
                                int i100 = i32 + 2;
                                i22 = (i2 <= i100 || (bArr[i100] & ISO7816.INS_GET_RESPONSE) != 128) ? 2 : 3;
                            }
                            i22 = 1;
                        } else {
                            byte b17 = bArr[i32 + 1];
                            if ((b17 & ISO7816.INS_GET_RESPONSE) == 128) {
                                byte b40 = bArr[i32 + 2];
                                if ((b40 & ISO7816.INS_GET_RESPONSE) == 128) {
                                    byte b61 = bArr[i96];
                                    if ((b61 & ISO7816.INS_GET_RESPONSE) == 128) {
                                        int i101 = (b4 << 18) ^ (((b61 ^ 3678080) ^ (b40 << 6)) ^ (b17 << 12));
                                        if (i101 > 1114111) {
                                            i6 = i33 + 1;
                                            cArr[i33] = 65533;
                                        } else if ((55296 > i101 || i101 >= 57344) && i101 >= 65536) {
                                            if (i101 != 65533) {
                                                cArr[i33] = (char) ((i101 >>> 10) + 55232);
                                                i21 = i33 + 2;
                                                cArr[i33 + 1] = (char) ((i101 & 1023) + 56320);
                                            } else {
                                                cArr[i33] = 65533;
                                                i21 = i33 + 1;
                                            }
                                            Unit unit9 = Unit.f186387a;
                                            i6 = i21;
                                            i22 = 4;
                                        } else {
                                            i6 = i33 + 1;
                                            cArr[i33] = 65533;
                                        }
                                        Unit unit10 = Unit.f186387a;
                                        i22 = 4;
                                    } else {
                                        i6 = i33 + 1;
                                        cArr[i33] = 65533;
                                        Unit unit11 = Unit.f186387a;
                                    }
                                } else {
                                    i6 = i33 + 1;
                                    cArr[i33] = 65533;
                                    Unit unit12 = Unit.f186387a;
                                }
                            } else {
                                i6 = i33 + 1;
                                cArr[i33] = 65533;
                                Unit unit13 = Unit.f186387a;
                                i22 = 1;
                            }
                        }
                        i32 += i22;
                    } else {
                        i6 = i33 + 1;
                        cArr[i33] = 65533;
                        i32++;
                    }
                    i33 = i6;
                }
                i32 += i5;
            }
            i33 = i3;
        }
        return a0.s(cArr, 0, i33);
    }

    public static final void f(View view, Function0 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (view.isAttachedToWindow() && ViewCompat.isLaidOut(view)) {
            action.invoke();
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ax.d(view, action));
        }
    }

    public static final JuniorBankingProfile g(String walletId, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((vf8.b) next).f288535a.f239484a, walletId)) {
                break;
            }
        }
        vf8.b bVar = (vf8.b) next;
        if (bVar != null) {
            return bVar.f288536b;
        }
        return null;
    }

    public static final Object h(Flow flow, gim.c cVar) {
        int i = 4;
        return q.x(mo3.a.g(new iyg.b0(flow, i), null, new v0(i), 1), cVar);
    }

    public static final String i(ChatItem chatItem) {
        Intrinsics.checkNotNullParameter(chatItem, "<this>");
        if (chatItem instanceof Bill) {
            return ((Bill) chatItem).f79516h.getId();
        }
        if (chatItem instanceof MessageItem) {
            return ((MessageItem) chatItem).f79531a;
        }
        if (chatItem instanceof Settlement) {
            return ((Settlement) chatItem).e.getId();
        }
        if (chatItem instanceof MoneyRequestItem) {
            return ((MoneyRequestItem) chatItem).f79564g.f60314a;
        }
        if (chatItem instanceof TransferLinkItem) {
            return ((TransferLinkItem) chatItem).f79578a;
        }
        if (chatItem instanceof TransactionItem) {
            String str = ((TransactionItem) chatItem).f79576g.f272592g1;
            return str == null ? "" : str;
        }
        if (!(chatItem instanceof DonationItem) && !(chatItem instanceof Reminder)) {
            throw new NoWhenBranchMatchedException();
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public static final String j(ChatItem chatItem) {
        Intrinsics.checkNotNullParameter(chatItem, "<this>");
        return a0.d.r(k(chatItem).name(), i(chatItem));
    }

    public static final t k(ChatItem chatItem) {
        Intrinsics.checkNotNullParameter(chatItem, "<this>");
        if (chatItem instanceof Bill) {
            return t.GROUP_BILL;
        }
        if (chatItem instanceof MessageItem) {
            return t.MESSAGE;
        }
        if (chatItem instanceof Settlement) {
            return t.GROUP_SETTLEMENT;
        }
        if (chatItem instanceof MoneyRequestItem) {
            return t.MONEY_REQUEST;
        }
        if (chatItem instanceof TransferLinkItem) {
            return t.TRANSFER_LINK;
        }
        if (chatItem instanceof TransactionItem) {
            return t.P2P_TRANSFER;
        }
        if ((chatItem instanceof DonationItem) || (chatItem instanceof Reminder)) {
            return t.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean l(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return Intrinsics.f(hVar, sf8.a.f262350a);
    }

    public static final dj0.d m(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return kVar.f213439a.f260363b.f302979a;
    }

    public static final n02.b n(ApmContact apmContact) {
        Intrinsics.checkNotNullParameter(apmContact, "<this>");
        if (apmContact instanceof AaniContact) {
            return n02.b.AANI;
        }
        if (apmContact instanceof BizumContact) {
            return n02.b.BIZUM;
        }
        if (apmContact instanceof BlikContact) {
            return n02.b.BLIK;
        }
        if (apmContact instanceof BrebContact) {
            return n02.b.BREB;
        }
        if (apmContact instanceof IrisContact) {
            return n02.b.IRIS;
        }
        if (apmContact instanceof MultibancoContact) {
            return n02.b.MBWAY;
        }
        if (apmContact instanceof PixContact) {
            return n02.b.PIX;
        }
        if (apmContact instanceof QvikContact) {
            return n02.b.QVIK;
        }
        if (apmContact instanceof SpinContact) {
            return n02.b.SPIN;
        }
        if (apmContact instanceof WeroContact) {
            return n02.b.WERO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ApmProductComplete o(ApmContact apmContact) {
        Intrinsics.checkNotNullParameter(apmContact, "<this>");
        if (apmContact instanceof AaniContact) {
            return ApmAani.f61807c;
        }
        if (apmContact instanceof BizumContact) {
            return ApmBizum.f61808c;
        }
        if (apmContact instanceof BrebContact) {
            return ApmBreb.f61810c;
        }
        if (apmContact instanceof BlikContact) {
            return ApmBlik.f61809c;
        }
        if (apmContact instanceof IrisContact) {
            return ApmIris.f61811c;
        }
        if (apmContact instanceof MultibancoContact) {
            return ApmMultibanco.f61815c;
        }
        if (apmContact instanceof PixContact) {
            return ApmPix.f61820c;
        }
        if (apmContact instanceof QvikContact) {
            return ApmQvik.f61823c;
        }
        if (apmContact instanceof SpinContact) {
            return ApmSpin.f61827c;
        }
        if (apmContact instanceof WeroContact) {
            return ApmWero.f61829c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ApmProductComplete p(n02.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (mx1.d.f210153a[bVar.ordinal()]) {
            case 1:
                return ApmAani.f61807c;
            case 2:
                return ApmBizum.f61808c;
            case 3:
                return ApmBlik.f61809c;
            case 4:
                return ApmBreb.f61810c;
            case 5:
                return ApmIris.f61811c;
            case 6:
                return ApmMultibanco.f61815c;
            case 7:
                return ApmPix.f61820c;
            case 8:
                return ApmQvik.f61823c;
            case 9:
                return ApmSpin.f61827c;
            case 10:
                return ApmWero.f61829c;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final x5i.a q(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return kVar.f213439a.f260362a;
    }

    public static final AccountWrapper r(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return q(kVar).f302980b;
    }

    public static final AccountWrapper t(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return kVar.f213439a.f260363b.f302980b;
    }

    public static final boolean v(OrderQuoteParams orderQuoteParams) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "<this>");
        return cp5.d.z(orderQuoteParams.f104783a) || cp5.d.z(orderQuoteParams.f104784b);
    }

    public static final boolean w(myf.a aVar) {
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        TravelExperienceLogistics travelExperienceLogistics = aVar.o;
        if (travelExperienceLogistics != null) {
            if (!((travelExperienceLogistics == null || (list2 = travelExperienceLogistics.f92829a) == null) ? false : !list2.isEmpty())) {
                TravelExperienceLogistics travelExperienceLogistics2 = aVar.o;
                if ((travelExperienceLogistics2 == null || (list = travelExperienceLogistics2.f92830b) == null) ? false : !list.isEmpty()) {
                }
            }
            return true;
        }
        return false;
    }

    public static final xag.a x(xag.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = xag.b.f303875a[aVar.ordinal()];
        if (i == 1) {
            return xag.a.DISABLED;
        }
        if (i == 2) {
            return xag.a.ENABLED;
        }
        if (i == 3) {
            return xag.a.UNAVAILABLE;
        }
        if (i == 4) {
            return xag.a.HIDDEN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List y(myf.a aVar) {
        Object next;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        TravelExperienceLogistics travelExperienceLogistics = aVar.o;
        if (travelExperienceLogistics == null) {
            return f0.f322471a;
        }
        List<TravelExperienceLogisticsLocation> list = travelExperienceLogistics.f92830b;
        ArrayList arrayList = new ArrayList();
        for (TravelExperienceLogisticsLocation travelExperienceLogisticsLocation : list) {
            Iterator it8 = aVar.f210459n.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((TravelExperienceLocation) next).f92826a, travelExperienceLogisticsLocation.f92832a)) {
                    break;
                }
            }
            TravelExperienceLocation travelExperienceLocation = (TravelExperienceLocation) next;
            Pair pair = travelExperienceLocation != null ? new Pair(travelExperienceLogisticsLocation, travelExperienceLocation) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    public static final List z(myf.a aVar) {
        Object next;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        TravelExperienceLogistics travelExperienceLogistics = aVar.o;
        if (travelExperienceLogistics == null) {
            return f0.f322471a;
        }
        List<TravelExperienceLogisticsLocation> list = travelExperienceLogistics.f92829a;
        ArrayList arrayList = new ArrayList();
        for (TravelExperienceLogisticsLocation travelExperienceLogisticsLocation : list) {
            Iterator it8 = aVar.f210459n.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((TravelExperienceLocation) next).f92826a, travelExperienceLogisticsLocation.f92832a)) {
                    break;
                }
            }
            TravelExperienceLocation travelExperienceLocation = (TravelExperienceLocation) next;
            Pair pair = travelExperienceLocation != null ? new Pair(travelExperienceLogisticsLocation, travelExperienceLocation) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    public abstract float s();

    public abstract Clause u();
}
