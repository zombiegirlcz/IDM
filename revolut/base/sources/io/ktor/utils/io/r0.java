package io.ktor.utils.io;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class r0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f163083b = zhm.v.k(new r0(1), new r0(2), new r0(4));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f163084a;

    public /* synthetic */ r0(int i) {
        this.f163084a = i;
    }

    public static String a(int i) {
        if (i == 1) {
            return "CR";
        }
        if (i == 2) {
            return "LF";
        }
        if (i == 4) {
            return "CRLF";
        }
        List list = f163083b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if ((((r0) obj2).f163084a | i) == i) {
                arrayList.add(obj2);
            }
        }
        return arrayList.toString();
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof r0) {
            return this.f163084a == ((r0) obj2).f163084a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163084a);
    }

    public final String toString() {
        return a(this.f163084a);
    }
}
