package f1a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f131206c;
    public final Long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f131207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f131208h;
    public final jo3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jo3.b f131209j;

    public /* synthetic */ i(int i, String str, String str2, long j2, Long l2, String str3, String str4, String str5, jo3.b bVar, jo3.b bVar2, jo3.b bVar3) {
        if (343 != (i & 343)) {
            j1.f(g.f131203a.getDescriptor(), i, 343);
            throw null;
        }
        this.f131204a = str;
        this.f131205b = str2;
        this.f131206c = j2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        this.f131207g = str5;
        if ((i & 128) == 0) {
            this.f131208h = null;
        } else {
            this.f131208h = bVar;
        }
        this.i = bVar2;
        if ((i & 512) == 0) {
            this.f131209j = null;
        } else {
            this.f131209j = bVar3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f131204a, iVar.f131204a) && Intrinsics.f(this.f131205b, iVar.f131205b) && this.f131206c == iVar.f131206c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f131207g, iVar.f131207g) && Intrinsics.f(this.f131208h, iVar.f131208h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f131209j, iVar.f131209j);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.f131204a.hashCode() * 31, 31, this.f131205b), 31, this.f131206c);
        Long l2 = this.d;
        int iC2 = p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iC3 = p.a.c((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f131207g);
        jo3.b bVar = this.f131208h;
        int iE = y.e(this.i, (iC3 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        jo3.b bVar2 = this.f131209j;
        return iE + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public i(String id10, String username, long j2, Long l2, String title, String str, String category, jo3.b bVar, jo3.b totalAmount, jo3.b bVar2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f131204a = id10;
        this.f131205b = username;
        this.f131206c = j2;
        this.d = l2;
        this.e = title;
        this.f = str;
        this.f131207g = category;
        this.f131208h = bVar;
        this.i = totalAmount;
        this.f131209j = bVar2;
    }
}
