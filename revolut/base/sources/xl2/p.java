package xl2;

import com.revolut.feature.backend_flow.domain.models.BackendFlowIcon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f306924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f306925c;
    public final String d;
    public final BackendFlowIcon e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f306926g;

    public p(String id10, String title, String str, String str2, BackendFlowIcon backendFlowIcon, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f306923a = id10;
        this.f306924b = title;
        this.f306925c = str;
        this.d = str2;
        this.e = backendFlowIcon;
        this.f = str3;
        this.f306926g = str4;
    }

    @Override // xl2.r
    public final String a() {
        return this.f306926g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f306923a, pVar.f306923a) && Intrinsics.f(this.f306924b, pVar.f306924b) && Intrinsics.f(this.f306925c, pVar.f306925c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f306926g, pVar.f306926g);
    }

    @Override // xl2.r
    public final String getId() {
        return this.f306923a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f306923a.hashCode() * 31, 31, this.f306924b);
        String str = this.f306925c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BackendFlowIcon backendFlowIcon = this.e;
        int iHashCode3 = (iHashCode2 + (backendFlowIcon == null ? 0 : backendFlowIcon.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f306926g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
