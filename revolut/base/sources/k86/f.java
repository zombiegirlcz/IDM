package k86;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.devicemanagement.api.model.ConnectedApp;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.api.model.UserDeviceAddress;
import com.revolut.feature.devicemanagement.impl.data.service.DeviceManagementService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ufm.i;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a {

    @NotNull
    public static final d Companion = new d();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceManagementService f182093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f182094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f182095c;
    public final w4l.f d;

    static {
        Type type = new TypeToken<List<? extends q86.c>>() { // from class: com.revolut.feature.devicemanagement.impl.data.repository.DeviceManagementRepositoryImpl$Companion$type$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public f(b80.c connectivityRepository, DeviceManagementService service, j86.a mapper, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f182093a = service;
        this.f182094b = memoryCache;
        this.f182095c = storage;
        final int i = 0;
        uj0.b bVarK0 = w.k0(connectivityRepository, new Function1(this) { // from class: k86.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f182089b;

            {
                this.f182089b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f182089b;
                        d0<List<p86.c>> userDevices = fVar.f182093a.getUserDevices(params.f182092a);
                        k64.a aVar = new k64.a(9, new k7c.d(fVar, 10));
                        userDevices.getClass();
                        i iVar = new i(userDevices, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return ue0.e.t(iVar, h0.f322473a);
                    case 1:
                        e params2 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f182089b.f182094b.get(params2.a());
                    default:
                        e params3 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List list = (List) this.f182089b.f182095c.T2(params3.a(), f.e);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        int i2 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            q86.c device = (q86.c) it8.next();
                            Intrinsics.checkNotNullParameter(device, "device");
                            String id10 = device.getId();
                            h86.a aVar2 = (h86.a) u1.v(device.getBrand(), j86.a.f172130c);
                            if (aVar2 == null) {
                                aVar2 = h86.a.UNKNOWN;
                            }
                            h86.a aVar3 = aVar2;
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
                            String model = device.getModel();
                            String browserModel = device.getBrowserModel();
                            String appVersion = device.getAppVersion();
                            String lastIpAddress = device.getLastIpAddress();
                            String locale = device.getLocale();
                            String systemVersion = device.getSystemVersion();
                            String timeZoneId = device.getTimeZoneId();
                            boolean trusted = device.getTrusted();
                            boolean isCurrent = device.getIsCurrent();
                            String osVersion = device.getOsVersion();
                            long j2 = Long.parseLong(device.getLastUsed());
                            long j3 = Long.parseLong(device.getCreatedAt());
                            q86.b address = device.getAddress();
                            Intrinsics.checkNotNullParameter(address, "address");
                            UserDeviceAddress userDeviceAddress = new UserDeviceAddress(address.getLat(), address.getLon(), address.getPostcode(), address.getCountry(), address.getRegion(), address.getCity());
                            boolean primary = device.getPrimary();
                            List<q86.a> apps = device.getApps();
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(apps, i2));
                            for (q86.a aVar4 : apps) {
                                arrayList2.add(new ConnectedApp(aVar4.getName(), aVar4.getIconUrl()));
                                it8 = it8;
                            }
                            arrayList.add(new UserDevice(id10, aVar3, cVar2, bVar2, model, browserModel, appVersion, lastIpAddress, locale, systemVersion, timeZoneId, trusted, isCurrent, osVersion, j2, j3, userDeviceAddress, primary, arrayList2));
                            i2 = 10;
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: k86.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f182089b;

            {
                this.f182089b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f182089b;
                        d0<List<p86.c>> userDevices = fVar.f182093a.getUserDevices(params.f182092a);
                        k64.a aVar = new k64.a(9, new k7c.d(fVar, 10));
                        userDevices.getClass();
                        i iVar = new i(userDevices, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return ue0.e.t(iVar, h0.f322473a);
                    case 1:
                        e params2 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f182089b.f182094b.get(params2.a());
                    default:
                        e params3 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List list = (List) this.f182089b.f182095c.T2(params3.a(), f.e);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        int i22 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            q86.c device = (q86.c) it8.next();
                            Intrinsics.checkNotNullParameter(device, "device");
                            String id10 = device.getId();
                            h86.a aVar2 = (h86.a) u1.v(device.getBrand(), j86.a.f172130c);
                            if (aVar2 == null) {
                                aVar2 = h86.a.UNKNOWN;
                            }
                            h86.a aVar3 = aVar2;
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
                            String model = device.getModel();
                            String browserModel = device.getBrowserModel();
                            String appVersion = device.getAppVersion();
                            String lastIpAddress = device.getLastIpAddress();
                            String locale = device.getLocale();
                            String systemVersion = device.getSystemVersion();
                            String timeZoneId = device.getTimeZoneId();
                            boolean trusted = device.getTrusted();
                            boolean isCurrent = device.getIsCurrent();
                            String osVersion = device.getOsVersion();
                            long j2 = Long.parseLong(device.getLastUsed());
                            long j3 = Long.parseLong(device.getCreatedAt());
                            q86.b address = device.getAddress();
                            Intrinsics.checkNotNullParameter(address, "address");
                            UserDeviceAddress userDeviceAddress = new UserDeviceAddress(address.getLat(), address.getLon(), address.getPostcode(), address.getCountry(), address.getRegion(), address.getCity());
                            boolean primary = device.getPrimary();
                            List<q86.a> apps = device.getApps();
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(apps, i22));
                            for (q86.a aVar4 : apps) {
                                arrayList2.add(new ConnectedApp(aVar4.getName(), aVar4.getIconUrl()));
                                it8 = it8;
                            }
                            arrayList.add(new UserDevice(id10, aVar3, cVar2, bVar2, model, browserModel, appVersion, lastIpAddress, locale, systemVersion, timeZoneId, trusted, isCurrent, osVersion, j2, j3, userDeviceAddress, primary, arrayList2));
                            i22 = 10;
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: k86.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f182091b;

            {
                this.f182091b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        e params = (e) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f182091b.f182094b.f(params.a(), data);
                        break;
                    default:
                        e params2 = (e) obj2;
                        List devices = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(devices, "devices");
                        ue0.c cVar = this.f182091b.f182095c;
                        String strA = params2.a();
                        List list = devices;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            UserDevice userDevice = (UserDevice) it8.next();
                            Intrinsics.checkNotNullParameter(userDevice, "userDevice");
                            String str = userDevice.f71914a;
                            String strA2 = userDevice.f71915b.a();
                            String strName = userDevice.f71916c.name();
                            String strName2 = userDevice.d.name();
                            String str2 = userDevice.e;
                            String str3 = userDevice.f;
                            String str4 = userDevice.f71917g;
                            String str5 = userDevice.f71918h;
                            String str6 = userDevice.i;
                            String str7 = userDevice.f71919j;
                            Iterator it9 = it8;
                            String str8 = userDevice.k;
                            boolean z = userDevice.f71920l;
                            boolean z3 = userDevice.f71921m;
                            String str9 = userDevice.f71922n;
                            String strValueOf = String.valueOf(userDevice.o);
                            String strValueOf2 = String.valueOf(userDevice.f71923p);
                            UserDeviceAddress address = userDevice.f71924q;
                            Intrinsics.checkNotNullParameter(address, "address");
                            q86.b bVar = new q86.b(address.e, address.f, address.f71928a, address.f71929b, address.f71930c, address.d);
                            boolean z4 = userDevice.f71925r;
                            List<ConnectedApp> list2 = userDevice.f71926s;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (ConnectedApp connectedApp : list2) {
                                arrayList2.add(new q86.a(connectedApp.f71912a, connectedApp.f71913b));
                                z4 = z4;
                            }
                            arrayList.add(new q86.c(str, strA2, strName, strName2, str2, str3, str4, str5, str6, str7, str8, z, z3, str9, strValueOf, strValueOf2, bVar, z4, arrayList2));
                            it8 = it9;
                        }
                        cVar.G(arrayList, strA, kii.e.o(q86.c.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: k86.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f182089b;

            {
                this.f182089b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f182089b;
                        d0<List<p86.c>> userDevices = fVar.f182093a.getUserDevices(params.f182092a);
                        k64.a aVar = new k64.a(9, new k7c.d(fVar, 10));
                        userDevices.getClass();
                        i iVar = new i(userDevices, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return ue0.e.t(iVar, h0.f322473a);
                    case 1:
                        e params2 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f182089b.f182094b.get(params2.a());
                    default:
                        e params3 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List list = (List) this.f182089b.f182095c.T2(params3.a(), f.e);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        int i22 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            q86.c device = (q86.c) it8.next();
                            Intrinsics.checkNotNullParameter(device, "device");
                            String id10 = device.getId();
                            h86.a aVar2 = (h86.a) u1.v(device.getBrand(), j86.a.f172130c);
                            if (aVar2 == null) {
                                aVar2 = h86.a.UNKNOWN;
                            }
                            h86.a aVar3 = aVar2;
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
                            String model = device.getModel();
                            String browserModel = device.getBrowserModel();
                            String appVersion = device.getAppVersion();
                            String lastIpAddress = device.getLastIpAddress();
                            String locale = device.getLocale();
                            String systemVersion = device.getSystemVersion();
                            String timeZoneId = device.getTimeZoneId();
                            boolean trusted = device.getTrusted();
                            boolean isCurrent = device.getIsCurrent();
                            String osVersion = device.getOsVersion();
                            long j2 = Long.parseLong(device.getLastUsed());
                            long j3 = Long.parseLong(device.getCreatedAt());
                            q86.b address = device.getAddress();
                            Intrinsics.checkNotNullParameter(address, "address");
                            UserDeviceAddress userDeviceAddress = new UserDeviceAddress(address.getLat(), address.getLon(), address.getPostcode(), address.getCountry(), address.getRegion(), address.getCity());
                            boolean primary = device.getPrimary();
                            List<q86.a> apps = device.getApps();
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(apps, i22));
                            for (q86.a aVar4 : apps) {
                                arrayList2.add(new ConnectedApp(aVar4.getName(), aVar4.getIconUrl()));
                                it8 = it8;
                            }
                            arrayList.add(new UserDevice(id10, aVar3, cVar2, bVar2, model, browserModel, appVersion, lastIpAddress, locale, systemVersion, timeZoneId, trusted, isCurrent, osVersion, j2, j3, userDeviceAddress, primary, arrayList2));
                            i22 = 10;
                        }
                        return arrayList;
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: k86.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f182091b;

            {
                this.f182091b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        e params = (e) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f182091b.f182094b.f(params.a(), data);
                        break;
                    default:
                        e params2 = (e) obj2;
                        List devices = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(devices, "devices");
                        ue0.c cVar = this.f182091b.f182095c;
                        String strA = params2.a();
                        List list = devices;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            UserDevice userDevice = (UserDevice) it8.next();
                            Intrinsics.checkNotNullParameter(userDevice, "userDevice");
                            String str = userDevice.f71914a;
                            String strA2 = userDevice.f71915b.a();
                            String strName = userDevice.f71916c.name();
                            String strName2 = userDevice.d.name();
                            String str2 = userDevice.e;
                            String str3 = userDevice.f;
                            String str4 = userDevice.f71917g;
                            String str5 = userDevice.f71918h;
                            String str6 = userDevice.i;
                            String str7 = userDevice.f71919j;
                            Iterator it9 = it8;
                            String str8 = userDevice.k;
                            boolean z = userDevice.f71920l;
                            boolean z3 = userDevice.f71921m;
                            String str9 = userDevice.f71922n;
                            String strValueOf = String.valueOf(userDevice.o);
                            String strValueOf2 = String.valueOf(userDevice.f71923p);
                            UserDeviceAddress address = userDevice.f71924q;
                            Intrinsics.checkNotNullParameter(address, "address");
                            q86.b bVar = new q86.b(address.e, address.f, address.f71928a, address.f71929b, address.f71930c, address.d);
                            boolean z4 = userDevice.f71925r;
                            List<ConnectedApp> list2 = userDevice.f71926s;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (ConnectedApp connectedApp : list2) {
                                arrayList2.add(new q86.a(connectedApp.f71912a, connectedApp.f71913b));
                                z4 = z4;
                            }
                            arrayList.add(new q86.c(str, strA2, strName, strName2, str2, str3, str4, str5, str6, str7, str8, z, z3, str9, strValueOf, strValueOf2, bVar, z4, arrayList2));
                            it8 = it9;
                        }
                        cVar.G(arrayList, strA, kii.e.o(q86.c.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
