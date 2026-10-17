package kem;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f183212b;

    public l(String value, List params) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f183211a = value;
        this.f183212b = params;
        Iterator it8 = params.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((m) next).f183214a, "q")) {
                    break;
                }
            }
        }
        m mVar = (m) next;
        if (mVar == null || (str = mVar.f183215b) == null) {
            return;
        }
        kotlin.text.y.k(str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f183211a, lVar.f183211a) && Intrinsics.f(this.f183212b, lVar.f183212b);
    }

    public final int hashCode() {
        return (this.f183211a.hashCode() * 31) + this.f183212b.hashCode();
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f183211a + ", params=" + this.f183212b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
