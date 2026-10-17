package cog;

import bog.j;
import bog.p;
import bog.r;
import bog.s;
import bog.t;
import bog.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25547a;

    public e(Integer num) {
        this.f25547a = num != null ? num.intValue() : 90;
    }

    @Override // cog.f
    public final boolean a(zng.g domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        u uVar = domainState.f323819a;
        if (uVar instanceof r) {
            r rVar = (r) uVar;
            j jVar = rVar.f17451b;
            bog.d dVar = rVar.f17450a;
            if (c(dVar.f17432c)) {
                if (c(jVar != null ? jVar.f17441c : null) && c(rVar.f17452c.f17438c)) {
                    if (d(dVar.f17432c, jVar != null ? jVar.f17441c : null)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (uVar instanceof s) {
            s sVar = (s) uVar;
            return c(sVar.d.f17432c) && c(sVar.f17455c.f17438c);
        }
        if (!(uVar instanceof t)) {
            throw new NoWhenBranchMatchedException();
        }
        t tVar = (t) uVar;
        p pVar = tVar.f17458c;
        bog.f fVar = tVar.f17457b;
        return c(tVar.f17456a.f17432c) && c(fVar.f17435c) && c(pVar.f17446c) && d(fVar.f17435c, pVar.f17446c);
    }

    public final Integer b(String str, String str2) {
        int i;
        int length = str != null ? str.length() : 0;
        int length2 = str2 != null ? str2.length() : 0;
        if (length == 0 || length > (i = this.f25547a) || length2 == 0 || length2 > i || length2 + length + 1 <= i) {
            return null;
        }
        return Integer.valueOf(length + 1);
    }

    public final boolean c(String str) {
        return (str != null ? str.length() : 0) <= this.f25547a;
    }

    public final boolean d(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return true;
        }
        return str2.length() + str.length() <= this.f25547a - 1;
    }
}
