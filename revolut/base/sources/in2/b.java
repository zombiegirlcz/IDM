package in2;

import ang.f;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import n30.n;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b implements e {
    public static jn2.b a(f userInteractor, n chatInteractor) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        return new jn2.b(userInteractor, chatInteractor);
    }
}
