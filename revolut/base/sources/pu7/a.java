package pu7;

import aj6.u;
import android.app.Activity;
import android.os.Build;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.g1;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.blik.api.navigation.BlikFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.utils.charts.ChartInconsistentCurrenciesException;
import efm.r;
import fij.o;
import fij.s;
import ind.b0;
import io3.h;
import j7l.f;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.a0;
import kotlin.text.f0;
import kotlinx.coroutines.flow.Flow;
import lp6.g;
import lr.l;
import m9d.y0;
import ml3.i;
import nel.z;
import nkm.n;
import nkm.p;
import nkm.x;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import rd0.c;
import t27.k;
import t27.m;
import vkm.q;
import vkm.t;
import vkm.v1;
import vkm.y;
import xi0.b;
import zm3.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static int A(Object obj2, g1 g1Var, byte[] bArr, int i, int i2, d dVar) throws InvalidProtocolBufferException {
        int iJ = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iJ = j(i3, bArr, iJ, dVar);
            i3 = dVar.f49349a;
        }
        int i5 = iJ;
        if (i3 < 0 || i3 > i2 - i5) {
            throw InvalidProtocolBufferException.h();
        }
        int i6 = i5 + i3;
        g1Var.a(obj2, bArr, i5, i6, dVar);
        dVar.f49351c = obj2;
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(nki.a r5, java.lang.String r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof mki.k
            if (r0 == 0) goto L13
            r0 = r8
            mki.k r0 = (mki.k) r0
            int r1 = r0.f206475x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206475x = r1
            goto L18
        L13:
            mki.k r0 = new mki.k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f206474w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f206475x
            java.lang.String r3 = "taskId"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.String r6 = r0.v
            nki.a r5 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5d
        L2d:
            r7 = move-exception
            goto L6f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r8)
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.Lazy r8 = r5.f216814a
            java.lang.Object r8 = r8.getValue()
            java.util.Set r8 = (java.util.Set) r8
            boolean r8 = r8.add(r6)
            if (r8 != 0) goto L50
            r5 = 0
            return r5
        L50:
            r0.u = r5     // Catch: java.lang.Throwable -> L2d
            r0.v = r6     // Catch: java.lang.Throwable -> L2d
            r0.f206475x = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.Lazy r5 = r5.f216814a
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            r5.remove(r6)
            return r8
        L6f:
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.Lazy r5 = r5.f216814a
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            r5.remove(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pu7.a.B(nki.a, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final y C(Flow flow, nki.a singleTasksRegistry, String taskId) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(singleTasksRegistry, "singleTasksRegistry");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Continuation continuation = null;
        return new y(new t(q.B(new y0(flow, continuation, 17), new v1(new l(singleTasksRegistry, taskId, continuation, 24))), new g(singleTasksRegistry, taskId, (Continuation) null)), new u(3, 2, continuation));
    }

    public static final boolean D(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return h.n(zVar) || h.k(zVar) || h.i(zVar) || h.j(zVar);
    }

    public static final long E(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return TimeUnit.SECONDS.toMillis(((Number) pair.f186385a).longValue());
    }

    public static final e7l.h F(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        xi0.a aVar = b.Companion;
        String currency = fVar.getCurrency();
        aVar.getClass();
        return new e7l.h(xi0.a.a(currency), new LocalDate(fVar.getLaunchDate()));
    }

    public static final zm3.a G(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar.i) {
            return H(iVar);
        }
        int i = nl3.a.f216989a[iVar.f206602p.ordinal()];
        if (i == 1) {
            return new zm3.f(iVar.f206594b, iVar.f206593a, iVar.f206595c, iVar.d, iVar.e, iVar.o, iVar.f206601n, iVar.f206600m);
        }
        if (i == 2) {
            return new e(iVar.f206594b, iVar.f206593a, iVar.f206595c, iVar.d, iVar.e, iVar.o, iVar.f206601n, iVar.f206600m);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final zm3.i H(ml3.i r30) {
        /*
            r0 = r30
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            long r3 = r0.f206593a
            java.lang.String r5 = r0.f
            java.lang.String r12 = r0.f206603q
            java.lang.String r1 = r0.f206596g
            java.lang.String r2 = ""
            if (r1 != 0) goto L15
            r11 = r2
            goto L16
        L15:
            r11 = r1
        L16:
            java.lang.String r1 = r0.f206597h
            if (r1 != 0) goto L1c
            r10 = r2
            goto L1d
        L1c:
            r10 = r1
        L1d:
            boolean r6 = r0.f206598j
            java.lang.Long r1 = r0.k
            if (r1 == 0) goto L2e
            long r7 = r1.longValue()
            org.joda.time.DateTime r1 = new org.joda.time.DateTime
            r1.<init>(r7)
            r7 = r1
            goto L2f
        L2e:
            r7 = 0
        L2f:
            java.lang.String r1 = r0.f206599l
            if (r1 == 0) goto L39
            java.time.LocalDate r1 = java.time.LocalDate.parse(r1)
            r15 = r1
            goto L3a
        L39:
            r15 = 0
        L3a:
            int r1 = r0.f206600m
            long r8 = r0.f206601n
            zm3.f r16 = new zm3.f
            java.lang.String r13 = r0.f206594b
            r27 = r3
            long r2 = r0.f206593a
            java.lang.String r14 = r0.f206595c
            java.lang.String r4 = r0.d
            r29 = r1
            java.lang.String r1 = r0.e
            r22 = r1
            java.lang.String r1 = r0.o
            r24 = 0
            r26 = 0
            r23 = r1
            r18 = r2
            r21 = r4
            r17 = r13
            r20 = r14
            r16.<init>(r17, r18, r20, r21, r22, r23, r24, r26)
            do3.a r1 = do3.b.Companion
            r1.getClass()
            do3.b r13 = do3.b.FULL
            java.lang.String r1 = r0.f206605s
            zm3.h r14 = pw5.a.I(r1)
            java.lang.String r0 = r0.f206606t
            if (r0 == 0) goto L99
            do3.c[] r1 = do3.c.values()
            int r2 = r1.length
            r3 = 0
        L7a:
            if (r3 >= r2) goto L96
            r4 = r1[r3]
            r30 = r1
            java.lang.String r1 = r4.name()
            r17 = r2
            r2 = 1
            boolean r1 = kotlin.text.a0.z(r1, r0, r2)
            if (r1 == 0) goto L8f
            r2 = r4
            goto L97
        L8f:
            int r3 = r3 + 1
            r1 = r30
            r2 = r17
            goto L7a
        L96:
            r2 = 0
        L97:
            if (r2 != 0) goto L9b
        L99:
            do3.c r2 = do3.c.PERSONAL
        L9b:
            zm3.i r0 = new zm3.i
            r3 = r8
            r8 = r16
            r16 = r3
            r9 = r2
            r3 = r27
            r18 = r29
            r2 = r0
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pu7.a.H(ml3.i):zm3.i");
    }

    public static final long I(ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        return zonedDateTime.toInstant().toEpochMilli();
    }

    public static final LocalDateTime J(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        org.joda.time.LocalDateTime localDateTime = dateTime.toLocalDateTime();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        return jli.b.f(localDateTime);
    }

    public static final BigDecimal K(long j2, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(currency, "currency");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2 / cp5.d.k(currency));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    public static final zei.a L(String str) {
        zei.a aVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        zei.a[] aVarArrValues = zei.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), str, true)) {
                break;
            }
            i++;
        }
        return aVar == null ? zei.a.UNKNOWN : aVar;
    }

    public static final ZonedDateTime M(long j2, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(j2).atZone(zoneId);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeAtZone, "atZone(...)");
        return zonedDateTimeAtZone;
    }

    public static final void N(Tabs tabs, fij.y yVar) {
        List list;
        Intrinsics.checkNotNullParameter(tabs, "<this>");
        tabs.setVisibility(pd.b.j((yVar == null || (list = yVar.f135465a) == null) ? null : Boolean.valueOf(list.isEmpty() ^ true)) ? 0 : 8);
        if (yVar != null) {
            List<com.revolut.core.ui_kit.views.q> list2 = yVar.f135465a;
            o oVar = yVar.f135466b;
            tabs.setItems(list2, oVar != null ? oVar.getValue() : null);
        }
    }

    public static final void O(TwinVerticalButton twinVerticalButton, fij.a0 footerState) {
        Intrinsics.checkNotNullParameter(twinVerticalButton, "<this>");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        fij.z zVar = footerState.f135433a;
        fij.z zVar2 = footerState.f135434b;
        twinVerticalButton.setMainButtonVisible(zVar != null);
        if (zVar != null) {
            twinVerticalButton.setMainButtonEnabled(zVar.f135468b);
            twinVerticalButton.setMainButtonText(zVar.f135467a);
        }
        twinVerticalButton.setSecondaryButtonVisible(zVar2 != null);
        if (zVar2 != null) {
            twinVerticalButton.setSecondaryButtonEnabled(zVar2.f135468b);
            twinVerticalButton.setSecondaryButtonText(zVar2.f135467a);
        }
        twinVerticalButton.setGradientBackgroundEnabled(footerState.f135435c != null);
        TwinVerticalButton.setDescription$default(twinVerticalButton, footerState.f135435c, null, null, 6, null);
    }

    public static final void P(NavBarWithToolbar navBarWithToolbar, s sVar) {
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "<this>");
        navBarWithToolbar.setToolbarTitle(ebm.a.z(sVar != null ? sVar.f135457a : null));
        navBarWithToolbar.setTitle(sVar != null ? sVar.f135457a : null, null);
        navBarWithToolbar.setSecondDescriptionText(sVar != null ? sVar.f135458b : null);
        navBarWithToolbar.setSecondDescriptionVisible((sVar != null ? sVar.f135458b : null) != null);
    }

    public static final String a(String str, String str2) {
        return str.length() < 44 ? a0.d.r(str, f0.V0(44 - str.length(), str2)) : str;
    }

    public static final FeatureCommand b(BlikFeatureConfig.BlikCodeConfig blikCodeConfig) {
        Intrinsics.checkNotNullParameter(blikCodeConfig, "<this>");
        return new FeatureCommand(new KompotOverlayFeatureConfig(blikCodeConfig.f98274b, yhi.b.SOLID, (Integer) 1, 8));
    }

    public static int c(byte[] bArr, int i, d dVar) throws InvalidProtocolBufferException {
        int iK = k(bArr, i, dVar);
        int i2 = dVar.f49349a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 > bArr.length - iK) {
            throw InvalidProtocolBufferException.h();
        }
        if (i2 == 0) {
            dVar.f49351c = j.f49370b;
            return iK;
        }
        dVar.f49351c = j.c(iK, i2, bArr);
        return iK + i2;
    }

    public static int d(int i, byte[] bArr) {
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static long e(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int f(g1 g1Var, int i, byte[] bArr, int i2, int i3, com.google.crypto.tink.shaded.protobuf.f0 f0Var, d dVar) throws InvalidProtocolBufferException {
        Object objNewInstance = g1Var.newInstance();
        g1 g1Var2 = g1Var;
        byte[] bArr2 = bArr;
        int i5 = i3;
        d dVar2 = dVar;
        int iA = A(objNewInstance, g1Var2, bArr2, i2, i5, dVar2);
        g1Var2.makeImmutable(objNewInstance);
        dVar2.f49351c = objNewInstance;
        f0Var.add(objNewInstance);
        while (iA < i5) {
            d dVar3 = dVar2;
            int i6 = i5;
            int iK = k(bArr2, iA, dVar3);
            if (i != dVar3.f49349a) {
                break;
            }
            byte[] bArr3 = bArr2;
            g1 g1Var3 = g1Var2;
            Object objNewInstance2 = g1Var3.newInstance();
            iA = A(objNewInstance2, g1Var3, bArr3, iK, i6, dVar3);
            g1Var2 = g1Var3;
            bArr2 = bArr3;
            i5 = i6;
            dVar2 = dVar3;
            g1Var2.makeImmutable(objNewInstance2);
            dVar2.f49351c = objNewInstance2;
            f0Var.add(objNewInstance2);
        }
        return iA;
    }

    public static int g(byte[] bArr, int i, d dVar) throws InvalidProtocolBufferException {
        int iK = k(bArr, i, dVar);
        int i2 = dVar.f49349a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 == 0) {
            dVar.f49351c = "";
            return iK;
        }
        dVar.f49351c = new String(bArr, iK, i2, g0.f49364a);
        return iK + i2;
    }

    public static int h(byte[] bArr, int i, d dVar) throws InvalidProtocolBufferException {
        int iK = k(bArr, i, dVar);
        int i2 = dVar.f49349a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 == 0) {
            dVar.f49351c = "";
            return iK;
        }
        dVar.f49351c = com.google.crypto.tink.shaded.protobuf.v1.f49419a.i(bArr, iK, i2);
        return iK + i2;
    }

    public static int i(int i, byte[] bArr, int i2, int i3, j1 j1Var, d dVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i5 = i & 7;
        if (i5 == 0) {
            int iM = m(bArr, i2, dVar);
            j1Var.d(i, Long.valueOf(dVar.f49350b));
            return iM;
        }
        if (i5 == 1) {
            j1Var.d(i, Long.valueOf(e(i2, bArr)));
            return i2 + 8;
        }
        if (i5 == 2) {
            int iK = k(bArr, i2, dVar);
            int i6 = dVar.f49349a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i6 > bArr.length - iK) {
                throw InvalidProtocolBufferException.h();
            }
            if (i6 == 0) {
                j1Var.d(i, j.f49370b);
            } else {
                j1Var.d(i, j.c(iK, i6, bArr));
            }
            return iK + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw InvalidProtocolBufferException.a();
            }
            j1Var.d(i, Integer.valueOf(d(i2, bArr)));
            return i2 + 4;
        }
        j1 j1VarC = j1.c();
        int i21 = (i & (-8)) | 4;
        int i22 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iK2 = k(bArr, i2, dVar);
            i22 = dVar.f49349a;
            if (i22 == i21) {
                i2 = iK2;
                break;
            }
            i2 = i(i22, bArr, iK2, i3, j1VarC, dVar);
        }
        if (i2 > i3 || i22 != i21) {
            throw InvalidProtocolBufferException.f();
        }
        j1Var.d(i, j1VarC);
        return i2;
    }

    public static int j(int i, byte[] bArr, int i2, d dVar) {
        int i3 = i & CertificateBody.profileType;
        int i5 = i2 + 1;
        byte b4 = bArr[i2];
        if (b4 >= 0) {
            dVar.f49349a = i3 | (b4 << 7);
            return i5;
        }
        int i6 = i3 | ((b4 & Ascii.DEL) << 7);
        int i21 = i2 + 2;
        byte b5 = bArr[i5];
        if (b5 >= 0) {
            dVar.f49349a = i6 | (b5 << 14);
            return i21;
        }
        int i22 = i6 | ((b5 & Ascii.DEL) << 14);
        int i32 = i2 + 3;
        byte b7 = bArr[i21];
        if (b7 >= 0) {
            dVar.f49349a = i22 | (b7 << Ascii.NAK);
            return i32;
        }
        int i33 = i22 | ((b7 & Ascii.DEL) << 21);
        int i43 = i2 + 4;
        byte b13 = bArr[i32];
        if (b13 >= 0) {
            dVar.f49349a = i33 | (b13 << 28);
            return i43;
        }
        int i59 = i33 | ((b13 & Ascii.DEL) << 28);
        while (true) {
            int i66 = i43 + 1;
            if (bArr[i43] >= 0) {
                dVar.f49349a = i59;
                return i66;
            }
            i43 = i66;
        }
    }

    public static int k(byte[] bArr, int i, d dVar) {
        int i2 = i + 1;
        byte b4 = bArr[i];
        if (b4 < 0) {
            return j(b4, bArr, i2, dVar);
        }
        dVar.f49349a = b4;
        return i2;
    }

    public static int l(int i, byte[] bArr, int i2, int i3, com.google.crypto.tink.shaded.protobuf.f0 f0Var, d dVar) {
        c0 c0Var = (c0) f0Var;
        int iK = k(bArr, i2, dVar);
        c0Var.b(dVar.f49349a);
        while (iK < i3) {
            int iK2 = k(bArr, iK, dVar);
            if (i != dVar.f49349a) {
                break;
            }
            iK = k(bArr, iK2, dVar);
            c0Var.b(dVar.f49349a);
        }
        return iK;
    }

    public static int m(byte[] bArr, int i, d dVar) {
        int i2 = i + 1;
        long j2 = bArr[i];
        if (j2 >= 0) {
            dVar.f49350b = j2;
            return i2;
        }
        int i3 = i + 2;
        byte b4 = bArr[i2];
        long j3 = (j2 & 127) | (((long) (b4 & Ascii.DEL)) << 7);
        int i5 = 7;
        while (b4 < 0) {
            int i6 = i3 + 1;
            byte b5 = bArr[i3];
            i5 += 7;
            j3 |= ((long) (b5 & Ascii.DEL)) << i5;
            b4 = b5;
            i3 = i6;
        }
        dVar.f49350b = j3;
        return i3;
    }

    public static emm.h n() {
        try {
            for (Map.Entry entry : fmm.e.f136487b.entrySet()) {
                fmm.e.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        emm.b.Companion.getClass();
        emm.h bVar = emm.b.e ? new emm.b() : null;
        if (bVar == null) {
            emm.e.Companion.getClass();
            bVar = emm.e.e ? new emm.e() : null;
        }
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(a0.d.n("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT));
    }

    public static final void o(yji.l lVar, Throwable throwable) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(c.ERROR, null, "request failed", throwable, null, 18);
        TextLocalisedClause title = new TextLocalisedClause(R$string.common_error_state_title, null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        lVar.X1(new nii.y0(null, new nii.z(title, null, null, null, null, null, true, null, null, null, null, null, null, 32468), false, 5));
    }

    public static final es6.b p(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (mVar instanceof t27.j) {
            return es6.b.FIXED_PERCENTAGE;
        }
        if (mVar instanceof k) {
            return es6.b.PER_PRODUCT_PERCENTAGE;
        }
        if (mVar instanceof t27.l) {
            return es6.b.DISABLED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final pr.q q(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        phm.a aVar = (phm.a) ue0.e.j(activity).a().get(pr.q.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (pr.q) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", pr.q.class, " is not found"));
    }

    public static final Float r(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (mVar instanceof t27.j) {
            return Float.valueOf(((t27.j) mVar).f267434a);
        }
        if ((mVar instanceof k) || (mVar instanceof t27.l)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [gim.h, kotlin.jvm.functions.Function2] */
    public static final ChartInconsistentCurrenciesException s(Sequence sequence) {
        Object next;
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        nij.d transform = new nij.d(27);
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        n nVarA = p.a((gim.h) p.b(new x(sequence, transform, null)).f195577b);
        while (true) {
            if (!nVarA.hasNext()) {
                next = null;
                break;
            }
            next = nVarA.next();
            Pair pair = (Pair) next;
            if (!Intrinsics.f((b) pair.f186385a, (b) pair.f186386b)) {
                break;
            }
        }
        Pair pair2 = (Pair) next;
        if (pair2 == null) {
            return null;
        }
        b first = (b) pair2.f186385a;
        b second = (b) pair2.f186386b;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return new ChartInconsistentCurrenciesException(a0.d.s("Chart contains mixed currencies: ", first.f306286a, " and ", second.f306286a));
    }

    public static final dj0.d t(ind.e eVar, b defaultCurrency) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        ind.c cVar = eVar instanceof ind.c ? (ind.c) eVar : null;
        return (cVar == null || (dVar = cVar.i) == null) ? new dj0.d(0L, defaultCurrency) : dVar;
    }

    public static final Integer u(vjg.b bVar) {
        int i = bVar == null ? -1 : vjg.h.f289743a[bVar.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return Integer.valueOf(R$style.UiKitThemeOverlay_ConfettiTinting_Pride);
        }
        if (i == 2) {
            return Integer.valueOf(R$style.UiKitThemeOverlay_ConfettiTinting_Accent);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int v(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return (dVar.f(dj0.d.e) || dVar.k()) ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative;
    }

    public static final y80.d w(y80.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        LinkedHashMap linkedHashMap = cVar.f311617b;
        if (!linkedHashMap.isEmpty()) {
            Iterator it8 = linkedHashMap.entrySet().iterator();
            while (it8.hasNext()) {
                Object value = ((Map.Entry) it8.next()).getValue();
                y80.d dVar = y80.d.DENIED_PERMANENTLY;
                if (value == dVar) {
                    return dVar;
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it9 = linkedHashMap.entrySet().iterator();
            while (it9.hasNext()) {
                Object value2 = ((Map.Entry) it9.next()).getValue();
                y80.d dVar2 = y80.d.DENIED;
                if (value2 == dVar2) {
                    return dVar2;
                }
            }
        }
        return y80.d.GRANTED;
    }

    public static final r x(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        r rVarDistinctUntilChanged = rVar.map(new h0l.g(new gzg.a0(29), 7)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public static final boolean y(ind.e eVar, yld.d screenType) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        if (eVar instanceof ind.b) {
            return true;
        }
        if (eVar instanceof ind.d) {
            return false;
        }
        if (!(eVar instanceof ind.c)) {
            throw new NoWhenBranchMatchedException();
        }
        switch (bod.a.f17391a[screenType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                ind.c cVar = (ind.c) eVar;
                if (cVar.i.k()) {
                    b0 b0Var = cVar.e;
                    ind.a0 a0Var = b0Var instanceof ind.a0 ? (ind.a0) b0Var : null;
                    if ((a0Var != null ? a0Var.f162788b : null) == null) {
                        return true;
                    }
                }
                return false;
            case 5:
            case 6:
                return ((ind.c) eVar).e.isEmpty();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final sh.a z() {
        sh.a aVar = new sh.a();
        Intrinsics.checkNotNullExpressionValue(aVar, "build(...)");
        return aVar;
    }
}
