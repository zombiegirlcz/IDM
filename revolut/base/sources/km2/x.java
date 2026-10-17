package km2;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f185712a;

    public x(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f185712a = personalisationStorage;
    }

    public final Set a() {
        List list = (List) kii.e.n("VIEWED_FEATURED_THEMES", this.f185712a);
        Set setI1 = list != null ? d0.i1(list) : null;
        return setI1 == null ? h0.f322473a : setI1;
    }
}
