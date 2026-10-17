package a71;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f1724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f1726c;
    public final String d;
    public final List e;

    public d(k userInfo, ArrayList cards, f footerInfo, String date, List jointAccounts) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(jointAccounts, "jointAccounts");
        this.f1724a = userInfo;
        this.f1725b = cards;
        this.f1726c = footerInfo;
        this.d = date;
        this.e = jointAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f1724a, dVar.f1724a) && this.f1725b.equals(dVar.f1725b) && this.f1726c.equals(dVar.f1726c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c((this.f1726c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f1725b, this.f1724a.hashCode() * 31, 31)) * 31, 31, this.d);
    }
}
