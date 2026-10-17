package a;

import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import ar9.x;
import aw0.d9;
import aw0.e9;
import aw0.g9;
import aw0.s9;
import br9.l;
import cfl.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.messaging.data.api.model.Bill;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageAuthor;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.Reminder;
import com.revolut.feature.payments.messaging.data.api.model.Settlement;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.feature.travel.miles.api.model.TravelMilesRateDisplay;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import cqb.f;
import cxe.u;
import dj0.d;
import dx4.d1;
import dx4.f5;
import dx4.h1;
import dx4.i1;
import dx4.j1;
import dx4.m0;
import dx4.m5;
import dx4.n5;
import dx4.v5;
import dx4.w5;
import grl.hd;
import gw0.i;
import gw0.t;
import ip0.h3;
import ip0.p3;
import ip0.v3;
import ip0.w3;
import ip0.z3;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jel.e2;
import jel.q1;
import jel.t1;
import jel.w2;
import jo3.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlinx.coroutines.flow.Flow;
import nwj.q;
import nx4.a3;
import nx4.d3;
import nx4.e0;
import nx4.f2;
import nx4.k0;
import nx4.l0;
import nx4.s2;
import nx4.v2;
import nx4.z2;
import oq9.a0;
import oq9.b0;
import oq9.c0;
import oq9.m;
import oq9.n;
import oq9.y;
import oq9.z;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import pjb.c;
import sdl.q0;
import sdl.r0;
import v0f.p;
import vrf.g;
import wim.r;
import x9m.h;
import xfg.v;
import xfg.w;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static final Amount A(Amount amount, BigDecimal mult) {
        Intrinsics.checkNotNullParameter(amount, "<this>");
        Intrinsics.checkNotNullParameter(mult, "mult");
        BigDecimal bigDecimalMultiply = amount.f104717a.multiply(mult);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return Amount.a(amount, bigDecimalMultiply);
    }

    public static final DateTime B(String str, DateTimeZone dateTimeZone) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(dateTimeZone, "dateTimeZone");
        DateTime dateTimeToday = LocalTime.parse(str).toDateTimeToday(dateTimeZone);
        Intrinsics.checkNotNullExpressionValue(dateTimeToday, "toDateTimeToday(...)");
        return dateTimeToday;
    }

    public static final cdd.a C(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        String accessCode = qVar.getAccessCode();
        String refreshCode = qVar.getRefreshCode();
        long expiryDate = qVar.getExpiryDate();
        String value = qVar.getOwnerId();
        Intrinsics.checkNotNullParameter(value, "value");
        return new cdd.a(expiryDate, accessCode, refreshCode, value);
    }

    public static final o D(q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        int i = r0.f262057b[q0Var.ordinal()];
        if (i == 1) {
            return o.TRANSFER_IN;
        }
        if (i == 2) {
            return o.TRANSFER_OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TravelMilesRate E(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        double d = Double.parseDouble(wVar.getPointsToMilesRate());
        d dVarO = mo3.a.o(wVar.getFee());
        v vVarA = wVar.getDisplay();
        Intrinsics.checkNotNullParameter(vVarA, "<this>");
        return new TravelMilesRate(d, dVarO, new TravelMilesRateDisplay(Integer.parseInt(vVarA.getPoints()), Integer.parseInt(vVarA.getReward())));
    }

    public static final ArrayList F(LinkedHashMap members, List list) {
        String str;
        b0 b0Var;
        c0 yVar;
        b0 b0Var2;
        b0 b0Var3;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(members, "members");
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            ar9.v vVar = (ar9.v) it8.next();
            Intrinsics.checkNotNullParameter(vVar, str2);
            Intrinsics.checkNotNullParameter(members, "members");
            Object obj2 = vVar.f8589g;
            String str3 = vVar.i;
            String str4 = vVar.f8590h;
            long j2 = vVar.f8593m;
            b bVar = vVar.f8592l;
            String str5 = vVar.k;
            long j3 = vVar.f8591j;
            x xVar = vVar.f8588c;
            Iterator it9 = it8;
            String str6 = vVar.f8587b;
            oq9.o nVar = (oq9.o) members.get(obj2);
            if (nVar == null) {
                str = str2;
                nVar = new n(vVar.f8589g, str6);
            } else {
                str = str2;
            }
            oq9.o oVar = nVar;
            oq9.o nVar2 = (oq9.o) members.get(str4);
            if (nVar2 == null) {
                nVar2 = new n(str4, str6);
            }
            oq9.o oVar2 = nVar2;
            oq9.o nVar3 = (oq9.o) members.get(str3);
            if (nVar3 == null) {
                nVar3 = new n(str3, str6);
            }
            oq9.o oVar3 = nVar3;
            int i = l.f17963b[vVar.d.ordinal()];
            if (i == 1) {
                String str7 = vVar.f8586a;
                String str8 = vVar.f8587b;
                int i2 = l.f17962a[xVar.ordinal()];
                if (i2 == 1) {
                    b0Var = b0.MARK_AS_PAID;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b0Var = b0.TRANSFER;
                }
                b0 b0Var4 = b0Var;
                String str9 = vVar.e;
                xi0.b.Companion.getClass();
                yVar = new y(str7, str8, b0Var4, oVar, oVar2, oVar3, new d(j3, xi0.a.a(str5)), bVar != null ? hx7.a.v(bVar) : null, new DateTime(j2), str9);
            } else if (i == 2) {
                String str10 = vVar.f8586a;
                String str11 = vVar.f8587b;
                int i3 = l.f17962a[xVar.ordinal()];
                if (i3 == 1) {
                    b0Var2 = b0.MARK_AS_PAID;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b0Var2 = b0.TRANSFER;
                }
                b0 b0Var5 = b0Var2;
                String str12 = vVar.e;
                xi0.b.Companion.getClass();
                yVar = new z(str10, str11, b0Var5, oVar, oVar2, oVar3, new d(j3, xi0.a.a(str5)), bVar != null ? hx7.a.v(bVar) : null, new DateTime(j2), str12);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                String str13 = vVar.f8586a;
                String str14 = vVar.f8587b;
                int i5 = l.f17962a[xVar.ordinal()];
                if (i5 == 1) {
                    b0Var3 = b0.MARK_AS_PAID;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b0Var3 = b0.TRANSFER;
                }
                b0 b0Var6 = b0Var3;
                String str15 = vVar.e;
                String str16 = vVar.f;
                xi0.b.Companion.getClass();
                yVar = new a0(str13, str14, b0Var6, oVar, oVar2, oVar3, new d(j3, xi0.a.a(str5)), bVar != null ? hx7.a.v(bVar) : null, new DateTime(j2), str15, str16);
            }
            arrayList.add(yVar);
            it8 = it9;
            str2 = str;
        }
        return arrayList;
    }

    public static final c G(f fVar) {
        pjb.a aVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        List<cqb.c> list = fVar.f108070a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (cqb.c cVar : list) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            long j2 = cVar.f108065a;
            Long l2 = cVar.f108066b;
            String str = cVar.f108067c;
            String str2 = cVar.d;
            String str3 = cVar.e;
            pjb.a[] aVarArrValues = pjb.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i];
                if (kotlin.text.a0.z(aVar.name(), str3, true)) {
                    break;
                }
                i++;
            }
            if (aVar == null) {
                aVar = pjb.a.UNKNOWN;
            }
            arrayList.add(new pjb.b(j2, l2, str, str2, aVar));
        }
        return new c(arrayList);
    }

    public static final k0 H(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        if (d1Var instanceof m0) {
            m0 m0Var = (m0) d1Var;
            return new nx4.a0(m0Var.f120673a, m0Var.f120674b);
        }
        if (d1Var instanceof f5) {
            f5 f5Var = (f5) d1Var;
            m0 m0Var2 = f5Var.f120599a;
            nx4.a0 a0Var = new nx4.a0(m0Var2.f120673a, m0Var2.f120674b);
            m0 m0Var3 = f5Var.f120600b;
            return new v2(a0Var, new nx4.a0(m0Var3.f120673a, m0Var3.f120674b));
        }
        if (d1Var instanceof w5) {
            w5 w5Var = (w5) d1Var;
            String strB = w5Var.f120819a.b();
            String strName = w5Var.f120820b.name();
            v5 v5Var = w5Var.f120821c;
            return new d3(strB, strName, v5Var != null ? new s2(v5Var.f120803a.name(), v5Var.f120804b.name()) : null);
        }
        if (d1Var instanceof m5) {
            m5 m5Var = (m5) d1Var;
            return new z2(m5Var.f120683a, m5Var.f120684b.name());
        }
        if (!(d1Var instanceof n5)) {
            throw new NoWhenBranchMatchedException();
        }
        n5 n5Var = (n5) d1Var;
        return new a3(n5Var.f120691a, n5Var.f120692b, n5Var.f120693c);
    }

    public static final l0 I(j1 j1Var) {
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        if (j1Var instanceof h1) {
            h1 h1Var = (h1) j1Var;
            return new e0(h1Var.f120611a.name(), h1Var.f120612b.name());
        }
        if (j1Var instanceof i1) {
            return new f2(((i1) j1Var).name());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final q0 J(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = r0.f262056a[oVar.ordinal()];
        if (i == 1) {
            return q0.TRANSFER_IN;
        }
        if (i == 2) {
            return q0.TRANSFER_OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList K(List list) {
        String str;
        x xVar;
        ar9.w wVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<c0> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (c0 c0Var : list2) {
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            String id10 = c0Var.getId();
            String strE = c0Var.e();
            String strI = c0Var.i();
            boolean z = c0Var instanceof y;
            if (z || (c0Var instanceof z)) {
                str = null;
            } else {
                if (!(c0Var instanceof a0)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((a0) c0Var).k;
            }
            int i = l.f17964c[c0Var.k().ordinal()];
            if (i == 1) {
                xVar = x.MARK_AS_PAID;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                xVar = x.TRANSFER;
            }
            if (z) {
                wVar = ar9.w.COMPLETED;
            } else if (c0Var instanceof z) {
                wVar = ar9.w.DELETED;
            } else {
                if (!(c0Var instanceof a0)) {
                    throw new NoWhenBranchMatchedException();
                }
                wVar = ar9.w.PENDING;
            }
            String strB = c0Var.h().b();
            String strB2 = c0Var.f().b();
            String strB3 = c0Var.b().b();
            long j2 = c0Var.a().f115082a;
            String str2 = c0Var.a().f115083b.f306286a;
            d dVarD = c0Var.d();
            arrayList.add(new ar9.v(id10, strE, xVar, wVar, strI, str, strB, strB2, strB3, j2, str2, dVarD != null ? hx7.a.A(dVarD) : null, c0Var.c().getMillis()));
        }
        return arrayList;
    }

    public static final d L(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String str = amount.f104718b.f104720b;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        return new d(amount.f104717a.multiply(cp5.d.j(bVarA)).longValue(), bVarA);
    }

    public static final hd M(nel.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        switch (zfl.b.f322033a[zVar.ordinal()]) {
            case 1:
                return hd.ADR;
            case 2:
                return hd.ETF;
            case 3:
                return hd.ETC;
            case 4:
                return hd.ETN;
            case 5:
                return hd.EQUITY;
            case 6:
                return hd.WARRANT;
            case 7:
                return hd.SPAC;
            case 8:
                return hd.CFD;
            case 9:
                return hd.BOND;
            case 10:
                return hd.COMMODITY;
            case 11:
                return hd.FUND;
            case 12:
                return hd.MUTUAL_FUND;
            case 13:
                return hd.STRUCTURED_NOTE;
            case 14:
                return hd.OPTION;
            case 15:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final e9 N(s9 s9Var) {
        d9 d9Var;
        Intrinsics.checkNotNullParameter(s9Var, "<this>");
        if (s9Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        float f = s9Var.f10532a;
        Float f4 = s9Var.f10533b;
        int i = g9.f10326a[s9Var.f10534c.ordinal()];
        if (i == 1) {
            d9Var = d9.THREE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d9Var = d9.FIVE;
        }
        return new e9(f, f4, d9Var, s9Var.d);
    }

    public static final boolean O(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        double dDoubleValue = bigDecimal.doubleValue();
        return dDoubleValue > 0.0d && dDoubleValue < 100.0d;
    }

    public static final String a(File file, File file2, String str) {
        StringBuilder sb6 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb6.append(" -> " + file2);
        }
        if (str != null) {
            sb6.append(": ".concat(str));
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static void b(Matrix matrix, float f, float f4, float f5, float f6) {
        if (f4 != BitmapDescriptorFactory.HUE_RED) {
            matrix.preScale(f6, 1.0f);
        }
        if (f != BitmapDescriptorFactory.HUE_RED) {
            matrix.preScale(1.0f, f5);
        }
    }

    public static void c(Matrix matrix, PointF pointF, PointF pointF2, float f, float f4, float f5, float f6, float f32, float f35, float f36) {
        matrix.reset();
        if (pointF2 != null) {
            float f37 = pointF2.x;
            if (f37 != BitmapDescriptorFactory.HUE_RED || pointF2.y != BitmapDescriptorFactory.HUE_RED) {
                matrix.preTranslate(f37, pointF2.y);
            }
        }
        if (f32 != BitmapDescriptorFactory.HUE_RED) {
            matrix.preRotate(f32);
        }
        if (f6 != BitmapDescriptorFactory.HUE_RED) {
            matrix.preScale(f36, 1.0f);
        }
        if (f5 != BitmapDescriptorFactory.HUE_RED) {
            matrix.preScale(1.0f, f35);
        }
        if (f != 1.0f || f4 != 1.0f) {
            matrix.preScale(f, f4);
        }
        if (pointF != null) {
            float f41 = pointF.x;
            if (f41 == BitmapDescriptorFactory.HUE_RED && pointF.y == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            matrix.preTranslate(-f41, -pointF.y);
        }
    }

    public static final ge0.b d(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        return new ge0.b(cursor);
    }

    public static final int e(Amount amount, Amount other) {
        Intrinsics.checkNotNullParameter(amount, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.f(amount.f104718b, other.f104718b)) {
            return amount.f104717a.compareTo(other.f104717a);
        }
        throw new IllegalArgumentException("Comparison of different assets is not supported");
    }

    public static StackTraceElement f() {
        Exception exc2 = new Exception();
        String simpleName = a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc2.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final void g(Layout layout, Canvas canvas, float f, float f4) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint.Align textAlign = layout.getPaint().getTextAlign();
        Paint.Align align = Paint.Align.LEFT;
        boolean z = textAlign != align;
        if (z) {
            try {
                layout.getPaint().setTextAlign(align);
            } catch (Throwable th10) {
                if (z) {
                    layout.getPaint().setTextAlign(textAlign);
                }
                throw th10;
            }
        }
        int iSave = canvas.save();
        canvas.translate(f - (layout.getWidth() / 2), f4);
        try {
            layout.draw(canvas);
            if (z) {
                layout.getPaint().setTextAlign(textAlign);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void h(Layout layout, Canvas canvas, float f, float f4) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint.Align textAlign = layout.getPaint().getTextAlign();
        Paint.Align align = Paint.Align.LEFT;
        boolean z = textAlign != align;
        if (z) {
            try {
                layout.getPaint().setTextAlign(align);
            } catch (Throwable th10) {
                if (z) {
                    layout.getPaint().setTextAlign(textAlign);
                }
                throw th10;
            }
        }
        int iSave = canvas.save();
        canvas.translate(f, f4);
        try {
            layout.draw(canvas);
            if (z) {
                layout.getPaint().setTextAlign(textAlign);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void i(Layout layout, Canvas canvas, float f, float f4) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint.Align textAlign = layout.getPaint().getTextAlign();
        Paint.Align align = Paint.Align.LEFT;
        boolean z = textAlign != align;
        if (z) {
            try {
                layout.getPaint().setTextAlign(align);
            } catch (Throwable th10) {
                if (z) {
                    layout.getPaint().setTextAlign(textAlign);
                }
                throw th10;
            }
        }
        int iSave = canvas.save();
        canvas.translate(f - layout.getWidth(), f4);
        try {
            layout.draw(canvas);
            if (z) {
                layout.getPaint().setTextAlign(textAlign);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final ContactImage j(oq9.o member) {
        Intrinsics.checkNotNullParameter(member, "member");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.uikit_common_accessibility_custom_action_open_profile, null, null, 14);
        if (member instanceof oq9.l) {
            return new ContactImage((String) null, (String) null, pq9.a.a(((oq9.l) member).d), (String) null, (String) null, oi0.d.p(member), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, textLocalisedClause, YearClass.CLASS_2011);
        }
        if (member instanceof m) {
            return new ContactImage((String) null, (String) null, pq9.a.a(((m) member).d), (String) null, (String) null, oi0.d.p(member), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, textLocalisedClause, YearClass.CLASS_2011);
        }
        if (!(member instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, textLocalisedClause, 2047);
    }

    public static final u k(Flow flow, Function1 condition) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return new u(flow, condition, 2);
    }

    public static final ContactImage l(ChatItem item, cam.f position, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(position, "position");
        if (!z || !(position instanceof i) || !((t) ((i) position).f22677a).a() || !(item instanceof GroupChatItem)) {
            return null;
        }
        GroupChatItem groupChatItem = (GroupChatItem) item;
        if (groupChatItem instanceof Bill) {
            return j(((Bill) item).f79516h.c());
        }
        if (!(groupChatItem instanceof MessageItem)) {
            if (groupChatItem instanceof Settlement) {
                return j(((Settlement) item).e.b());
            }
            if (groupChatItem instanceof Reminder) {
                throw new IllegalStateException("Reminder can be sent only by the user");
            }
            throw new NoWhenBranchMatchedException();
        }
        MessageAuthor messageAuthor = ((MessageItem) item).e;
        return new ContactImage((String) null, (String) null, messageAuthor.f79529a, (String) null, (String) null, messageAuthor.f79530b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, new TextLocalisedClause(R$string.uikit_common_accessibility_custom_action_open_profile, null, null, 14), YearClass.CLASS_2011);
    }

    public static final int m(cam.f position, boolean z) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (z) {
            return R$attr.uikit_dp16;
        }
        int i = cu9.a.f108915a[((t) position.f22677a).ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return R$attr.uikit_dp4;
        }
        return R$attr.uikit_dp1;
    }

    public static final KClass n(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        wim.c classifier = kType.getF186441a();
        if (classifier != null) {
            return o(classifier);
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kType);
    }

    public static final KClass o(wim.c cVar) {
        Object obj2;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof KClass) {
            return (KClass) cVar;
        }
        if (!(cVar instanceof r)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + cVar);
        }
        List upperBounds = ((r) cVar).getUpperBounds();
        Iterator it8 = upperBounds.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            wim.c classifier = ((KType) next).getF186441a();
            zim.e0 e0Var = classifier instanceof zim.e0 ? (zim.e0) classifier : null;
            if (e0Var != null && e0Var.y() != ClassKind.INTERFACE && e0Var.y() != ClassKind.ANNOTATION_CLASS) {
                obj2 = next;
                break;
            }
        }
        KType kType = (KType) obj2;
        if (kType == null) {
            kType = (KType) d0.d0(upperBounds);
        }
        return kType != null ? n(kType) : o0.f186429a.b(Object.class);
    }

    public static final int p(cam.f position, boolean z) {
        Intrinsics.checkNotNullParameter(position, "position");
        return (z && (position instanceof i) && !((t) ((i) position).f22677a).a()) ? R$attr.uikit_dp48 : R$attr.uikit_dp16;
    }

    public static final int q(cam.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        int i = cu9.a.f108915a[((t) position.f22677a).ordinal()];
        if (i == 1) {
            return R$attr.uikit_dp4;
        }
        if (i != 2 && i != 3) {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return R$attr.uikit_dp4;
        }
        return R$attr.uikit_dp1;
    }

    public static final boolean r(p3 p3Var, v3 v3Var, w3 w3Var) {
        List list = p3Var.f165762a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            z3 z3Var = (z3) ((h3) it8.next()).f164501c.get(v3Var);
            if (z3Var != null && z3Var.f167392b == w3Var) {
                return true;
            }
        }
        return false;
    }

    public static final StaticLayout s(Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(layout.getText(), 0, layout.getText().length(), new TextPaint(layout.getPaint()), layout.getWidth()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    public static final g t(List list) {
        TransferQuoteSplitOption transferQuoteSplitOption;
        vrf.b bVar;
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (true) {
            transferQuoteSplitOption = null;
            obj2 = null;
            if (!it8.hasNext()) {
                bVar = null;
                break;
            }
            vrf.f fVar = (vrf.f) it8.next();
            bVar = fVar instanceof vrf.b ? (vrf.b) fVar : null;
            if (bVar != null) {
                break;
            }
        }
        if (bVar != null) {
            Iterator it9 = bVar.f291579a.f92287a.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next = it9.next();
                if (((TransferQuoteSplitOption) next).f92290c == bVar.f291580b) {
                    obj2 = next;
                    break;
                }
            }
            transferQuoteSplitOption = (TransferQuoteSplitOption) obj2;
        }
        return new g(transferQuoteSplitOption);
    }

    public static final Amount u(Amount amount, Amount subtrahend) {
        Intrinsics.checkNotNullParameter(amount, "<this>");
        Intrinsics.checkNotNullParameter(subtrahend, "subtrahend");
        if (!Intrinsics.f(amount.f104718b, subtrahend.f104718b)) {
            throw new IllegalArgumentException("Subtraction of different assets is not supported");
        }
        BigDecimal bigDecimalSubtract = amount.f104717a.subtract(subtrahend.f104717a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return Amount.a(amount, bigDecimalSubtract);
    }

    public static final h v(h q5) {
        Intrinsics.checkNotNullParameter(q5, "q");
        float f = q5.f303759a;
        float f4 = q5.f303760b;
        float f5 = (f4 * f4) + (f * f);
        float f6 = q5.f303761c;
        float f32 = (f6 * f6) + f5;
        float f35 = q5.d;
        float fSqrt = 1.0f / ((float) Math.sqrt((f35 * f35) + f32));
        return new h(q5.f303759a * fSqrt, q5.f303760b * fSqrt, q5.f303761c * fSqrt, q5.d * fSqrt);
    }

    public static final e2 w(w2 w2Var, nel.d0 type) {
        Intrinsics.checkNotNullParameter(w2Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = q4e.a.f242133a[type.ordinal()];
        if (i == 1) {
            q1 q1Var = w2Var.f173589h;
            if (q1Var != null) {
                return q1Var.d;
            }
            return null;
        }
        if (i == 2) {
            t1 t1Var = w2Var.i;
            if (t1Var != null) {
                return t1Var.e;
            }
            return null;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        t1 t1Var2 = w2Var.i;
        if (t1Var2 != null) {
            return t1Var2.e;
        }
        return null;
    }

    public static final Amount x(Amount amount, Amount addend) {
        Intrinsics.checkNotNullParameter(amount, "<this>");
        Intrinsics.checkNotNullParameter(addend, "addend");
        if (!Intrinsics.f(amount.f104718b, addend.f104718b)) {
            throw new IllegalArgumentException("Addition of different assets is not supported");
        }
        BigDecimal bigDecimalAdd = amount.f104717a.add(addend.f104717a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return Amount.a(amount, bigDecimalAdd);
    }

    public static Object y(long j2, Function3 function3, Function1 function1, gim.c cVar) {
        return vkm.q.x(new c7i.c0(new p(kotlin.ranges.f.o(0, Integer.MAX_VALUE), 7), function3, new nfj.i(3, 28, null), j2, function1), cVar);
    }

    public static final void z(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
