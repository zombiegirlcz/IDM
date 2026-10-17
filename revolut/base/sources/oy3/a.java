package oy3;

import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f230875c;
    public final dj0.d d;
    public final String e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f230876g;

    public a(String title, String descriptionTemplate, String descriptionAmountExceededTemplate, dj0.d depositAmount, String sourcesTitle, ArrayList sources, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionTemplate, "descriptionTemplate");
        Intrinsics.checkNotNullParameter(descriptionAmountExceededTemplate, "descriptionAmountExceededTemplate");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        Intrinsics.checkNotNullParameter(sourcesTitle, "sourcesTitle");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f230873a = title;
        this.f230874b = descriptionTemplate;
        this.f230875c = descriptionAmountExceededTemplate;
        this.d = depositAmount;
        this.e = sourcesTitle;
        this.f = sources;
        this.f230876g = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f230873a, aVar.f230873a) && Intrinsics.f(this.f230874b, aVar.f230874b) && Intrinsics.f(this.f230875c, aVar.f230875c) && this.d.equals(aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f.equals(aVar.f) && Intrinsics.f(this.f230876g, aVar.f230876g);
    }

    public final int hashCode() {
        return this.f230876g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, p.a.c(v7.c(p.a.c(p.a.c(this.f230873a.hashCode() * 31, 31, this.f230874b), 31, this.f230875c), 31, this.d), 31, this.e), 31);
    }
}
