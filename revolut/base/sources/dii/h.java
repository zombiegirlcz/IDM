package dii;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f115070a;

    public h(ArrayList bulletItems) {
        Intrinsics.checkNotNullParameter(bulletItems, "bulletItems");
        this.f115070a = bulletItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f115070a.equals(((h) obj2).f115070a);
    }

    public final int hashCode() {
        return this.f115070a.hashCode();
    }
}
