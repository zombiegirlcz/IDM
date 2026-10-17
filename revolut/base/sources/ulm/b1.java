package ulm;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();
    public static final Regex e = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Regex f = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f281066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f281067c;
    public final String[] d;

    public b1(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(parameterNamesAndValues, "parameterNamesAndValues");
        this.f281065a = mediaType;
        this.f281066b = type;
        this.f281067c = subtype;
        this.d = parameterNamesAndValues;
    }

    public final Charset a(Charset charset) {
        String str;
        Intrinsics.checkNotNullParameter("charset", "name");
        String[] strArr = this.d;
        int i = 0;
        int iA = iim.b.a(0, strArr.length - 1, 2);
        if (iA < 0) {
            str = null;
            break;
        }
        while (!kotlin.text.a0.z(strArr[i], "charset", true)) {
            if (i == iA) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof b1) && Intrinsics.f(((b1) obj2).f281065a, this.f281065a);
    }

    public final int hashCode() {
        return this.f281065a.hashCode();
    }

    public final String toString() {
        return this.f281065a;
    }
}
