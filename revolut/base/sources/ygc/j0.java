package ygc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yfe.b2;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f313616g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new b2(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f313617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f313618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f313619c;
    public final f d;
    public final w e;
    public final List f;

    public /* synthetic */ j0(int i, i0 i0Var, f fVar, f fVar2, f fVar3, w wVar, List list) {
        if (63 != (i & 63)) {
            j1.f(m.f313625a.getDescriptor(), i, 63);
            throw null;
        }
        this.f313617a = i0Var;
        this.f313618b = fVar;
        this.f313619c = fVar2;
        this.d = fVar3;
        this.e = wVar;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f313617a, j0Var.f313617a) && Intrinsics.f(this.f313618b, j0Var.f313618b) && Intrinsics.f(this.f313619c, j0Var.f313619c) && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e) && Intrinsics.f(this.f, j0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f313619c.hashCode() + ((this.f313618b.hashCode() + (this.f313617a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public j0(i0 header, f faqButton, f feedbackButton, f footerButton, w description, ArrayList sections) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(faqButton, "faqButton");
        Intrinsics.checkNotNullParameter(feedbackButton, "feedbackButton");
        Intrinsics.checkNotNullParameter(footerButton, "footerButton");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f313617a = header;
        this.f313618b = faqButton;
        this.f313619c = feedbackButton;
        this.d = footerButton;
        this.e = description;
        this.f = sections;
    }
}
