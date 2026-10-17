package ta;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f269071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f269072c;
    public final Boolean d;
    public final ArrayList e;

    public h(String title, e state, String fieldCode, Boolean bool, ArrayList values) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fieldCode, "fieldCode");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f269070a = title;
        this.f269071b = state;
        this.f269072c = fieldCode;
        this.d = bool;
        this.e = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f269070a, hVar.f269070a) && this.f269071b == hVar.f269071b && Intrinsics.f(this.f269072c, hVar.f269072c) && Intrinsics.f(this.d, hVar.d) && this.e.equals(hVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f269071b.hashCode() + (this.f269070a.hashCode() * 31)) * 31, 31, this.f269072c);
        Boolean bool = this.d;
        return this.e.hashCode() + ((iC + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        return "DetailsBlock(title=" + this.f269070a + ", state=" + this.f269071b + ", fieldCode=" + this.f269072c + ", legacy=" + this.d + ", values=" + this.e + ")";
    }
}
