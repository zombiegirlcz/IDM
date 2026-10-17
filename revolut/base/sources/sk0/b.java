package sk0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tk0.f;
import tk0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f263748b;

    public b(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f263747a = key;
        this.f263748b = value;
    }

    public final boolean a(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z = key instanceof tk0.c;
        Object obj2 = this.f263748b;
        if (z) {
            return obj2 instanceof Double;
        }
        if (key instanceof tk0.d) {
            return obj2 instanceof String;
        }
        if (key instanceof tk0.b) {
            return obj2 instanceof Boolean;
        }
        if (key instanceof tk0.e) {
            if (!(obj2 instanceof List)) {
                return false;
            }
            if (((List) obj2).isEmpty()) {
                return true;
            }
            Iterable iterable = (Iterable) obj2;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                if (!(it8.next() instanceof String)) {
                    return false;
                }
            }
            return true;
        }
        if (!(key instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(obj2 instanceof Map)) {
            return false;
        }
        Map map = (Map) obj2;
        if (map.isEmpty() || map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String) || !(entry.getValue() instanceof String)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f263747a, bVar.f263747a) && Intrinsics.f(this.f263748b, bVar.f263748b);
    }

    public final int hashCode() {
        return this.f263748b.hashCode() + (this.f263747a.hashCode() * 31);
    }
}
