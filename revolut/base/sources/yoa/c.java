package yoa;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.profile.notificationsettings.impl.network.NotificationSettingsService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.List;
import kii.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import ufm.i;
import w4l.f;
import yma.r;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationSettingsService f315641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f315642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f315643c;
    public final Type d;
    public final f e;

    public c(NotificationSettingsService notificationSettingsService, ue0.c notificationSettingsStorage, j memoryCache) {
        Intrinsics.checkNotNullParameter(notificationSettingsService, "notificationSettingsService");
        Intrinsics.checkNotNullParameter(notificationSettingsStorage, "notificationSettingsStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f315641a = notificationSettingsService;
        this.f315642b = notificationSettingsStorage;
        this.f315643c = memoryCache;
        this.d = new TypeToken<List<? extends apa.a>>() { // from class: com.revolut.feature.profile.notificationsettings.impl.repository.NotificationsSettingsRepositoryImpl$notificationSettingsEntityType$1
        }.getType();
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: yoa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f315638b;

            {
                this.f315638b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<xoa.a>> d0VarFetchNotificationSettings = this.f315638b.f315641a.fetchNotificationSettings();
                        r rVar = new r(new yjj.j(27), 22);
                        d0VarFetchNotificationSettings.getClass();
                        i iVar = new i(d0VarFetchNotificationSettings, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List notificationSettingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notificationSettingsList, "notificationSettingsList");
                        this.f315638b.f315643c.f("notification_settings_key", notificationSettingsList);
                        break;
                    default:
                        List notificationSettingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notificationSettingsList2, "notificationSettingsList");
                        this.f315638b.f315642b.G(ifk.b.D(notificationSettingsList2), "notification_settings_key", e.o(apa.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: yoa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f315640b;

            {
                this.f315640b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f315640b.f315643c.get("notification_settings_key");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        c cVar = this.f315640b;
                        ue0.c cVar2 = cVar.f315642b;
                        Type notificationSettingsEntityType = cVar.d;
                        Intrinsics.checkNotNullExpressionValue(notificationSettingsEntityType, "notificationSettingsEntityType");
                        return ifk.b.d((List) cVar2.T2("notification_settings_key", notificationSettingsEntityType));
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: yoa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f315638b;

            {
                this.f315638b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<xoa.a>> d0VarFetchNotificationSettings = this.f315638b.f315641a.fetchNotificationSettings();
                        r rVar = new r(new yjj.j(27), 22);
                        d0VarFetchNotificationSettings.getClass();
                        i iVar = new i(d0VarFetchNotificationSettings, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List notificationSettingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notificationSettingsList, "notificationSettingsList");
                        this.f315638b.f315643c.f("notification_settings_key", notificationSettingsList);
                        break;
                    default:
                        List notificationSettingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notificationSettingsList2, "notificationSettingsList");
                        this.f315638b.f315642b.G(ifk.b.D(notificationSettingsList2), "notification_settings_key", e.o(apa.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: yoa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f315640b;

            {
                this.f315640b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f315640b.f315643c.get("notification_settings_key");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        c cVar = this.f315640b;
                        ue0.c cVar2 = cVar.f315642b;
                        Type notificationSettingsEntityType = cVar.d;
                        Intrinsics.checkNotNullExpressionValue(notificationSettingsEntityType, "notificationSettingsEntityType");
                        return ifk.b.d((List) cVar2.T2("notification_settings_key", notificationSettingsEntityType));
                }
            }
        };
        final int i3 = 2;
        this.e = new f(function2, function1, function22, function12, new Function2(this) { // from class: yoa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f315638b;

            {
                this.f315638b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<xoa.a>> d0VarFetchNotificationSettings = this.f315638b.f315641a.fetchNotificationSettings();
                        r rVar = new r(new yjj.j(27), 22);
                        d0VarFetchNotificationSettings.getClass();
                        i iVar = new i(d0VarFetchNotificationSettings, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List notificationSettingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notificationSettingsList, "notificationSettingsList");
                        this.f315638b.f315643c.f("notification_settings_key", notificationSettingsList);
                        break;
                    default:
                        List notificationSettingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notificationSettingsList2, "notificationSettingsList");
                        this.f315638b.f315642b.G(ifk.b.D(notificationSettingsList2), "notification_settings_key", e.o(apa.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
