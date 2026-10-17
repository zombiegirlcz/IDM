package jz8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new jxi.a(15)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179657c;
    public final String d;

    public /* synthetic */ r(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            j1.f(p.f179650a.getDescriptor(), i, 15);
            throw null;
        }
        this.f179655a = str;
        this.f179656b = list;
        this.f179657c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f179655a, rVar.f179655a) && Intrinsics.f(this.f179656b, rVar.f179656b) && Intrinsics.f(this.f179657c, rVar.f179657c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f179655a.hashCode() * 31, 31, this.f179656b);
        String str = this.f179657c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public r(String header, String str, String str2, ArrayList description) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f179655a = header;
        this.f179656b = description;
        this.f179657c = str;
        this.d = str2;
    }
}
