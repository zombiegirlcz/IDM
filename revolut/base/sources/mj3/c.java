package mj3;

import android.content.Context;
import com.revolut.feature.cms.stories.impl.data.network.CmsStoriesService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import qz0.n;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f205905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205906b;

    public c(d dVar, int i) {
        this.f205905a = dVar;
        this.f205906b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f205905a;
        ee0.a aVar = dVar.f205907a;
        nj0.a aVar2 = dVar.f205909c;
        int i = this.f205906b;
        if (i == 0) {
            return new ne0.d();
        }
        if (i == 1) {
            je0.d mapper = aVar.d();
            s.j(mapper);
            yk0.a databaseSessionProvider = dVar.f205908b.b();
            s.j(databaseSessionProvider);
            xe0.f storageFactory = aVar.f();
            s.j(storageFactory);
            b.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.f(storageFactory, databaseSessionProvider, "cms_stories", mapper, 0, null, 56);
        }
        if (i == 2) {
            return new jj3.e((CmsStoriesService) dVar.i.get(), (j) dVar.f205910g.get(), (ue0.c) dVar.f205911h.get());
        }
        if (i == 3) {
            ek.a converterFactory = ((nj0.d) aVar2).d();
            ik0.b retrofitFactory = ((nj0.d) aVar2).m();
            s.j(retrofitFactory);
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
            Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CmsStoriesService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            CmsStoriesService cmsStoriesService = (CmsStoriesService) objCreate;
            s.k(cmsStoriesService);
            return cmsStoriesService;
        }
        if (i == 4) {
            Context context = (Context) dVar.k.get();
            b.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            return new n(context, null, null);
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        z70.a contextProvider = dVar.e.f();
        s.j(contextProvider);
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Context context2 = contextProvider.getContext();
        s.k(context2);
        return context2;
    }
}
