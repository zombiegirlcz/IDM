package soi;

import com.revolut.data.network.models.security.SettingDescriptionDto;
import com.revolut.retail.analytics.tracking.impl.privacy.PrivacyService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import sl3.r;
import ufm.i;
import w4l.f;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrivacyService f264847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f264848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f264849c;
    public final f d;

    public e(PrivacyService privacyService, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(privacyService, "privacyService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f264847a = privacyService;
        this.f264848b = memoryCache;
        this.f264849c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: soi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f264844b;

            {
                this.f264844b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<SettingDescriptionDto>> privacySettings = this.f264844b.f264847a.getPrivacySettings();
                        r rVar = new r(new a(0), 24);
                        privacySettings.getClass();
                        i iVar = new i(privacySettings, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f264844b.f264848b.f("ANALYTICS_EVENTS_KEY", bool);
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj3;
                        bool2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f264844b.f264849c, "ANALYTICS_EVENTS_KEY", bool2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: soi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f264846b;

            {
                this.f264846b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Boolean) this.f264846b.f264848b.get("ANALYTICS_EVENTS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f264846b.f264849c;
                        Type type = l21.d.e;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                        return (Boolean) cVar.T2("ANALYTICS_EVENTS_KEY", type);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: soi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f264844b;

            {
                this.f264844b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<SettingDescriptionDto>> privacySettings = this.f264844b.f264847a.getPrivacySettings();
                        r rVar = new r(new a(0), 24);
                        privacySettings.getClass();
                        i iVar = new i(privacySettings, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f264844b.f264848b.f("ANALYTICS_EVENTS_KEY", bool);
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj3;
                        bool2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f264844b.f264849c, "ANALYTICS_EVENTS_KEY", bool2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: soi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f264846b;

            {
                this.f264846b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Boolean) this.f264846b.f264848b.get("ANALYTICS_EVENTS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f264846b.f264849c;
                        Type type = l21.d.e;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                        return (Boolean) cVar.T2("ANALYTICS_EVENTS_KEY", type);
                }
            }
        };
        final int i3 = 2;
        this.d = new f(function2, function1, function22, function12, new Function2(this) { // from class: soi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f264844b;

            {
                this.f264844b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<SettingDescriptionDto>> privacySettings = this.f264844b.f264847a.getPrivacySettings();
                        r rVar = new r(new a(0), 24);
                        privacySettings.getClass();
                        i iVar = new i(privacySettings, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f264844b.f264848b.f("ANALYTICS_EVENTS_KEY", bool);
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj3;
                        bool2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f264844b.f264849c, "ANALYTICS_EVENTS_KEY", bool2);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
