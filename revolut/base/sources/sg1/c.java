package sg1;

import jg1.e;
import jg1.f;
import k7i.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg1.a f262580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f262581b;

    public c(tg1.a repository, i sharedCardsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sharedCardsInteractor, "sharedCardsInteractor");
        this.f262580a = repository;
        this.f262581b = sharedCardsInteractor;
    }

    public final a a(String str, boolean z) {
        tg1.a aVar = this.f262580a;
        if (z) {
            f fVarC = aVar.c(str);
            if (fVarC != null) {
                return new a(fVarC.e, fVarC.f173904c, null);
            }
            return null;
        }
        e eVarB = aVar.b(str);
        if (eVarB != null) {
            return new a(eVarB.d, eVarB.f173901c, eVarB.e);
        }
        return null;
    }
}
