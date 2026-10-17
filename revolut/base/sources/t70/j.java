package t70;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.n f268391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f268392b;

    public j(l70.n validationToggle, q resourceIdCache) {
        Intrinsics.checkNotNullParameter(validationToggle, "validationToggle");
        Intrinsics.checkNotNullParameter(resourceIdCache, "resourceIdCache");
        this.f268391a = validationToggle;
        this.f268392b = resourceIdCache;
    }

    public final h a(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        Resources resources = base.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a aVar = new a(resources, this.f268392b);
        l70.o oVar = (l70.o) this.f268391a;
        r resources2 = aVar;
        if (((Boolean) oVar.f192459a.getValue()).booleanValue()) {
            String packageName = base.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            resources2 = new z(aVar, packageName);
        }
        r pVar = resources2;
        if (((Boolean) oVar.f192460b.getValue()).booleanValue()) {
            Intrinsics.checkNotNullParameter(resources2, "resources");
            pVar = new p(resources2);
        }
        return new h(base, pVar);
    }
}
