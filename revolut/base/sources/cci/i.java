package cci;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23119c;

    public i(String screenTitle, String str, ArrayList tiles) {
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.f23117a = screenTitle;
        this.f23118b = str;
        this.f23119c = tiles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f23117a, iVar.f23117a) && Intrinsics.f(this.f23118b, iVar.f23118b) && this.f23119c.equals(iVar.f23119c);
    }

    public final int hashCode() {
        int iHashCode = this.f23117a.hashCode() * 31;
        String str = this.f23118b;
        return this.f23119c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
