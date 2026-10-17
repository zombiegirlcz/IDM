package kotlin.text;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f187908b = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187909a;

    public j() {
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "suffix");
        this.f187909a = true;
        if (g0.a("")) {
            return;
        }
        g0.a("");
    }

    public final void a(String indent, StringBuilder sb6) {
        Intrinsics.checkNotNullParameter(sb6, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb6.append(indent);
        sb6.append("prefix = \"");
        sb6.append("");
        sb6.append("\",");
        sb6.append('\n');
        j6.a.D(sb6, indent, "suffix = \"", "", "\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("removeLeadingZeros = ");
        sb6.append(false);
        sb6.append(CoreConstants.COMMA_CHAR);
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("minLength = ");
        sb6.append(1);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("NumberHexFormat(\n");
        a("    ", sb6);
        sb6.append('\n');
        sb6.append(")");
        return sb6.toString();
    }
}
