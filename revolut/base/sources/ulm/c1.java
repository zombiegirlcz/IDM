package ulm;

import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes14.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.m f281078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1 f281079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f281080c;

    public c1() {
        this(0);
    }

    public final void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        MultipartBody$Part.Companion.getClass();
        c(e1.b(name, value));
    }

    public final void b(String name, String str, RequestBody body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        MultipartBody$Part.Companion.getClass();
        c(e1.c(name, str, body));
    }

    public final void c(MultipartBody$Part part) {
        Intrinsics.checkNotNullParameter(part, "part");
        this.f281080c.add(part);
    }

    public final void d(u0 u0Var, RequestBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        MultipartBody$Part.Companion.getClass();
        c(e1.a(u0Var, body));
    }

    public final okhttp3.c e() {
        ArrayList arrayList = this.f281080c;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new okhttp3.c(this.f281078a, this.f281079b, vlm.j.q(arrayList));
    }

    public final void f(b1 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type.f281066b, "multipart")) {
            this.f281079b = type;
        } else {
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }

    public c1(int i) {
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "toString(...)");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        mmm.m.Companion.getClass();
        this.f281078a = mmm.l.c(boundary);
        this.f281079b = okhttp3.c.f226116m;
        this.f281080c = new ArrayList();
    }
}
