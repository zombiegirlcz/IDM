package gw2;

import jg1.e;
import jg1.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg1.a f147276a;

    public c(tg1.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f147276a = repository;
    }

    public final a a(String str, boolean z) {
        tg1.a aVar = this.f147276a;
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
