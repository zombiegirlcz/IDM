package cmi;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    @NotNull
    private static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.f f25311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je0.d f25312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fmi.b f25313c;
    public final Lazy d;

    public z(xe0.f storageFactory, je0.d objectMapper, fmi.b parser) {
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f25311a = storageFactory;
        this.f25312b = objectMapper;
        this.f25313c = parser;
        this.d = yhm.j.b(new bvb.a(this, 27));
    }

    public final Object a(gim.c cVar) throws Throwable {
        c65.i iVar = new c65.i(this, null, 27);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, iVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
