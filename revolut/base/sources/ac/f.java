package ac;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.h f3007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gpk.c f3008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3009c;

    public f(Context context, gpk.c cVar) {
        ao.h hVar = new ao.h(context, 1);
        this.f3009c = new HashMap();
        this.f3007a = hVar;
        this.f3008b = cVar;
    }

    public final synchronized h a(String str) {
        if (this.f3009c.containsKey(str)) {
            return (h) this.f3009c.get(str);
        }
        CctBackendFactory cctBackendFactoryC = this.f3007a.c(str);
        if (cctBackendFactoryC == null) {
            return null;
        }
        gpk.c cVar = this.f3008b;
        h hVarCreate = cctBackendFactoryC.create(new b((Context) cVar.f145463a, (ic.a) cVar.f145464b, (ic.a) cVar.f145465c, str));
        this.f3009c.put(str, hVarCreate);
        return hVarCreate;
    }
}
