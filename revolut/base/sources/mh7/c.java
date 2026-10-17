package mh7;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kpj.f;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f205421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f205422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f205423c;
    public final j2 d;

    public c(ue0.c storage, f extractor) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        p0 p0Var = p0.f264001a;
        elm.f dispatcher = elm.f.f127540b;
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f205421a = storage;
        this.f205422b = extractor;
        this.f205423c = dispatcher;
        this.d = q.c(Boolean.FALSE);
    }

    public final Object a(cwa.b bVar) throws Throwable {
        Object objJ = e0.J(this.f205423c, new b(this, null, 1), bVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
