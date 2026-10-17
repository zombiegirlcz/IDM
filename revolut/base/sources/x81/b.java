package x81;

import hx7.e;
import java.util.concurrent.CancellationException;
import jo0.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u81.d;
import ue0.c;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f303256c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f303257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f303258b;

    public b(d accessibilitySettingsRepository, h uiKitA11yPlugins) {
        Intrinsics.checkNotNullParameter(accessibilitySettingsRepository, "accessibilitySettingsRepository");
        Intrinsics.checkNotNullParameter(uiKitA11yPlugins, "uiKitA11yPlugins");
        this.f303257a = accessibilitySettingsRepository;
        this.f303258b = uiKitA11yPlugins;
    }

    public final void a() throws Throwable {
        Object objA;
        Object objA2;
        h hVar = this.f303258b;
        d dVar = this.f303257a;
        c cVar = dVar.f278076a;
        Class cls = Boolean.TYPE;
        Boolean bool = (Boolean) cVar.T2("ACTION_VISIBILITY_KEY", cls);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Object exclusiveWriterToken = f303256c;
        Intrinsics.checkNotNullParameter(exclusiveWriterToken, "exclusiveWriterToken");
        try {
            m.Companion companion = m.INSTANCE;
            Object obj2 = hVar.f176840a;
            if (obj2 != null && !obj2.equals(exclusiveWriterToken)) {
                throw new IllegalAccessException("exclusiveWriterToken does not match; only the first writer is allowed to continue modifications");
            }
            hVar.f176840a = exclusiveWriterToken;
            if (hVar.d != zBooleanValue) {
                hVar.d = zBooleanValue;
                hVar.f176841b.onNext(Boolean.valueOf(zBooleanValue));
            }
            objA = Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        Boolean bool2 = (Boolean) dVar.f278076a.T2("COLOR_CONTRAST_KEY", cls);
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Intrinsics.checkNotNullParameter(exclusiveWriterToken, "exclusiveWriterToken");
        try {
            Object obj3 = hVar.f176840a;
            if (obj3 != null && !obj3.equals(exclusiveWriterToken)) {
                throw new IllegalAccessException("exclusiveWriterToken does not match; only the first writer is allowed to continue modifications");
            }
            hVar.f176840a = exclusiveWriterToken;
            if (hVar.e != zBooleanValue2) {
                hVar.e = zBooleanValue2;
                hVar.f176842c.onNext(Boolean.valueOf(zBooleanValue2));
            }
            objA2 = Unit.f186387a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th11) {
            m.Companion companion3 = m.INSTANCE;
            objA2 = o.a(th11);
        }
        Throwable thA2 = m.a(objA2);
        if (thA2 != null) {
            e.n(thA2);
        }
    }
}
