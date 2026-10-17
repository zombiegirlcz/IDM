package mmm;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class h0 implements Comparable {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f207271b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f207272a;

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f207271b = separator;
    }

    public h0(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f207272a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = nmm.c.a(this);
        m mVar = this.f207272a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < mVar.d() && mVar.k(iA) == 92) {
            iA++;
        }
        int iD = mVar.d();
        int i = iA;
        while (iA < iD) {
            if (mVar.k(iA) == 47 || mVar.k(iA) == 92) {
                arrayList.add(mVar.r(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < mVar.d()) {
            arrayList.add(mVar.r(i, mVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        m mVar = nmm.c.f217395a;
        m mVarS = this.f207272a;
        int iM = m.m(mVarS, mVar);
        if (iM == -1) {
            iM = m.m(mVarS, nmm.c.f217396b);
        }
        if (iM != -1) {
            mVarS = m.s(mVarS, iM + 1, 0, 2);
        } else if (g() != null && mVarS.d() == 2) {
            mVarS = m.d;
        }
        return mVarS.v();
    }

    public final h0 c() {
        m mVar = nmm.c.d;
        m mVar2 = this.f207272a;
        if (Intrinsics.f(mVar2, mVar)) {
            return null;
        }
        m mVar3 = nmm.c.f217395a;
        if (Intrinsics.f(mVar2, mVar3)) {
            return null;
        }
        m mVar4 = nmm.c.f217396b;
        if (Intrinsics.f(mVar2, mVar4)) {
            return null;
        }
        m suffix = nmm.c.e;
        mVar2.getClass();
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iD = mVar2.d();
        byte[] bArr = suffix.f207285a;
        if (mVar2.o(iD - bArr.length, suffix, bArr.length) && (mVar2.d() == 2 || mVar2.o(mVar2.d() - 3, mVar3, 1) || mVar2.o(mVar2.d() - 3, mVar4, 1))) {
            return null;
        }
        int iM = m.m(mVar2, mVar3);
        if (iM == -1) {
            iM = m.m(mVar2, mVar4);
        }
        if (iM == 2 && g() != null) {
            if (mVar2.d() == 3) {
                return null;
            }
            return new h0(m.s(mVar2, 0, 3, 1));
        }
        if (iM == 1 && mVar2.p(mVar4)) {
            return null;
        }
        if (iM != -1 || g() == null) {
            return iM == -1 ? new h0(mVar) : iM == 0 ? new h0(m.s(mVar2, 0, 1, 1)) : new h0(m.s(mVar2, 0, iM, 1));
        }
        if (mVar2.d() == 2) {
            return null;
        }
        return new h0(m.s(mVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        h0 other = (h0) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f207272a.compareTo(other.f207272a);
    }

    public final h0 d(h0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iA = nmm.c.a(this);
        m mVar = this.f207272a;
        h0 h0Var = iA == -1 ? null : new h0(mVar.r(0, iA));
        other.getClass();
        m mVar2 = other.f207272a;
        int iA2 = nmm.c.a(other);
        if (!Intrinsics.f(h0Var, iA2 != -1 ? new h0(mVar2.r(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && Intrinsics.f(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && mVar.d() == mVar2.d()) {
            Companion.getClass();
            return g0.a(".", false);
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(nmm.c.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.f(mVar2, nmm.c.d)) {
            return this;
        }
        h hVar = new h();
        m mVarC = nmm.c.c(other);
        if (mVarC == null && (mVarC = nmm.c.c(this)) == null) {
            mVarC = nmm.c.f(f207271b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            hVar.v(nmm.c.e);
            hVar.v(mVarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            hVar.v((m) arrayListA.get(i));
            hVar.v(mVarC);
            i++;
        }
        return nmm.c.d(hVar, false);
    }

    public final h0 e(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        h hVar = new h();
        hVar.D(child);
        return nmm.c.b(this, nmm.c.d(hVar, false), false);
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof h0) && Intrinsics.f(((h0) obj2).f207272a, this.f207272a);
    }

    public final Path f() {
        Path path = Paths.get(this.f207272a.v(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character g() {
        m mVar = nmm.c.f217395a;
        m mVar2 = this.f207272a;
        if (m.h(mVar2, mVar) != -1 || mVar2.d() < 2 || mVar2.k(1) != 58) {
            return null;
        }
        char cK = (char) mVar2.k(0);
        if (('a' > cK || cK >= '{') && ('A' > cK || cK >= '[')) {
            return null;
        }
        return Character.valueOf(cK);
    }

    public final int hashCode() {
        return this.f207272a.hashCode();
    }

    public final File toFile() {
        return new File(this.f207272a.v());
    }

    public final String toString() {
        return this.f207272a.v();
    }
}
