package a71;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f1742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1744c;
    public final ArrayList d;
    public final f e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f1745g;

    public j(k userInfo, ArrayList cards, ArrayList topups, ArrayList devices, f footerInfo, String date, List jointAccounts) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(topups, "topups");
        Intrinsics.checkNotNullParameter(devices, "devices");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(jointAccounts, "jointAccounts");
        this.f1742a = userInfo;
        this.f1743b = cards;
        this.f1744c = topups;
        this.d = devices;
        this.e = footerInfo;
        this.f = date;
        this.f1745g = jointAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f1742a, jVar.f1742a) && this.f1743b.equals(jVar.f1743b) && this.f1744c.equals(jVar.f1744c) && this.d.equals(jVar.d) && this.e.equals(jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f1745g, jVar.f1745g);
    }

    public final int hashCode() {
        return this.f1745g.hashCode() + p.a.c((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f1744c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f1743b, this.f1742a.hashCode() * 31, 31), 31), 31)) * 31, 31, this.f);
    }
}
