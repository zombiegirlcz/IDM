package z69;

import a79.q;
import boh.f;
import kg.o;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import s69.m;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements f79.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f319712a;

    public d(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f319712a = gson;
    }

    @Override // f79.a
    public final t69.c a(m item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String strK = this.f319712a.k(item);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return new q(strK);
    }

    @Override // f79.a
    public final boolean b(m item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return true;
    }

    @Override // f79.a
    public final boolean c(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return true;
    }

    @Override // f79.a
    public final boolean d(t69.c pref) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        return true;
    }

    @Override // f79.a
    public final m e(c79.a pref) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        return (m) this.f319712a.c(pref.getData(), g79.b.class);
    }

    @Override // f79.a
    public final m f(u json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            String strJ = f.j("id", json);
            String strJ2 = f.j("title", json);
            String strJ3 = f.j("description", json);
            Long lH = f.h("timestamp", json);
            if (lH != null) {
                return new g79.b(strJ, strJ2, strJ3, new Instant(lH.longValue()), f.j("detailsDeepLink", json));
            }
            throw new NullPointerException("timestamp should not be null");
        } catch (NullPointerException e) {
            gom.e.f145194a.w(e);
            return null;
        }
    }
}
