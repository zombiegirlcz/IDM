package lg0;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f195040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f195041c;
    public final List d;

    public e(String url2, LinkedHashMap pathParameters, LinkedHashMap queryParameters, List pathSegments) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(pathParameters, "pathParameters");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        this.f195039a = url2;
        this.f195040b = pathParameters;
        this.f195041c = queryParameters;
        this.d = pathSegments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f195039a, eVar.f195039a) && this.f195040b.equals(eVar.f195040b) && this.f195041c.equals(eVar.f195041c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.e(this.f195041c, r6.b.e(this.f195040b, this.f195039a.hashCode() * 31, 31), 31);
    }
}
