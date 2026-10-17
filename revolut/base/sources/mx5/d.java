package mx5;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f210210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210211b;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f210210a, dVar.f210210a) && this.f210211b == dVar.f210211b;
    }

    public final int hashCode() {
        Clause clause = this.f210210a;
        return Boolean.hashCode(this.f210211b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }

    public /* synthetic */ d(int i) {
        this(null, false);
    }

    public d(Clause clause, boolean z) {
        this.f210210a = clause;
        this.f210211b = z;
    }
}
