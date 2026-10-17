package nd;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import com.youTransactor.uCube.log.ILogger;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.Intrinsics;
import nx4.f1;
import o9k.t0;
import o9k.w0;
import o9k.y;
import org.jmrtd.cbeff.ISO781611;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements q, kfm.p, zc.n, ILogger, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214266a;

    public /* synthetic */ n(int i) {
        this.f214266a = i;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static kdh.b c(Context context, String[] strArr, String str) {
        String[] strArrK = k(context);
        int length = strArrK.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = strArrK[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb6 = new StringBuilder("lib");
                            char c2 = File.separatorChar;
                            sb6.append(c2);
                            sb6.append(str3);
                            sb6.append(c2);
                            sb6.append(str);
                            String string = sb6.toString();
                            jt0.b.w0("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                kdh.b bVar = new kdh.b(27);
                                bVar.f182899b = zipFile;
                                bVar.f182900c = entry;
                                return bVar;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    public static String[] h(Context context, String str) {
        StringBuilder sb6 = new StringBuilder("lib");
        char c2 = File.separatorChar;
        r6.b.o(c2, c2, "([^\\", "]*)", sb6);
        sb6.append(c2);
        sb6.append(str);
        Pattern patternCompile = Pattern.compile(sb6.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : k(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Set i(java.util.List r2) {
        /*
            if (r2 == 0) goto L2c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            com.revolut.retail.feature.airport.security_fast_track.api.model.AsftBusinessHours r1 = (com.revolut.retail.feature.airport.security_fast_track.api.model.AsftBusinessHours) r1
            java.time.DayOfWeek r1 = r1.f98708a
            r0.add(r1)
            goto L13
        L25:
            java.util.Set r2 = zhm.d0.i1(r0)
            if (r2 == 0) goto L2c
            goto L2e
        L2c:
            zhm.h0 r2 = zhm.h0.f322473a
        L2e:
            him.a r0 = yui.b.f317022a
            java.util.Set r0 = zhm.d0.i1(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r2 = zhm.d0.Q0(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.n.i(java.util.List):java.util.Set");
    }

    public static String[] k(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // zc.o
    public Object a() {
        return new m(8);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        return xnd.m.f307422a.invoke(obj2);
    }

    @Override // com.youTransactor.uCube.log.ILogger
    public void d(String str, String str2) {
        LoggerFactory.getLogger(str).debug(str2);
    }

    @Override // com.youTransactor.uCube.log.ILogger
    public void e(String str, String str2, Exception exc2) {
        LoggerFactory.getLogger(str).error(str2, (Throwable) exc2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List f(java.util.List r7, java.lang.Integer r8, java.time.LocalDate r9, java.util.TimeZone r10) {
        /*
            r6 = this;
            java.lang.String r0 = "businessHours"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "airportTimeZone"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            if (r9 != 0) goto Lf
            goto La6
        Lf:
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.revolut.retail.feature.airport.security_fast_track.api.model.AsftBusinessHours r3 = (com.revolut.retail.feature.airport.security_fast_track.api.model.AsftBusinessHours) r3
            java.time.DayOfWeek r3 = r3.f98708a
            java.time.DayOfWeek r4 = r9.getDayOfWeek()
            if (r3 != r4) goto L16
            goto L2d
        L2c:
            r2 = r0
        L2d:
            com.revolut.retail.feature.airport.security_fast_track.api.model.AsftBusinessHours r2 = (com.revolut.retail.feature.airport.security_fast_track.api.model.AsftBusinessHours) r2
            if (r2 == 0) goto L34
            java.util.ArrayList r1 = r2.f98709b
            goto L35
        L34:
            r1 = r0
        L35:
            java.time.LocalDateTime r7 = r6.g(r7, r8, r10)
            if (r7 == 0) goto L41
            java.time.LocalDate r8 = r7.toLocalDate()
            if (r8 != 0) goto L45
        L41:
            java.time.LocalDate r8 = yui.a.a(r10)
        L45:
            boolean r8 = r9.isAfter(r8)
            if (r8 == 0) goto L4c
            return r1
        L4c:
            java.time.LocalDate r8 = yui.a.a(r10)
            if (r7 == 0) goto L58
            java.time.LocalTime r7 = r7.toLocalTime()
            if (r7 != 0) goto L5a
        L58:
            java.time.LocalTime r7 = java.time.LocalTime.MIN
        L5a:
            if (r1 == 0) goto La6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot r3 = (com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot) r3
            java.lang.String r3 = r3.f98749a
            java.time.LocalTime r3 = java.time.LocalTime.parse(r3)
            boolean r4 = r9.equals(r8)
            if (r4 == 0) goto L99
            java.lang.String r4 = "timeZone"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r4)
            java.time.ZoneId r4 = r10.toZoneId()
            java.time.LocalTime r4 = java.time.LocalTime.now(r4)
            java.lang.String r5 = "now(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            boolean r4 = r3.isAfter(r4)
            if (r4 == 0) goto L97
            goto L99
        L97:
            r4 = 0
            goto L9a
        L99:
            r4 = 1
        L9a:
            boolean r3 = r3.isAfter(r7)
            if (r3 == 0) goto L65
            if (r4 == 0) goto L65
            r0.add(r2)
            goto L65
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.n.f(java.util.List, java.lang.Integer, java.time.LocalDate, java.util.TimeZone):java.util.List");
    }

    public LocalDateTime g(List list, Integer num, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(timeZone, "airportTimeZone");
        Set setI = i(list);
        if (setI.size() == yui.b.f317022a.size()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        LocalDateTime localDateTimeNow = LocalDateTime.now(timeZone.toZoneId());
        Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "now(...)");
        if (num != null) {
            localDateTimeNow = localDateTimeNow.plusHours(num.intValue());
            Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "plusHours(...)");
        }
        LocalDate localDate = localDateTimeNow.toLocalDate();
        Intrinsics.h(localDate);
        LocalDate localDatePlusDays = localDate;
        while (setI.contains(localDatePlusDays.getDayOfWeek())) {
            localDatePlusDays = localDatePlusDays.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        }
        return LocalDateTime.of(localDatePlusDays, localDatePlusDays.equals(localDate) ? localDateTimeNow.toLocalTime() : LocalTime.MIN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList j(List list) {
        Image layeredImage;
        List<DeliveryCarrier> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (DeliveryCarrier deliveryCarrier : list2) {
            Intrinsics.checkNotNullParameter(deliveryCarrier, "deliveryCarrier");
            String str = deliveryCarrier.f84654a;
            TextClause textClause = new TextClause(deliveryCarrier.f84655b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = deliveryCarrier.f84656c;
            Float f = null;
            Object[] objArr = 0;
            if (str2 != null) {
                Integer num = null;
                CustomColors customColors = null;
                gz0.b bVar = null;
                Integer num2 = null;
                Integer num3 = null;
                layeredImage = new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(num, new CircleTransformation(f, (Integer) (objArr == true ? 1 : 0), false, 15), customColors, bVar, num2, num3, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
            } else {
                Float f4 = null;
                layeredImage = new LayeredImage(zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorAccentNeutral_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_delivery_car, Integer.valueOf(R$attr.uikit_colorAccent), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), f4, f4, 14);
            }
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(layeredImage, null, null, false, null, false, 62), textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, deliveryCarrier, null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public gef.a l(lef.a dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        List listA = dto.getTransactions();
        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList.add(oef.a.a((lef.e) it8.next()));
        }
        return new gef.a(arrayList);
    }

    @Override // kfm.p
    public /* synthetic */ boolean test(Object obj2) {
        switch (this.f214266a) {
            case 1:
                return ((Boolean) nje.j.f216465a.invoke(obj2)).booleanValue();
            case 2:
                return ((Boolean) nz7.m.f220983a.invoke(obj2)).booleanValue();
            default:
                return ((Boolean) w48.f.f294525a.invoke(obj2)).booleanValue();
        }
    }

    @Override // com.youTransactor.uCube.log.ILogger
    public void w(String str, String str2) {
        LoggerFactory.getLogger(str).warn(str2);
    }

    public n(oef.a recogniserTransactionMapper) {
        this.f214266a = 3;
        Intrinsics.checkNotNullParameter(recogniserTransactionMapper, "recogniserTransactionMapper");
    }

    @Override // nd.q
    public Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    public n(p2b.i cfdRiskWarningInteractor, aoh.a productProvider, x8h.m etpProductAvailabilityInteractor, vmh.p tradeScreenFilterProductComparator) {
        this.f214266a = 16;
        Intrinsics.checkNotNullParameter(cfdRiskWarningInteractor, "cfdRiskWarningInteractor");
        Intrinsics.checkNotNullParameter(productProvider, "productProvider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tradeScreenFilterProductComparator, "tradeScreenFilterProductComparator");
    }

    public n(gte.a featureToggleInteractor) {
        this.f214266a = 5;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
    }

    public n(f1 headerDtoMapper, nx4.r actionFooterDtoMapper) {
        this.f214266a = 7;
        Intrinsics.checkNotNullParameter(headerDtoMapper, "headerDtoMapper");
        Intrinsics.checkNotNullParameter(actionFooterDtoMapper, "actionFooterDtoMapper");
    }

    public n(qbc.a itemMapper) {
        this.f214266a = 6;
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
    }

    public n(sm3.b tabsMapper, sm3.a simpleListItemMapper) {
        this.f214266a = 14;
        Intrinsics.checkNotNullParameter(tabsMapper, "tabsMapper");
        Intrinsics.checkNotNullParameter(simpleListItemMapper, "simpleListItemMapper");
    }

    public n(gte.a featureToggleInteractor, jla.h productCatalogueInteractor) {
        this.f214266a = 10;
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
    }

    public n(yui.a dateProvider) {
        this.f214266a = 22;
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public n(y transactionResultProcessingDelegate, t0 transferExtension, w0 transferResultExtension, ks0.n scheduleResultProcessingDelegate, kbb.c peerToPeerSubmissionExtraDataProvider) {
        this.f214266a = 13;
        Intrinsics.checkNotNullParameter(transactionResultProcessingDelegate, "transactionResultProcessingDelegate");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(scheduleResultProcessingDelegate, "scheduleResultProcessingDelegate");
        Intrinsics.checkNotNullParameter(peerToPeerSubmissionExtraDataProvider, "peerToPeerSubmissionExtraDataProvider");
    }

    public n(wt5.a cryptoInvestmentsCalculations) {
        this.f214266a = 15;
        Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
    }

    public n(slm.y block) {
        this.f214266a = 21;
        Intrinsics.checkNotNullParameter(block, "block");
    }

    public n(sph.j itemMapper) {
        this.f214266a = 12;
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
    }

    public n(zph.m clauseMapper) {
        this.f214266a = 23;
        Intrinsics.checkNotNullParameter(clauseMapper, "clauseMapper");
    }
}
