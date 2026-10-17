package b94;

import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f13645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pu3.d f13647c;
    public final boolean d;
    public final DetailsInputForm e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final it3.d f13649h;

    public /* synthetic */ h(i iVar, String str, pu3.d dVar, boolean z, DetailsInputForm detailsInputForm, String str2, int i) {
        this(iVar, str, dVar, z, detailsInputForm, null, (i & 64) != 0 ? null : str2, null);
    }

    public static h a(h hVar, DetailsInputForm detailsInputForm, String str, it3.d dVar, int i) {
        i mode = hVar.f13645a;
        String str2 = hVar.f13646b;
        pu3.d debtType = hVar.f13647c;
        boolean z = hVar.d;
        if ((i & 16) != 0) {
            detailsInputForm = hVar.e;
        }
        DetailsInputForm finalForm = detailsInputForm;
        if ((i & 32) != 0) {
            str = hVar.f;
        }
        String str3 = str;
        String str4 = hVar.f13648g;
        if ((i & 128) != 0) {
            dVar = hVar.f13649h;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(finalForm, "finalForm");
        return new h(mode, str2, debtType, z, finalForm, str3, str4, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f13645a == hVar.f13645a && Intrinsics.f(this.f13646b, hVar.f13646b) && this.f13647c == hVar.f13647c && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f13648g, hVar.f13648g) && Intrinsics.f(this.f13649h, hVar.f13649h);
    }

    public final int hashCode() {
        int iHashCode = this.f13645a.hashCode() * 31;
        String str = this.f13646b;
        int iB = p.a.b(j6.a.c((this.f13647c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e.f67474a);
        String str2 = this.f;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13648g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        it3.d dVar = this.f13649h;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public h(i mode, String str, pu3.d debtType, boolean z, DetailsInputForm finalForm, String str2, String str3, it3.d dVar) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(finalForm, "finalForm");
        this.f13645a = mode;
        this.f13646b = str;
        this.f13647c = debtType;
        this.d = z;
        this.e = finalForm;
        this.f = str2;
        this.f13648g = str3;
        this.f13649h = dVar;
    }
}
