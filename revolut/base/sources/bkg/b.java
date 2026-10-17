package bkg;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import hx7.e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import tk0.d;
import tk0.f;
import ue0.c;
import vjg.g;
import xjg.j;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements uk0.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16411b;

    public b(c localStorage, g themeCatalog) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        this.f16410a = localStorage;
        this.f16411b = themeCatalog;
    }

    @Override // uk0.b
    public final boolean a(mk0.a storage) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(storage, "storage");
        try {
            m.Companion companion = m.INSTANCE;
            akg.b.Companion.getClass();
            Intrinsics.checkNotNullParameter("APP_STYLE", "id");
            objA = Boolean.valueOf(storage.h(new f("APP_STYLE")) == null && c(storage) != null);
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
        if (objA instanceof n) {
            objA = null;
        }
        Boolean bool = (Boolean) objA;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // uk0.b
    public final void b(mk0.a storage) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(storage, "storage");
        try {
            m.Companion companion = m.INSTANCE;
            dkg.a aVarC = c(storage);
            if (aVarC != null) {
                akg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter("APP_STYLE", "id");
                storage.g(new f("APP_STYLE"), (Serializable) ngm.n.G(aVarC));
                objA = Unit.f186387a;
            } else {
                objA = null;
            }
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
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    public final dkg.a c(mk0.a aVar) {
        j colorTheme;
        xjg.m mVar;
        Object next;
        Companion.getClass();
        Intrinsics.checkNotNullParameter("COLOR_THEME", "id");
        String str = (String) aVar.h(new d("COLOR_THEME"));
        if (str != null) {
            akg.b.Companion.getClass();
            colorTheme = (j) u1.v(str, akg.a.f5929c);
        } else {
            colorTheme = null;
        }
        c cVar = this.f16410a;
        if (colorTheme == null) {
            String tag2 = (String) cVar.T2("COLOR_THEME", String.class);
            if (tag2 != null) {
                j.Companion.getClass();
                Intrinsics.checkNotNullParameter(tag2, "tag");
                Iterator<E> it8 = j.b().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((j) next).d(), tag2)) {
                        break;
                    }
                }
                colorTheme = (j) next;
            } else {
                colorTheme = null;
            }
        }
        Companion.getClass();
        Intrinsics.checkNotNullParameter("LIGHT_DARK_MODE", "id");
        String str2 = (String) aVar.h(new d("LIGHT_DARK_MODE"));
        if (str2 != null) {
            akg.b.Companion.getClass();
            mVar = (xjg.m) u1.v(str2, akg.a.f5928b);
        } else {
            mVar = null;
        }
        if (mVar == null) {
            mVar = (xjg.m) cVar.T2("THEME_MODE", xjg.m.class);
        }
        if (colorTheme == null && mVar == null) {
            return null;
        }
        if (colorTheme == null) {
            colorTheme = j.DEFAULT;
        }
        if (mVar == null) {
            mVar = xjg.m.SYSTEM;
        }
        gwl.d dVar = (gwl.d) this.f16411b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        GlobalThemeDeclaration globalThemeDeclarationE = gwl.b.f147586a[colorTheme.ordinal()] == 1 ? dVar.f147597p : null;
        if (globalThemeDeclarationE == null) {
            globalThemeDeclarationE = dVar.e();
        }
        return new dkg.a(globalThemeDeclarationE, mVar, colorTheme);
    }
}
