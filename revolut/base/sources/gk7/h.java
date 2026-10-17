package gk7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f144335b;

    public h(List selectedExpenses, boolean z) {
        Intrinsics.checkNotNullParameter(selectedExpenses, "selectedExpenses");
        this.f144334a = selectedExpenses;
        this.f144335b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f144334a, hVar.f144334a) && this.f144335b == hVar.f144335b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144335b) + (this.f144334a.hashCode() * 31);
    }
}
