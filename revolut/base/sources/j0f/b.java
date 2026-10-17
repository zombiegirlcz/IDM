package j0f;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import yqi.c;
import yqi.d;
import yqi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f170021a = new Regex("^[A-Z]{4}0[A-Z0-9]{6}$");

    public static final class a {
        private a() {
        }
    }

    /* JADX INFO: renamed from: j0f.b$b, reason: collision with other inner class name */
    public static final class C0962b implements yqi.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0962b f170022a = new C0962b();

        private C0962b() {
        }
    }

    @Override // yqi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d validate(String validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (!this.f170021a.f(validationData)) {
            return new d(validationData, C0962b.f170022a);
        }
        d.Companion.getClass();
        return c.a(validationData);
    }
}
