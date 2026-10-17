package jx9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import nx9.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static nx9.a a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        for (nx9.a aVar : nx9.a.values()) {
            if (Intrinsics.f(aVar.a(), value)) {
                return aVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static d b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        for (d dVar : d.values()) {
            if (Intrinsics.f(dVar.a(), value)) {
                return dVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
