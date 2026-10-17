package iu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f168472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168473c;
    public final c d;
    public final d e;

    public g(String title, ArrayList sections, String buttonTitle, c coApplicantApplicationInProgressErrorPopup, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(coApplicantApplicationInProgressErrorPopup, "coApplicantApplicationInProgressErrorPopup");
        this.f168471a = title;
        this.f168472b = sections;
        this.f168473c = buttonTitle;
        this.d = coApplicantApplicationInProgressErrorPopup;
        this.e = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f168471a, gVar.f168471a) && this.f168472b.equals(gVar.f168472b) && Intrinsics.f(this.f168473c, gVar.f168473c) && this.d.equals(gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f168472b, this.f168471a.hashCode() * 31, 31), 31, this.f168473c)) * 31;
        d dVar = this.e;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
