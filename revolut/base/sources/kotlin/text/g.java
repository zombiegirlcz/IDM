package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f187905c = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187907b;

    public g() {
        Intrinsics.checkNotNullParameter("  ", "groupSeparator");
        Intrinsics.checkNotNullParameter("", "byteSeparator");
        Intrinsics.checkNotNullParameter("", "bytePrefix");
        Intrinsics.checkNotNullParameter("", "byteSuffix");
        this.f187906a = true;
        this.f187907b = true;
        if (g0.a("  ") || g0.a("") || g0.a("")) {
            return;
        }
        g0.a("");
    }

    public final void a(String indent, StringBuilder sb6) {
        Intrinsics.checkNotNullParameter(sb6, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb6.append(indent);
        sb6.append("bytesPerLine = ");
        sb6.append(Integer.MAX_VALUE);
        sb6.append(",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("bytesPerGroup = ");
        sb6.append(Integer.MAX_VALUE);
        sb6.append(",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("groupSeparator = \"");
        sb6.append("  ");
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("byteSeparator = \"");
        sb6.append("");
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("bytePrefix = \"");
        sb6.append("");
        sb6.append("\",");
        sb6.append('\n');
        j6.a.D(sb6, indent, "byteSuffix = \"", "", "\"");
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("BytesHexFormat(\n");
        a("    ", sb6);
        sb6.append('\n');
        sb6.append(")");
        return sb6.toString();
    }
}
