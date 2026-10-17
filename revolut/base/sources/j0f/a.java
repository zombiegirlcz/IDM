package j0f;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import yqi.c;
import yqi.d;
import yqi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements f {

    @NotNull
    public static final C0961a Companion = new C0961a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f170019a = new Regex("^[0-9]{9,18}$");

    /* JADX INFO: renamed from: j0f.a$a, reason: collision with other inner class name */
    public static final class C0961a {
        private C0961a() {
        }
    }

    public static final class b implements yqi.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f170020a = new b();

        private b() {
        }
    }

    @Override // yqi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d validate(String validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (!this.f170019a.f(validationData)) {
            return new d(validationData, b.f170020a);
        }
        d.Companion.getClass();
        return c.a(validationData);
    }
}
