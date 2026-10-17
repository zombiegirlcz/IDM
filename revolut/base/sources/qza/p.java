package qza;

import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$RemoteStoriesModel;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import v3e.e0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.remote_stories.impl.ui.b f250472b;

    public /* synthetic */ p(com.revolut.feature.remote_stories.impl.ui.b bVar, int i) {
        this.f250471a = i;
        this.f250472b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f250471a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.remote_stories.impl.ui.b bVar = this.f250472b;
                return ((com.revolut.feature.remote_stories.impl.ui.a) bVar.e).a3(new b((RemoteStoriesContract$Config) ((b0) bVar.f81988c).w0().get()));
            default:
                List models = (List) obj2;
                Intrinsics.checkNotNullParameter(models, "models");
                RemoteStoriesContract$RemoteStoriesModel remoteStoriesContract$RemoteStoriesModel = (RemoteStoriesContract$RemoteStoriesModel) zhm.d0.o0(models);
                Continuation continuation = null;
                String str = remoteStoriesContract$RemoteStoriesModel != null ? remoteStoriesContract$RemoteStoriesModel.f81975b : null;
                com.revolut.feature.remote_stories.impl.ui.b bVar2 = this.f250472b;
                NaviCommand naviCommandJ3 = bVar2.j3();
                if (naviCommandJ3 == null) {
                    return str != null ? pd.b.n(p0.f264003c, new u(bVar2, str, continuation, 0)) : pfm.m.f235744a;
                }
                e0 e0Var = ((b0) bVar2.f81988c).f250459b;
                return te0.w.z0(e0Var.f285897h.getValue(e0Var, e0.f285893j[6]), naviCommandJ3);
        }
    }
}
