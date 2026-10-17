package nnd;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f217560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f217562c;
    public final ArrayList d;
    public final Set e;
    public final l f;

    public j(Set originalSelection, boolean z, Set currentSelection, ArrayList eligibleAccounts, Set expandedItems, l tab2) {
        Intrinsics.checkNotNullParameter(originalSelection, "originalSelection");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        Intrinsics.checkNotNullParameter(eligibleAccounts, "eligibleAccounts");
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        this.f217560a = originalSelection;
        this.f217561b = z;
        this.f217562c = currentSelection;
        this.d = eligibleAccounts;
        this.e = expandedItems;
        this.f = tab2;
    }

    public static j a(j jVar, Set set, LinkedHashSet linkedHashSet, l lVar, int i) {
        Set originalSelection = jVar.f217560a;
        boolean z = jVar.f217561b;
        if ((i & 4) != 0) {
            set = jVar.f217562c;
        }
        Set currentSelection = set;
        ArrayList eligibleAccounts = jVar.d;
        Set set2 = linkedHashSet;
        if ((i & 16) != 0) {
            set2 = jVar.e;
        }
        Set expandedItems = set2;
        if ((i & 32) != 0) {
            lVar = jVar.f;
        }
        l tab2 = lVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(originalSelection, "originalSelection");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        Intrinsics.checkNotNullParameter(eligibleAccounts, "eligibleAccounts");
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        return new j(originalSelection, z, currentSelection, eligibleAccounts, expandedItems, tab2);
    }

    @Override // nnd.k
    public final l b() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f217560a, jVar.f217560a) && this.f217561b == jVar.f217561b && Intrinsics.f(this.f217562c, jVar.f217562c) && this.d.equals(jVar.d) && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.f(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.f(j6.a.c(this.f217560a.hashCode() * 31, 31, this.f217561b), 31, this.f217562c), 31), 31, this.e);
    }
}
