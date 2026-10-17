package jj3;

import com.revolut.feature.cms.stories.impl.data.network.CmsStoriesService;
import ghl.l;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jch.p;
import jeg.g;
import jij.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CmsStoriesService f174632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f174633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f174634c;
    public final x4l.c d;

    public e(CmsStoriesService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f174632a = service;
        this.f174633b = memoryCache;
        this.f174634c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new l(this, continuation, 21), new g(this, 25), new p(this, 21), new h(this, continuation, 2), new j40.d(this, continuation, 5));
    }

    public final String a(c cVar) {
        Set setEntrySet;
        List listP0;
        Map map = cVar.f174631b;
        String strK0 = null;
        if (map.isEmpty()) {
            map = null;
        }
        if (map != null && (setEntrySet = map.entrySet()) != null && (listP0 = d0.P0(setEntrySet, new d())) != null) {
            strK0 = d0.k0(listP0, "&", "?", null, 0, new a(this, 0), 28);
        }
        if (strK0 == null) {
            strK0 = "";
        }
        String strEncode = URLEncoder.encode(cVar.f174630a, Charsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return p.a.p("cms_story:", strEncode, strK0);
    }
}
