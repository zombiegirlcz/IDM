package c0f;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import skm.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y51.a f20253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f20254b;

    public d(y51.a externalCardsInteractor, h serverErrorParser) {
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f20253a = externalCardsInteractor;
        this.f20254b = serverErrorParser;
    }

    public final Object a(String str, String str2, gim.c cVar) {
        Object objO = e0.o(new b96.d(this, str, str2, null, 27), cVar);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }
}
