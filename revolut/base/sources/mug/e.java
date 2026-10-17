package mug;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f209026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f209027b;

    public e(ArrayList features, Map ratings) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        this.f209026a = features;
        this.f209027b = ratings;
    }

    public static e a(e eVar, LinkedHashMap ratings) {
        ArrayList features = eVar.f209026a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        return new e(features, ratings);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f209026a.equals(eVar.f209026a) && this.f209027b.equals(eVar.f209027b);
    }

    public final int hashCode() {
        return this.f209027b.hashCode() + (this.f209026a.hashCode() * 31);
    }
}
