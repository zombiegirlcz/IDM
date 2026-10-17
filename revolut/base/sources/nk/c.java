package nk;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;
import nd.p;
import skm.p0;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        p0 p0Var = p0.f264001a;
        elm.f fVar = elm.f.f127540b;
        lk.a jsonConverter = lk.a.f196159a;
        Intrinsics.checkNotNullParameter(jsonConverter, "jsonConverter");
        ok.b bVar = new ok.b();
        r39.a aVar = new r39.a();
        qy5.a eventEmitter = new qy5.a(23);
        ok.c filterLinkMessage = ok.c.f225853a;
        Intrinsics.checkNotNullParameter(jsonConverter, "jsonConverter");
        Intrinsics.checkNotNullParameter(filterLinkMessage, "filterLinkMessage");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        return new f(fVar, bVar, aVar, new p());
    }
}
