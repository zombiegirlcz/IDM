package n0m;

import c10.g;
import e4m.e;
import i4b.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f211060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f211061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f211062c;
    public final e d;

    public a() {
        int i = 7;
        this.f211060a = e4m.b.b(new a9i.b(0, i));
        this.f211061b = e4m.b.b(new a9i.b(1, i));
        this.f211062c = e4m.b.b(new a9i.b(2, i));
        this.d = e4m.b.b(new a9i.b(3, i));
    }

    public final c10.d a() {
        return (c10.d) this.f211060a.get();
    }

    public final f b() {
        g visionInitialization = (g) this.d.get();
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(visionInitialization, "visionInitialization");
        return new f(visionInitialization);
    }
}
