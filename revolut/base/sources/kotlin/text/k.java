package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class k {

    @NotNull
    public static final h Companion = new h();
    public static final k d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f187911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f187912c;

    static {
        f fVar = g.Companion;
        fVar.getClass();
        g gVar = g.f187905c;
        i iVar = j.Companion;
        iVar.getClass();
        j jVar = j.f187908b;
        d = new k(false, gVar, jVar);
        fVar.getClass();
        iVar.getClass();
        new k(true, gVar, jVar);
    }

    public k(boolean z, g bytes, j number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f187910a = z;
        this.f187911b = bytes;
        this.f187912c = number;
    }

    public final String toString() {
        StringBuilder sbS = p.a.s("HexFormat(\n    upperCase = ");
        sbS.append(this.f187910a);
        sbS.append(",\n    bytes = BytesHexFormat(\n");
        this.f187911b.a("        ", sbS);
        sbS.append('\n');
        sbS.append("    ),");
        sbS.append('\n');
        sbS.append("    number = NumberHexFormat(");
        sbS.append('\n');
        this.f187912c.a("        ", sbS);
        sbS.append('\n');
        sbS.append("    )");
        sbS.append('\n');
        sbS.append(")");
        return sbS.toString();
    }
}
