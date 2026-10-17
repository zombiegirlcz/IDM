package odf;

import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f224462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f224464c;
    public final a d;
    public final b e;
    public final d f;

    public f(List sectionConfigs, String selectedSourcePocketId, xi0.b baseCurrency, a context, b bVar, d disclaimer) {
        Intrinsics.checkNotNullParameter(sectionConfigs, "sectionConfigs");
        Intrinsics.checkNotNullParameter(selectedSourcePocketId, "selectedSourcePocketId");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f224462a = sectionConfigs;
        this.f224463b = selectedSourcePocketId;
        this.f224464c = baseCurrency;
        this.d = context;
        this.e = bVar;
        this.f = disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f224462a, fVar.f224462a) && Intrinsics.f(this.f224463b, fVar.f224463b) && Intrinsics.f(this.f224464c, fVar.f224464c) && this.d.equals(fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f.equals(fVar.f);
    }

    public final int hashCode() {
        int iD = a10.b.d(this.d.f224456a, l.j(this.f224464c, p.a.c(this.f224462a.hashCode() * 31, 31, this.f224463b), 31), 31);
        b bVar = this.e;
        return this.f.f224460a.hashCode() + ((iD + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
