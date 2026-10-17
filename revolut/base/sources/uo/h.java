package uo;

import android.os.Build;
import android.os.Parcelable;
import com.google.protobuf.k3;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsMetadata;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.grpc.SignMessageException;
import com.revolut.tracking.v3.AnalyticEvent;
import com.revolut.tracking.v3.App;
import com.revolut.tracking.v3.MobileDevice;
import com.revolut.tracking.v3.Ownership;
import com.revolut.tracking.v3.ScreenMetadata;
import com.revolut.tracking.v3.SearchQueryContext;
import com.revolut.tracking.v3.UiInteraction;
import com.revolut.tracking.v3.UserInfo;
import com.revolut.tracking.v3.WidgetDescription;
import d9.e1;
import grl.a7;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.y6;
import ho.n;
import java.time.OffsetDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f281475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f281476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm0.d f281477c;
    public final qd0.b d;
    public final rm0.b0 e;
    public final no.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f281478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final df0.b f281479h;
    public final i90.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i70.a f281480j;
    public volatile String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile UserInfo.a f281481l;

    public h(k advertisingInfoProvider, c commonPropertiesProvider, l80.e dateProvider, dm0.d deviceIdProvider, qd0.b languageProvider, rm0.b0 mainThreadChecker, no.n productType, s sessionIdProvider, df0.b syncedDateProvider, i90.b uuidGenerator, i70.a vendorIdProvider) {
        Intrinsics.checkNotNullParameter(advertisingInfoProvider, "advertisingInfoProvider");
        Intrinsics.checkNotNullParameter(commonPropertiesProvider, "commonPropertiesProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(mainThreadChecker, "mainThreadChecker");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(vendorIdProvider, "vendorIdProvider");
        this.f281475a = advertisingInfoProvider;
        this.f281476b = commonPropertiesProvider;
        this.f281477c = deviceIdProvider;
        this.d = languageProvider;
        this.e = mainThreadChecker;
        this.f = productType;
        this.f281478g = sessionIdProvider;
        this.f281479h = syncedDateProvider;
        this.i = uuidGenerator;
        this.f281480j = vendorIdProvider;
    }

    public static AnalyticEvent.Action a(grl.s sVar) {
        AnalyticEvent.Action.a aVarNewBuilder = AnalyticEvent.Action.newBuilder();
        aVarNewBuilder.c();
        ((AnalyticEvent.Action) aVarNewBuilder.f49761b).setStatic(sVar);
        return (AnalyticEvent.Action) aVarNewBuilder.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnalyticEvent b(AnalyticEvent.a aVar, n.a aVar2, AnalyticEvent.Action action, String str, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, String str2, Integer num, Integer num2, WidgetDescription widgetDescription, String str3) {
        AnalyticsMetadata analyticsMetadataA;
        com.google.protobuf.w0 w0Var;
        com.google.protobuf.w0 w0Var2;
        if (str != null) {
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setScreen(str);
        }
        if (str2 != null) {
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setSection(str2);
        }
        if (num != null) {
            int iIntValue = num.intValue();
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setSectionPosition(iIntValue);
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setItemPosition(iIntValue2);
        }
        if (widgetDescription != null) {
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setWidget(widgetDescription);
        }
        if (str3 != null) {
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setPath(str3);
        }
        aVar.c();
        ((AnalyticEvent) aVar.f49761b).setAction(action);
        if (analyticsContext != null && (w0Var2 = analyticsContext.f50296a) != null) {
            com.google.protobuf.g gVarK = e1.K(w0Var2);
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setAnyContext(gVarK);
        }
        AnalyticEvent.Product.a aVarNewBuilder = AnalyticEvent.Product.newBuilder();
        boolean z = analyticsProduct instanceof AnalyticsProduct.Business;
        no.n productType = this.f;
        if (z) {
            grl.x0 x0Var = ((AnalyticsProduct.Business) analyticsProduct).f50298a;
            Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
            Intrinsics.checkNotNullParameter(productType, "productType");
            if (new AnalyticsProduct.Business(x0Var).v3(productType)) {
                x0Var = grl.x0.Business;
            }
            aVarNewBuilder.c();
            ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setBusiness(x0Var);
        } else if (analyticsProduct instanceof AnalyticsProduct.Retail) {
            k9 k9Var = ((AnalyticsProduct.Retail) analyticsProduct).f50300a;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(productType, "productType");
            if (new AnalyticsProduct.Retail(k9Var).v3(productType)) {
                k9Var = k9.Retail;
            }
            aVarNewBuilder.c();
            ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setRetail(k9Var);
        } else if (analyticsProduct instanceof AnalyticsProduct.Junior) {
            q6 q6Var = ((AnalyticsProduct.Junior) analyticsProduct).f50299a;
            Parcelable.Creator<AnalyticsProduct.Junior> creator3 = AnalyticsProduct.Junior.CREATOR;
            Intrinsics.checkNotNullParameter(productType, "productType");
            if (new AnalyticsProduct.Junior(q6Var).v3(productType)) {
                q6Var = q6.Junior;
            }
            aVarNewBuilder.c();
            ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setJunior(q6Var);
        } else if (analyticsProduct instanceof AnalyticsProduct.RevolutX) {
            w2 w2Var = ((AnalyticsProduct.RevolutX) analyticsProduct).f50301a;
            Parcelable.Creator<AnalyticsProduct.RevolutX> creator4 = AnalyticsProduct.RevolutX.CREATOR;
            Intrinsics.checkNotNullParameter(productType, "productType");
            if (new AnalyticsProduct.RevolutX(w2Var).v3(productType)) {
                w2Var = w2.RevolutX;
            }
            aVarNewBuilder.c();
            ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setCryptoExchange(w2Var);
        } else if (analyticsProduct instanceof AnalyticsProduct.Terminal) {
            od odVar = ((AnalyticsProduct.Terminal) analyticsProduct).f50305a;
            Parcelable.Creator<AnalyticsProduct.Terminal> creator5 = AnalyticsProduct.Terminal.CREATOR;
            Intrinsics.checkNotNullParameter(productType, "productType");
            if (new AnalyticsProduct.Terminal(odVar).v3(productType)) {
                odVar = od.Terminal;
            }
            aVarNewBuilder.c();
            ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setTerminal(odVar);
        } else {
            if (!(analyticsProduct instanceof AnalyticsProduct.Shared)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = g.f281474a[productType.ordinal()];
            if (i == 1) {
                grl.x0 value = ((AnalyticsProduct.Shared) analyticsProduct).f50303b;
                Intrinsics.checkNotNullParameter(value, "value");
                Parcelable.Creator<AnalyticsProduct.Business> creator6 = AnalyticsProduct.Business.CREATOR;
                Intrinsics.checkNotNullParameter(productType, "productType");
                if (new AnalyticsProduct.Business(value).v3(productType)) {
                    value = grl.x0.Business;
                }
                aVarNewBuilder.c();
                ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setBusiness(value);
            } else if (i == 2) {
                k9 value2 = ((AnalyticsProduct.Shared) analyticsProduct).f50302a;
                Intrinsics.checkNotNullParameter(value2, "value");
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(productType, "productType");
                if (new AnalyticsProduct.Retail(value2).v3(productType)) {
                    value2 = k9.Retail;
                }
                aVarNewBuilder.c();
                ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setRetail(value2);
            } else if (i == 3) {
                q6 value3 = ((AnalyticsProduct.Shared) analyticsProduct).f50304c;
                Intrinsics.checkNotNullParameter(value3, "value");
                Parcelable.Creator<AnalyticsProduct.Junior> creator8 = AnalyticsProduct.Junior.CREATOR;
                Intrinsics.checkNotNullParameter(productType, "productType");
                if (new AnalyticsProduct.Junior(value3).v3(productType)) {
                    value3 = q6.Junior;
                }
                aVarNewBuilder.c();
                ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setJunior(value3);
            } else if (i == 4) {
                w2 value4 = ((AnalyticsProduct.Shared) analyticsProduct).d;
                Intrinsics.checkNotNullParameter(value4, "value");
                Parcelable.Creator<AnalyticsProduct.RevolutX> creator9 = AnalyticsProduct.RevolutX.CREATOR;
                Intrinsics.checkNotNullParameter(productType, "productType");
                if (new AnalyticsProduct.RevolutX(value4).v3(productType)) {
                    value4 = w2.RevolutX;
                }
                aVarNewBuilder.c();
                ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setCryptoExchange(value4);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                od value5 = ((AnalyticsProduct.Shared) analyticsProduct).e;
                Intrinsics.checkNotNullParameter(value5, "value");
                Parcelable.Creator<AnalyticsProduct.Terminal> creator10 = AnalyticsProduct.Terminal.CREATOR;
                Intrinsics.checkNotNullParameter(productType, "productType");
                if (new AnalyticsProduct.Terminal(value5).v3(productType)) {
                    value5 = od.Terminal;
                }
                aVarNewBuilder.c();
                ((AnalyticEvent.Product) aVarNewBuilder.f49761b).setTerminal(value5);
            }
        }
        AnalyticEvent.Product product = (AnalyticEvent.Product) aVarNewBuilder.a();
        aVar.c();
        ((AnalyticEvent) aVar.f49761b).setProduct(product);
        AnalyticEvent.Metadata metadata = null;
        ho.f0 f0Var = aVar2 instanceof ho.f0 ? (ho.f0) aVar2 : null;
        if (f0Var != null && (analyticsMetadataA = f0Var.a()) != null && (w0Var = analyticsMetadataA.f50297a) != null) {
            AnalyticEvent.Metadata.a aVarNewBuilder2 = AnalyticEvent.Metadata.newBuilder();
            if (w0Var instanceof ScreenMetadata) {
                aVarNewBuilder2.c();
                ((AnalyticEvent.Metadata) aVarNewBuilder2.f49761b).setScreenMetadata((ScreenMetadata) w0Var);
            } else if (w0Var instanceof UiInteraction) {
                aVarNewBuilder2.c();
                ((AnalyticEvent.Metadata) aVarNewBuilder2.f49761b).setUiInteraction((UiInteraction) w0Var);
            }
            metadata = (AnalyticEvent.Metadata) aVarNewBuilder2.a();
        }
        if (metadata != null) {
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setMetadata(metadata);
        }
        mo.e eVarB = aVar2.b();
        if (eVarB != null) {
            int iC = eVarB.c();
            Ownership.a aVarNewBuilder3 = Ownership.newBuilder();
            aVarNewBuilder3.h(iC);
            Ownership ownership = (Ownership) aVarNewBuilder3.a();
            aVar.c();
            ((AnalyticEvent) aVar.f49761b).setOwnership(ownership);
        }
        com.google.protobuf.w0 w0VarA = aVar.a();
        AnalyticEvent analyticEvent = (AnalyticEvent) w0VarA;
        if (!analyticEvent.hasId() || !analyticEvent.hasSessionId() || !analyticEvent.getApp().hasId() || !analyticEvent.getApp().hasVersion() || !analyticEvent.getDevice().getMobile().hasInstallationId()) {
            throw SignMessageException.f50327a;
        }
        Intrinsics.checkNotNullExpressionValue(w0VarA, "also(...)");
        return analyticEvent;
    }

    public final AnalyticEvent c(n.a event) {
        AnalyticsContext analyticsContext;
        Intrinsics.checkNotNullParameter(event, "event");
        this.e.a(new ru0.d(6));
        if (event instanceof ho.i) {
            ho.i iVar = (ho.i) event;
            return b(d(), event, a(grl.s.view), iVar.f154167a, iVar.f154168b, iVar.f154169c, null, null, null, null, null);
        }
        if (event instanceof ho.h) {
            ho.h hVar = (ho.h) event;
            return b(d(), event, a(grl.s.disappear), hVar.f154164a, hVar.f154165b, hVar.f154166c, null, null, null, null, null);
        }
        if (event instanceof ho.j) {
            ho.j jVar = (ho.j) event;
            return b(d(), event, a(grl.s.screenshot), jVar.f154171a, jVar.f154172b, jVar.f154173c, null, null, null, null, null);
        }
        if (event instanceof ho.a) {
            AnalyticEvent.a aVarD = d();
            ho.a aVar = (ho.a) event;
            String str = aVar.f154134a;
            AnalyticEvent.Action.a aVarNewBuilder = AnalyticEvent.Action.newBuilder();
            aVarNewBuilder.c();
            ((AnalyticEvent.Action) aVarNewBuilder.f49761b).setDynamic(str);
            return b(aVarD, event, (AnalyticEvent.Action) aVarNewBuilder.a(), aVar.f154135b, aVar.f, aVar.f154137g, aVar.f154136c, aVar.d, aVar.e, aVar.f154138h, null);
        }
        if (event instanceof ho.k) {
            AnalyticEvent.a aVarD2 = d();
            AnalyticEvent.Action actionA = a(grl.s.search);
            ho.k kVar = (ho.k) event;
            String str2 = kVar.f154177a;
            String str3 = kVar.f154178b;
            AnalyticsProduct analyticsProduct = kVar.f154179c;
            if (str2.length() > 0) {
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                SearchQueryContext.a aVarNewBuilder2 = SearchQueryContext.newBuilder();
                aVarNewBuilder2.h(str2);
                com.google.protobuf.w0 w0VarA = aVarNewBuilder2.a();
                companion.getClass();
                analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            } else {
                analyticsContext = null;
            }
            return b(aVarD2, event, actionA, str3, analyticsProduct, analyticsContext, null, null, null, null, null);
        }
        if (event instanceof ho.l) {
            ho.l lVar = (ho.l) event;
            return b(d(), event, a(grl.s.settings), lVar.f154180a, lVar.f154181b, new AnalyticsContext(lVar.f154182c), null, null, null, null, null);
        }
        if (event instanceof ho.c) {
            ho.c cVar = (ho.c) event;
            return b(d(), event, a(grl.s.diagnostic), cVar.f154147a, cVar.f154148b, new AnalyticsContext(cVar.f154149c), null, null, null, null, null);
        }
        if (event instanceof ho.d) {
            ho.d dVar = (ho.d) event;
            return b(d(), event, a(grl.s.impression), dVar.f(), dVar.e(), new AnalyticsContext(dVar.c()), dVar.h(), dVar.i(), dVar.d(), null, null);
        }
        if (event instanceof ho.m) {
            ho.m mVar = (ho.m) event;
            return b(d(), event, a(grl.s.viewable_record), mVar.f(), mVar.e(), new AnalyticsContext(mVar.c()), mVar.h(), mVar.i(), mVar.d(), mVar.k(), null);
        }
        if (event instanceof ho.e) {
            ho.e eVar = (ho.e) event;
            return b(d(), event, a(grl.s.intent), eVar.f154155a, eVar.f154156b, new AnalyticsContext(eVar.f154157c), null, null, null, null, null);
        }
        if (event instanceof ho.g) {
            ho.g gVar = (ho.g) event;
            return b(d(), event, a(grl.s.notification), gVar.e(), gVar.d(), new AnalyticsContext(gVar.c()), null, null, null, null, null);
        }
        if (event instanceof ho.f) {
            ho.f fVar = (ho.f) event;
            return b(d(), event, a(grl.s.nudge), fVar.f(), fVar.e(), new AnalyticsContext(fVar.d()), null, null, null, null, null);
        }
        if (!(event instanceof ho.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ho.b bVar = (ho.b) event;
        return b(d(), event, a(grl.s.deeplink), bVar.f(), bVar.e(), new AnalyticsContext(bVar.c()), null, null, null, null, bVar.d());
    }

    public final AnalyticEvent.a d() {
        dm0.b bVarB = this.f281477c.b();
        MobileDevice.a aVarNewBuilder = MobileDevice.newBuilder();
        y6 y6Var = ((Boolean) ((e) this.f281476b).f281472b.getValue()).booleanValue() ? y6.Tablet : y6.Mobile;
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setCategory(y6Var);
        a7 a7Var = a7.Android;
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setOperatingSystem(a7Var);
        String str = Build.VERSION.RELEASE;
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setOperatingSystemVersion(Build.VERSION.RELEASE);
        String str2 = Build.BRAND;
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setMobileBrandName(Build.BRAND);
        String str3 = Build.PRODUCT;
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setMobileModelName(Build.PRODUCT);
        String str4 = Build.MODEL;
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setMobileOsHardwareModel(Build.MODEL);
        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        Intrinsics.h(offsetDateTimeNow);
        int totalSeconds = offsetDateTimeNow.getOffset().getTotalSeconds();
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setTimeZoneOffsetSeconds(totalSeconds);
        String string = ((s80.b) this.d).a().toString();
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setLocale(string);
        tg0.a aVar = (tg0.a) this.f281475a.f281486b.getValue();
        String id10 = aVar != null ? ((nh0.c) aVar).f215267a.getId() : null;
        if (id10 != null) {
            aVarNewBuilder.c();
            ((MobileDevice) aVarNewBuilder.f49761b).setAdvertisingId(id10);
        }
        tg0.a aVar2 = (tg0.a) this.f281475a.f281486b.getValue();
        Boolean boolValueOf = aVar2 != null ? Boolean.valueOf(((nh0.c) aVar2).f215267a.isLimitAdTrackingEnabled()) : null;
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            aVarNewBuilder.c();
            ((MobileDevice) aVarNewBuilder.f49761b).setIsLimitedAdTracking(zBooleanValue);
        }
        String str5 = bVarB.f115814c;
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setInstallationId(str5);
        String str6 = bVarB.d;
        if (str6 != null) {
            aVarNewBuilder.c();
            ((MobileDevice) aVarNewBuilder.f49761b).setHardwareId(str6);
        }
        String strA = this.f281480j.a();
        aVarNewBuilder.c();
        ((MobileDevice) aVarNewBuilder.f49761b).setVendorId(strA);
        MobileDevice mobileDevice = (MobileDevice) aVarNewBuilder.a();
        AnalyticEvent.Device.a aVarNewBuilder2 = AnalyticEvent.Device.newBuilder();
        aVarNewBuilder2.c();
        ((AnalyticEvent.Device) aVarNewBuilder2.f49761b).setMobile(mobileDevice);
        AnalyticEvent.Device device = (AnalyticEvent.Device) aVarNewBuilder2.a();
        long epochMilli = this.f281479h.a().toEpochMilli();
        AnalyticEvent.a aVarNewBuilder3 = AnalyticEvent.newBuilder();
        String string2 = this.i.a().toString();
        aVarNewBuilder3.c();
        ((AnalyticEvent) aVarNewBuilder3.f49761b).setId(string2);
        String str7 = this.k;
        if (str7 != null) {
            aVarNewBuilder3.c();
            ((AnalyticEvent) aVarNewBuilder3.f49761b).setUserId(str7);
        }
        UserInfo.a aVar3 = this.f281481l;
        if (aVar3 != null) {
            aVarNewBuilder3.c();
            ((AnalyticEvent) aVarNewBuilder3.f49761b).setUserInfo((UserInfo) aVar3.a());
        }
        String strA2 = this.f281478g.a();
        aVarNewBuilder3.c();
        ((AnalyticEvent) aVarNewBuilder3.f49761b).setSessionId(strA2);
        k3 k3VarA = ho.k0.a(epochMilli);
        aVarNewBuilder3.c();
        ((AnalyticEvent) aVarNewBuilder3.f49761b).setClientTimestamp(k3VarA);
        Object value = ((e) this.f281476b).f281473c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        aVarNewBuilder3.c();
        ((AnalyticEvent) aVarNewBuilder3.f49761b).setApp((App) value);
        aVarNewBuilder3.c();
        ((AnalyticEvent) aVarNewBuilder3.f49761b).setDevice(device);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder3, "apply(...)");
        return aVarNewBuilder3;
    }
}
