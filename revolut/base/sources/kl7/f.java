package kl7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f185315c;

    public f(String title, String str, ArrayList contacts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.f185313a = title;
        this.f185314b = str;
        this.f185315c = contacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f185313a, fVar.f185313a) && Intrinsics.f(this.f185314b, fVar.f185314b) && this.f185315c.equals(fVar.f185315c);
    }

    public final int hashCode() {
        int iHashCode = this.f185313a.hashCode() * 31;
        String str = this.f185314b;
        return this.f185315c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
