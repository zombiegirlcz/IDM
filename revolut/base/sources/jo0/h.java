package jo0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();
    public static h f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f176840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f176841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f176842c;
    public boolean d;
    public boolean e;

    public static final class a {
        private a() {
        }

        public static h a() {
            h hVar = h.f;
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h();
            h.f = hVar2;
            return hVar2;
        }
    }

    public h() {
        Boolean bool = Boolean.FALSE;
        ihm.b bVarE = ihm.b.e(bool);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f176841b = bVarE;
        ihm.b bVarE2 = ihm.b.e(bool);
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.f176842c = bVarE2;
    }

    public final ihm.b a() {
        return this.f176841b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.e;
    }
}
