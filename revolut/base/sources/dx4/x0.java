package dx4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x0 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f120826c;

    public x0(String id10, String text, LinkedHashMap attachments) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        this.f120824a = id10;
        this.f120825b = text;
        this.f120826c = attachments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f120824a, x0Var.f120824a) && Intrinsics.f(this.f120825b, x0Var.f120825b) && this.f120826c.equals(x0Var.f120826c);
    }

    public final int hashCode() {
        return this.f120826c.hashCode() + p.a.c(this.f120824a.hashCode() * 31, 31, this.f120825b);
    }
}
