package xd1;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f304216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f304218c;
    public final f d;
    public final g e;

    public h(ArrayList tabs, String str, boolean z, f primaryButtonModel, g secondaryButtonModel) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(primaryButtonModel, "primaryButtonModel");
        Intrinsics.checkNotNullParameter(secondaryButtonModel, "secondaryButtonModel");
        this.f304216a = tabs;
        this.f304217b = str;
        this.f304218c = z;
        this.d = primaryButtonModel;
        this.e = secondaryButtonModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f304216a.equals(hVar.f304216a) && Intrinsics.f(this.f304217b, hVar.f304217b) && this.f304218c == hVar.f304218c && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f304216a.hashCode() * 31;
        String str = this.f304217b;
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f304218c)) * 31);
    }
}
