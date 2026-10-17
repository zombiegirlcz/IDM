package o5c;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r5c.b;
import vkm.d;
import w4l.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f222420a;

    public a(b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f222420a = repository;
    }

    public final d a() {
        b bVar = this.f222420a;
        bVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return bVar.e.b(Unit.f186387a, loadingStrategy);
    }
}
