package y21;

import com.revolut.data.network.models.security.SecuritySettingRequestDto;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.data.network.models.security.SettingDescriptionDto;
import com.revolut.data.network.services.UserService;
import efm.d0;
import efm.r;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ne0.d;
import od0.i;
import org.bouncycastle.asn1.BERTags;
import pfm.t;
import te0.w;
import w4l.f;
import w4l.k;
import wim.z;
import xf0.h;
import xy7.j;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserService f310583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f310584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l21.c f310585c;
    public final f d;

    public c(UserService userService, d memoryCache, l21.c storage) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f310583a = userService;
        this.f310584b = memoryCache;
        this.f310585c = storage;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: y21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f310582b;

            {
                this.f310582b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String params = (String) obj2;
                        i enabledOptional = (i) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(enabledOptional, "enabledOptional");
                        Boolean bool = (Boolean) enabledOptional.g();
                        if (bool != null) {
                            this.f310582b.f310585c.G(bool, params, z.d(o0.b(Boolean.TYPE)));
                        }
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String params2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<SettingDescriptionDto>> privacySettings = this.f310582b.f310583a.getPrivacySettings();
                        j jVar = new j(28, new h(params2, 19));
                        privacySettings.getClass();
                        ufm.i iVar = new ufm.i(privacySettings, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String params3 = (String) obj2;
                        i enabledOptional2 = (i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(enabledOptional2, "enabledOptional");
                        Boolean bool2 = (Boolean) enabledOptional2.g();
                        if (bool2 != null) {
                            this.f310582b.f310584b.f(params3, bool2);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: y21.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f310580b;

            {
                this.f310580b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String params = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        l21.c cVar = this.f310580b.f310585c;
                        Type type = l21.d.e;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                        Boolean bool = (Boolean) cVar.T2(params, type);
                        if (bool == null) {
                            return null;
                        }
                        i.Companion.getClass();
                        return od0.h.a(bool);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Boolean bool2 = (Boolean) this.f310580b.f310584b.get(params);
                        if (bool2 == null) {
                            return null;
                        }
                        i.Companion.getClass();
                        return od0.h.a(bool2);
                }
            }
        };
        final int i2 = 2;
        Function2 function22 = new Function2(this) { // from class: y21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f310582b;

            {
                this.f310582b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String params = (String) obj2;
                        i enabledOptional = (i) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(enabledOptional, "enabledOptional");
                        Boolean bool = (Boolean) enabledOptional.g();
                        if (bool != null) {
                            this.f310582b.f310585c.G(bool, params, z.d(o0.b(Boolean.TYPE)));
                        }
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String params2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<SettingDescriptionDto>> privacySettings = this.f310582b.f310583a.getPrivacySettings();
                        j jVar = new j(28, new h(params2, 19));
                        privacySettings.getClass();
                        ufm.i iVar = new ufm.i(privacySettings, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String params3 = (String) obj2;
                        i enabledOptional2 = (i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(enabledOptional2, "enabledOptional");
                        Boolean bool2 = (Boolean) enabledOptional2.g();
                        if (bool2 != null) {
                            this.f310582b.f310584b.f(params3, bool2);
                        }
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 0;
        this.d = new f(function2, function1, function22, new Function1(this) { // from class: y21.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f310580b;

            {
                this.f310580b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String params = (String) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        l21.c cVar = this.f310580b.f310585c;
                        Type type = l21.d.e;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                        Boolean bool = (Boolean) cVar.T2(params, type);
                        if (bool == null) {
                            return null;
                        }
                        i.Companion.getClass();
                        return od0.h.a(bool);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Boolean bool2 = (Boolean) this.f310580b.f310584b.get(params);
                        if (bool2 == null) {
                            return null;
                        }
                        i.Companion.getClass();
                        return od0.h.a(bool2);
                }
            }
        }, new Function2(this) { // from class: y21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f310582b;

            {
                this.f310582b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String params = (String) obj2;
                        i enabledOptional = (i) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(enabledOptional, "enabledOptional");
                        Boolean bool = (Boolean) enabledOptional.g();
                        if (bool != null) {
                            this.f310582b.f310585c.G(bool, params, z.d(o0.b(Boolean.TYPE)));
                        }
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String params2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<SettingDescriptionDto>> privacySettings = this.f310582b.f310583a.getPrivacySettings();
                        j jVar = new j(28, new h(params2, 19));
                        privacySettings.getClass();
                        ufm.i iVar = new ufm.i(privacySettings, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String params3 = (String) obj2;
                        i enabledOptional2 = (i) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(enabledOptional2, "enabledOptional");
                        Boolean bool2 = (Boolean) enabledOptional2.g();
                        if (bool2 != null) {
                            this.f310582b.f310584b.f(params3, bool2);
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final i a(SecuritySettings securitySettings) {
        Boolean bool = (Boolean) this.f310584b.get(securitySettings.getSettingName());
        if (bool != null) {
            i.Companion.getClass();
            return od0.h.a(bool);
        }
        String settingName = securitySettings.getSettingName();
        Type type = l21.d.e;
        Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
        Boolean bool2 = (Boolean) this.f310585c.T2(settingName, type);
        if (bool2 != null) {
            i.Companion.getClass();
            return od0.h.a(bool2);
        }
        i.Companion.getClass();
        return i.f224256b;
    }

    public final r b(SecuritySettings securitySettings, k kVar) {
        return this.d.e(securitySettings.getSettingName(), kVar);
    }

    public final t c(SecuritySettings securitySettings, boolean z) {
        t tVarL = w.g0(this.f310583a.putSecuritySetting(securitySettings.getSettingsQuery(), new SecuritySettingRequestDto(z))).l(new br6.a(this, securitySettings, z, 11));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }
}
