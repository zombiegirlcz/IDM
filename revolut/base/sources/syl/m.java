package syl;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements o31.c, koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f266710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f266711c;
    public p31.c d;
    public p31.c e;

    public m(String listId, CharSequence text) {
        int i = R$attr.uikit_colorAccent;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f266709a = listId;
        this.f266710b = text;
        this.f266711c = i;
        this.d = null;
        this.e = null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51890a() {
        return this.f266709a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f266709a.equals(mVar.f266709a) && Intrinsics.f(this.f266710b, mVar.f266710b) && this.f266711c == mVar.f266711c && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f266711c, (this.f266710b.hashCode() + (this.f266709a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        return (iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51895j() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51897m() {
        return null;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51896l() {
        return null;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }
}
