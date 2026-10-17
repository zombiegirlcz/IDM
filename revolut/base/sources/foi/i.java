package foi;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap f136995a = new ArrayMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f136996b = new ArrayList();

    public static final class a {
        private a() {
        }
    }

    public static boolean a(j jVar, long j2, long j3) {
        if (jVar.f136998b >= j3) {
            return false;
        }
        Long l2 = jVar.f136999c;
        return l2 == null || l2.longValue() > j2;
    }
}
