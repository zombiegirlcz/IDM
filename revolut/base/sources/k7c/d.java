package k7c;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.devicemanagement.api.model.ConnectedApp;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.api.model.UserDeviceAddress;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181949a;

    public /* synthetic */ d(int i) {
        this.f181949a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        UserDeviceAddress userDeviceAddress;
        ?? arrayList;
        switch (this.f181949a) {
            case 0:
                e7c.f it8 = (e7c.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.getCanDebit());
            case 1:
                e7c.g it9 = (e7c.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return d7c.c.e(it9);
            case 2:
                e7c.h it10 = (e7c.h) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return d7c.c.d(it10.getDeferredPayments());
            case 3:
                e7c.h it11 = (e7c.h) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return d7c.c.d(it11.getDeferredPayments());
            case 4:
                Intrinsics.checkNotNullParameter((u6c.n) obj2, "it");
                return Boolean.TRUE;
            case 5:
                return Boolean.TRUE;
            case 6:
                Intrinsics.checkNotNullParameter((i0) obj2, "it");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((t0) obj2, "it");
                return null;
            case 8:
                List incomeSorters = (List) obj2;
                Intrinsics.checkNotNullParameter(incomeSorters, "incomeSorters");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : incomeSorters) {
                    if (((IncomeSorter) obj3).d == hzi.b.ACTIVE) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                Iterator it12 = arrayList2.iterator();
                while (it12.hasNext()) {
                    arrayList3.add(((IncomeSorter) it12.next()).f99162c);
                }
                return arrayList3;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 10:
                List devices = (List) obj2;
                Intrinsics.checkNotNullParameter(devices, "devices");
                List<p86.c> list = devices;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                for (p86.c device : list) {
                    Intrinsics.checkNotNullParameter(device, "device");
                    String strG = device.getId();
                    h86.a aVar = (h86.a) u1.v(device.getBrand(), j86.a.f172130c);
                    if (aVar == null) {
                        aVar = h86.a.UNKNOWN;
                    }
                    h86.a aVar2 = aVar;
                    h86.c cVar = (h86.c) u1.v(device.getType(), j86.a.f172128a);
                    if (cVar == null) {
                        cVar = h86.c.MOBILE_APP;
                    }
                    h86.c cVar2 = cVar;
                    h86.b bVar = (h86.b) u1.v(device.getOs(), j86.a.f172129b);
                    if (bVar == null) {
                        bVar = h86.b.UNKNOWN;
                    }
                    h86.b bVar2 = bVar;
                    String strK = device.getModel();
                    String str = strK == null ? "" : strK;
                    String strE = device.getBrowserModel();
                    String str2 = strE == null ? "" : strE;
                    String strB = device.getAppVersion();
                    String str3 = strB == null ? "" : strB;
                    String strH = device.getLastIpAddress();
                    String strJ = device.getLocale();
                    String str4 = strJ == null ? "" : strJ;
                    String strO = device.getSystemVersion();
                    String str5 = strO == null ? "" : strO;
                    String strP = device.getTimeZoneId();
                    String str6 = strP == null ? "" : strP;
                    boolean zQ = device.getTrusted();
                    boolean zS = device.getIsCurrent();
                    String strM = device.getOsVersion();
                    String str7 = strM == null ? "" : strM;
                    long jI = device.getLastUsed();
                    long jF = device.getCreatedAt();
                    p86.b address = device.getAddress();
                    if (address != null) {
                        Intrinsics.checkNotNullParameter(address, "address");
                        String postcode = address.getPostcode();
                        String str8 = postcode == null ? "" : postcode;
                        String country = address.getCountry();
                        String str9 = country == null ? "" : country;
                        String region = address.getRegion();
                        String str10 = region == null ? "" : region;
                        String city = address.getCity();
                        String str11 = city == null ? "" : city;
                        Double lat = address.getLat();
                        double dDoubleValue = lat != null ? lat.doubleValue() : 0.0d;
                        Double lon = address.getLon();
                        userDeviceAddress = new UserDeviceAddress(dDoubleValue, lon != null ? lon.doubleValue() : 0.0d, str8, str9, str10, str11);
                    } else {
                        UserDeviceAddress.INSTANCE.getClass();
                        userDeviceAddress = UserDeviceAddress.f71927g;
                    }
                    boolean zN = device.getPrimary();
                    List listC = device.getApps();
                    if (listC != null) {
                        List<p86.a> list2 = listC;
                        arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (p86.a aVar3 : list2) {
                            arrayList.add(new ConnectedApp(aVar3.getName(), aVar3.getIconUrl()));
                        }
                    } else {
                        arrayList = zhm.f0.f322471a;
                    }
                    arrayList4.add(new UserDevice(strG, aVar2, cVar2, bVar2, str, str2, str3, strH, str4, str5, str6, zQ, zS, str7, jI, jF, userDeviceAddress, zN, arrayList));
                }
                return arrayList4;
            case 11:
                iel.t it13 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.f160814a == iel.u.ADD);
            case 12:
                iel.t it14 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.f160814a == iel.u.REMOVE);
            case 13:
                iel.t it15 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.f160814a == iel.u.ADD);
            case 14:
                iel.t it16 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16.f160814a == iel.u.REMOVE);
            case 15:
                iel.t it17 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.f160814a == iel.u.ADD);
            case 16:
                iel.t it18 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.f160814a == iel.u.REMOVE);
            case 17:
                iel.t it19 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.f160814a == iel.u.ADD);
            case 18:
                iel.t it20 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(it20.f160814a == iel.u.REMOVE);
            case 19:
                iel.t it21 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(it21.f160814a == iel.u.ADD);
            case 20:
                iel.t it22 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(it22.f160814a == iel.u.REMOVE);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return m8b.b.f203461a;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 24:
                k8g.k update = (k8g.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return k8g.k.a(update, null, null, null, null, !update.e, false, 47);
            case 25:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(new pb0(a0.d.n("TRANSACTIONS_LOADING_ITEM_ID_", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 26:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayListP2.add(new pb0(a0.d.n("AGENTS_LOADING_ITEM_ID_", i2)));
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                return k8g.u.a(arrayListP2, k8g.u.b());
            case 27:
                k8k.a update2 = (k8k.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String link = update2.f182173a;
                Intrinsics.checkNotNullParameter(link, "link");
                return new k8k.a(null, link, null);
            case 28:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new k9c.h((List) getDefaultLoadingItems.invoke(), null, null, null, null, null);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f181949a = i;
    }
}
